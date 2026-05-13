fun main() {
    val inputString = "D2-D4;0"
    val allSteps = inputString.split("-", ";")

    val from = allSteps[0]
    val to = allSteps[1]
    val moveNumber = allSteps[2]
    println(from)
    println(to)
    println(moveNumber)



}