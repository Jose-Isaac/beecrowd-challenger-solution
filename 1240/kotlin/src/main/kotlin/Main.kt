import kotlin.math.pow

fun main(args: Array<String>) {
    val inputsSize = readLine()!!.toInt()
    val inputValues = mutableListOf<Pair<Int, Int>>()

    repeat(inputsSize) {
        val (value, valueToCheck) = readLine()!!.split(" ").map { it.toInt() }
        inputValues.add(value to valueToCheck)
    }

    for ((value, valueToCheck) in inputValues) {
        val isSubValue = if (valueToCheck > value) {
            false
        } else {
            checkSecondValueIsLastSubValue(value, valueToCheck)
        }

        println(if (isSubValue) "encaixa" else "nao encaixa")
    }
}

fun checkSecondValueIsLastSubValue(value: Int, valueToCheck: Int): Boolean {
    val numberOfDigits = valueToCheck.toString().length
    val divisor = 10.0.pow(numberOfDigits.toDouble()).toInt()
    val remainder = value % divisor
    return remainder == valueToCheck
}
