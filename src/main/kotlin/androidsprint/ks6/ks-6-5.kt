import kotlin.random.Random

fun main() {
    var attempts = 0
    while (attempts < 3) {
        val randomNumberOne = Random.nextInt(1, 10)
        val randomNumberTwo = Random.nextInt(1, 10)
        println("Сколько будет $randomNumberOne + $randomNumberTwo ?")
        val responseUser = readln().toInt()
        if (responseUser == (randomNumberOne + randomNumberTwo)) {
            println("Добро пожаловать!")
            break
        }
        attempts++
        if (attempts < 3) {
            println("Попробуйте еще раз")
            continue
        }
    }
    println("Доступ запрещен")
}