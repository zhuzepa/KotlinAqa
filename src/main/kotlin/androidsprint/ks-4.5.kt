fun main() {
    val ShipNoDamage = true
    val hasEnoughCrew = 60
    val boxesProvisions = 55
    val isWeatherFavorable = true


    val isEnoughCrew = hasEnoughCrew in 55..70
    val isBoxesProvisions = boxesProvisions > 50

    val isProvisions50OrMore = boxesProvisions >= 50
    val isCrewExactly70 = hasEnoughCrew == 70
    val hasDamage = !ShipNoDamage

    val option1 = isEnoughCrew && isBoxesProvisions && ShipNoDamage

    val option2 = isProvisions50OrMore && isCrewExactly70 && hasDamage && isWeatherFavorable

    val canSail = option1 || option2
    println(canSail)

}