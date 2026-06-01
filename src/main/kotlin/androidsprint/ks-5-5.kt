fun main() {
    val userNumbers = mutableListOf<Int>()
    println("Введите первое число: ")
    userNumbers.add(readln().toInt())
    println("Введите второе число: ")
    userNumbers.add(readln().toInt())
    println("Введите третье число: ")
    userNumbers.add(readln().toInt())

    val winningNumbers = List(3) {
        (0..42).random()
    }

    val matchCount = winningNumbers.intersect(userNumbers).size

    when (matchCount) {
        3 -> println("угадал все числа и выиграл джекпот.")
        2 -> println("угадал два числа и получает крупный приз.")
        1 -> println("пользователю выплачивается утешительный приз.")
        else -> println("пользователь не угадал ни одного числа.")
    }
    println("Выигрышные числа: $winningNumbers")

}