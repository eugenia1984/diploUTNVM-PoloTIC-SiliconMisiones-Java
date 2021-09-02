# Clase 4

## Arreglos (Arrays)

Los arreglos (o arrays) son un conjunto de datos que se almacenan en memoria de manera contigua con el mismo nombre, pero con diferentes índices para diferenciar cada uno de ellos.

los arreglos son estructuras fijas que se declaran y que mantienen su tamaño durante toda la ejecución del programa. Si declaro un arreglo de 5 osiciones, mantendrá esas 5 posiciones.

Cada arreglo que se cree puede ser de un determinado tipo de datos y puede almacenar solo valores de ese tipo.

Ejemplo:

índices / posiciones

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 
| - | - | - | - | - | - | - | - |
| 35 | 40 | 23 | 11 | 91 | 16 | 7 | 12 |

Me lo puedo imaginar como un conjunto de cajas, una al lado de la otra, cada caja es un elemento de mi arreglo, todas pueden guardan un mismo tipo de dato.


---

## Arreglos unidimensionales : vectores

Poseen solo filas o solo columnas (una sola dimensión). Por ejmplo: los vectores



```
int numeros[] = new int[8];  //declaro e inicializo mi arreglo

//Relleno las posiciones manualmente
numeros[0] = 35;
numeros[1] = 40;
numeros[2] = 23;
numeros[3] = 11;
numeros[4] = 91;
numeros[5] = 16;
numeros[6] = 7;
numeros[7] = 12;

System.out. println("El numero en la quinta posicion es: " + numeros[4]);
```

   * *numeros* es el nombre de mi vector

   * *int* es el tipo de dato que guardara

   * Los corchetes me indican que es un vector

   * 8 es la dimensión de mi vector


Mi vector es el siguiente:

| 35 | 40 | 23 | 11 | 91 | 16 | 7 | 12 |
| -- | -- | -- | -- | -- | -- | - | -- |

0 1 2 3 4 5 6 7 -> indices


**indices** = **posicion** - 1


Ejemplo:

```
package arreglos;

public class Arreglos {

  public static void main(String[] args) {
    //creo mi vector
    int vector[] = new[3];
    //agrego valores de forma manual
    vector[0] = 35;
    vector[1] = 23;
    vector[2] = 24;
    
    System.out. println("El numero en la primera posicion es: " + vector[1]);
  }
}
```

También puedo cargar el vector con un FOR:


```
package arreglos;

public class Arreglos {

  public static void main(String[] args) {
  
    //creo mi vector
    int vector[] = new[3];
    
    Scanner reclado = new Scanner(System.in);
    
    //cargo valores con un for
    for( int i = 0; 1 <= 2; i++) {
      System.out.ln("Ingrese el valor para el indice: " + i);
      vector[i]= teclado.nextInt();
    }
    
    //muestro los valores con un for
    for( int i = 0; 1 <= 2; i++) {
      System.out.ln("Estoy en el indice: " + i + " y tengo el valor " + vector[i]);
    }
  }
}
```

**Error por desbordamiento** cuando intento acceder a una posición del vector que no existe.

Por ejemplo si mi vector tiene 20 posiciones y queremos acceder a la 21, la misma no existe. SI uso el vector 20 del vector es la posición 21, no existe en mi vector.

En el codigo voy a ver el siguiente mensaje -> ```Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException```

---

## Arreglos bidimensionales: matrices

Forman tablas de valores, donde existen dos dimensiones tanto filas como colomnas. Por ejemplo: las matrices.

Son cajas que forman como un cubo, tiene cajas una al lado de la otra y también una arriba de la otra.

las matrices tienen las características de tener tanto filas como columnas

```
    0    1    2    3    4     5
   -------------------------------
0 | 35 | 40 | 23 | 11 | 91 | 16  |
  --------------------------------
1 | 4  |  5 |  8 | 64 | 61 | 36  |
   -------------------------------
2 | 14 | 11 |  6 | 20 | 46 | 48  |
  -------------------------------- 
3 |  2 |  8 | 16 | 32 | 64 | 128 | 
  --------------------------------
```
