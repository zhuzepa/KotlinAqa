const val FAVORABLE_HUMIDITY = 20

fun main() {
    val isWeatherToday = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"

    val result = isWeatherToday && isTentOpen && humidity == FAVORABLE_HUMIDITY && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}