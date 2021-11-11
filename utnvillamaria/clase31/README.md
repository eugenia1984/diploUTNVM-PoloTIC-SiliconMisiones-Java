#  Clase 31 : 9 Noviembre

Temas: 

- Constructores de objetos

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

- Un **finalizador** es un método de objeto (no static), sin valor de retorno (void), sin argumentos y que siempre se llama **finalize()**.

---
