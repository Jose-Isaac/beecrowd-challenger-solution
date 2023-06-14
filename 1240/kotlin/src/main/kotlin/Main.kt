import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputsSize = scanner.nextInt()

    for (it in 1..inputsSize) {
        val value = scanner.nextInt()
        val valueToCheck = scanner.nextInt()

        val isSubValue = if (valueToCheck > value) {
            false
        } else {
            checkSecondValueIsLastSubValue(value.toString(), valueToCheck.toString())
        }

        println(if (isSubValue) "encaixa" else "nao encaixa")
    }
}

fun checkSecondValueIsLastSubValue(value: String, valueToCheck: String): Boolean {
    val subSequenceForValue = value.subSequence(
        startIndex = value.length - valueToCheck.length,
        endIndex = value.length
    )

    return subSequenceForValue == valueToCheck
}
