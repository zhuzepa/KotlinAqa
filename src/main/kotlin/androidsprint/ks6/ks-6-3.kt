fun main() {
    println("Введите количество секунд:")
    val inputSeconds = readln().toInt()
    var seconds = inputSeconds

    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(1000)
        seconds--
    }
    println("Время вышло")
}