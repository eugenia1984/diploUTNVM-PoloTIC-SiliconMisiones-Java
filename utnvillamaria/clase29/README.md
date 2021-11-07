# 📘 Clase 29 : 2 Noviembre

Temas:

- Continuamos diseñando un jFrame para guardar nombre, apellido y dni de clientes en un ArrayList.

- For mejorado

- Definición CRUD - MVC - MVC en ejercicio práctico

- Agregar imágenes usando JFrame 

---

## Continuamos diseñando un jFrame para guardar nombre, apellido y dni de clientes en un ArrayList

Quedo pendiente:

- Diseñar la UI para la Consulta de los clientes

- Agregar la lógica para mostrar los clientes en pantalla

1-Agrego un nuevo **button**, le modifico el texto a **Mostrar clientes** y le cambio el nombre de la variable a **ButtonGetCustomers**.

2-Del lado derecho agrego un nuevo **label** que va a ser un rectangulo grande, donde voy a mostrar a los clientes. Le cambio el nombre a la variable a **LabelCustomerlist**.

3-Agrego un **event handler** en el boton de Mostrar Clientes que sea **mouseClicked**.

 
 ```JAVA
 ButtonGetCustomers.setText("Mostrar Clientes");
        ButtonGetCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGetCustomersMouseClicked(evt);
            }
        });
 ```
 
 ```JAVA
private void ButtonGetCustomersMouseClicked(java.awt.event.MouseEvent evt) {                                                
        //instancio una variable Sring vacia
        String customerListString ="";
        //recorro el Arraylist de clientes elemento por elemento
        for (int i = 0;  i < customerList.size(); i++) {
            //agarro el First Name y los voy concatenando
            customerListString = customerListString.concat(customerList.get(i).toString());
            customerListString = customerListString.concat("<br>");
        }
        labelCustomerList.setText("<html>"+customerListString+"</html>");
    }  
```
 
Es muy importante el ORDEN, primero tengo que tener el boton de Guardar y luego el de Mostrar, sino al mostrar no tendre los clientes guardados.

JFrame permite etiquetas html por eso uso **br** como salto de linea.
 
---

## For mejorado

Nos permite iterar de manera más sencilla y limpia sobre un conjunto de elementos de un array.

Ejemplo en codigo:

```JAVA
 for (tipoVariable : array) {
  //declaraciones usando tipoVariable
 }
```

Es equivalente a:

```JAVA
 for (int i = 0; i < arr.length; i++) {
   tipoVariable = arr;
   //declaraciones usando varaible
 }
```
  
  
  En el ejercicio de los clientes sería así:
  
```JAVA
private void ButtonGetCustomersMouseClicked(java.awt.event.MouseEvent evt) {                                                
        String customerListString ="";

        for (Customer c : customerList) {
            customerListString = customerListString.concat(c.toString());
            customerListString = customerListString.concat("<br>");
        }
        
        labelCustomerList.setText("<html>"+customerListString+"</html>");
    }  
 ```
  
 ---
 
 :star: [Aca se puede ver el código del ejercicio](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase29/Customers)
 
 ---
  
 ## CRUD
  
 Hace referencia a las funciones básicas de la persistencia de base de datos
  
 **C** de  CREATE (crear)
  
 **R** de READ (leer)
  
 **U** de UPDATE (actualizar)
  
 **D** de DELETE (borrar)
 
 En español se le llama **ABM** (Alta - Baja - Modificación)
 
En el ejercicio utilizamos el CREATE al crear los clientes y utilizamos el READ al mostrar la lista de los clientes.
  
---

## MVC

MVC es un patrón de diseño que se estructura mediante tres componentes: **modelo** (las clases, Entities), **vista** (aca esta la UI, el IGU) y **controlador**.

Este patrón tiene como principio que cada uno de los componentes esté separado en diferentes objetos, esto quiere decir que los componentes no se pueden combinar dentro de una misma clase.

#### Modelo

Constiene sólo los datos de aplicación. No contiene ninguna lógica que describa cómo presentar los datos a un usuario.

#### Vista

Presenta los datos del modelo al usuario. La vista sabe cómo acceder a los datos del modelo, pero no sabe qué significa esta información o qué puede hacer el usuario para manipularla.

