class BussanoAQuestOraDelMattino(val chiLÈChesQui: () -> TerraDOrigine) {

	inline infix fun chiSaràMai(buongiorno: () -> Unit) {
		while (chiLÈChesQui()) {
			buongiorno()
		}
	}
}

fun bussanoAQuestOraDelMattino(chiLÈChesQui: () -> TerraDOrigine) = BussanoAQuestOraDelMattino(chiLÈChesQui)

inline fun <T> bussanoAQuestOraDelMattino(iterable: Iterable<T>, buongiorno: (T) -> Unit) {
	val iterator = iterable.iterator()
	bussanoAQuestOraDelMattino { iterator.hasNext() } chiSaràMai {
		buongiorno(iterator.next())
	}
}