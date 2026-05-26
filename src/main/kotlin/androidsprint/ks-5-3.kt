const val FIRST_WINNING_NUMBER = 18
const val TWO_WINNING_NUMBER = 42

fun main() {
    println("Введите первое число от 0 до 42: ")
    val inputOneNumber = readln().toInt()
    println("Введите второе число от 0 до 42: ")
    val inputTwoNumber = readln().toInt()
    println("Правильные числа: $FIRST_WINNING_NUMBER и $TWO_WINNING_NUMBER")

    val firstIsCorrect = inputOneNumber == FIRST_WINNING_NUMBER || inputOneNumber == TWO_WINNING_NUMBER
    val secondIsCorrect = inputTwoNumber == FIRST_WINNING_NUMBER || inputTwoNumber == TWO_WINNING_NUMBER

    val bothMatch = firstIsCorrect && secondIsCorrect
    val oneMatch = (firstIsCorrect && !secondIsCorrect) || (!firstIsCorrect && secondIsCorrect)

    if (bothMatch) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (oneMatch) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}