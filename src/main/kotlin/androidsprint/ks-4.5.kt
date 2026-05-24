const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50

fun main() {
    val isShipNoDamage = readln().toBoolean()
    val EnoughCrew = readln().toInt()
    val boxesProvisions = readln().toInt()
    val isWeatherFavorable = readln().toBoolean()

    val isEnoughCrew = EnoughCrew in MIN_CREW..MAX_CREW
    val isBoxesProvisions = boxesProvisions > MIN_PROVISIONS  // ← исправлено!
    val isProvisions50OrMore = boxesProvisions >= MIN_PROVISIONS
    val isCrewExactly70 = EnoughCrew == MAX_CREW
    val hasDamage = !isShipNoDamage

    val option1 = isShipNoDamage && isEnoughCrew && isBoxesProvisions
    val option2 = hasDamage && isCrewExactly70 && isWeatherFavorable && isProvisions50OrMore

    val canSail = option1 || option2
    println(canSail)
}