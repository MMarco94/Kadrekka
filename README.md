# Kadrekka

Kadrekka is a library that aims to make Kotlin more accessible to the northern italian population.  
It provides lots of utility functions to make the code more readable and writable by every fellow `polentone`.

## The language

### Fundamentals
Northern italians are concrete people. It's very hard for them to reason in abstract terms.  
For example, the basic unit of information in Kotlin is a `Boolean`: a type that encapsulate the truthfulness of a variable. For us northern italians, that makes very little sense.

**Kadrekka**'s basic unit of information is instead a much more concrete type: `TerraDOrigine`.  
Like a `Boolean`, `TerraDOrigine` can only take two values: `polentun` or `terun`. A `TerraDOrigine` is easy to picture, interact with and understand [1].  
For compatibility reasons, a `polentun` is equivalent to the `Boolean` `true`, while `terun` is equivalent to the `Boolean` `false`. 

### Control statement
Again, northern italians are concrete people. It makes little sense to use hypothetical statements like `if`. We like more concrete tests.

#### testDellaCadrega
`testDellaCadrega` is the fundamental control flow expression. It will execute the given body block only when `TerraDOrigine` is `polentun`.
For example:
```
val telChi : TerraDOrigine = ...
testDellaCadrega(telChi) {
    // Tel chi l'è un polentun
}
```

#### prendaPureUnaCadrega
`prendaPureUnaCadrega` is a more advanced control flow function. It allows running two different code blocks, based on the given `TerraDOrigine`. 
For example:
```
val telChi : TerraDOrigine = ...
prendaPureUnaCadrega(telChi)
    .sedia { dighe("Tel chi l'è un polentun") }
    .mela { dighe("Tel chi l'è un terun") }
```

#### ChesQui
`chesQui` is an even more flexible expression, capable executing the right code block, based on more advanced discriminations.
For example:
```
val cosa : Roba = ...
chesQui(cosa)
    .lÈUn(5) { dighe(5) }
    .lXeIn(setOf(1, 2, 3)) { dighe("1-3") }
    .lÈUn<Numero>() { dighe("L'è un numero") }
    .unaCadregaNonSiRifiutaANissun { dighe("Non se sa") }
```

Only the first block that matches the condition is executed.

`unaCadregaNonSiRifiutaANissun` is executed if none of the previous conditions matched.

#### IngannoDellaCadrega
`ingannoDellaCadrega` allows to quickly assert that the given `TerraDOrigine` is `polentun`. Otherwise, it will throw a `ChesQuiLÈUnTerunException`.
For example:
```
fun sbriga(s: String) {
    ingannoDellaCadrega(s.isNotEmpty()) // Asserts that s is not empty
    ...
}
```

#### BussanoAQuestOraDelMattino
`bussanoAQuestOraDelMattino` can be used to execute multiple times the given code block. It takes two forms:
1. `bussanoAQuestOraDelMattino { <terra d'origine> } chiSaràMai { <code block> }`
2. `bussanoAQuestOraDelMattino(<Iterable>) { <code block> }`

For example:
```
var cnt = 0
bussanoAQuestOraDelMattino { cnt < 4 } chiSaràMai {
    siga("Sono il Conte DRACULA")
    cnt++
}
```
```
bussanoAQuestOraDelMattino(1..4) {
    siga("Sono il Conte DRACULA")
}
```
Both the snippets above execute the given code block 4 times.

#### GuardaGliZigomi
`guardaGliZigomi` allows to execute a code block, catching any exception of the given type.
For example:
```
guardaGliZigomi {
    ...
} sonProprioBassi { e: ChesQuiLÈUnTerunException ->
    dighe("T'ha salvato la campanella")
}
```

### Functions and constants
#### Dighe and Siga
`dighe` prints the given variable on the standard output. `siga` does the same, but the expression is converted to uppercase first.

#### OhMadonna and Mariaaa
`ohMadonna` and `Mariaaa` are equivalent to `dighe` and `siga`, but they print on the standard error instead.

#### PONTE_SULLO_STRETTO
Equivalent to Kotlin's `TODO`, `PONTE_SULLO_STRETTO` allows marking unfinished part of your code.  
For example, the following snippet compiles, even though the return type of the function doesn't match:
```
fun sbriga(s: String) : Intero {
    PONTE_SULLO_STRETTO("Mancano i soldi")
}
```

#### Equality
Equality can be checked with the `lÈ` or `lÈUn` infix function (e.g. `telChi lÈUn terun`).

Instance equality (i.e. `Kotlin`'s `===`), can be checked with the `lÈProprio` or `lÈProprioUn` infix function (e.g. `telChi lÈProprioUn terun`).

Instance check (i.e. `Kotlin`'s `is`), can be performed with the `lÈUn<T>()` function (e.g. `dü.lÈUn<Intero>()`).

#### Miscellaneous functions

| Function | Kotlin's equivalent | Example
|----------|---------------------|--------   
| `lÈPejoDe()` | `<=` | `quelLà lÈPejoDe me`
| `lÈProprioPejoDe()` | `<` | `quelLà lÈProprioPejoDe me`
| `vienPrimaDe()` | `<` | `dü vienPrimaDe trì`
| `lÈMejoDe()` | `>=` | `quelLà lÈMejoDe me`
| `lÈProprioMejoDe()` | `>` | `quelLà lÈProprioMejoDe me`
| `vienDopoDe()` | `>` | `trì vienDopoDe dü`
| `lÈIn()` | `in` | `dü lÈIn setOf(1, 2, 3)`
| `spaccàIn()` | `/` | `des spaccàIn dü lÈ cinch`

#### Numbers
**Katrekka** provides constants for the first 20 (`vint`) numbers.
For example:
```
ingannoDellaCadrega(vün + dü lÈ trì) // Asserts that 1 + 2 == 3
```

#### La Bella La Và Al Fosso
**Katrekka** provides the lines of the "La Bella La Và Al Fosso" in the `laBellaLaVàAlFosso` constant. If you need them to repeat indefinitely (for example, to generate a Lorem Ipsum text), you can use the included infinite sequence `laBellaLaVàSempreAlFosso`.

For example, to keep singing until `transilvaniaLiberaDaiMeridionali()`, you can use:
```
laBellaLaVàSempreAlFosso
    .takeUntil { transilvaniaLiberaDaiMeridionali() }
    .forEach { siga(it) }
```

## Install
### Gradle
```
dependencies {
    // Your other dependencies
    implementation 'io.github.mmarco94:kadrekka:0.1-alpha'
}
```

## Examples
### Recursive binary search
Kotlin (taken from [Rosetta code](http://www.rosettacode.org/wiki/Binary_search#Kotlin)):
```
fun <T : Comparable<T>> Array<T>.binarySearch(target: T, lo: Int, hi: Int): Int {
	if (hi < lo) return -1

	val guess = (hi + lo) / 2

	return when {
		this[guess] > target -> binarySearch(target, lo, guess - 1)
		this[guess] < target -> binarySearch(target, guess + 1, hi)
		else -> guess
	}
}
```
What is this?! Only fancy intellectuals are able to understand this blob.  
Let's see **Katrekka**'s equivalent:
```
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
```
Now, that's better. 

### Iterative binary search
Kotlin:
```
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
```
**Katrekka**'s equivalent:
```
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
```
Wow, even a newborn polentun could understand that!

## Appendix
[1] = For some people, it may be easier to understand a `polentun` than a `terun`.