# Clase 5

Realizamos algunos de los ejercicios de la [guia](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices)

## Ejercicio 1:

Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.

Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.

```JAVA
package arreglos;

import java.util.Scanner;

public class Arreglos {

  public static void main(String[] args){
  
    //declaro mi vector y lo incicializo
    String nombres[] = new String[8];
    //siempre incicializo el Scanner por fuera del bucle
    Scanner leer = new Scanner(System.in);
    //Recorrido para incializar (CARGAR) el vector
    
    //con nombres.length me aseguro que nunca me voy a pasar del largo de mi vector
    //.next si solo va a tener una palabra, sin espacio
    //.nextLine si voy a tener más de una palaba y voy a tener espacios entre palabras
    
    for( int i; i < nombres.length, i++){
      System.out.println("Cargue el nombre para el índice : "+i);
      nombres[i] = leer.next();
    }
    
    //Recorro mi vector para mostrarlo
    for( int i; i < nombres.length, i++){
      System.out.println("En el índice : "+i+" tengo el nombre :" + nombres[i]);
    }
     
  }

}

```

---

## Shortcut:

```Alt + Shift + F```  ó *Format* y me va a identar bien el código.

---

## Ejercicio 3:

Realizar un programa que permita la carga de 15 números en un vector. una vez cargados, se necesita que el programa cuente e informe por pantalla cuántes veces se cargó el número 3.

```JAVA
package arreglos;

import java.util.Scanner;

public class Arreglos {

  public static void main(String[] args){
  
    //declaro mi vector y le doy dimension 15
    int numeros = new int[15];
    Scanner leer = new Scanner(System.in);
    //va a ser mi contador de los números 3, hay que inicializarlo en 0
    //Porque si no encuentra ningun 3 va a valer 0 y no tengo NullPoint Exception
    int contTres = 0;
  
    //Cargo mi vector
    for( int i; i < numeros.length, i++) {
      System.out.println("Ingrese el número para el índice : "+i);
      numeros[i[ = leer.nextInt();
    }
    
    for( int i; i < numeros.length, i++){
      if(numeros[i] == 3) {  //Si el valor del indice es 3
        contTres ++;  //contTres = contTres +1;
      }
    }
    
    //muestro cuantas veces tengo el 3
    System.out.println("La cantidad de números 3 que hay en el vector es : " + contTres);
  }
}  
```

---

## Ejercicio extra con vectores y matrices

Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de fútbol en los últimos 3 partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo.

Se necesita un programa que sea capaz de permitir la carga de ls goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un vector de 5 pocisiones, donde cada posición representará a un jugador.

Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:

| 2 | 1 | 4 |
| - | - | - |
| 3 | 2 | 0 |
| 0 | 1 | 3 |
| 0 | 0 | 1 |
| 1 | 0 | 2 |

Matriz

| 2,33 |
| ---- |
| 1,6667 |
| 1,3334 |
| 0,3334 |
| 1 |

Vector






```JAVA

```
