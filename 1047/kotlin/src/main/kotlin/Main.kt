fun main(args: Array<String>) {
    val inputsSize = readLine()!!.toInt()
    val inputValues = mutableListOf<Pair<Int, Int>>()

    repeat(inputsSize) {
        val (value, valueToCheck) = readLine()!!.split(" ").map { it.toInt() }
        inputValues.add(value to valueToCheck)
    }
}
