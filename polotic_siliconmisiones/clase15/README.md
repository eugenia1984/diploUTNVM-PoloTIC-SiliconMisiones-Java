# Clase 15 : 13 Octubre

**Interfaz** -> para hacer HERENCIA MULTIPLE

**Clase Abstracta** -> Cuando hay un pseudotipo y muchos hijos que dependen de ella.

---

## CLASES ABSTRACTAS

-Son un **tipo particular de clase** cuya principal carcterística es que **no peden ser instancidas.** Es como una plantilla para otras clases, se implementa herencia.

-Generalmente declara la **existencia de métodos pero no su implementación**, convirtíendola así en una clase padre.

-**Al menos uno de sus métodos debe ser abstracto** (puede tener métodos no abstractos). Si es abstracto, solo se declara el método, pero no su implementación, y no van las llaves.

-Sus niveles de visualización deben ser **public** o **protected** (**nunca private**).

-Cuando se usan clases abstratas **una clase no puede heredar de varias clases abstractas a la vez** (coo es en el caso de las interfaces).

-Generalmente las clases abstractas indican el **ES/SER** de un objeto.


## ¿ Cuándo se usan las clases abstractas ?

-Cuando deseamos definir una abstracción que englobe objetos de distintos tipos y queremos hacer uso del polimorfismo.

Por ejemplo:

```
  ----------------------
          Figura
  ----------------------
     -posicionX
     -posicionY
  -----------------------  
      +calcularArea()
  ----------------------
           ^
           |
           |
   --------------------------
   |                        |
 --------------    ------------------
   Circulo             Cuadrado
 --------------     ------------------
   -posicionX        -posicionX
   -posicionY        -posicionY
 --------------     -----------------
  +calcularArea       +calcularArea
 ---------------     ----------------- 
 ```
 
 -Figura es una clase abstracta porque no tiene sentido calcular su área, pero sí lo de sus hijas (cuadrado y circulo)
 
 -Si una subclase de Figura (cuadrado o circulo) no define el método calcularAerea(), deberá declararse también como clase abstracto.


Ejemplo en codigo:


Clase abstracta Figura
```JAVA
package clases.abstractas;

public abstract class Figura {
   protected double x;
   protected double y;
   
   public figura() {
   }
   public Figura(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public abstract double calcularArea();
}
```

Aunque no se instancias clases Figura, si tengo el constrautor, porque lo utilizarán sus clases hijas (llamando al **super()** en su constructor, asi inicializan los valoes x e y).

Las clases que implementan calcularAerea:

Cuadrado:

```JAVA
package clase.abstracta;

public class Cuadrado extends Figura {
  private double lado;
  
  public Cuadrado() {
  }
  
  public Cuadrado(double lado, double x, double y) {
     super(x, y);
     this.lado = lado;
  }
  
  @Override
  public double calcularArea() {
    double resultado = lado + lado;
    return resultado;
  }
}
```

-Para indicar que vamos a implementar (customizar) el métod -> **@Override**. Me indica que estoy sobreeescribiendo le método de la clase abstracta.

Circulo:

```JAVA
package clase.abstracta;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
      this.radio = radio;
    }
    
    public Circulo(double radio, double x, double y) {
      super(x, y);
      this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
      double pi = 3.14;
      double resultado = pi * radio * radio;
      return resultado;
    }

}
```

---

## Interfaces

-Son un colección de **métodos abstractos** con **propiedades CONSTANTES**.

-Una interfaz solamente puede **extender o implementar otras interfaces** (la cantidad que quiera).

-Da a conocer qué se debe hacer (métodos) pero sin mostrar su implementación (sólo puede tener métodos abstractos).

-Sólo puede tener **métodos con acceso público** (no pueden ser protected o private).

-Solo puede tener **variables** **public static final** (o sea una **constante**).

-La palabra **abstract** en la definición de métodos no es obligatoria.

-**Generalmente las interfaces indican el PUEDE HACER de un objeto**.

Interfaz -> permite la conexión entre dos partes, en este caso permite la conexión entre varias clases.

Volvemos al ejemplo de figura, pero ahora como una interfaz:


```
------------    -----------------     -------------
  Rotable          Figura                Dibujable
------------    -----------------     ------------

------------     ----------------      -------------
 +rotar()        +calcularAerea()       +dibujar
 -----------     ----------------      -------------
    ^                ^     ^               ^     ^
    |                |     |               |      |
    -------     -----------|---------------       |
          |    |     |     |                      |
          |    |     --------  -------------- -----
      ----------------          Cuadrado
        Circulo                ---------------
      ----------------          -lado
       -radio                  ----------------
      ----------------          +calcularArea()
      +calcularAera()           +dibujar()
      +dibujar                 ---------------
      +rotar
      -----------------
  
```

-Si no fuese necesario conocer la ubicación de una figura (x , y), se podría eliminar por completo los atributos y convertir a Figura en una interfaz

-Se utiliza la palabra **implements**.

-Cada nombre de interfaz que se implementa se separa por comas


Y viendolo en código:

  
```JAVA
package clase.abstracta;

public class Circulo implements Figura, Rotable, Dibujable {
  private doule radio;
  
  public Circulo(double radio) {
      this.radio = radio;
  }
  
  @Override
  public double calcularArea() {
      double pi = 3.14;
      double resultado = pi * radio * radio;
      return resultado;
  }
  
  @Override 
  public void rotar() {
    System.out.printla("Estoy rotando el circulo");
  }
  
  @Override
  public void dibujar() {
    System.out.printla("Estoy dibujando el circulo");
  }
}
  
```

Ahora que se inplementan las interfaces ¿ Hereda atributos ?

Las interfaces no permiten atributos/variables, por lo que al implementar interfaces únicamente se hredan sus métodos.

---
