# 📖 Clase 27 :  26 Octubre

Temas:

- Arrays
- String
- Estructuras de control
- Clases y Objetos

---

## Arrays

Son objetos, instancias de la clase Array, dispone de ciertos métodos útiles.

El tipo base puede ser un **tipo primitivo** o un **tipo de referencia**.

Ejemplo en código:

```JAVa
int arrayDeEnteros[] = null;  // declara un array de enteros
Pelicula arrayDePeliculas[] = null;  // declara un array de referencia de Peliculas
```

Creación (reserva de espacio):

```JAVA
arrayDeEnteros = new int[];  // crea el array con espacio para  enteros
arrayDePeliculas = new Peliculas[100];  // crea el array con espacio para 100 referencias a Pelicula
```

```JAVA
for( int i = 0; i > 100, i++) {
  arrayDePeliculas[i] = new Pelicula();
}
```

Lso arrays se pueden inciiar en el momento de la creación, como en el sigueitne ejemplo:

```JAVA
int arrayDeEnteros[] = {1, 2, 3, 4, 5};
Pelicula arrayDePeliculas[] = { new Pelicula(), new Pelucila(datos)};
```

---

## String

En Java existe una clase para representar y manipular cadenas, la clase **String**

Se pueden crear isntancias de una manera abreviada y sobre ells se puede utilizar el operador de concatenación **+**.

Ejemplo:

```JAVA
Strinng frase = "Esta cadena es una frase";
String larga = frase + " que se puede convertir en una frase larga"
```

:computer: [**En la imagen que te lleva este link se puede ver ejemplo de String**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase27/string.pdf)

utilizando: substring() , .length(), .equalsIgnoreCase().

---

## Estructuras de control


IF:

```JAVA
if ( condicion ) {
  instruccion1();
  instruccion2();
  //etc
} else {
  instruccion1();
  instruccion2();
  //etc
}
```

SWITCH:

```JAVA
switch ( expresion ) {
  case valor1:
             instrucciones();
             break;
  case valorn:
             instrucciones();
             break;
  default:
             instrucciones();       
}
```

---

## Clases y objetos


**Encapsulamiento**: las clases pueden ser declaradas como *publicas* y como *paquete* (accesibles solo para otras clases del mismo paquete). Las variables miembros y los metodos pueden ser *public*, *private*, *protected* y *package*. De esta forma se puede controlar el acceso entre objetos y evitar un uso inadecuado.

**Herencia**: una clase puede derivar de otra (*extends*) y en ese caso hereda toda sus variables y metodos. una clase derivada puede añadir nuevas variables y metodos y/o definir las variables y metodos heredados.

**Polimorfismo**: los objetos de distintas clases pertenecientes a una misma jerarquia o que implementan una misma interface, pueden responder de forma indistinta a un mismo metodo. Esto facilita la programación y el mantenimiento del código.

---

**Lenguajes POO**: ADA, C++, Objective C, Java, Smalltalk, Eiffel, Ruby, Python, OCAMIL, Object Pascal, CLIPS, Actionscript, Pascal, Perl, PHP, C#, Kotiln, Visual Basic .NET, Simula, Delphi, PowerBuilder, Visual FoxPro

---

Características:

-Todas las variables y métodos de Java deben pertenecer a una **clase**. no hay variables y funciones globales.

-Si una clase deriva (**extends**) de otra, hereda toda sus variables y métodos.

-Java tiene una jerarquía de clases estandar de la que pueden derivar las clases que crean los usuarios.

-una clase solo puede heredar de una **única clase** (**en java no hay herencia múltiple**). si la definir una clase no se especifica de que clase deriva, por defecto la clase deriva de **Object**. La clase **Object** es la base de toda la jerarquía de clases de Java.
Lo veo cuando puedo usar en cualquier clase los métodos *equal* y *toString*

```
                          Object
                            |
   -------------------------------------------------
   |           |            |           |          |
 Boolean    Character     Number       Void      Class
                            |--Byte
                            |--Short
                            |--integer
                            |--Long
                            |--Float
                            |--Double
```

-En un archivo de codigo fuente se pueden definir varias clases, pero en un mismo archivo no puede haber mas que una clase definida como public. Este archivo se debe llamar como la clase public que debe tener extension .java. Con algunas excepciones, lo habitual es escribir una sola clase por archivo.

-Si una clase contenida en un fichero no es public, no es necesario que el fichero se llame como la clase.

-Los metodos y variables de una clase pueden referirse de modo global a un objeto de esa clase a la que se aplican por medio de la referencia **this**. Al utilizar la palabra reservada **this** para referirse tanto a métodos como atributos se restringe el ámbito al objeto que hace la declaración.

-Las clases pueden agrupar en **packages**, introduciendo una linea al comienzo del fichero (**packageName**). Esta agrupacion en packages esta relacionada con la jerarquia de carpetas y archivos en la que se guardan las clases. En la practica usamos paquetes para agrupar clases con un mismo proposito usando jerarquia de paquetes, esta decision es muy importante a la hora de diseñar la estructura de nuestro programa.

-Se separan en paquetes los tipos de clases: clases entidad, clases gestores (controllers), clases con mis vistas.


-La POO esta centrada en los datos. Una clase son datos y metodos que operan sobre esos datos.

-Cada objeto tiene su propia copia de las variables miembro.

-Pueden ser de tipo primitivos (blloean, int, etc) o referencia de objetos de otra clase (agregacion o composicion).

-Las variables miembros de tipos primitivos se inciializan siempre de modo automatico, incluso antes de llamar al constructor (false para boolean, el caracter null para char (codigo unicode ``` '\u000' ```) y cero para los tipos numericos). lo mas adecuado es inciializar en el constructor o cuando la declaro.

-Las variables miembro se inicializan en el mismo orden en que aparecen en el codigo de la clase. Algunas variables pueden apoyarse en otras previamente definidas.

-Cada objeto que se crea tiene su propia copia de las variables miembro. Ejemplo, clase Circulo tiene sis propias coordenadas del centro x e y, y su propio valor del radio e. Se puede aplicar un metodo concreto poniendo el nombre del objeto y luego el nombre del metodo separados por un punto. por ejemplo, para calcular el area de un objeto de la case Circulo llamado c1 se escribe ```c1.area();``` 

-La definicion de cada atributo debe empezar con un **modificador de acceso** que indican la visibilidad, private / protected / public.

-Tras el modificador de acceso se escribe el **tipo de argumento**, primitivo o referencia.

-Un atributo se puede declarar como **static**. Esto implica que no existe una copia de este atributo en cada instancia de la clase, si no que existe uno unico comun a todas las instancias. tambien se les llama atributos de la clase.

-otro modificador que puede afectar el comportamiento de los atributos de una clase es **final**. Si un atributo se declara como  final, implica que no se puede cambiar su valor una vez definido. Es **constante**.

---

