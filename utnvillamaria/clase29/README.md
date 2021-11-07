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

Es equivalene a:

 ```JAVA
 for (int i = 0; i < arr.length; i++) {
   tipoVariable = arr;
   //declaraciones usando varaible
 }
  ```
  
  ---
