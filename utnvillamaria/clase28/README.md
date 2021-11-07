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

A-Creacion del nuevo proyecto

B-Desarrollo de la Clase Customer

C-Configurar el entorno para el desarrollo de la UI con JFrame

D-Diseñar la UI para el Alta del Cliente

E-Agregar la logica para cargar los clientes

F-Diseñar la UI para la Consulta de los Clientes

G-Agregar la logica para mostrar los clientes en pantalla.

---

## A-Creacion del nuevo proyecto

Creo el proyecto **Customers**

Y dentro del paquete **customers** creo los subpaquetes:

-**customers.controller**

-**customers.domain**

-**customer.ui**

## B-Desarrollo de la Clase Customer

Dentro del paquete **customers.domain** creo la clase **Customer.java**, con sus atributos, getters, setters y toString:

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

## C-Configurar el entorno para el desarrollo de la UI con JFrame

En el paquete **customer.ui** creo un JFrame con el nombre de **CreateCurstomer.java**

---

## D-Diseñar la UI para el Alta del Cliente

Desde **Design** haciedo click derecho -> *Set layout* -> *Absolute*

Agrego un *jLabel*  y en properties **text** le pongo el texto que se va a ver: **ingrese los datos del cliente y luego pulse el botón GUARDAR**. Otro modo es con *click derecho sobre jLabel* -> *Edit Text*.

Ahora voy a agregar tres **Text Field**, uno para que ingrese el *nombre*, otro para que ingrese el *apellido* y otro para que ingrese el *DNI*, para que la persona sepa que ingresar en cada Text Field, a la izquierda le agrego a cada uno un jLabel que indique que dato es.

si me posiciono sobre el jlabel o el Text field y hago click, elijo *cambiar nombre de variable*, les puedo poner algo más personalizado que Textfiled1, TextField2, TextField3, asi cuando trabaje con el codigo las reconozco más fácil.

También agrego un **button** para tener el texto *Guardar*

Entonces en source veo:

```JAVA
 // Variables declaration - do not modify    
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JTextField TextFieldFirstName;
    private javax.swing.JTextField TextFieldNationalId;
    private javax.swing.JTextField TextFieldlastName;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration      
 ```   
 
 En los jLabelNombre, jLabelApellido, jLabelDni, **properties** en **horizontalAligment** puedo hacer que se alinean hacia la izquierda o derecha. pero si o quiero hacer internacional para varios idiomas también tengo **Trailing** (lo alinea en el sentido en que se escribe, es decir para el español es la dercha, ya que se escribe de derecha a izquierda, pero para el árabe es al reves.) y **leading**
 
 Para que al hacer click en el boton efectivamente se me guarde, hago click derecho en el boton -> *Event* -> *Muose* -> *mouseClicked*.
 
 Y en source voy a tener el método:
 
 ```JAVA
ButtonGuardar.setText("Guardar");
        ButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGuardarMouseClicked(evt);
            }
        });
```

Modifico le método ** ButtonGuardarMouseClicked**

```JAVA
private void ButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.out.println("Click en el boton");
    } 
```    

Y si le doy run, cada vez que hago click en el boton, por consola veo: ```Click en el boton```


---


## E-Agregar la logica para cargar los clientes

Como todavía no vimos nada de base de datos, vamos a guardar todo en un array, lo unico que al finalizar la ejecucion del programa esa información no se va a guardar.

Lo que hay que hacer es que cada vez que se hace click en el boton *Guardar* se instancie un objeto **cliente**, tome los datos Nombre, apellido y DNI y se guarde en el array.

Entonces creo un ArrayList:

```JAVA
public class CreateCustomer extends javax.swing.JFrame {
    
    private List<Customer> customerList = new ArrayList<>();
 }
 ```
 
 Y en el metodo instancio un objeto  de la clase Customer y le seteo el nombre, apellido y dni con los datos que se van a ir ingresando en mi TextFiled usando el nombre de la variable de cada textField y el método **.getText()**.
 
 Para ver si se guarda hago un ```System.out.println(customer);``` asi por consola puedo ver si mi objeto customer guarda los datos.
 
 Y al final lo agrego a mi lista de clientes con ```customerList.add(customer);```
 
 
 Y recorro el array y lo imprimo para corroborar que agregue al cliente
 
 ```JAVA
     private void ButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                           
        //System.out.println("Click en el boton");
        Customer customer = new Customer(); 
        customer.setFirstname(TextFieldFirstName.getText());
        customer.setLastname(TextFieldlastName.getText());
        customer.setNationalId(TextFieldNationalId.getText());
        System.out.println(customer);
        //agrego el customer a mi ArrayList
        customerList.add(customer);
        //recorro el array y muestro los objetos para ver que se agregaron
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    } 
 ```

---


## F-Diseñar la UI para la Consulta de los Clientes

---


## G-Agregar la logica para mostrar los clientes en pantalla.

---
