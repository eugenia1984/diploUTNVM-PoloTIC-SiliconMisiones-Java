#  Clase 31 : 9 Noviembre

Temas: 

- Constructores de objetos

- Finalizacion y destruccion de Objetos

- Agrupando Clases en Paquetes

- Documentacion de Clases y Métodos

---

## Constructores de objetos

Los métodos que tienen el mismo nombre que la clase tienen un comportamiento especial, sirven para crear las instancias de la clase y se les denomina constructores.

Es un operador que se llama automáticamente cada vez que se crea un objeto de una clase.

La principal misión es reservar en memoria automáticamente cada vez que se crea un objeto de una clas. La principal misión es reservar memoria e inicializar las variables miembros de la clase.

Principales aspector de los constructores en Java que es necesario entender:

-Cuando se llama al constructor de una clase para instanciarla y crear el objeto, se invoca al constryctor.

-Los constructores no tienen valor de retorno (ni siquiera void) y su nombre es el mismo que el de la clase.

-Su argumento implícito es el objeto que se está creando.

-Si no se define explícitamente un constructor, Java lo hará por nosotros ya que siempre es necesario que exista. Se creara un constructor sin argumentos.

-Una clase puede tener varios constructores, que se diferencian por el tipo y numero de sus argumentos (son un ejemplo tipico de metodos **sobrecargados**).

si es necesario que un constructor llame a otro constructor lo debe hacer antes que cualquier otra cosa.

Se llama **constructor por defecto** al constructor que no tiene argumentos.

En caso de que solo definamos un constructor con parámetros el constructor por defecto no será creado por Java, por lo que deberemos definirlo explícitamente en caso de ser necesario.

```JAVA
public class Alumno {
  private String nombre;
  private String apellido;
  
  public Alumno() {
  }
  
  public Alumno(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
```

Podemos crear los mismos alumnos anteriores de la forma:

```JAVA
Alumno alumno1 = new Alumno("Pablo", "Perez");
Alumno alumno2 = new Alumno("Ana", "Sosa");
Alumno alumno3 = new Alumno();
```


- Al igual que los demás métodos de una clase, los constructores pueden tener también los modificadores de acceso **public**, **private**, **protected** y **package**.

- Si un constructor es **private**, ninguna clase puede crear un objeto de esa clase. En este caso, puede haber métodos **public** y **static** (factory methods) que llamen al constructor y devuelvan un objeto de esa clase.

- Dentro de una clase, los constructores solo pueden ser llamados por otros constructores o por métodos static.

- No pueden ser llamados por los métodos de objeto de la clase.

---

## Finalizacion y destruccion de Objetos

- En java el sistema se ocupa automáticamente de liberar la memoria de los objetos que ya han perdido la referencia, es decir, objetos que ya no tienen ningun nombre que permita acceder a ellos, por ejemplo, por haber llegado al final del bloque en el que habian sido definidos, porque a la referencia se le ha asignado el valor **null** o porque a la referencia se la ha asignado la dirección de otro objeto. a esta característica de Java se le llama **garbage collection**.

- antes de que un objeto sea completamente eliminado de la memoria por el recolector de basura, se llama a su metodo **finalize()**. Está definido en la clase Object de la que hereda implícitamente cualqueir clase.

- Un **finalizador** es un método de objeto (no static), sin valor de retorno (void), sin argumentos y que siempre se llama **finalize()**. Los finalizadores se llaman de modo automatico siempre que hayan sifo definidos por el programador de la clase.

- Para realizar su tarea correctamente, un finalizador deberia terminar siempre lalamndo al finalizador de su super-clase.

---

## Agrupando Clases en Paquetes

- un **package** es una agrupación de clases que sirve para establecer una jerarquia lógica en la organización de las clases.

- Tiene una relación directa con la organización física de nuestro código ya que también se representa en la estructura de archivos y carpetas que conforman nuestro programa.

- Al estructurar de este modo las clases, estamos estableciendo un dominio de nombres que la máquina virtual de Java utiliza, por ejemplo, cuando nuestra aplicación utiliza clases distribuidas en una red de computadoras.

