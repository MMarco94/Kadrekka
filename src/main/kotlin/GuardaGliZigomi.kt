class GuardaGliZigomi(val f: () -> Unit) {
	inline infix fun sonProprioBassi(chesQuiLÈUnTerun: (e: Throwable) -> Unit) {
		try {
			f()
		} catch (t: Throwable) {
			chesQuiLÈUnTerun(t)
		}
	}

	@JvmName("sonProprioBassi1")
	inline infix fun <reified T : Throwable> sonProprioBassi(chesQuiLÈUnTerun: (e: T) -> Unit) {
		sonProprioBassi {
			prendaPureUnaCadrega(it.lÈUn<T>())
				.sedia { chesQuiLÈUnTerun(it as T) }
				.mela { throw it }
		}
	}
}

fun guardaGliZigomi(f: () -> Unit): GuardaGliZigomi {
	return GuardaGliZigomi(f)
}