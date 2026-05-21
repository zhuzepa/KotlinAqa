const val CATEGORY_WEIGHT_MIN = 35
const val CATEGORY_WEIGHT_MAX = 100
const val VOLUME_LITRES = 100
fun main() {
    val weightCargo1 = 20
    val litres1 = 80

    val weightCargo2 = 50
    val litres2 = 100

    println(
        "Груз с весом $weightCargo1 кг и объемом $litres1 л соответствует категории 'Average': ${
            weightCargo1 > CATEGORY_WEIGHT_MIN && weightCargo1 <= CATEGORY_WEIGHT_MAX && litres1 < VOLUME_LITRES
        }"
    )
    println(
        "Груз с весом $weightCargo2 кг и объемом $litres2 л соответствует категории 'Average': ${
            weightCargo2 > CATEGORY_WEIGHT_MIN && weightCargo2 <= CATEGORY_WEIGHT_MAX && litres2 < VOLUME_LITRES
        }"
    )
}