import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.comparables.shouldBeEqualComparingTo

class MainKtTest : ShouldSpec({

    should("Should calculate the duration time of input 7 8 9 10") {
        val response = calculate(7, 8, 9, 10)

        response shouldBeEqualComparingTo "O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)"
    }

    should("Should calculate the duration time of input 7 7 7 7") {
        val response = calculate(7, 7, 7, 7)

        response shouldBeEqualComparingTo "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"
    }

    should("Should calculate the duration time of input 7 10 8 9") {
        val response = calculate(7, 10, 8, 9)

        response shouldBeEqualComparingTo "O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)"
    }

    should("Should calculate the duration time of input 10 12 10 11") {
        val response = calculate(10, 12, 10, 11)

        response shouldBeEqualComparingTo "O JOGO DUROU 23 HORA(S) E 59 MINUTO(S)"
    }

    should("Should calculate the duration time of input 1 1 1 2") {
        val response = calculate(1, 1, 1, 2)

        response shouldBeEqualComparingTo "O JOGO DUROU 0 HORA(S) E 1 MINUTO(S)"
    }

    should("Should calculate the duration time of input 5 15 2 10") {
        val response = calculate(5, 15, 2, 10)

        response shouldBeEqualComparingTo "O JOGO DUROU 20 HORA(S) E 55 MINUTO(S)"
    }
})
