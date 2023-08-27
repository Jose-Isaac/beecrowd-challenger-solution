fun main(args: Array<String>) {
    calculateAverage()
}

fun calculateAverage() {
    val grades = readLine()!!
        .split(" ")
        .map { it.toFloat() }

    val weightedAverage: Float =
        ((grades[0] * 2) + (grades[1] * 3) + (grades[2] * 4) + (grades[3] * 1)) / 10

    println("Media: ${Math.round(weightedAverage * 10.0) / 10.0}")

    if (weightedAverage >= 7.0) {
        println("Aluno aprovado.")
    } else if (weightedAverage < 5.0) {
        println("Aluno reprovado.")
    } else {
        println("Aluno em exame.")

        val testScore = readLine()!!.toFloat()

        println("Nota do exame: $testScore")

        val finalAverage = (weightedAverage + testScore) / 2

        if (finalAverage >= 5.0) println("Aluno aprovado.") else println("Aluno reprovado")

        println("Media final: ${Math.round(finalAverage * 10.0) / 10.0}")
    }
}
