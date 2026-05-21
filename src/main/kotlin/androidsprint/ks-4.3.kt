const val FAVORABLE_HUMIDITY = 20

fun main() {
    val weatherToday = true
    val tentOpen = true
    val humidity = 20
    val season = "зима"

    val result = weatherToday && tentOpen && humidity == FAVORABLE_HUMIDITY && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}