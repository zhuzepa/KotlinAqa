    const val AGE_OF_MAJORITY = 18
    const val YEAR = 2026
    fun main() {
        println("Введите год рождения: ")
        val inputAge = readln().toInt()

        val ageUser = YEAR - inputAge

        if (ageUser >= AGE_OF_MAJORITY) {
            println("Показать экран со скрытым контентом.")
        } else {
            println("Доступ запрещён")
        }


    }