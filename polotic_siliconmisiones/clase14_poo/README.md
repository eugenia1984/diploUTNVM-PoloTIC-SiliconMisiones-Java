# Clase 14 : 06 Octubre


---

## Herencia

-Hay clases que comparten gran parte de sus características.

-El mecanismo conocido con el nombre de **herencia** permite **reutilizar clases**: se crea una nueva clase que **extiende** (**hereda**) la funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.

-La nueva clase se la denomina **SUBCLASE** / **clase hija**, puede poseer atributos y métodos que no existan en la clase original

-Los objetos de la nueva clase heredan los atributos y los métdos de la clase original, que se denomina: **clase padre / madre / SUPERCLASE**.

*Java **no tiene herencia multiple** por eso se auxilia con las interfaces.


### Ejemplo con UML:

```

        --------------
        |   Persona  |
        --------------
        |            |
        --------------
        |            |
        -------------
              ^
              |
      ----------------------
      |                     |
 --------------     ---------------
 |  Empleado  |     |  Consultor   |
 -------------      ----------------
 |            |     |              |
 --------------     ----------------
 |            |     |              |
 -------------      ----------------
``` 


**Persona**: es una clase genérica que sirve para almacenar datos en común de todas ls personas, como el nombre, la dirección, el número de teléfono, etc.


**Empleado**: hereda estos mismos atributos de la clase Persona, pero puede incluir atributos propios, como por ejemplo, numero de legajo, puesto, cargo, etc.


**Consultor**: también hereda los mismos atributos en común de la clase persona, mientras que puede incluir otros atributos propios, como empresa Consultora, id de consultor, etc.


#### El ejemplo en código:

```JAVA
public class Empleado extends Persona {  //EXTENDS me indica que hereda de.../ es hija/o de...
	//los atributos propios de Empleado
	private int numLegago;
	private String cargo;
	private double sueldo;

	//costructores
	public Empleado(){
	}

	public Empleado(int numLegajo, String cargo, double sueldo, String dni, String apellido, Atring nombre, String direccion, String telefono){
		super(dni, apellido, nombre, direccion telefono); //atributos heredados
		this.numLegajo = numLegajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}



	//Métodos propios de Empleado, ejemplo de get y set con numLegajo
	public int getNumLegajo(){
	    return numLegajo;
	}
	
	public void setNumLegajo(int numLegajo){
	   this.numLegajo = numLegajo;
	}
}

```

## Polimorfismo

-Polimorfismo significa **Muchas formas**

-Este término se utiliza en la POO para **referirse a la propiedad por la que es posible enviar mensajes sintécticamente iguales a objetos de tipos distintos**.

-El polimorfismo y la herencia son dos conceptos estrecahemnte ligados. Conseguimos implementar polimorfismo en jerarquías de clasificación que se dan a través de la herencia.

-Las clases hijas tiene formas similares, cuando tengo objetos de tipo de una clase PADRE le puedo asignar objetos de CLASES HIJAS. Esto solo se puede hacer con CLASES:

-Una variable siempre deberá apuntar a un objeto de la clase que se indicó en el momento de su declaración.

-El polimorfismo es el mecanismo por el que se puede **dejar de lado** el sistema de tipos, de modo que nos acepte también objetos de las clases hijas o derivadas.

-Por ejemplo, si tenemos un arreglo de tipo **Persona**, permitirá únicamente tener personas, pero gracias al polimorfismo también aceptará a sus clases heredadas (Empleado, Consultor).


### Ejemplo:

```
         Vehiculo  ( Clase Padre )
            |
            |
   -------------------------
   |           |            |
   v           v            v
 Coche       Moto          Bus    ( Clases hijas o Derivadas )
```

Declaro la función:

```
estacionar(vehiculo){...}
```

Invoco la función: (soportto polimorfismo):

```
estacionar(Coche);
estacionar(Moto);
estacionar(Bus);
```
---

:computer: [Para ver -> **Git y GitBuh**](https://www.youtube.com/playlist?list=PLQxX2eiEaqby-qh4raiKfYyb4T7WyHsfW)

---