# Clase 16: POO practica

Temas vistos:

   * Atributos y métodos en POO
   * ¿Qué es un atributo ?
   * Modificadores de acceso
   * ¿Qué es un método ?
   * Llamar a un método
   * Debuggear
     
---

## Atributos

   * Son *variables* que un objeto posee o conoce de sí mismo. Pertenecen al objeto en si cuando se está instanciando
   * Los definimos dentro de la clase, cuando instanciemos objetos, cada uno va a tener una copia de esa variable ya con un valor
   * Una clase puede tener o no tener atributos y no hay límite para la cantidad de atributos
   * Para acceder a los atributos se utilizar el punto (.)
   * Su valor puede ser modificado
  
  
---
   
## Modificadores de acceso de los atributos

   * Uno de los principios básicos de los lenguajes orientados a objetos es el **encapsulamiento**, mediante el cuál se ocultan los detalles de implementación de un objeto. 
   * En el caso de los *atributos*, por lo general se declaran **private** para que sólo puedan ser accedidos y modificados  por los métodos.
   * El acceso a las propiedades y métodos se determina mediante las palabras reservadas de los modificadores de acceso.
     

Los ámbitos de visibilidad según el modificador de acceso y el origen de acceso a la propiedad o método son los siguientes:


| modificadores de acceso | misma clase o anidada | clase en el mismo paquete | clase que hereda en otro paquete | clase que no hereda en otro paquete |
| ----------------------- | --------------------- | ------------------------- | -------------------------------- | ----------------------------------- |
| private | SI | NO | NO | NO |
| default(package private) | SI | SI | NO | NO |
| protected | SI | SI |SI |NO |
| public | SI | SI | SI | SI |

En general los atributos de la clase se encapsulan, para aislar esa información hacia el exterior, asi otras entidades (clases) no me las modifican.

Para no romper este encapsuamiento el atributo es privado y con un metodo lo voy a modificar.

PRIVATE y PUBLIC son los que más se usan. El public ROMPE en ENCAPSULAMIENTO ya que los atributos ahora pueden ser accedidos por otras clases, que los pueden modificar.

PROTECTED se utiliza con herencia.

DEFAULT no se suele utilizar

----

## Métodos

  * Un método es un bloque de código que se ejecuta cuando es **llamado**. No está siempre en ejecución. En un método se pueden introducir detos de entrada llamados **parametros**
  
  * Los métodos se utilizan para ejecutar ciertas acciones y también son conocidos con el nombre de *funciones*
  
  * El uso de métodos nos permite **reutilizar código**. Se definen una vez, y se ejecuta muchas veces
  
  * Un método ya utilizado en Java: ``` System.out.println("Hola Mundo!);```
  
  * Un método debe ser declarado **dentro de una clase**. El método posee un **modificador de acceso**. Se define un **nombre** seguido de **paréntesis**. En los paréntesis se **puede o no definir parámetros**. Si bien Java ya provee métodos, podemos declarar e implementar métodos propios.
  
  * Los métodos se llaman utilizando el pinto (.)
  
  
  Ejemplo de método:
  
  ```JAVA
  public int mx (int x, int y){
    if(x > y) {
      return x;
    } else {
      return y;
    }
  }
  
```

**public** -> modificador

**int** -> tipo de retorno

**max** -> nombre del metodo

**(int x, int y)** -> parametros

**{...}** -> el cuerpo el método es todo el código que está entre llaves

**return** -> nos permite que el método tenga un valor de salida y finalice la ejecución del método.


Si el método de la clase es **private** no va a poder accederse desde el main, debe ser **public** para poder ser accedido.

---

:computer: [Ejercicio de ejemplo de clases Car y Bus con atributos y método es carpeta **Car**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase16_poo_practica/Car)

---

## Debug


Debbugear: depurar el código para encontrar errores.

Quiero ver qué pasa internamente e ir viendo su ejecución.

---
