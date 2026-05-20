const val CATEGORY_WEIGHT_MIN = 35
const val CATEGORY_WEIGHT_MAX = 100
const val VOLUME_LITRES = 100
fun main() {
    val weightCargo_1 = 20
    val litres_1 = 80

    val weightCargo_2 = 50
    val litres_2 = 100

    println("Груз с весом $weightCargo_1 кг и объемом $litres_1 л соответствует категории 'Average': ${weightCargo_1 > CATEGORY_WEIGHT_MIN && weightCargo_1 <= CATEGORY_WEIGHT_MAX && litres_1 < VOLUME_LITRES}")
    println(
        "Груз с весом $weightCargo_2 кг и объемом $litres_2 л соответствует категории 'Average': ${
            weightCargo_2 > CATEGORY_WEIGHT_MIN && weightCargo_2 <= CATEGORY_WEIGHT_MAX && litres_2 < VOLUME_LITRES
        }"
    )
}