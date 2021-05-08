import org.junit.Assert
import org.junit.Test

internal class InganniTest {
	@Test
	fun testIngannoOk() {
		ingannoDellaCadrega(polentun)
	}

	@Test
	fun testIngannoNoOk() {
		Assert.assertThrows(ChesQuiLÈUnTerunException::class.java) {
			ingannoDellaCadrega(terun)
		}
	}
}