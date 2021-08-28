# Clase 9

## Estructuras : listas, pilas, colas, arboles

Estructuras de datos que nos permiten coleccionar elementos

Operaciones:
   * colocar
   * obtener


---

### PILAS:

| 3 |
| - |
| 2 |
| 1 |

   * Se denominan **LIFO** Last In Forst Out -< Primero en entrar último en salir. Se piensa como una pila de platos
   * Las operaciones básica son: **PUSH** (colocar un elemento al principio) y **POP** (obtener el último elemento colocado)
   * Otras pueden ser: **cima()**, **esVacia()**, **buscar()**, **eliminar()** la pila no puedo eliminar un elemento del medio, siempre comienzo a sacar de arriba uno a uno, **listar()**
   
Ejemplo :

| buzo |
| ---- |

| jeans |
| ----- |
| buzo |

| remera |
| ------ |
| jeans |
| buzo |

Ejemplo en pseudocodigo con mi pila (**STACK**) denominada *sillaDelDormitorio* y con el **PUSH** voy agregando elementos

``` 
BEGIN
STACK sillaDelDormitorios
  PUSH(sillaDelDormitorio, "buzo")
  PUSH(sillaDelDormitorio, "jeans")
  PUSH(sillaDelDormitorio, "remera")
END
```



Y para ir eliminando con el **POP**:

| remera |
| ------ |
| jeans |
| buzo |

| jeans |
| ----- |
| buzo |


| buzo |
| ---- |

``` 
BEGIN
STACK sillaDelDormitorios
  POP(sillaDelDormitorio)      remera
  POP(sillaDelDormitorio)      jean
  POP(sillaDelDormitorio)       buzo
END
```

---

### COLAS:

| 1 | 2 | 3 | 4 | 5 |

   * Se denomina también **FIFO** First In First out, debido a que el primer elemento en entrar será también el primero en salir
   * Las operaciones básicas de las pilas son : **PUSH** agrega (se realiza por un extremo, agrega al final) y **POP** extrae  (se realiza por otro extremo, saca al inicio)

Se usan para manejar stock de productos, asi van sacando como primero el más próximo a vencer

Un ejemplo en una cola para una caja en el supermercado, que voy gregando:

| Araceli |
| ------- |

| Araceli |
| ------- |
| Santiago |

| Araceli |
| ------- |
| Santiago |
| Paulina |

En pseudocodigo, para ir agregando:

``` 
BEGIN
COLA  cajaDelSupermercado
  PUSH(cajaDelSupermercado, "Araceli") 
  PUSH(cajaDelSupermercado, "Santiago")
  PUSH(cajaDelSupermercado, "Paulina")
END
```

Un ejemplo en una cola para una caja en el supermercado, que voy sacando:

| Araceli |
| ------- |
| Santiago |
| Paulina |

| Araceli |
| ------- |
| Santiago |


| Araceli |
| ------- |


En pseudocodigo, para ir sacando:

``` 
BEGIN
COLA  cajaDelSupermercado
  POP(cajaDelSupermercado) 
  POP(cajaDelSupermercado) 
  POP(cajaDelSupermercado) 
  POP(cajaDelSupermercado)  -> ERROR
END
```

No son estructuras tan utilizadas

----

### LISTAS:

| a | b | c | d | e |
| - | - | - | - | - |
| 0 | 1 | 2 | 3 | 4 |

   * de tamaño fijo o variable (me ayuda si no tngo un numero definido, puedo ampliarla o achicarla)
   * los elementos (items) de una lista deben ser del mismo tipo de dato
   * Zero-based -> índices comienzan en 0, el primer elemento está en el índice 0
   * la cantidad de elementos total -> **length** será igual al  número  del último elemento (índice o subindice) más 1. 
   
En el ejemplo su longitud -> length = 5.

El elemento que agrego **se agrega al final** salvo que lo indique con **nombre de la lista** y **posicion a tener**

