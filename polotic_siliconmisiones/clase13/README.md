# Clase 13 : 29 Septiembre

## Getters y Setters

-Los métodos **get** y **set**, son simples métodos que se utilizan en las clases para mostrar (get) o modificar (set) el valor de un atributo

-El nombre del metodo siempre será **get** o **set** y a continuación el **nombre del atributo** comenzando con letra mayúsucla.

-Los getters son funciones (devuelven un valor) mientras que los setters son proedimientos (realizan una acción sin devolver precisamente un valor)

```JAVA
public String getNombre(){
  return nombre;
}

public void setNombre(String nombre){
  this.nombre = nombre;
}
```

Como tnego el atributo **nombre** y el parámetro **nombre** en mi setNombre, con **this** le digo que **this.nombre** es mi atributo y **nombre** del parametro es el valor que se va a setear al atributo.

En todas las clases voy a tener este orden:

1- atributos

2- constructores

3- getters y setters

4- metodos de la clase

---

## En el ejemplo de la clase anterior de alumnos:

```JAVA
public static void main(String[] args) {
  Alumno alumno1 = new Alumno();
  Alumno alumno2 = new Alumno(15, "Luisina", "de Paula");
  
  System.out.println("La id del alumno es : " + alumno2.getId());
  System.out.println("El nombre del alumno es: " + alumno2.getNombre());
  System.out.println("El apellido del alumno es : "+ alumno2.getApellido());
}
```

Por pantalla voy a ver:
```JAVA
  La id del alumno es : 15
  El nombre del alumno es: Luisina
  El apellido del alumno es : de Paula
}
```

Si mandaría a imprimir al alumno1 voy a tener **0** de id y **null** para nombre y apellido, ya que el valor por default para String es NULL.

Lo que puedo hacer es setear los datos al alumno1

```JAVA
alumno1.setId(20);
alumno1.setNombre("Eugenia");
alumno1.setApellido("Costa");
```

Tengo dos formas de colocar los valores de los atributos:

-con el constructor

-con el set

---

## Método toString

Se encarga de pasarme todo el objeto a un string y me va a mostrar los atributos y sus valores.


Entonces:

```JAVA
System.out.println(alumno1.toString());
```

Y me va a mostrar todos los datos que signe a los valores en el objeto alumno1.

---

# Encapsulamiento

Significa reunir a todos los elementos que pueden considerarse pertenencientes a una misma entidad, al mismo nivel de abstracción. No se debe confundir con el Principio de Ocultación.

Esa capsula la puedo abrir cuando necesito los datos, y luego lo vuelvo a cerrar.


El **encapsulamiento** permite 3 niveles de acceso :

-**Public**: es el de menor protecicón, de acceso más general. Pueden utilizarse desde cualquier contexto (desde el interior de la misma clase, desde una clase heredada o desde el exterior). Se declaran a nivel de código como **PUBLIC**

-**Private**: es el de mayor protección. El acceso sólo está permitido para métodos de esa clase en particular. Los atributos declarados como **private** *solo serán visibles desde el interior de la clase donde están declarados*.

-**Protected**: el acceso sólo está permitido a funciones de la misma clase o a métodos de subclases de ella. los atributos y métodos declarados como **protected** *solo serán visibles desde la clase que los declara o desde una clase derivada*, peor nunca desde el exterior de la clase.



Ejemplo en una clase *Auto* que va a instanciar objetos *auto* con atributos:

-publicos: color, año, caja, marca, modelo

-privados: clasis, motor


### Por convensión para cumplir con el ENCAPSULAMIENTO los ATRIBUTOs son PRIVATE. En cambio a los métodos que nosotros creemos pueden tener todos los accesos. Pero los que esten @Override deben tener el mismo acceso que la clase padre de la que heredan el metodo.


Entonces en mi ejemplo de la clase Alumno

```JAVA
public class Alumno {
  private int id;
  private String nombre;
  private String apellido;
}
```

**principio de ocultación** -> cada objeto está aislado y únicamente expone una interfaz a otros objetos donde específica cómo pueden interactuar con él. El aislamiento protege a las propiedades de un objeto contra su modificación por quien no tenga derecho a acceder a ellas.



---
