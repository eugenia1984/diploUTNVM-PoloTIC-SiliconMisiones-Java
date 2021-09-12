# Clase 14

---

## Seguimos con francisco resolviendo los ejercicios prácticos de la clase 10

---

## Ordenamiento burbuja 

   * Es un método que consiste en comparar pares de elementos adyacentes en un array y si están desordenados intercambiarlos hasta que estén todos ordenados.

Comparamos los dos primeros, vemos cuál es el mayor, el menor va primero y el mayor segundo, y asi va haciendo comparando de 2 en 2.


   * Es necesario revisar varais veces toda la lsta hasta que no se necesiten más intercambios, lo cual significa que la lista esté ordenada.
   
Como es de 2 en 2 hay que ir iterando N veces -1, donde N es la longitud del array.

   * No es un algoritmo +optimo de ordenamiento, es útil cuando el array tiene pocos elementos, ya que requiere más proesamiento computacional que cualquier otro algoritmo de ordenamiento

Vamos a tener muchos ciclos for, que van a ir creciendo exponencialmente, no es óptimo y relentiza el código.

---
