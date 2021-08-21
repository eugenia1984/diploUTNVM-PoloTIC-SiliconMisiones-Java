# Clase 1 : Introduccion a Java


## ¿Qué es programar?

-Es un conjunto de instrucciones que se especifican a una computadora para que realice una función de manera automática.

-Es un conjunto de pasos que se llevan a cabo para solucionar un problema de manera automática por medio de instrucciones a una computadora


----


## Lenguajes de programación

-Un lenguaje de programación es un **conjunto de palabras y sintaxis** que en conjunto proporcionan una serie de **instrucciones** que le permiten a un programador escribir **secuencias de ordenes** y **algoritmos** con el fin de controlar el comportamiento físico y/o lógico de una computadora con el objetivo de que se cumplan ciertas acciones.
 
-Algunos ejemplos son **Java**, **JavaScript**, **PHP**, **Python**, **C++**, **C#**, entre otros. 

.NET es un framework, todavía se discute si es lenguaje o no

---

## ¿ Qué es Java?

-Java es un lenguaje de programación y tecnología pensada para **desarrollo de aplicaciones de gran envergadura**, altamente **escalables**, de gran **integración** con otras tecnologías muy robustas.

-Tiene características que lo diferencian y lo hacen una muy buena opción para elegirlo como lenguaje de programación:

   * lenguaje **orientado a objetos**
   * es **multiplataforma**, se puede ejecutar en Windows, Linux y Mac
   * **manejo automático de memoria**
   * **evolución** permanente
   * gran demanda en el mercado
   
 
Los bancos lo utilizan.
 
Se pueden hacer aplicaciones de escritorio, aplicacines webs y aplicaciones para el desarrollo mobile.


---
 
 
 ## Versiones de Java
 
**J2SE (Java 2 Standar Edition)** : tiene como objetivo el **desarrollo de aplicaciones de escritorio**, similares a las aplicaciones tipo ventanas creadas con Visual Basic o Delphi, Incluye la funcionalidad básica del lenguaje como manejo de clases, colecciones, entrada / salida, acceso a base de datos, manejo de sockets, hilos de ejecución, etc.
 
**J2EE (Java 2 Enterprise Edition)** : tiene como objetivo el **desarrollo de aplicaciones empresariales**, de gran envergadura. Contempla ambientes web, como los ambientes manejados por servidores de aplicación. Las tecnologías principales incluidas en esta área son Selvets, JSP, EJB, entre otras.
 
 
---


## ¿ Qué es un IDE ?

-Un **IDE (Integrated Development Enviroment)** es un **entorno de desarrollo integrado**. Es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.

-Un IDE consta, de un **editor de código fuente**, **herramientas de construcción automática** y un **depurador**. Algunos de ellos contienen también un **compilador**, un **intérprete**, o ambos, como el caso de NetBeans o Eclipse.


---


## ¿ Qué necesitamos para programar en Java ?

-Un **IDE**, en este caso utilizaremos NetBeans 8.2, que funciona para todas las computadoras, ya sean viejas o nuevas.

-**JER (Java Runtime Enviroment)** es un conjunto de utilidades que permite la ejecución de programas Java.

-**JDK (Java Development Kit)** es un software que provee herramientas de desarrollo para la creacion de programas en Java.


---


## Sintaxis

-Java se destaca por ser un lenguaje **fuerteemnte tipado**, es muy exigente tanto con su **sintaxis** como son sus **tipos de datos**.

Entre estas 'exigencias' se destacan:

  * Es **case sensitive**, distingue entre mayúsculas y minúsculas
  * Cada línea de código debe finalizar con **;**
  * El principio y el fin de cada estructura, así como los bloques de código se delimitan con llaves  ->  ```{ } ```


---


## Primer Hola Mundo con Java

```JAVA
package hello;

public class Hello {
  public static void main(String[] args){  //empieza con llave
    System.out.println("Hola mundo!");   // finaliza con ;
  }  //termian con llave

}
```


---


## Variables y constantes

Una **variable** es un nombre que se asocia con una porción de la memoria de la computadora, en la que se guarda un valor determinado.