En pseudocodigo:

| Enero | Febrero | Marzo | Abril | Mayo | Junio | Julio |
| ----- | ------- | ----- | ----- | ---- | ----- | ----- |
| 0 | 1 | 2 | 3 | 4 | 5 | 6 |
```
BEGIN
 Lista mesesDelPrimerSementre
 Obtener(mesesDelAño,0) -> Enero
 Obtener(mesesDelAño,6) -> Julio
 Obtener(mesesDelAño,12) -> ERROR porque este indice no existe, tngo como en el ejemplo solo 7 elementos / hasta indice 6 
END 
```
Puedo **sacar elementos desde cualquier posicion**

---

### ARBOLES:

   * Son estructuras **no lineales**
   * Un árbol consta de un conjunto finito de elementos, enominados **nodos** t un conjunto finito de lineas rígidas, denominadas **ramas**, que conectan los nodos
   * El número de ramas asociado con un nodo es el **grado** del nodo

Se puede imaginar como un árbole genealógico, es muy importante por ser NO LIEAL, me permite un recorrido dinámico, tengo muchas formas de recorrerlo.

Casi todos los sistemas almacenan sus archivos en árboles.

Sus números son finitos, parte desde la RAIZ y se desprenden los NODOS.

Lso NODOS que NO TIENEN HIJOS son las **HOJAS**.

El nivel del NODO es al distancia que tiene con la RAIZ.

Las RAMAS son importantes porque me va conectndo a los PADRES con los HIJOS

```
Nivel 0                    A  (RAIZ)
Nivel 1           B        E       F (NODOS INTERIORES)
Nivel 2          C D             G H I (HOJAS)
```
Padres: A, B, F

Hijos: B, E, F, C, D, G, H, I

Hermanos: (B, E, F) , (C, D), (G, H, I)

Hojas: C, D, E, G, H, I

Ramas: AB, AE, AF, BC, BD, FG, FH, FI


Por lo general en Java es HERENCIA UNICA **cada elemento tieen UN solo padre**

Un tipo de árbol muy utilizado es el **árbol binario**, un PADRE NO PUEDE TENER MAS DE DOS HIJOS, por cada padre solo tengo 1 o 2 hijos.

```
                         A
                B                C
             D   E             F   G
```

---

# Algoritmos fundamentales: Ordenamiento, Búsqueda, recorrido

   * Sirven para dar un orden determinado a los elementos de la lista
   * Ordenar listas en orden alfabético u orden numérico -> muy usual
   * El orden puede ser ascendente (de menor a mayor) o descendiente (de mayor a menor)
   * Algunos algoritmos de ordenacion son: **ordenamiento por inserción**, **algoritmo de la Busbuja**, **Ordenamiento por selección**, **algoritmo Quick-Sort**.

### Ordenamiento de Inserción

Empieza a recorrer mi vector/lista desde el segundo elemento, lo compara con el anterior y si es menor lo intercambia y asi va haciendo con todos, siempre va a ir comparando con los elementos anteriores.

```
K -> 3 8 2 1 4 2
     3 8
     2 3 8
     1 2 3 8
     1 2 3 4 8
     1 2 2 3 4 8
```

Con codigo Java:

```JAVA
public static void insercionDirecta(int A[]) {
  int p,j;
  int aux;
  for( p = 1; p < A.length; p++) {    //desde el segundo elemento
    aux = A[p];   //el final, guardamos el elemento y
    j = p -1;   // empezamos a comprobar con el anterior
    while( j >= 0 ) && ( aux < A[j]) ) { //mientras queden posiciones y el valor de aux sea menos que los
      A[j+1] = A[j];  // de la izquierda, se desplaza a 
      j--;  //la derecha
    }
    A[j+1] = aux;  //colocamos aux en su sitio
  }
}
```

### Ordenamiento de la burbuja

   * Este algoritmo consiste en comparar cada elemento de la lista con el siguiente (por parejas), si no están en el orden concreto, se intercambian entre sí sus valores
   * El valor más pequeño flota hasta el principio de la lista

