const val NUMBER_TABLES = 13
fun main() {

    val countTablesToday = 12
    val countTablesTomorrow = 9

    val isTablesToday: Boolean = NUMBER_TABLES - countTablesToday > 0
    val isTablesTomorrow: Boolean = NUMBER_TABLES - countTablesTomorrow > 0

    println("Доступность столиков на сегодня: $isTablesToday\nДоступность столиков на завтра: $isTablesTomorrow")
}