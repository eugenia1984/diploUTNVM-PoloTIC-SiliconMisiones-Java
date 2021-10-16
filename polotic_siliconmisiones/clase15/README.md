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


## ¿ Càndo se usan las clases abstractas ?

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

---
