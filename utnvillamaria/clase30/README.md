# 📖 Clase 30 : 4 de Noviembre

Tema: métodos

---

Aclaración: la **programación estructurada** separa los datos de las funciones, mientras que la **POO** define un conjunto de *objetos* donde se combina de forma modular los *datos* con las *funciones*.

Puedo tneer clases sin atributos, pero nunca puedo tener una clase sin métodos.

---

## Método

Es una forma organizada y sistemática de poder alcanzar un determinado objetivo. Puede aplicarse a distintas áreas de estudio como las ciencias naturales, sociales o las matemáticas.

El método se entiende como una serie de pasos que se deben seguir para cumplir un objetivo.

---

## Método en Java:

- Los métodos especifican el comportamiento de la clase y sus instancias.

- Los modificadores de acceso y su significado son los mismos que al operar sobre atributos.

- En particular, al declarar un método **estático** implica que es un método de la clase, y por lo tanto no es necesario crear ninguna instancia de la clase para poder llamarlo.

- El conjunto de los métodos públicos de una clase forma su interface.

- Un método declarado **final** implica que no se puede redefinir en ninguna clase que herede de esta, es importante destacar que el cuerpo de un método definido como final no podrá ser modificado por ninguna clase hija.

- En el momento de la declaración hay que inidicar cual  es el tipo del parámetro que devolverá el método o void en caso de que no devuelva nada.

- En otros lenguajes, estos tipos de métodos o funciones se denominan procedimientos.

- Los métodos tienen *visibilidad directa* de los atributos miembro del objeto que es su argumento implícito; pueden acceder a ellas sin cualificarlas con un nombre de objeto y el operador punto. También se puede acceder a ellas mediante la refernecia hit (this.r).

- Los métodos pueden definir variables locales. su visibilidad llega desde la definición al final del bloque en el que han sido definidas. No hace falta inicializar las variables locales en el punto en que se definen, pero el compilador no permite utilizarlas sin haberles dado un valor. A diferencia de las variables miembro, las variables locales no se inicilian por defecto.

- También se ha de especificar el tipo y nombre de cada uno de los argumentos del método entre paréntesis. Si un método no tiene argumentos el paréntesis queda vacío, no es necesario escribir void.

- El tipo y número de estos argumentos identifican al método, ya que varios métodos pueden tener el mismo nombre, con independencia del tipo devuelto, y se distinguirán entre sí por el número y tipo de argumentos. *Sobrecarga de método*.

---

Ejemplo en codgo:

```JAVA
public class Alumno {
  private String nombre;
  private String apellido;
  
  public String getNombreCompleto() {
    return nombre + " " + this.apellido;
  }
}
```

- Los atributos de un objeto deberían ser accesibles solo a través de métodos públicos 

- Método público getnombreCompleto() que no recibe parámetros y devuelve una cadena de texto.

- Para acceder a los atributos de la instancia de esta clase puede usarse o no la palabra reservada this ya que en el cuerpo del método no existe otra variable local con el mismo nombre que pueda resultar en ambiguedad.

- Los atributos siempre deben ser privados y puedo acceder a los mismos con un metodo publico

- El **get** en el nombre se usa como buena practica para saber que ese metodo me devuelve algo.

- En Java los argumentos de los tipos primitivos se pasan siempre por valor.

- El método recibe una copia del argumento actual; si se modifica esta copia, el argumento original que se incluyó en la llamada no queda modificado.

- Para modificar un argumento de un tipo primitivo dentro del cuerpo del método puede incluirse como variable meimbro o ser retornado para luego realizar la asignación en el momento de la llamada.

- Las referencias se pasan tambien por valor, pero a traves de ellas se pueden modificar los objetos referenciados.

---

## Los metodos de setteo : set y get

En la práctica, es común nombrar métodos de obtención y modificación con los prefijos **get** y **set** respectivamente. Cada atributo de la clase debería ser definido como privado y existir métodos get y set para poder obtener y setear sus valores.

Un ejemplo de un método get:

```JAVA
public tipoDeDatp getAtributo() {
  return this.atributo;
}
```

Donde tipoDeDato puede ser tanto un tipo primitivo como una clase o interfaz si estamos referenciando a otros objetos.

Por convension el nombre dle método luego del prefijo get o set se escribe en camelCase.

Los métodos set reciben como parámetros el nuevo valor y no retornan nada.

```JAVA
public void setAtributo( tipoDeDatos nuevoValor) {
  this.atributo = atributo;
}
```

Podriamos crear instancias de alumnos y mostrar por pantalla sus nombres completo. 

En POO las llamadas a los metodos se les llama paso de mensajes, llamar a un método es análogo a pasarle un mensaje.

---

## Metodo main

- Método reservado en Java y otros lenguajes: el método main().

- Es especial ya que el que da lugar al incio del programa y será llamado por la maquina virtual al momento de la ejecucion

- El metodo main no es el elemento principal en el desarrollodel programa. El programa, se desarrolla mediante la interaccion entre objetos por lo que el objetivo de este metodo normalmente es inicial y delegar el comportameinto a los distintos objetos correspondientes.

- Debe pertenecer a una clase publica
```
public static void main(String[] args) {
}
```

- Es estático, ya que no depende de una instancia en particular de la clase en la que se declara y no tiene ningun valor de retorno.

- Podemos ver que recibe un array de parametros de tipo String que representan los argumentos pasados a la hora de ejecutar el programa.

- Casi siempre el main queda casi vacio, apenas comienza voy delegando con metodos en mis otras clases, interfaces, voy delegando el comportamiento.

En el caso de realizar la ejecucion mediante la linea de comando, cada elemento del array sera cadena de texto luego de la llamada a nuestro programa, separadas por espacios.


---

## Métodos sobrecargados y redefinición ( overload y override )

Java permite métodos sobrecargados (overloaded), son métodos distintos con el mismo nombre que se diferencian por el numero y/o tipo de datos de los argumentos.

Java sigue unas reglas para determinar el método concreto que debe llamar:

1- Si existe el método cuyos argumentos se ajustan exactamente al tipo de los argumentos de la llamada (argumentos actuales), se llama ese métodos.

2- Si no existe un método que se ajuste exactamente, se intenta promover los argumentos actuales al tipo inmediatamente superior (por ejemplo: char a int, int a long, floar a double) y se llama el método correspondiente.

3- Si solo existen métodos con argumentos de un tipo mas amplio (por ejemplo, long en vez de int), el programador debe hacer un cast explicito en la llamada, responsabilizándose de que pueda ocurrir.

4- El valor de retorno no influye en la elección del método sobrecargado. Es imposible saber desde el propio método lo que se va a hacer con el.

5- No es posible crear dos métodos sobrecargados, con el mismo nombre y que solo difieran en el valor de retorno.


Aclaraciones de **REdefinición** (**Override**):

- Diferente de la sobrecarga de métodos es la redefinición.

- Una clase puede redefinir (**override**) un método heredado de una superclase.

- Redefinir un método es dar una nueva definición.

- EL método debe tener exactamente los mismo argumentos en tipo y numero que el metodo redefinido

- Esto es muy utilizado en **Herencia**. Si tengo una clase con un metodo abstracto la clase que lo hereda lo puede override.

---
