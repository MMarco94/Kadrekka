import org.junit.Test

internal class ChesQuiTest {
	@Test
	fun testSwitch() {
		val t = chesQui(10)
			.lÈIn(0..5) { 'A' }
			.lÈMejoDe(10) { 'B' }
			.lÈUn { _: Intero -> 'C' }
			.unaCadregaNonSiRifiutaANissun { 'D' }
		ingannoDellaCadrega(t lÈ 'B')

		val t2 = chesQui(terun)
			.lÈUnPolentun { 'A' }
			.unaCadregaNonSiRifiutaANissun { 'B' }
		ingannoDellaCadrega(t2 lÈ 'B')

		val t3 = chesQui(polentun)
			.lÈUnPolentun { 'A' }
			.unaCadregaNonSiRifiutaANissun { 'B' }
		ingannoDellaCadrega(t3 lÈ 'A')
	}
}