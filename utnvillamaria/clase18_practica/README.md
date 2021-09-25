# Clase 18 : POO práctica

Temas:

    * return
    * getter y setter
    * sobrecarga de métodos
    * métodos útiles de java
    * ejercicios
    
---

## Return

La secuencia return se emplea para salir de la secuencia de ejecución de un método y, opcionalmente, devolver un valor.

Tras la salida del método se vuelve a la secuencia de ejecución del programa al lugar de llamada de dicho método.

Nos devuelve un **valor** que puede utilizarse dentro del método

En cambio el ```System.out.println``` solo MUESTRA en pantalla NO nos devuelve ningún valor.


Ejemplo en código:

```JAVA
 public double getVelocidadMaxMillas(){  //1km = 0,6213millas
        //Multiplicar la velocidad maxima en km por el factor de conversion a millas
        //variable INTERNA (LOCAL) del método, fuera del método no existe
        Double VelocidadMaxMillas;
        VelocidadMaxMillas= velocidadMaxKm * 0.6213;
        return VelocidadMaxMillas;
    }
```    

---

## Getter y Setter

Los **getters** y los **setters** son métodos que se utilizar para **controlar y proteger el acceso a los datos de la clase**

Nos permiten **controlar** el **acceso** a las **variables** y también **cómo de modifican** o **asignan** esas variables.

Están relacionado con el **encapsulamiento**, utilizan los valores de los **atributos** (**properties**) de la clase.

**Getter** -> obtiene / devuelve el valorde la variable (atributo / propertie)

**Setter** -> setea el valor de la variable (atributo / propertie)


Ejemplo en código de SETTER:

**this** me indica que se lo asigne a al variable que es atributo de la clase CAr ya que la variable de mi parametro tiene el mismo nombre.

Por buena práctica el nombre que se pasa por parametro es igual al nombre del atributo que queremos settear 


```JAVA
 public void setVelocidadMaxKm(Integer velocidadMaxKm){
        this.velocidadMaxKm = velocidadMaxKm;
    }
```    

Y si por ejemplo no quiero que la velocidad máxima supere los 400 km/h, puede en el mismo setter aplicar lógica:

```JAVA
 public void setVelocidadMaxKm(Integer velocidadMaxKm){      
        //Si no quiero que la velocidad máxima supere los 400 km/h
        if(velocidadMaxKm > 400){
            System.out.println("Eso seguramente no es un auto.");
        } else {
            this.velocidadMaxKm = velocidadMaxKm;
        }    
    }
```    

```JAVA
public void setColor(String color){
        if(color == "amarillo"){
            System.out.println("No contamos con el color amarillo en este modelo"+
                    " por lo tanto se asignara el color blanco");
            this.color = "blanco";
        } else {
            this.color = color;
        }
    }
```  

Como **color** es un string dentro del if en vez de el == debo utilizar el equals: ```"amarillo".equals(color)```

Ejemplo de getter:

```JAVA
//GETTER de la velocidad maxima
    public Integer getVelocidadMaxKm(){
        return velocidadMaxKm;
    }
```

---

## Sobrecarga de método

La creación de varios métodos con el **mismo nombre** pero con **diferente lista e tipos de parámetros**.

Java utiliza el número y tipo de parámetros para seleccionar cuál definición de método ejecutar.

Java diferencia los métodos sobrecargados con base en el número y tipo de parámetros o argumentos que tiene el método y no por el tpo que devuelve.

En ejemplo de código:

```JAVA
 //SETTER para el color
    public void setColor(String color){
        if("amarillo".equals(color)){
            System.out.println("No contamos con el color amarillo en este modelo"+
                    " por lo tanto se asignara el color blanco");
            this.color = "blanco";
        } else {
            this.color = color;
        }
    }
    
    //SOBRECARGA del método setColor
    public void setColor(String color1, String color2){
        this.color = color1 + " " + color2;
    }
 ```
 
:computer: [**https://www.w3schools.com/java/java_encapsulation.asp**](https://www.w3schools.com/java/java_encapsulation.asp) 
 
----

## Métodos útiles de Java


**Class String**

java.lang.Object

java.lang.String

All Implemented Interfaces: Serializable, CharSequence, Comparable<String>


public final class **String**
  
extends Object
  
implements Serializable, Comparable<String>, CharSequence
  
The String class represents character strings. 
  
 All string literals in Java programs, such as "abc", are implemented as instances of this class.
  
Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. Because String objects are immutable they can be shared. For example:

 ```JAVA
 String str = "abc";
 ```
  
is equivalent to:

 ```JAVA
  char data[] = {'a', 'b', 'c'};
  String str = new String(data);
 ```
  
Here are some more examples of how strings can be used:

 ```JAVA
     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
```
 
The class **String** includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.

The Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. String concatenation is implemented through the **StringBuilder(or StringBuffer) class** and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification.

Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.

A String represents a string in the UTF-16 format in which supplementary characters are represented by surrogate pairs (see the section Unicode Character Representations in the Character class for more information). Index values refer to char code units, so a supplementary character uses two positions in a String.

The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for dealing with Unicode code units (i.e., char values).

 :computer: 
 [documentacion en Oracle con los métodos de la lase String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int,%20int)
  
---
