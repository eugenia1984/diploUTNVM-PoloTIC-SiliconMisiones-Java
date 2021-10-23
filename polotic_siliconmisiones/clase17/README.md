# Clase 17 : 20 Octubre

## Colecciones

-Las colecciones son estructuras similares a los arreglos pero con la principal característica de que son dinámicos (su tamaño y cantidad de elementos puede variar en el tiempo)

-Es un objeto que agrupa diferentes elementos en una sola unidad.

-Se dividen en distintos tipos de intefaces. las más principales son :

  * List
  * Set
  * Map

```

              Collection(Interface)
                     |
    -------------------------------------
    |                 |                 |
  Set               List              Queue
(Interface)      (Interface)       (Interface)
  |                 |                |
  |-HashSet         |-ArrayList      |-ProrityQueue
  |-LinkedHashSet   |-Linkedlist     |-Deque (Interface)
  |                 |-Vector
  |-SortedSet            |
   (Interface)          |
       |                 |
    TreeSet            Stack
```

```
       Map
        |
    AbstractMap
          |
    -------------    
    |            |
  HashMap     ThreeHashMap
   |
LinkedHashMap
```

```


---

### List

-Son un conjunto de elementos relacionados entre si que TIENEN UN DETERMINADO ORDEN

-Su tamaño es DINÁMICO (puede cambiar en el tiempo)

-Hay distintos tipos:

 * ArrayList (tiene un orden)
 
 * LinkedList
 
 * Stack (es una pila - LIFO (Last in Fist out))


#### ArrayList

-Es una clase que se representa como una matriz dinámica que permite almacenar elementos.

-Hereda de la clase AbstractList, la cual implementa la interfaz List

-Permite **colecciones** o **elementos duplicados**

-El orden de los registros es el **orden en el que fueron insertados**. Teoria FIFO (First in First out) 

-Permite acceso aleatorio (**tiene indice**)

-Manipulación lenta (recorrer todo el ArrayList para hacer un cambio)


---

Ejemplo en código 


Tengo una clase Persona:

```JAVA
public class Persona {
  private int id;
  private String nombre;
  private int edad;
  
  public Persona(){
  }
  
  public Persona(int id, String nombre, int edad){
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public int getId(){
     return id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  public String getNombre(){
     return nombre;
  }
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public int getEdad(){
     return edad;
  }
  
  public void setEdad(int edad){
    this.edad = edad;
  }
  
  @Override
  public String toString(){
    return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad+ "}";
  }
  
}

```


Tengo mi main:


```JAVA
package logica;

import java.util.list;

public class Listas {
   public static void main(String[] args){
   
       //Declaro una lista con la palabra reservada List y entre los <> aclaro el tipo de dato y luego el nombre de la lista
       List<Persona> listaPersona;
  
   }
}

```
