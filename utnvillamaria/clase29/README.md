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
        // TODO add your handling code here:
    }  
 ```
 
Es muy importante el ORDEN, primero tengo que tener el boton de Guardar y luego el de Mostrar, sino al mostrar no tendre los clientes guardados.
 
 ---
 
