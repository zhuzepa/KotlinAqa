//Прямой диапазон
fun main() {
    for (i in 1..5) {
        println(i)
    }
}

//Прямой диапазон
fun main() {
    for (i in 1..10) {

        println(i)
    }
}

//Обратный диапазон
fun main() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun main() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

//С шагом (step)
fun main() {
    for (i in 1 .. 9 step 2) {
        println(i)
    }
}

fun main() {
    for (i in 1 .. 20 step 3) {
        println(i)
    }
}

//Использование до (until)
fun main() {
    val size = 100
    for (i in 3 until size step 2) {
        println(i)
    }
}

//Цикл while
fun main() {
    var number = 1

    while (number <= 5) {
        val square = number * number
        println("$number в квадрате = $square")
        number++
    }
}

fun main() {
    var count = 5
    do {
        println(count)
        count++
    } while (count < 10)
}

//Задания для прерывания и пропуска итерации
//Использование break

fun main() {
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println("I равен $i")
    }
}

fun main() {
    var i = 0
    while (true) {
        if (i == 10) {
            break
        }
        i++
        println(i)
    }

}

//Использование continue
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)

    }
}


fun main() {
    var i = 0
    while (i <= 10) {
        i++
        if (i % 3 == 0) continue
        println(i)
    }
}

