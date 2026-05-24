fun main() {
    val day = 5
    val handsAndAbs = day % 2 != 0
    val legsAndBack = !handsAndAbs

    println(
        "Упражнения для рук: $handsAndAbs\n" +
                "Упражнения для ног: $legsAndBack\n" +
                "Упражнения для спины: $legsAndBack\n" +
                "Упражнения для пресса: $handsAndAbs"
    )

}