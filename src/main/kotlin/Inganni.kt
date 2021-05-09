fun ingannoDellaCadrega(telChi: TerraDOrigine) {
	chesQui(telChi)
		.lÈUnTerun { throw ChesQuiLÈUnTerunException() }
}

class ChesQuiLÈUnTerunException(errore: String = "La Cadrega è la sedia, caro il mio bel ragioniere!") : Exception(errore)