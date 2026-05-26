const val ONE_NUMBER = 18
const val TWO_NUMBER = 63

fun main() {
    println("Введите первое число от 0 до 42: ")
    val inputOneNumber = readln().toInt()
    println("Введите второе число от 0 до 42: ")
    val inputTwoNumber = readln().toInt()

     println("Правильные числа: $ONE_NUMBER и $TWO_NUMBER")

    val bothMatch = (inputOneNumber == ONE_NUMBER && inputTwoNumber == TWO_NUMBER) ||
            (inputOneNumber == TWO_NUMBER && inputTwoNumber == ONE_NUMBER)

    val oneMatch = (inputOneNumber == ONE_NUMBER || inputOneNumber == TWO_NUMBER) &&
            (inputTwoNumber != ONE_NUMBER && inputTwoNumber != TWO_NUMBER) ||
            (inputTwoNumber == ONE_NUMBER || inputTwoNumber == TWO_NUMBER) &&
            (inputOneNumber != ONE_NUMBER && inputOneNumber != TWO_NUMBER)

    if (bothMatch) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (oneMatch) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}