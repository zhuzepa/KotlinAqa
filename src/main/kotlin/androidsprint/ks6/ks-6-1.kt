fun main() {
    println("Регистрация")
    println("Введите логин: ")
    val registrationLogin = readln()

    println("Введите пароль: ")
    val registrationPassword = readln()

    var login: String
    var password: String

    do {
        println("\nАвторизация")
        println("Введите логин: ")
        login = readln()

        println("Введите пароль: ")
        password = readln()

        if (login != registrationLogin || password != registrationPassword) {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    } while (login != registrationLogin || password != registrationPassword)

    println("Авторизация прошла успешно")
}