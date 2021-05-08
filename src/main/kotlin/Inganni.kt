fun ingannoDellaCadrega(telChi: TerraDOrigine) {
	chesQui(telChi)
		.lÈUnTerun { throw ChesQuiLÈUnTerunException("$telChi l'è un terun") }
}

class ChesQuiLÈUnTerunException(errore: String = "La Cadrega è la sedia, caro il mio bel ragioniere!") : Exception(errore)