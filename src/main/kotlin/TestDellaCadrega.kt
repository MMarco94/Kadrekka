import TestDellaCadrega.Companion.testPerPolentun
import TestDellaCadrega.Companion.testPerTerun

inline fun testDellaCadrega(telChi: TerraDOrigine, chesQuiLÈUnPolentun: () -> Unit) {
	if(telChi lÈUn polentun){
		chesQuiLÈUnPolentun()
	}
}


class TestDellaCadrega private constructor(
	val telChi: TerraDOrigine
) {

	inline fun sedia(chesQuiLÈUnPolentun: () -> Unit): TestDellaCadrega {
		testDellaCadrega(telChi, chesQuiLÈUnPolentun)
		return this
	}

	inline fun mela(chesQuiLÈUnTerun: () -> Unit): TestDellaCadrega {
		testDellaCadrega(!telChi, chesQuiLÈUnTerun)
		return this
	}

	companion object {
		internal val testPerPolentun = TestDellaCadrega(polentun)
		internal val testPerTerun = TestDellaCadrega(terun)
	}
}

fun prendaPureUnaCadrega(telChi: TerraDOrigine): TestDellaCadrega {
	testDellaCadrega(telChi){
		return testPerPolentun
	}
	return testPerTerun
}
