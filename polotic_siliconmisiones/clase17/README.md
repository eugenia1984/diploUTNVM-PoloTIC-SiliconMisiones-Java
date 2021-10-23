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

import java.util.List;
import java.util.ArrayList;

public class Listas {
   public static void main(String[] args){
   
       //Declaro una lista con la palabra reservada List y entre los <> aclaro el tipo de dato y luego el nombre de la lista
       //Aplico polimorfismo
       List<Persona> listaPersonas= new ArrayList<Persona>();

       //con el metodo .add() agrego a la ArrayList al nuevo objeto Persona que instancio
       listaPersonas.add(new Persona(1, "Julian", 25));
       listaPersonas.add(new Persona(3, "Ana", 5));
       
       //recorro al ArrayList con el for de siempre, utilizando el índice
       for (int i=0; i<listaPersona.size(), i++) {
           System.out.println("hola" + listaPersona-get(i));
       }
  
      //pero la forma que mas se utiliza es con el for each recorriendo por elemento
      for ( Persona persona : listaPersona ) {
          System.out.println(persona);
      }
   }
}

```

#### Linked List

-Representan a una LISTA ENLAZADA (ida y vuelta)

-Proporciona una estructura de lista que hereda de AbstractSsequencial List e implementa la interfaz List

- Permite duplicados

-Mantiene el orden de inserción (FIFO First In First Out)

-Manipulación más rápida

-Puede ser usada/tratada no solo como lista, sino también como pila, o como cola.

-Permite hacer inserciones o eliminaciones al principio o al final de la colección (por eso es que puede ser tratado como una pila o una cola)


Ejemplo en código:

```JAVA
package logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Linkedlist;

public class Listas {
   public static void main(String[] args){
   
       //aprovecho el polimorfismo, y declaro como List para heredar sus metofodos
       List<Persona> listaPersona = new LinkedList<Persona>();
   
       //con el metodo .add() agrego a la ArrayList al nuevo objeto Persona que instancio
       listaPersonas.add(new Persona(1, "Juliana", 25));
       listaPersonas.add(new Persona(3, "Analia", 5));
       
       //recorro elemento con elemento, no puedo con el for normal
       for ( Persona persona : listaPersona ) {
          System.out.println(persona);
        }
        
        //si quiero agregar un elemento al final
        listaPersonas.add(new Persona(4, "Luisina", 29));
        
        //si quiero agregar un elemento al inicio
        listaPersonas.add(0, new persona(8, "Mario", 51));
        
   }
}   
```

#### Stack

-Representa una pila de objetos, donde el último en entrar es el prmero en salir. (LIFO Last in First out)

-Se usan métodos como :

 * **push** coloca un elemento al tope de la pila
 * **pop** borra el último elemento de la pila
 * **isempty** devuelve true o false dependiendo si la pila está vacía o no
 * **peek** mosrar el elemento tope de la lista SIN ELIMINAR
 * **search** buscar elemento específico de la pila
 
```
 Iterable (Interface)
     |
     | extends
     |
  Collection (Interface)
     |
     | extends
     |
   List (Interface)
     |
     |  implements
     |
  Vector(Class)
     |
     |  extends
     |
   Stack (Class) 
```

```JAVA
package logica;

import java.util.List;
import java.util.ArrayList;
import java.util.Linkedlist;

public class Listas {
   public static void main(String[] args){
   
     //declaro un Stack, no puedo usar los primitivos para decir el tipo de dato, debo usar la clase wrapper  
     Stack<Integer> pila = new Stack<Integer>();
     
     System.out.println("Lista vacia: " + pila);
     System.out.println("Esta vacia?" + pila.isEmpty());
     
     //agrego valores
     pila.push(1);
     pila.push(2):
     pila.push(3);
     
     //recorro
     for (Integer pilita : pila) {
         System.out.println(pilita);
     }
     
     //la puedo mostrar por pantalla, a toda la pila, pero ojo si tiene muchos elementos tarda
     System.out.println("Pila: " + pila);  //voy a ver -> Pila: [1, 2, 3]
     System.out.println("Pila vacia?" + pila.isEmpty());
   
     //elimino el ultimo elemento que agregue
     pila.pop();
     
     //busco un elemento en particulas
     //con .serach() si lo encuentra me da un numero positivo (cualquier numero positivo) y si no lo encuentra me da un numero negativo (cualquier numero)
     System.out.println("Esta el 3?" + pila.search(3));
     
     //quiero ver el ultimo elemento de la pila sin eliminarlo
     System.out.println"Ultimo agregado: " + (pila.peek());
   }
 }  
 ```
 
---


