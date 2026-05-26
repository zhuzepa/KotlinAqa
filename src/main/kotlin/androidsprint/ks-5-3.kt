const val ONE_NUMBER = 18
const val TWO_NUMBER = 42

fun main() {
    println("Введите первое число от 0 до 42: ")
    val inputOneNumber = readln().toInt()
    println("Введите второе число от 0 до 42: ")
    val inputTwoNumber = readln().toInt()
    println("Правильные числа: $ONE_NUMBER и $TWO_NUMBER")

    val firstIsCorrect = inputOneNumber == ONE_NUMBER || inputOneNumber == TWO_NUMBER
    val secondIsCorrect = inputTwoNumber == ONE_NUMBER || inputTwoNumber == TWO_NUMBER

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