- Todas las clases dentro de un mismo paquete tienen acceso al resto de clases declaradas como publicas.

- Para poder acceder a una clase de otro paquete se ha de importar anteriormente mediante la sentencia **import**.

La sentencia **import** permite abreviar los nombres de las clases, variables y métodos, evitando el tener que escribir continuamente el nombre package importado.

Se importan por defecto el **package java.lang** y el **package actual** o por defecto (las clases del directorio actual).

Existen dos formas de utilizar **import** : para una **clase** y para **todo un package**.

```JAVA
import poo.cine.Autor;
import poo.cine.*;
```

El importar un package no hace que se carguen todas las clases dle package: solo se cargan las clases public que se vayan a utilizar. al importar un package no se importan los sub-packages. Deben ser importados explícitamente, pues en realidad son packages distintos.

por ejemplo, al importar **java.awt** no se importa java.awt.event

---

## Agrupando clases en paquetes

Imaginemos la sigueinte estructura de paquetes y clases:

```
futsal
-torneos
  --Torneo.java
  --Fecha.java
  --Encuentro.java
-equipos
  --Equipo.java
  --Jugador.java
-predio
  --Cancha.java
```


```JAVA
package futsal.equipos;

public class Equipo {
  private String nombre;
  private Jugador[] jugadores;
  // podriamos seguir listand atributos
}
```

Por otro lado podriamos escribir la clase Encuentro entre 2 equipos como sigue:

```JAVA
public class Encuentro {
  private Date fechaHora;
  private Cancha cancha;
  private Equipo equipo1;
  private Equipo equipo2;
  private int golesEquipo1 = 0;
  private int golesEquipo2 = 0;
  private boolean jugando = false;
}
```

---

## Documentacion de Clases y Métodos

- Documentar un  proyecto es algo fundamenttal de cara a su futuro mantenimiento.

- Cuando programamos una clase, debemos generar documentación lo suficientemente detallada sobre ella como para que otros programadores sean capaces de usarla solo con su interfaz.

- No debe existir necesidad de leer o estudiar su implementación, lo mismo que nosotros para usar una clase la biblioteca de Java no leemos ni estudiamos su código fuente.

- Javadoc es una utilidad de Oracle para la generación de documentación en formato de página web a partir de código fuente Java.

- Javadoc es el estándar para documentar clases de Java. La mayoría de los IDEs utilizan javadoc para generar de forma automática documentación de clases.

- La documentación a ser utilizada por javadoc se escribe en comentarios que cimienzan con ```/**``` (notar el doble) y que terminan con ```*/```

- A la vez, dentro de estos comentarios se puede escribir código HTML y operadores para que interprete javadoc (generalmente precedidos por @).

| tag | descricion | uso |
| --- | ---------- | --- |
| @autor | nombre del desarrollador creador de la clase o interfaz | nombre |
| @deprecated | inidica que el metodo o clase es antigua y que no se recomeinda su uso porque posiblemente desaparecerá en versiones posteriores | descripcion |
| @param | definicion de un parametro de un metodo, es requerido para todos los parametros del metodo | nombre_parametro descripcion |
| @return | informa lo que devuelve el metodo, no se puede usar en constructores o metodos void | descripcion |
| @see | asocia con otro metodo o clase, brinda mas informacion o elementos relacionados | referencia (#metodo()); clase#metodo(); paquete.clase; paquete.clase#metodo() |
| @throws | excepcion lanzada por el metodo | nombre_clase descripcion |

- Las etiquetas @autor y @version se usan para documentar clases e interfaces. No son validas en cabecera de constructores ni metodos.

- La etiqueta @param se usa para documentar constructores y metodos.

- La etiqueta @return se usa solo en metodos de tipo funcion

- Dentro de los comentarios se admiten etiquetas HTML, por ejemplo con @see se puede referencias una pagina web como link para recomendar su visita de cara a ampliar información.

- **TODO**, convencion utilizada por los desarrolladores para denotar codigo que aun debe implementarse, del ingles pendiente. Algunos IDEs agregan automaticamente estos comentarios y ademas permiten resaltarlos para recordarnos de las porciones de codigo que nos faltan escribir.

---
