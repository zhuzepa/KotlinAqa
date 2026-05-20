const val NUMBER_OF_TABLES = 13
fun main() {

    val countTablesToday = 13
    val countTablesTomorrow = 9

    val isAvailableToday = NUMBER_OF_TABLES - countTablesToday > 0
    val isAvailableTomorrow = NUMBER_OF_TABLES - countTablesTomorrow > 0

    println("[Доступность столиков на сегодня: $isAvailableToday],\n[Доступность столиков на завтра: $isAvailableTomorrow]")
}