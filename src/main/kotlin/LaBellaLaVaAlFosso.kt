val laBellaLaVàAlFosso = """La bella la va al fosso
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
La bella la va al fosso
Al fosso a resentar
E al fosso a resentar.
Intant che la resenta
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
Intant che la resenta
Al ghè cascà l'anel
Si al ghè cascà l'anel.
Allor si mise a piangere
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
Allor si mise a piangere
Che l'ha perdù l'anel
Si che l'ha perdù l'anel
La sbassa gli occhi all'onda
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
La sbassa gli occhi all'onda
La vide un pescator.
E la vide un pescator.
O pescator dell'onda
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
O pescatore dell'onda
Pescatemi l'anel
Su pescatemi l'anel.
E quand l'avrai pescato
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
E quand l'avrai pescato
Un regalo ti farò
Un regalo ti farò.
Andrem lassù sui monti
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
Andrem lassù sui monti
Sui monti a far l'amor
Si sui monti a far l'amor
Andrem lassù sui monti
Ravanei remolaz barbabietol' e spinaz
Daghel al terun
Andrem lassù sui monti
Sui monti a far l'amor
Si sui monti a far l'amor
Andrem lassù sui monti
Sui monti a far l'amor
Si sui monti a far l'amor""".split("\n")

val laBellaLaVàSempreAlFosso = sequence { yieldAll(laBellaLaVàAlFosso) }