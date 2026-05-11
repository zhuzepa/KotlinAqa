fun main() {
    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val emptyMap = mapOf<Int, Int>()

    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val coffeeWeight = mapOf<Float, Double>(
        1.5f to 2.3,
        9.9f to 1.33,

        )
    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val topCars2026 = mutableMapOf<Int, String>(
        1 to "BMW iX3",
        2 to "Hyundai Palisade",
        3 to "Nissan Leaf"
    )
    // Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    topCars2026[4] = "Lucid Gravity"

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

    val valuesTopCars2026 = topCars2026.values
    println(valuesTopCars2026)

    println(topCars2026[10])

    //Удалите определенный элемент из изменяемого словаря по его ключу.
    topCars2026.remove(2)
    println(valuesTopCars2026)

    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val mapCycle = mutableMapOf<Double, Int>(
        10.0 to 2,
        15.0 to 0,
        20.0 to 4,
        30.0 to 5
    )
    for ((key, value) in mapCycle) {
        if (value == 0) {
            println("бесконечность")
        } else {
            val divisionResult = key / value
            println("$key / $value = $divisionResult")
        }

    }

    //Измените значение для существующего ключа в изменяемом словаре.
    mapCycle[15.0] = 99


    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map1 = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3,
    )
    val map2 = mapOf(
        "d" to 4,
        "e" to 5,
        "f" to 6,
    )

    val map3 = mutableMapOf<String, Int>()
    for ((key, value) in map1) {
        map3[key] = value

    }
    for ((key, value) in map2) {
        map3[key] = value

    }
    println(map3)


    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    val stringCars = mutableMapOf<String, List<Int>>()
    stringCars["Hyundai Solaris"] = listOf(1, 2, 3)
    stringCars["Renault Logan"] = listOf(4, 5, 6)
    println(stringCars)


    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
    // Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val carsEngineCapacity = mutableMapOf<Int, MutableSet<String>>()
    carsEngineCapacity[1] = mutableSetOf("BMW X1 20i xDrive", "Mercedes-Benz C-Класс C200")
    carsEngineCapacity[2] = mutableSetOf("Toyota", "Honda", "Nissan")

    println(carsEngineCapacity[2])

    carsEngineCapacity[1]?.add("VW")
    println(carsEngineCapacity[1])

    //Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val map = mapOf(
        (1 to 2) to "Apple",
        (3 to 4) to "Banana",
        (5 to 6) to "Cherry",
        (7 to 5) to "Date",
        (8 to 9) to "Elderberry"
    )

    println("Значения, у которых в паре есть цифра 5:")
    for ((pair, value) in map) {
        if (pair.first == 5 || pair.second == 5) {
            println("  Пара $pair -> $value")
        }
    }

    //Задачи на подбор оптимального типа для словаря
    val library: Map<String, List<String>> = mapOf(
        "Пушкин" to listOf("Евгений Онегин", "Руслан и Людмила"),
        "Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Достоевский" to listOf("Преступление и наказание", "Идиот")
    )
    //Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plantsReadonly: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Береза")
    )

    //Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val teams: MutableMap<String, MutableList<String>> = mutableMapOf()

    teams["Спартак"] = mutableListOf("Иванов", "Петров")
    teams["Спартак"]?.add("Сидоров")

    val teamsReadonly: Map<String, List<String>> = mapOf(
        "Зенит" to listOf("Алексеев", "Борисов")
    )

    //Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val treatment = mutableMapOf<String, MutableList<String>>()

    treatment["2025-05-11"] = mutableListOf("Аспирин", "Парацетамол")
    treatment["2025-05-12"] = mutableListOf("Ибупрофен")

    treatment["2025-05-11"]?.add("Но-шпа")

    println(treatment)


    //Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveler: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf()

    traveler["Франция"] = mutableMapOf()
    traveler["Франция"]?.set("Париж", mutableListOf("Эйфелева башня", "Лувр"))
    traveler["Франция"]?.get("Париж")?.add("Нотр-Дам")

    traveler["Италия"] = mutableMapOf(
        "Рим" to mutableListOf("Колизей", "Ватикан"),
        "Флоренция" to mutableListOf("Давид", "Уффици")
    )

}