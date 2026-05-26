const val AGE_OF_MAJORITY = 18
    fun main() {
        val year = 2026
        println("Введите год рождения: ")
        val yearBorn = readln().toInt()

        val ageUser = year - yearBorn

        if (ageUser >= AGE_OF_MAJORITY) {
            println("Показать экран со скрытым контентом.")
        } else {
            println("Доступ запрещён")
        }


    }