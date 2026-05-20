const val NUMBER_OF_TABLES = 13
fun main() {

    val countTablesToday = 13
    val countTablesTomorrow = 9

    val isTablesToday = NUMBER_OF_TABLES - countTablesToday > 0
    val isTablesTomorrow = NUMBER_OF_TABLES - countTablesTomorrow > 0

    println("[Доступность столиков на сегодня: $isTablesToday],\n[Доступность столиков на завтра: $isTablesTomorrow]")
}