Un ejemplo del uso de variables es en matemáticas, donde un valor **X** puede tener infinita cantidad de valores asignados, por ejemplo **X = 5**

Las **constantes** son valores que se mantienen siempre de igual manera y que no dependen de una asignación para obtener el mismo. Por ejemplo el IVa en alimentos es de 21%.

---

## Tipo de datos

Los tipos de datos definen qué puede ser almacenado dentro de una variable  los límites de lo que allí se almacena. Por ejemplo so quiero una variable que solo almacene números enteros.

Algunos de los tipos de datos más usados son:

   * Enteros: **int** , por ej.: 0, 1, 35, 120, 44
   * Decimales: **double** o **float** , por ej.: 1.5 - 35,4
   * Boolean: **boolean** , por ej.: true, false
   * Caracteres: **char**, por ej: 'a', 'b', 'i', 'e', van siempre entre comillas simples
   * Cadena de caracteres / texto: **String** , por ej. "Hola Mundo", van siempre entre comillas dobles
   * Entero largo: **long**, números entre: (-9.223.372.036.854.775.808 y 9.223.372.036.854.775.808)

Ejemplo en código Java

```JAVA
public class Prueba {
  public static void main(String[] args) {
    int num = 35;
    String perro = "Pipi";
    double promedio = 8.95;
    boolean bandera = true;
    long numlargo = 1896542153;
    char letra = 'a';
  }
}
```

---

## Regla para nombres de variables

-Para elegir los nombres de nuestras variables deberemos seguir un conjunto de reglas:

1- No puede comenzar con un número.

2- No puede utilizar caracteres especiales o ninguno que esté reservado para otras operaciones

3- No puede incluir el carácter espacio en blanco

4- Distingue entre letras mayúsculas y minúsculas (es case sensitive)

5- No se puede utilizr las palabras reservdas como identificadores (double, int, String, static, public, void, entre otras)

Como sujerencia y buena práctica siempre es mejor que las variables lleven nombres **representativos**, si por ejemplo debo calcular un promedio la nombro promedio, prom

---

## ¿ Cómo declaro una variable ?

La declaración de las variables cuenta de dos partes fundamentales : **tipo de dato** **nombre /identificador** **;**

Por ejemplo:

```JAVA
public class Prueba {
  public static void main(String[] args) {
    int num = 35;
  }
}
```

**tipo de dato** -> int

**nombre / identificdor** -> num

---

## Operadores

Un **operador** es un símbolo especial que indica al compilador que debe efectuar una determianda operación

Estas operaciones pueden ser de **asignación**, **aritméticas**, **condicionales**, **relacionales**, entre otras.

Por ejemplo:

### Aritméticas

```
+  ->  suma
-  ->  resta
*  ->  multiplicacion
/  ->  division
%  ->  modulo
```

###  Relacionales

```
==    ->   igual que... 
>     ->   mayor que..
<     ->   menor que..
>=    ->   mayor o igual que...
<=    ->   menor o igual que...
!=    ->   distinto que...
```

Ejemplos:

```JAVA
if(numero == 1) {...}

while(numero < 100) {...}

if(numero >= 150 {...}

if(numero != 1) {...}
```

Cuando trabajamos con String:

Cuando quiero ver si dos String son iguales   -> ``` equals()```

Cuando quiero ver si dos String son distintas  -> ``` !......equals()```

Ejemplo en código:


De igualdad:

```JAVA
if( palabra.equals("hola") ) {...}
```

De distinto / no igual:
```JAVA
if( !palabra.equals("hola") ) {...}
```

### Condicionales

```
&&  ->  and
||  ->   or
|   ->  not , negación
```

Ejemplo de operaciones:


```JAVA
public class Prueba {
  public static void main(String[] args) {
    //Ejemplo asignacion
    //asigno la cadena linda a la variable casa
    String casa = "linda";
    
    //Ejemplo de asignacion y operacion aritmetica
    int numero1 = 0;
    int numero2 = 35;
    int resultado = numero1 + numero2;
  }
}
```
