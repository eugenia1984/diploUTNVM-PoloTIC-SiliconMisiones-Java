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

---
