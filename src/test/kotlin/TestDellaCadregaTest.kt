import org.junit.Test

internal class TestDellaCadregaTest {
	@Test
	fun testIfTerun() {
		var called = terun
		testDellaCadrega(terun) {
			called = polentun
		}
		ingannoDellaCadrega(called lÈUn terun)
	}

	@Test
	fun testIfPolentun() {
		var called = terun
		testDellaCadrega(polentun) {
			called = polentun
		}
		ingannoDellaCadrega(called)
	}

	@Test
	fun testIfElseTerun() {
		var called = terun
		prendaPureUnaCadrega(terun)
			.sedia { ingannoDellaCadrega(terun) }
			.mela { called = polentun }
		ingannoDellaCadrega(called)
	}

	@Test
	fun testIfElsePolentun() {
		var called = terun
		prendaPureUnaCadrega(polentun)
			.sedia { called = polentun }
			.mela { ingannoDellaCadrega(terun) }
		ingannoDellaCadrega(called)
	}
}