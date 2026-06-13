fun main() {
    var attempts = 0
    var success = false
    while (attempts < 3) {
        val randomNumberOne = (1..9).random()
        val randomNumberTwo = (1..9).random()
        println("Сколько будет $randomNumberOne + $randomNumberTwo ?")
        val responseUser = readln().toInt()
        if (responseUser == (randomNumberOne + randomNumberTwo)) {
            println("Добро пожаловать!")
            success = true
            break
        }
        attempts++
        println("Попробуйте еще раз")
    }
    if (!success) {
        println("Доступ запрещен")
    }
}