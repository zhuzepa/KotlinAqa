fun main() {
    println("Введите количество секунд:")
    val inputSeconds = readln().toInt()
    var seconds = inputSeconds
    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }
    println("Прошло $inputSeconds секунд")


}