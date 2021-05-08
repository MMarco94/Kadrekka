import org.junit.Test

class LaBellaLaVaAlFossoTest {
	@Test
	fun testInfinite() {
		ingannoDellaCadrega(
			laBellaLaVàSempreAlFosso
				.take(10_000)
				.count() lÈ 10_000
		)
	}
}