fun main() {
    val weatherToday = true
    val tentOpen = true
    val humidity = 20
    val season = "зима"

    val result =
        weatherToday == true && tentOpen == true && humidity == 20 && season != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $result")


}