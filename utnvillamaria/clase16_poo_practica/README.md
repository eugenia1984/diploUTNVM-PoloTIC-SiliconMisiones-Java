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
   * En el caso de los *atributos*, por lo general se declaran **private** para que sólo puedan ser accedidos y modificados por los métodos.
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

----


