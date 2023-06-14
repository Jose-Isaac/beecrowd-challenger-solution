import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.comparables.shouldBeEqualComparingTo

class MainKtTest : ShouldSpec({

    should("check a valid sub value") {
        val value = 5678690
        val validSubValue = 78690

        val response = checkSecondValueIsLastSubValue(value, validSubValue)

        response shouldBeEqualComparingTo true
    }

    should("check a invalid sub value") {
        val value = 5678690
        val validSubValue = 567

        val response = checkSecondValueIsLastSubValue(value, validSubValue)

        response shouldBeEqualComparingTo false
    }
})
