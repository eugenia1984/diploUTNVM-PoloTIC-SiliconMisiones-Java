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

---
