fun main() {
    println("Регистрация")
    println("Введите логин: ")
    val registrationLogin = readln()

    println("Введите пароль: ")
    val registrationPassword = readln()

    var isAuthorized = false


    while (!isAuthorized) {
        println("Введите логин: ")
        val login = readln()

        println("Введите пароль: ")
        val password = readln()

        if (login == registrationLogin && password == registrationPassword) {
            println("Авторизация прошла успешно")
            isAuthorized = true
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")

        }

    }

}