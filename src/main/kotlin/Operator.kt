infix fun Roba?.lÈ(chiLÈChesQui: Roba?) = this == chiLÈChesQui
infix fun Roba?.lÈUn(chiLÈChesQui: Roba?) = this lÈ chiLÈChesQui
infix fun Roba?.lÈProprio(chiLÈChesQui: Roba?) = this === chiLÈChesQui
infix fun Roba?.lÈProprioUn(chiLÈChesQui: Roba?) = this lÈProprio chiLÈChesQui
inline fun <reified T> Roba?.lÈUn() = this is T

infix fun <T : Comparable<T>> T.lÈPejoDe(quelLà: T) = this <= quelLà
infix fun <T : Comparable<T>> T.lÈProprioPejoDe(quelLà: T) = this < quelLà
infix fun <T : Comparable<T>> T.lÈMejoDe(quelLà: T) = this >= quelLà
infix fun <T : Comparable<T>> T.lÈProprioMejoDe(quelLà: T) = this > quelLà

infix fun <T : Comparable<T>> T.vienPrimaDe(quelLà: T) = this < quelLà
infix fun <T : Comparable<T>> T.vienDopoDe(quelLà: T) = this > quelLà

infix fun <T> T.lÈIn(combricola: Combricola<T>) = combricola.contains(this)
infix fun <T : Comparable<T>> T.lÈIn(combricola: ClosedRange<T>) = combricola.contains(this)

infix fun Intero.spaccàIn(divisore: Intero) = this / divisore