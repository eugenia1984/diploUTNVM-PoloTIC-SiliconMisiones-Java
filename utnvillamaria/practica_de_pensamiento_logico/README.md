# Teoria

## Desarrollo de Software

Empieza con al definicion de un problema, su analisis y ver como lo vamos a resolver. Y luego nos poneos a programar.

Interpretar especificaciones de diseño o requisitos, entender contexto, cuál es el problema a resolver.

Ver el alcance del problema y convalidar su interpretación a finde identificar aspectos faltantes.

Desarrollo algoritmicos que dan soluciones a los problemas asignados o derivados de los mismos.

## Elementos informaticos

**Software**: programas, procedimientos, reglas, documentacion

**hardware**: dispositivos de entrada: teclado, microfono, mouse / dispositivos de salida: pantalla, impresoa, auriculares / CPU ( procesador ) : unidad de control, memoria central, unidad aritmetca y logica / memoria externa : almacenamiento permanente

**redes internet**: internet aen toda aplicación / disminuye la brecha entre culturas ( comunicacion ) / seguridad

**programas**: lenguajes de programacion, empezaron con 0 y 1 (codigo de computadora, binario) y ahora son lenguajes.


## Sistemas

Teoria general de los Sistemas Bertalanffy

Conjunto de **elementos**, **relaciones** entre sí (finalidad) con **orden** u **organizacion** con una **función**, por ej. el cuerpo humano, un lavarropas, un auto.

Características:

   * **LIMITE**: concreto o simbólico (sirven para resolver algo, tienen un dominio)
   * **DEPOSITOS**: permanente o transitorio
   * **CANALES** de comunicacion (por donde viajan los datos)
   * **SUBSISTEMA** si es complejo, está formado por subsistemas
   
Su intercambio es mediante **ENTRADA (INPUT)** -> *proceso* -> **OUTPUT (SALIDA)**

## construccion de software

Proceso de:
   * Requerimiento, ideas, tiempo -> INPUT
   * Personas, materiales, energia, equipamiento, procedimiento -> PROCESO
   * Productos / servicios -> OUTPUT

Actividades del proceso de construcción de Software:
   * Especificación del software
   * Desarrollo del software
   * Validacion del software
   * Eolucion del software

Es un **proceso** automatizado con **herramientas** que se adapta al **proyecto** en el que se incorpora **personal** y como resultado se obtiene un **producto / servicio**

## Lógica

El estudio de los principios y metodos utilizados para distinguir el razonamiento correcto del incorrecto

Nos ayuda a resolver problemas de manera logica

## Proposicion logica

Afirma que algo es o no es por lo tanto cualquier proposicion puede ser afirmada o negada. x ej: Jorge Luis Borges es un escritor

Es una ORACION DECLARATIVA sobre la cual TIEEN SENTIDO DECIR QUE ES VERDADERA O FALSA

Son: oraciones INTERROGATIVAS / IMPERATIVAS / DESIDERATIVAS (que expresa un deseo)   EXCLAMATIVA o ADMINISTRATIVA NO afirman o niegan algo. x ej: Quizas mañana llueva. Ojala gane la loteria

## Proposiciones simples

NO tienen oraciones que las compongan que se encuentren afectada por NEGACIONES(NO), CONJUNCIONES (Y), DISYUNCIONES (O), IMPLICACIONES (SI...ENTONCES)

NO contienen operador logico


## Proposiciones compuestas

SI  tienen oraciones que las compongan que se encuentren afectada por NEGACIONES(NO), CONJUNCIONES (Y), DISYUNCIONES (O), IMPLICACIONES (SI...ENTONCES)

Contienen algun tipo de operador logico

## ¿ Cuáles NO son proposiciones logicas?

las oraciones DUBITATIVAS y los JUICIOS DE VALOR ya que su verdad no puede ser establecida. x ej.: Francisco es un excelente docente.

## Valores de verdad

1 = verdadero

0 = falso

Hace referencia al posible valor de verdad o falsedad que puede tener una fórmula, admitiendo el principio de bivalencia, es verdadero o falso, no puede ser ambos

## Operadores logicos : negacion -> NOT ~

| p | ~p |
| - | -- |
| V | F |
| F | V |

## Operadores logicos : conjuncion ->  AND Y ^ &&

Solo es verdadero si ambas son verdaderas

| p | q | p ^ q |
| - | - | --- |
| v | V | V |
| V | F | F |
| F | V | F |
| F | F | F |

Sirve para redirigir el flujo del algoritmo (bifurcamso codigo)

## Operadores logicos :disyuncion -> OR O v ||

Con que una sea verdadera, es verdadero

| p | q | p v q |
| - | - | --- |
| v | V | V |
| V | F | V |
| F | V | V |
| F | F | F |

Sirve para redirigir el flujo del algoritmo (bifurcamso codigo)

## Algoritmo

Paso previo a un programa

Un método para resolver un problema, tiene ciertos pasos a seguir: ENTRADA (INPUT) -> PROCESO -> SALUDA (OUTPUT)

   * Debe ser preciso
   * Estar especificamente definido
   * Se finito (tiene un fin)
   * Ser correcto
   * Es independeinte del lenguaje y del medio

Por ejemplo:

Calcular el area de un rectangulo de 10 cm de base y 5 cm de altura

```
- Entrada de datos: altura = 5 cm
                     base = 10 cm
- Proceso = rea = base * altura   
- Salida: Area = base x altura
```    

## Validacion de algoritmos

PRUEBA DE ESCRITORIO para validar un algoritmo, utilizando datos reales. Hacer seguimeinto de un algoritmo recorriendo las sentencias secuencialmente, simulando el funcionamiento de la computadora.

Identificar varaibles de entrada, auxiliares y de salida.

A medida que se van recorriendo las lineas se anotan en una TABLA AUXILIAR los valores que van tomando las variables

---

## Construccion de un programa

Pasos:

   * Definicion del problema
   * Analisis del problema
   * Diseño del algoritmo : diagrama de flujo / pseudocodigo
   * Codificacion
   * Prueba y depuracion: pruebas de escritorio / pruebas ayudadas con pogramas de desarrollo

----

## Elementos de un programa : ARAIALBES Y CONSTANTES

**VARIABLES**: direcciones de memoria con un valor. numero, letra, valor nulo, etc

**CONSTANTES**: direcciones de memoria con un valor que no varía durante la ejecucion del programa.

Tipos de datos: byte, short, Integer, Long, float, decimal, boolean

``` 
[privacidad] [tipo_de_variable] [identificador];
``` 

identificador: el nombre, debe representar el dato que almacena, en camelCase

tipo de variable: boolean (true/false), int, byte, short, long, float, double, String (cadena), char (caracter)

----

## Operadores ariteticos

```  
+ suma
- resta
/ division
% resto o modulo
```  

----

## Operadores unitarios

```  
++ incremento
-- decremento
! cambia el valor
```  

---

##  Operadores logicos relacionales

```  
== igual a
!= distinto de
> mayor que
>= mayor igual que
< menor que
<= menor igual que
```  

---

## Rutina (METODO / FUNCION)

   * bloque: conjunto de senencias
   * puede tener valor de retorno y parametros
   
----

## Java

   * multi-plataforma : windows, lunux, Mac, mobile
   * robusto : control del codigo mas fuerte que los otros lengajes
   * POO: uno de los paradigmas mas usados en programacion
   * gran funcionalidad
   * mucho open source : se puede usar codigo de terceros, no hay que inventar la rueda, se puede adaptar codigo, amplia comunidad
   * facil de aprender, a comparacion de C y C++
   * desarrollo web, aplicaciones mobiles, programas para empresas


---

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


