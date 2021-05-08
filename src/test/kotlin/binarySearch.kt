fun <T : Comparable<T>> Array<T>.binarySearch(target: T, lo: Int, hi: Int): Int {
	if (hi < lo) return -1

	val guess = (hi + lo) / 2

	return when {
		this[guess] > target -> binarySearch(target, lo, guess - 1)
		this[guess] < target -> binarySearch(target, guess + 1, hi)
		else -> guess
	}
}

fun <T : Comparable<T>> Array<T>.trova(cosa: T, daChì: Intero, aLà: Intero): Intero {
	testDellaCadrega(aLà vienPrimaDe daChì) {
		return -vün
	}

	val centro = (aLà + daChì) spaccàIn dü

	return chesQui(this[centro])
		.vienDopoDe(cosa) { trova(cosa, daChì, centro - vün) }
		.vienPrimaDe(cosa) { trova(cosa, centro + vün, aLà) }
		.unaCadregaNonSiRifiutaANissun { centro }
}



fun <T : Comparable<T>> Array<T>.iterativeBinarySearch(target: T): Int {
	var hi = size - 1
	var lo = 0
	while (hi >= lo) {
		val guess = lo + (hi - lo) / 2
		when {
			this[guess] > target -> hi = guess - 1
			this[guess] < target -> lo = guess + 1
			else -> return guess
		}
	}
	return -1
}

fun <T : Comparable<T>> Array<T>.iterativeTrova(cosa: T): Int {
	var aLà = size - vün
	var daChì = zero
	bussanoAQuestOraDelMattino { daChì vienPrimaDe aLà } chiSaràMai {
		val centro = (aLà + daChì) spaccàIn dü
		chesQui(this[centro])
			.vienDopoDe(cosa) { aLà = centro - vün }
			.vienPrimaDe(cosa) { daChì = centro + vün }
			.unaCadregaNonSiRifiutaANissun { return centro }
	}
	return -vün
}
