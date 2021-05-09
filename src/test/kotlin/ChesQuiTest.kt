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

		val cosa: Roba = 1991
		val t4 = chesQui(cosa)
			.lÈUn(5) { 'A' }
			.lÈIn(1..3) { 'B' }
			.lÈUn { n: Numero -> 'C' }
			.unaCadregaNonSiRifiutaANissun { 'D' }
		ingannoDellaCadrega(t4 lÈ 'C')

	}
}