#### Controlador

Existe entre la vista y el modelo. Escucha los eventos desencadenados por la vista y ejecuta el procedimiento adecuado a estos eventos. 

Por ejemplo, un controlador puede actualizar un modelo combiando los atributos de un personaje en un videojuego así como también puede modificar la vista mostrando el personaje actualizado en el juego.


```

            utiliza            manipula
    -------------------    ---------------
    |                 |    |             |
    |                 V    |             V
USUARIO            CONTROLADOR         MODELO
     ^                |     ^             |
     |                |     |             |
     |      actualiza |     ---------------
     |                |          notifica
     |                V
     -------------- VISTA
          se 
       muestra
```

---

En el ejercicio prácico d elos clientes ahora se puede ir separando la logic, dentro del paquete **customers.controller** creo la clase **CustomerController.java**

```JAVA
package customers.controller;

import customers.domain.Customer;
import java.util.List;
import java.util.ArrayList;


public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    
    //metodo para crear al cliente
    public void createCustomer(String firstName, String lastName, String nationalId) {
        Customer customer = new Customer(); 
        customer.setFirstname(firstName);
        customer.setLastname(lastName);
        customer.setNationalId(nationalId);
        
        customerList.add(customer);
    }
    
}
```


En mi clase **CreateCustomer** ya no tengo de atributo a mi lista de Customer, sino:

```JAVA
private CustomerController customerController = new CustomerController();
```

Y al hacer click en guardar:

```JAVA
private void ButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        /* Ahora lo paso a mi customerController
        Customer customer = new Customer(); 
        customer.setFirstname(textFieldFirstName.getText());
        customer.setLastname(textFieldlastName.getText());
        customer.setNationalId(textFieldNationalId.getText());
        
        //para imprimir el objeto asi veo que se setteo
        //System.out.println(customer);
        //agrego el customer a mi ArrayList
        customerList.add(customer);
        */
               
        customerController.createCustomer(
                textFieldFirstName.getText(), 
                textFieldlastName.getText(), 
                textFieldNationalId.getText());
        
        //Y voy a setear los campos nombre, apellido dni a vacio para que queden limpios 
        //para el proximo cliente
        textFieldFirstName.setText("");
        textFieldlastName.setText("");
        textFieldNationalId.setText("");
    }  
    
     private void ButtonGetCustomersMouseClicked(java.awt.event.MouseEvent evt) {                                                
        //instancio una variable Sring vacia
        String customerListString ="";
        //recorro el Arraylist de clientes elemento por elemento
        /* dejo comentado porque utilizo el for each - for mejorado
        for (int i = 0;  i < customerList.size(); i++) {
            //agarro el First Name y los voy concatenando
            customerListString = customerListString.concat(customerList.get(i).toString());
            customerListString = customerListString.concat("<br>");
        }
        */
          for ( Customer c : customerController.getAllCustomers() ) {
            customerListString = customerListString.concat(c.toString());
            customerListString = customerListString.concat("<br>");
        }
        labelCustomerList.setText("<html>"+customerListString+"</html>");
    }
```


En la clase **CustomerController**:

```JAVA
package customers.controller;

import customers.domain.Customer;
import java.util.List;
import java.util.ArrayList;


public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    
    //metodo para CREATE
    public void createCustomer(String firstName, String lastName, String nationalId) {
        //crea el customer
        Customer customer = new Customer(); 
        //setea los datos
        customer.setFirstname(firstName);
        customer.setLastname(lastName);
        customer.setNationalId(nationalId);
        //lo agrega al ArrayList
        customerList.add(customer);
    }
    
    //metodo para el READ
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    
}
```

Ahora tengo mi **logica** en el **CONTROLLER** separada de mi **VISTA**. Por lo que si a futuro cambia algun dato del cliente, lo cambio solo en la lógica, no tengo todo junto. La lógica de la creación del cliente me queda en el controller. Y la vista solo recibe los datos y los manda al controlador, o al controlador le pide la lista para mostrar los clientes.

Y por le momento en la vista se instancia un customerController cada vez, no es lo ideal, pero sirve para lo visto.

---

:star: [el ejercicio separado en capas](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase29/Customers2)

---
