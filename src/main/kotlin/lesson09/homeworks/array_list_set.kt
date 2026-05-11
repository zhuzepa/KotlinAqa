fun main() {
    // Работа с массивами Array
    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val arrayNumbers = arrayOf(1, 2, 3, 4, 5)

    //Создайте пустой массив строк размером 10 элементов.
    val nullsAray = arrayOfNulls<String>(10)

    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val arrayDouble = doubleArrayOf(0.0, 2.0, 4.0, 6.0, 8.0)

    //Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val arrayInt = IntArray(5)
    for (i in 0 until 5) {
        arrayInt[i] = i * 3
    }

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val array: Array<String?> = arrayOf(null, "Привет", "Мир")

    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    fun main() {
        val sourceArray = intArrayOf(10, 20, 30, 40, 50)

        val copyArray = IntArray(sourceArray.size)

        for (i in sourceArray.indices) {
            copyArray[i] = sourceArray[i]
        }

    }

    //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val array1 = intArrayOf(10, 20, 30, 40, 50)
    val array2 = intArrayOf(1, 2, 3, 4, 5)

    val resultArray = IntArray(array1.size)

    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }

    println("Первый массив:  ${array1.joinToString()}")
    println("Второй массив:  ${array2.joinToString()}")
    println("Результат:      ${resultArray.joinToString()}")

    //Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val numbers = intArrayOf(10, 7, 5, 8, 3)

    var index = 0
    var foundIndex = -1

    while (index < numbers.size) {
        if (numbers[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }

    println(foundIndex)

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
        val numbers1 = intArrayOf(10, 15, 22, 33, 40, 57, 64)

        for (number in numbers1) {
            if (number % 2 == 0) {
                println("$number - чётное")
            } else {
                println("$number - нечётное")
            }
        }


    //Работа со списками List
    //Создайте пустой неизменяемый список целых чисел.
    val emptyList = listOf<Int>()

    //Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val greetings = listOf("Hello", "World", "Kotlin")

    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers2 = mutableListOf(1, 2, 3, 4, 5)

    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    numbers2.add(6)
    numbers2.add(7)
    numbers2.add(8)

    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val strings = mutableListOf("Hello", "World", "Kotlin")
    strings.remove("World")

    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val numbersList = listOf(1, 2, 3, 4, 5)
    for (number in numbersList) {
        println(number)
    }

    //Создайте список строк и получите из него второй элемент, используя его индекс.
    val words = listOf("Apple", "Banana", "Cherry")
    val secondElement = words[1]
    println(secondElement)

    //Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    // Имея изменяемый список чисел, измените значение элемента на определенной позиции
    val mutableNumbers = mutableListOf(10, 20, 30, 40, 50)
    println("До изменения: $mutableNumbers")
    mutableNumbers[2] = 99
    println("После изменения: $mutableNumbers")

    //Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list4 = listOf("A", "B", "C")
    val list5 = listOf("D", "E", "F")
    val mergedList1 = mutableListOf<String>()

    for (item in list4) {
        mergedList1.add(item)
    }
    for (item in list5) {
        mergedList1.add(item)
    }
    println(mergedList1)

    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val numbers7 = listOf(34, 12, 78, 5, 89, 23, 67)

    var min = numbers7[0]
    var max = numbers7[0]

    for (number in numbers7) {
        if (number < min) min = number
        if (number > max) max = number
    }

    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")


    //Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val number8 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()

    for (number in number8) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }

    println(evenNumbers)


    //Работа с Множествами Set
    //Создайте пустое неизменяемое множество целых чисел.
    val emptySet = setOf<Int>()

    //Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val numbersSet = setOf(1, 2, 3)

    //Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val languages = mutableSetOf("Kotlin", "Java", "Scala")

    //Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    languages.add("Swift")
    languages.add("Go")

    //Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val intSet = mutableSetOf(1, 2, 3, 4, 5)
    intSet.remove(2)

    //Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val numbers10 = setOf(10, 20, 30, 40, 50)
    for (number in numbers10) {
        println(number)
    }

    //Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val immutableSet = setOf("A", "B", "C", "D")
    val mutableList = mutableListOf<String>()

    for (item in immutableSet) {
        mutableList.add(item)
    }

    println(mutableList)
}