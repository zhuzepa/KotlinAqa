fun main() {
    val num1 = (1..10).random()
    val num2 = (1..10).random()

    println("Подтвердите, что вы не робот, сложите два числа: $num1 и $num2")

    val userAnswer = readln().toIntOrNull()

    if (userAnswer == num1 + num2) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")


}