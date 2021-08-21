# Teoría y práctica 

## Break - Continue

•**Break**: La palabra reservada “break” nos permite **“romper” un loop**, es decir, finalizarlo inmediatamente.

Se usa en el switch y tambien en el cliclo for.


•**Continue**: La palabra reservada “continue” nos permite **“romper” SÓLO UNA ITERACIÓN**, de tal manera que **el ciclo seguirá con su siguiente iteración después del “continue”**.


[**ver ejercicios de practica en BreakYContinue**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/fibonacciRecursivo/BreakYContinue)


---

## Ejercicio de Fibonacci


```JAVA
public class MyClass {

  public static void(String[] args) {
  
  //mis dos primeros numeros son estaticos , no se calculan sumando anteriores
    int n1 = 0;
    int n2= 1;
    System.out.println(n1);
    System.out.println(n2);
    
    for( int i = 2; i < 10, i++) {
      int n3 = n2 + n1;
      System.out.println(n3);
      //En este punto ya tenemos el valor de 1
      n1 = n2;  //n1 es 1
      n2 = n3;
    }
  }
}

```

[**ver FibonacciRecursivo**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/fibonacciRecursivo/FibonacciRecursivo.java)
---

## Arrays

•Un array es una **variable que puede contener valores múltiples**, a diferencia de una variable regular que solo puede contener un único valor. 

•Es un **conjunto de variables del mismo tipo** agrupadas todas ellas bajo un mismo nombre, y distinguiéndolas mediante un índice numérico.


## Instanciando un Array

```JAVA
int[] miArray = new int[cantidad];
int[] miArray = {10, 43, 102, 49};
```

## Accediendo a los elementos del array

•Se accede mediante un **índice** que va desde 0 hasta la cantidad de elementos del array, utilizando la siguiente sintaxis: 

```JAVA
miArray[índice]
```

•Se puede usar la función **“length”** para saber la longitud del array.

•Se puede acceder a todos los elementos usando un **loop** (**ciclo FOR**).

---


Ejercicios

•Instalar Eclipse IDE y ejecutar un algoritmo (puede ser un “Hola Mundo”)

•Crear un ciclo for que calcule el promedio de un array de elementos enteros.

