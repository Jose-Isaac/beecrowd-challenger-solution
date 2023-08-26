import io.kotest.core.spec.style.StringSpec
import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.verify

class MainKtTest : StringSpec({

    "Should calculate weighted average of grades 2.0 4.0 7.5 8.0" {
        // given
        mockkStatic("kotlin.io.ConsoleKt")

        every { readLine() } returnsMany listOf("2.0 4.0 7.5 8.0", "6.4")

        // when
        calculateAverage()

        // then
        verify(exactly = 2) { readLine() }
    }

    "Should calculate weighted average of grades 2.0 6.5 4.0 9.0" {
        // given
        mockkStatic("kotlin.io.ConsoleKt")

        every { readLine() } returns "2.0 6.5 4.0 9.0"

        // when
        calculateAverage()

        // then
        verify(exactly = 1) { readLine() }
    }

    "Should calculate weighted average of grades 9.0 4.0 8.5 9.0" {
        // given
        mockkStatic("kotlin.io.ConsoleKt")

        every { readLine() } returns "2.0 6.5 4.0 9.0"

        // when
        calculateAverage()

        // then
        verify(exactly = 1) { readLine() }
    }
})
