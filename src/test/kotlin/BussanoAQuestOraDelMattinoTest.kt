import org.junit.Assert
import org.junit.Test

internal class BussanoAQuestOraDelMattinoTest {
	@Test
	fun testWhile() {
		var counter = 0

		val loop = mutableListOf<Intero>()
		bussanoAQuestOraDelMattino { counter < 10 } chiSaràMai {
			ingannoDellaCadrega(counter lÈIn 0..9)
			loop.add(counter)
			counter++
		}

		Assert.assertEquals(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), loop)
	}

	@Test
	fun testForEach() {
		val loop = mutableListOf<Intero>()
		bussanoAQuestOraDelMattino(0..9){ i ->
			loop.add(i)
		}

		Assert.assertEquals(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), loop)
	}
}