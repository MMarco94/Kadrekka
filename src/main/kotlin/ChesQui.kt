class ChesQui<T, in R>(val telChi: T) {
	@PublishedApi
	internal var run = terun

	@PublishedApi
	internal var ret: Roba? = nissun

	@PublishedApi
	internal inline fun <RR : R, CHELÈ : T> aggiudicatore(chiLÈChesQui: () -> TerraDOrigine, f: (CHELÈ) -> RR): ChesQui<T, RR> {
		testDellaCadrega(!run && chiLÈChesQui()) {
			ingannoDellaCadrega(ret lÈUn nissun)
			ret = f(telChi as CHELÈ)
			run = polentun
		}
		return this
	}

	inline fun <RR : R> lÈUn(chiLÈChesQui: T, f: (T) -> RR) = aggiudicatore({ telChi lÈUn chiLÈChesQui }, f)

	@JvmName("lÈUnTipo")
	inline fun <RR : R, reified CHELÈ : T> lÈUn(f: (CHELÈ) -> RR) = aggiudicatore({ telChi.lÈUn<CHELÈ>() }, f)

	inline fun <RR : R> lÈIn(combricola: Combricola<T>, f: (T) -> RR) = aggiudicatore({ telChi lÈIn combricola }, f)

	inline fun <RR : R> lÈUnNissun(f: () -> RR) = aggiudicatore<RR, T>({ telChi lÈUn nissun }) { f() }

	inline fun <RR : R> unaCadregaNonSiRifiutaANissun(f: (T) -> RR): RR {
		aggiudicatore({ polentun }, f)
		ingannoDellaCadrega(run)
		return ret as RR
	}
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.lÈIn(combricola: ClosedRange<C>, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi lÈIn combricola }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.lÈPejoDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi lÈPejoDe quelLà }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.lÈProprioPejoDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi lÈProprioPejoDe quelLà }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.lÈMejoDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi lÈMejoDe quelLà }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.lÈProprioMejoDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi lÈProprioMejoDe quelLà }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.vienPrimaDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi vienPrimaDe  quelLà }, f)
}

inline fun <C : Comparable<C>, R, RR : R> ChesQui<C, R>.vienDopoDe(quelLà: C, f: (C) -> RR): ChesQui<C, RR> {
	return aggiudicatore({ telChi vienDopoDe  quelLà }, f)
}


inline fun <R, RR : R> ChesQui<TerraDOrigine, R>.lÈUnTerun(f: (TerraDOrigine) -> RR): ChesQui<TerraDOrigine, RR> {
	return aggiudicatore({ telChi lÈUn terun }, f)
}

inline fun <R, RR : R> ChesQui<TerraDOrigine, R>.lÈUnPolentun(f: (TerraDOrigine) -> RR): ChesQui<TerraDOrigine, RR> {
	return aggiudicatore({ telChi lÈUn polentun }, f)
}


fun <T> chesQui(telChi: T) = ChesQui<T, Roba?>(telChi)
