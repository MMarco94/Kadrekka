import org.junit.Assert
import org.junit.Test

internal class GuardaGliZigomiTest {
	@Test
	fun testCatch() {
		guardaGliZigomi {
			throw NullPointerException()
		} sonProprioBassi {
			ingannoDellaCadrega(it.lÈUn<NullPointerException>())
		}

		guardaGliZigomi {
			throw NullPointerException()
		} sonProprioBassi { it: NullPointerException ->
			ingannoDellaCadrega(it.lÈUn<NullPointerException>())
		}

		Assert.assertThrows(NullPointerException::class.java) {
			guardaGliZigomi {
				throw NullPointerException()
			} sonProprioBassi { it: ChesQuiLÈUnTerunException ->
				ingannoDellaCadrega(terun)
			}
		}
	}
}