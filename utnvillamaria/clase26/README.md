# Clase 26 : 21 Octubre

Temas:

- Declaración de clases

---

## Declaración de clases

```
[public] [final|abstract] class NombreDeLaClase [extends ClaseMadre] [implements Interfase1, ..., InterfaceN]
```

Las porciones encerradas entre corchetes son opcionales a optar enre las posibilidades separadas por la barra vertical.

Ejemplo en código: 

```JAVA
public class Perro {
  //esto es un comentario
  //aqui completaremos luego el cuerpo de la clase
}
```

```JAVA
Perro miPerro = new Perro();
```

---

## Tipos de datos de referencia

En Java los objetos, instancias de clases, se manejan a través de referencias.

Cuando se crea una nueva instancia de una clase con el operador **new**, este devuelve una referencia al tipo de la clase.

Ejemplo:

```JAVA
public class Punto {
  private float x;
  private float y;
  ...
  public void setX( float x) {
    this.x = x;
  }
}
```

```JAVA
Punto unPunto = new Punto();
```

El operador **new** reserva espacio en memoria para contener un objeto del tipo Punto y devuelve una referencia que se asigna a unPunto, con los valores de atributos que se definieron en el constructor. A partir de ahora accedemos al objeto a través de su referencia.

Es posible, por tanto, tener **varias referencias al mismo objeto**.

```JAVA
Punto unPunto = new Punto();
unPunto.print();
Punto otroPunto = unPunto;
otroPunto.setx(1.0f);
otroPunto.sety(2.0f);
otroPunto.print();
```

La salida por pantalla es:

```JAVA
Coordenadas del punto (0.0f, 0.0f)
Coordenadas del punto (1.0f, 2.0f)
```

Como las dos referencias : unPunto y otroPunto, hacen referencia a la misma instancia, los cambios sobre el objeto se pueden realizar a través de cualquiera de ellas.

```
Objeto ----------------------> clase Punto
  ^        instancia de
  |-----------------------------------
  |                                  |
Referencia                           |
 unPunto    <------------------ Referencia otroPunto
```

---