```
2 3 4 5 1     NO ORDENADO
2 3           2 < 3 OK
  3 4         3 < 4 OK
    4 5       4 < 5 OK
      5 1     5 > 1 INTERCAMBIA
    

2 3           2 < 3 OK
  3 4         3 < 4 OK
    4 1       4 > 1 INTERCAMBIA  

2 3           2 < 3 OK
  3 1         3 > 1 INTERCAMBIA
 
2 1           2 > 1 INTERCAMBIA   

1 2 3 4 5     ORDENADO
```

Con codigo Java:

```JAVA
public static void burbuja(int[]matriz) {

  int temp;
  for( int i=1; 1 < matriz.length; i++) {
    if(matriz[j] > matriz[j+1]) {
      temp = matriz[j];
      matriz[j] = matriz[j+1];
      matriz[j+1] = temp;
    }  //cierro if
  }  //cierro for
}  // cierro main
```

No es eficiente para ordenar gran volumen de datos


### Ordenamiento por Selección

   * Similar al método de la burbuja
   * Primero recorre todoa la lista buscando el **menor/mayor** de todos los elementos
   * En la siguiente iteración se recorre nuevamente la lista pero comenzando con el **segundo elemento**

50 26 7 9 15 27

En la primer vuelta tiene el número mínimo: 

**7** 26 50 9 15 27

Vuelve a buscar en una segunda vuelta, busca el minimo en los numeros restantes a partir del 7 ya ordenado :

7 **9** 50 26 15 27

7 9 **15** 26 50 27

7 9 15 **26** 50 27

7 9 15 26 **27** **50**

Poco eficiente para grandes volumenes de datos

En codigo Java

```JAVA
public static void seleccion(int A[]) {
  int i, j, menor, pes, tmp;
  for(i = 0; i < A.length; i++ ) {      //tomamos como menor al 1ro
    menor = A[i];                       //de los elementos que quedan por ordenar
    pos = i;                             //y guardamos su posicion
    for(j = i+1; j < A.length; j++ ) {   //buscamos en el resto
      if(A[j]< menor) {                  //del array algun elemento
        menor = A[j];                    // menos que el actual
        pos = j;
      }
    }
    if(pos != i) {                      //si hay algun menor se intercambia
      tmp = A[i];
      A[i]=A[pos];
      A[pos]=tmp;
    }
  }
}
```

### Ordenamiento Quick-sort

   * Este tipo de algoritmos se basa en la técnica **divide y venceras**
   * Pasos del algoritmo:
   
    * Elegir el elemento **pivote**; puede ser el primero, el segundo, o uno del medio
    
    * Resitua los demás elemento de la lista a cada lado del pivote, de manera que a un lado queden los menores que él, y al otro los mayores. En este momento, el pivote ocupa exactaemnte el lugar que le correspoderá en la lista ordenada.
    
    * La lista queda separada en do sublistas, una formada por los elementos a la izqueirda del pivote, y otro por los elementos a su derecha.
    * Repetir esete proceso para cada sublista mientras estas contengan más de un elemento


Ejemplo:

**8** 1 5 14 4 15 12 6 2 11 10 7 9

**6** 1 5 7 4 2 **8** **12** 15 11 10 14 9

**4** 1 5 2 **6** 7 **10** 9 11 **12** 14 15

2 1 **4** 5 9 **10** 11 14 15

1 2 

1 2 4 5 6 7 8 9 10 11 12 14 15

----


---

## Estructuras de datos en Java

LISTA -> LIST

COLA -> QUEUE

PILA -> STACK

En java cada uno tiene su librería con sus métodos

```
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Ejemplo {

  public static void main(String args[]) {
    Stack<Integer> pila = new Stack();
    Queue<Integer> cola = new Queue();
    List<Integer> lista = new ArrayList();
  }

}

```
