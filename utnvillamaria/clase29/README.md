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

MVC es un patrón de diseño que se estructura mediante tres componentes: **modelo**, **vista** y **controlador**.

Este patrón tiene como principio que cada uno de los componentes esté separado en diferentes objetos, esto quiere decir que los componentes no se pueden combinar dentro de una misma clase.

---
