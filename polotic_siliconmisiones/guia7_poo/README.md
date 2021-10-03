# Guía de Ejercicios Nº 7: Programación Orientada a Objetos - Parte 1

## 1) Objetos

**A.** Crear una clase llamada Auto, que tenga los siguientes atributos: color, marca, modelo, patente, cantidad de puertas (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

✓ Crear 3 objetos Auto utilizando parámetros

✓ Crear 1 objeto Auto sin parámetros.

✓ Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con parámetros.

✓ Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

-> Como el cuarto auto se creo con el constructor vacío (sin parámetros) y no le setee los valores de los atributos, cuando los traigo con los getters, al ser todos atributos String su valor por defecto es NULL. Si en un paso anterior los hubiera seteado,e tnonces me mostraría los valores.

Todo en código:

```JAVA
package objetos;


public class Auto {
    //Atributos
    private String color;
    private String marca;
    private Integer modelo;
    private String patente;
    private Integer cantidadPuertas;
    //Constructor vacio
    public Auto() {
    }
    //constructor con parametros
    public Auto(String color, String marca, Integer modelo, String patente, Integer cantidadPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }
    //Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
}
```


---

**B.** Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, alto, ancho, material, cantidad.

✓ Crear 3 muebles utilizando parámetros.

✓ Mostrar por pantalla el nombre y el material de los 3 muebles.

✓ Colocar “Madera” como material de los 3 muebles creados.

✓ Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles que fueron cambiados.

---

**C.** Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

✓ Crear un vector de tipo Mascota que pueda almacenar 5 mascotas. Crear 5 mascotas y guardarlas en el vector.

✓ Recorrer el vector creado y mostrar por pantalla el nombre, especie y sexo de las mascotas almacenadas.

✓ Cambiar el nombre de dos mascotas. Mostrar por pantalla los datos de las dos mascotas cuyos nombres fueron cambiados.

✓ Recorrer el vector y mostrar por pantalla únicamente a las mascotas que sean de la especie “perro”.

---
