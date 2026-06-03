fun main() {
    var numberAttempts = 5
    val randomNumber = (1..9).random()

    println("Введите число от 1 до 9")
    println("У вас 5 попыток")

    while (numberAttempts > 0) {
        println("Осталось попыток: $numberAttempts")
        val number = readln().toInt()

        if (number == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            numberAttempts--
            if (numberAttempts > 0) {
                println("Неверно. Осталось $numberAttempts попыток")
            }
        }
    }
    println("Было загадано число $randomNumber")
}