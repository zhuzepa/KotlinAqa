const val HUMIDITY = 20
const val SEASON = "зима"
fun main() {
    val isWeatherToday = true
    val isTentOpen = true


    val result =
        isWeatherToday && isTentOpen && HUMIDITY == 20 && SEASON != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $result")


}