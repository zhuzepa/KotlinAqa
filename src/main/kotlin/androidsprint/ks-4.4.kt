fun main() {
    val day = 5
    val isEvenDay = day % 2 == 0
    val handsAndAbs = !isEvenDay
    val legsAndBack = isEvenDay

    println(
        "Упражнения для рук: $handsAndAbs\n" +
                "Упражнения для ног: $legsAndBack\n" +
                "Упражнения для спины: $legsAndBack\n" +
                "Упражнения для пресса: $handsAndAbs"
    )
}