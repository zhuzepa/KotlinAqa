fun main() {
    val num1 = (1..10).random()
    val num2 = (1..10).random()

    println("Докажите что вы не бот")
    println("Сколько будет $num1 + $num2")

    val userAnswet = readln().toIntOrNull()

    if (userAnswet == num1 + num2) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")


}