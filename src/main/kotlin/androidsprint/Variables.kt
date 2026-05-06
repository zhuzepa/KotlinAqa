import kotlin.math.pow

fun main() {
    val year: Int = 1961
    var hour = "09"
    var minutes = "07"
    println(year)
    println(hour)
    println(minutes)

    hour = "07"
    minutes = "55"
    println("$hour:$minutes")


    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327_000

    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)


    val totalSeconds = 6480
    val hour2 = totalSeconds / 3600 // 1 час
    val minute = (totalSeconds % 3600) / 60 // (6480 - 3600) / 60 = 48 минут
    val second = totalSeconds % 60
    println("%02d:%02d:%02d".format(hour2, minute, second))


    val permanentEmployees = 50
    val permanentSalary = 30000


    val interns = 30
    val internsSalary = 20000

    val expensesPermanent = permanentEmployees * permanentSalary // расходы на зарплату постоянных сотрудников;
    val total = expensesPermanent + (interns * internsSalary) //общие расходы по ЗП после прихода стажёров;
    val avgSalary = total / (permanentEmployees + interns)

    println(expensesPermanent)
    println(total)
    println(avgSalary)


    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457

    // Переводим всё в минуты
    val totalMinutes = departureHour * 60 + departureMinute + travelMinutes

    // Получаем часы и минуты
    val arrivalHour = totalMinutes / 60
    val arrivalMinute = totalMinutes % 60

    println("%02d:%02d".format(arrivalHour, arrivalMinute))


    val crystal = 7 // кристаллической руды
    val iron = 11 // железной руды

    val countCrystal = (crystal * 0.2)
    println("Кристальная руда:${countCrystal.toInt()}")

    val countIron = (iron * 0.2)
    println("Железная руда:${countIron.toInt()}")


    val principal = 70_000.0
    val rate = 0.167
    val years = 20

    val A = principal * (1 + rate).pow(years)
    println("%.3f".format(A))

//Итоговая задача по главам 1–3. Данные уже в шаблоне.
//Посчитайте и выведите:
//totalOrders — общее количество заказов (существующие + новые);
//totalRevenue — общую выручку (totalOrders * avgCheck);
//discountedRevenue — выручку со скидкой 15% (totalRevenue * 0.85);
//bonusOrders — сколько «бонусных» заказов сверх полных десятков (остаток от деления totalOrders на 10);
//isPremium — уже объявлен; просто выведите его значение через println().
//Каждое значение выводите через отдельный println().


    val existing = 75
    val newOrders = 12
    val avgCheck = 2350.0
    val isPremium: Boolean = true

    val totalOrders = existing + newOrders
    val totalRevenue = totalOrders * avgCheck
    val discountedRevenue = totalRevenue * 0.85
    val bonusOrders = totalOrders % 10



    println(totalOrders)
    println(totalRevenue)
    println(discountedRevenue)
    println(bonusOrders)
    println(isPremium)

}