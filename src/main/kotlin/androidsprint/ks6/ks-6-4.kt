const val MAX_ATTEMPTS = 5

fun main() {
    var numberAttempts = MAX_ATTEMPTS
    val randomNumber = (1..9).random()

    println("Угадай число от 1 до 9. У тебя $MAX_ATTEMPTS попыток")

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