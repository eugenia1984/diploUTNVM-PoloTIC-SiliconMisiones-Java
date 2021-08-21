# Ejercicio 1

–Indique cuales de las siguientes oraciones son proposiciones lógicas

1. La máquina me persigue -> SI

2. Hoy es lunes? -> NO

3. Hoy es lunes -> SI

4. Ábreme esa puerta. -> NO 

5. El gigante salió del armario. -> SI

6. Sabes cocinar? -> NO

7. La lógica no existe -> SI

8 Debes pagarme lo que me debes. -> NO

9. El programa fallo. -> SI

10. ax2 + bx + c2 = 0 -> SI



# Ejercicio 2

– Indique de las siguientes proposiciones lógicas, cuales son simples y cuales son compuestas. 

1. Si hoy es lunes, entonces mañana será martes **o** miércoles.  -> es compuesta

2. Voy a viajar becado a EE. UU. con Marcela **o** a Alemania con Emiliano.  -> es compuesta

3. Jorge **no** quiere viajar en avión.  -> es simple o compuesta, acorde a la bibliografía por ser NEGACION

4. No comeré mariscos **y** tampoco clavos.  -> es compuesta

5. 3 + 4 = 7 **o** no me llamo José  -> es compuesta


# Ejercicio 3

-Exprese las negaciones de las siguientes proposiciones lógicas.

1. p: "2+2 = 4" -> 2+2 != 4  ||  2+2 no es igual a 4 || no es cierto que 2 más 2 es 4

2. q: "1 = 0" -> 1 != 0

3. r: "Los diamantes son el mejor amigo de una perla." -> "Los diamantes no son el mejor amigo de una perla."


# Ejercicio 4

–Exprese utilizando conjunción las siguientes proposiciones simples:

1. Si p: "Esta galaxia, en última instancia, terminara en unagujero negro"   y   q: "2+2 = 4".

Entonces que significa p^q?

Esta galaxia, en última instancia, terminara en unagujero negro Y 2+2 = 4.



2. Si p: La letra “a” es una vocal española y q: 3 es un numero primo.

Que significa p^q?

La letra “a” es una vocal española Y 3 es un numero primo.


# Ejercicio 5

-Exprese utilizando disyunción las siguientes proposiciones simples:


1. Sean p: “2 es un número impar” y q: “7 es un numero primo”

a- Que significa pvq?

p O q   ->   2 es un número impar O 7 es un numero primo

b- Que significa (pv~q)?

p O NO q   ->   2 es un número impar O 7 no es un numero primo


2. Sean p: "El mayordomo lo hizo",  q: "El cocinero lo hizo", y   r: "El abogado lo hizo".

a- Que significa pvq?

p O q   ->   El mayordomo lo hizo O El cocinero lo hizo

b- Que significa (pvq) (~r)?

( p O q ) (NO r)    ->   El mayordomo lo hizo O El cocinero lo hizo   El abogado NO lo hizo


# Ejercicio 6

Construya las tablas de verdad para las siguientes proposiciones:

1. Sean p: “2 es un nro impar” y q: “7 es un nro primo"

|p v q | p ^ q | p^ ~q |
| ---- | ----- | ----- |
| 2 es un nro impar Y es un nro primo | 2 es un nro impar O es un nro primo | 2 es un nro impar O NO es un nro primo |


Ejemplo para armar una tabla de verdad (repetir para los otros dos ejercicios)

| 2 es un nro impar |7 es un nro primo |2 no es un nro impar | 7 no es un nro primo |2 es un nro impar o 7 es un nro primo | 2 es un nro impar y 7 es un nro primo | 2 es un nro impar y 7 no es un nro primo |
| -- | -- | --- | --- | ---------- | ---------- | ---------- |
| p  | q  |  ~p |  ~q | p   v    q | p   ^    q | p^      ~q |
| V  | V  |  F  |   F | V O V -> V | V Y V -> V | V Y F -> F |
| V  | F  |  F  |   V | V O F -> V | V Y F -> F | V Y V -> V |
| F  | V  |  V  |   F | V O F -> V | F Y V -> F | F Y F -> F |
| F  | F  |  V  |   V | F O F -> F | F Y F ´> F | V Y V -> V |


2. Si p: La letra “a” es una vocal española y q: 3 es un numero primo

| p  v ~q | p ^ q | ~p^ ~q |
| ------- | ------ | ------ |
| La letra “a” es una vocal española O 3 es un numero primo | La letra “a” es una vocal española Y 3 es un numero primo | La letra “a” NO es una vocal española Y 3 NO es un numero primo |




3. Sean p: Jorge no quiere viajar en avión y q: No comeré mariscos

| p v q | p ^ q |~p^ ~q |
| ----- | ----- | ----- |
| Jorge no quiere viajar en avión Y No comeré mariscos | Jorge no quiere viajar en avión O No comeré mariscos | Jorge  quiere viajar en avión Y  comeré mariscos |


