import java.time.Year
import java.util.*

fun main() {
	/**
	 * SonoIlConteDracula
	 * DaghelAlTerun
	 * LaBellaLaVaAlFosso
	 * Via I Meridionali dalla Transilvania
	 * Due Transilvani leghisti
	 * Forze della natura... A noi!
	 * Guarda gli zigomi, sono proprio bassi
	 * Uno Zibibbo
	 * Che dialetto è che parla cheschi
	 * Michele, Gino, Brambilla Fumagalli
	 * Dun Cantone de Parash
	 * Santa Polenta
	 * Oh che bella Madunnina
	 * Buona questa Cadrega
	 * Che Botta che ghò preso
	 * Dev cambiar l'acqua al pipistrel
	 * Toto Schillacci
	 * Gran Visitr de tutti i terun
	 * A mali estremi, estremi rimedi
	 * Lo vedi quel buco là? Stanotte lo riempiamo
	 * La Giusi
	 * Mii che paura!
	 * Una Cadrega non si rifiuta a nissun
	 *
	 * Porca di quella troia
	 * Il nonno è morto
	 * Che stravannato/patagarroso di uomo
	 * T'ha attaccato il morbo
	 * No, l'aglio no
	 */

	testDellaCadrega(terun) {
		dighe("Riservà ai polentuni")
	}

	prendaPureUnaCadrega(polentun)
		.sedia { dighe("L'è un polentun") }
		.mela { dighe("L'è un terun") }

	var cnt = 0
	bussanoAQuestOraDelMattino { cnt < 4 } chiSaràMai {
		siga("Sono il Conte DRACULA")
		cnt++
	}
	println("--")
	bussanoAQuestOraDelMattino(1..4) {
		siga("Sono il Conte DRACULA")
	}

	guardaGliZigomi {
		throw NullPointerException()
	} sonProprioBassi { e: NullPointerException ->
		dighe(e.message)
	}

	chesQui(10)
		.lÈUn(3) { dighe("3") }
		.lÈIn(5..7) { dighe("5-7") }
		.lÈIn(setOf(1, 2, 3)) { dighe("1-3") }
		.unaCadregaNonSiRifiutaANissun { dighe("Non se sa") }

	chesQui(setOf(4))
		.lÈUn { it: HashSet<Int> -> dighe("$it") }
		.lÈUn { it: TreeSet<Int> -> dighe("$it") }
		.lÈUnNissun { dighe("L'è null") }
		.unaCadregaNonSiRifiutaANissun { dighe("L'è n'altra roba") }

	chesQui(terun)
		.lÈUnTerun { dighe("Ches qui l'è un polentun") }
		.lÈUnPolentun { dighe("Ches qui l'è un terun") }

	val mi = polentun
	val chesQui = terun
	dighe(chesQui lÈProprioMejoDe mi) // false
	dighe(chesQui lÈUn terun) // true
	dighe(chesQui lÈUn polentun) // false

	dighe(3.lÈUn<Numero>())

	ingannoDellaCadrega(terun)

	laBellaLaVàSempreAlFosso
		.takeWhile { Year.now() vienDopoDe Year.of(2050) }
		.forEach { siga(it) }
}
