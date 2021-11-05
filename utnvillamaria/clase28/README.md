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

Nos encontramos trabajando en un nuevo sistema y nuestro PM nos ha encargado la tarea de desarrollar la pantalla y logica para DAR DE ALTA un Cliente en el sistema.

El PM tambien nos solicito que sea posible CONSULTAR los Clientes del Sistema.

El PM nos ha entregado la Clase Cliente con los datos que debe tener.

```
--------------------------
          Customer
--------------------------
-firstname: String
-lasName: string
-nationalId: String
--------------------------
+getters()
+setters()
+toString()
--------------------------
```

*El metodo toString debe mostrar: firstName, lastname y nationalId

### Desglose del ejercicio

-Creacion del nuevo proyecto

-Desarrollo de la Clase Customer

-Configurar el entorno para el desarrollo de la UI con JFrame

-Diseñar la UI para el Alta del Cliente

-Agregar la logica para cargar los clientes

-Diseñar la UI para la Consulta de los Clientes

-Agregar la logica para mostrar los clientes en pantalla.

1- Creo el proyecto **Customers**

Y dentro del paquete **customers** creo los subpaquetes:

-**customers.controller**

-**customers.domain**

-**customer.ui**

2-Dentro del paquete **customers.domain** creo la clase **Customer.java**, con sus atributos, getters, setters y toString:

```JAVA
package customers.domain;

public class Customer {
    //Atributos
    private String firstname;
    private String lastname;
    private String nationalId;
    //getters y setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    //toString
    @Override
    public String toString() {
        return "first name = " + firstname + ", last name = " + 
                lastname + ", ID nacional = " + nationalId + '}';
    }
    
    
}

```

3- En mi main instancio un objeto de Customer, le seteo los datos y lo imprimo por consola, para ver que se crea todo bien

```JAVA
package customers;

import customers.domain.Customer;


public class Customers {


    public static void main(String[] args) {
        //instancio un Customer para quechear que funciona bien
        Customer myCustomer = new Customer();
        //le seteo lso atributos
        myCustomer.setFirstname("Ana");
        myCustomer.setLastname("Lopez");
        myCustomer.setNationalId("93478529");
        //lo muestro por consula
        System.out.println(myCustomer); 
    }
  
}
```

---
