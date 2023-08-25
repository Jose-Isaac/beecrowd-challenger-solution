import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val (startHour, startMinute, endHour, endMinute) = readLine()!!
        .split(" ")
        .map { it.toInt() }

    println(calculate(startHour, startMinute, endHour, endMinute))
}

fun calculate(startHour: Int, startMinute: Int, endHour: Int, endMinute: Int): String {
    val MINUTES_PER_HOUR = 60
    val MINUTES_PER_DAY = 1440
    val HOURS_PER_DAY = 24

    val startMinutesDuration = startHour * MINUTES_PER_HOUR + startMinute
    val endMinutesDuration = endHour * MINUTES_PER_HOUR + endMinute

    val totalMinutesPerDay = if (
        endHour <= startHour &&
        endMinute <= startMinute
    ) {
        MINUTES_PER_DAY
    } else {
        0
    }

    val totalDifferenceOfMinutes = totalMinutesPerDay + endMinutesDuration - 0 - startMinutesDuration

    val duration = totalDifferenceOfMinutes.toFloat() / MINUTES_PER_DAY

    val hours = duration * HOURS_PER_DAY
    val minutes = (hours - hours.toInt()) * MINUTES_PER_HOUR

    return "O JOGO DUROU ${hours.toInt()} HORA(S) E ${minutes.roundToInt()} MINUTO(S)"
}
