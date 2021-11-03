#  📚 Clase 28 :  28 de Octubre

Temas:

-Referencia de objetos en Java

-Ejercicio practico - caso real (cargar clientes)

-Ejercicio extra - tarea (visualizar datos de los clientes)

---

## Referencia de objetos en Java

En Java es posible tener **varias referencias a un mismo objeto**

Hay una clase **Objeto** y creo una instancia de la clase Punto y puedo tener otro que hace referneica al mismo objeto


Ejemplo en codigo:

```JAVA
package inheritance;

public class Main {
  public static void main(String[] args) {
    Auto miAuto = new Auto(); //creo un auto
    miAuto.setMatricula("AA123");  //seteo matricula AA123
    cambiarMatricula(miAuto);  //con el metodo cambiarMatricula la cambio a CC123
    
    Auto otroAuto = miAuto;  //la variable otroAuto hace referencia a miAuto
    otroAuto.setMatricula("DD123");
    //la matricula de miAuto es DD123
    //la matricula de otroAuto es DD123
    //setee las dos porque miAuto = otroAuto (es una copia de la referencia)
  }

  public static void cambiarMatricula(Auto auto) {
    auto.setmatricula("CC123");
  }
}
```

### Es posible tener varias referencias hacia el mismo objeto


Otro modo más corto:

```JAVA
package inheritance;

public class Main {
  public static void main(String[] args) {
    Auto miAuto = new Auto(); //creo un auto
    miAuto.setMatricula("AA123");  //seteo matricula AA123
    Auto otroAuto = miAuto;  //la variable otroAuto hace referencia a miAuto
    //la matricula de miAuto es DD123
    //la matricula de otroAuto es DD123
  }

 
}
```

---

## Ejercicio practico


---
