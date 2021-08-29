# Clase 3

## Estructuras repetitivas

   * Permiten ejecutar una cierta porción de código por una determianda cantidad de veces (N cantidad de veces).
   * Esta ejecución repetitiva se conoce como **bucle**
   * Existen dos tipos de bucles: **controlador por un CONTADOR** y **controlados por un CENTINELA**

Se puede pensar un bucle como un espiral para los mosquitos, que van en circulo en cada vuelta (iteracion) y en un momento termina (cuando la condición deja de ser true y pasa a ser false, el contador y el centinela son los encargados de que pase a ser false en algún momento).

---

##   Bucles controlados por contador y centinela

### Por Contador

En ellos existe una **variable** que **cuenta la cantidad de 'vueltas'** (ejecuciones) del bucle.

Cuando se llega a la cantidad que establece como máximo la varaible, el programa sale del mismo.

Yo SE LA CANTIDAD DE VUELTAS NECESARIAS, entonces uso al **contador** que es una *variable auxiliar* que se suele incializar en 0 y me va a ir contando las iteraciones (vueltas) del bucle.



Ejemplo en diagrama de flujo:


```
          Inicio
            |
            V
      contador < 10 -------------
             |                  |
  ---------> |                  |
  |          V                  |
  |         S I                 | 
  |          |                  |
  |          V                  V
  |    (Hago un conjunto       N O
  |      de acciones)           |
  | contador = contador +1      |
  |          |                  |
  |----------|                  |
                                |
       (sigo con el  <-----------
    resto del programa)
             |
             |
             V
            Fin
 ```           

### Por centinela

   * Existe una variable (generalmente booleana) que establece un **valor** o **condición de salida del bucle**, a esta variable la suelen llamar *bandera* o *centinela*

   * **No exiiste una cantidad numérica que limite las ejecuciones** del bucle.

Por ejemplo, un bucle se puede ejecutar mientras una **variable tenga el valor verdadero**, si esta pasa a falso, se debe **salir** del mismo. No necesariamene tiene que ser un boolean, puede ser una String o una relación.


Ejemplo en diagrama de flujo:


```
          Inicio
            |
            V
      centinela = true-----------
             |                  |
  ---------> |                  |
  |          V                  |
  |    centinela = true         | 
  |          |                  |
  |          V                  V
  |    (Hago un conjunto       N O
  |      de acciones)           |
  |        ...                  |
  |          |                  |
  |          |                  |
  |----------|                  |
             |                  |
       (sigo con el  <-----------
    resto del programa)
             |
             |
             V
            Fin
 ```         

Un ejemplo sería si voy a anotar clientes y no se cuántos tengo.

Con un bucle va  haciendo todo hasta encontrar la parada.

---

##  While (Mientras)

---

## Bucles infinitos

---

## For
