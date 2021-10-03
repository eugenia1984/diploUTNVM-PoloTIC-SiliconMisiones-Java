/*
 * Crear una clase llamada Auto, que tenga los siguientes atributos: color, 
 * marca, modelo, patente, cantidad de puertas (tener en cuenta todos sus 
 * atributos, constructores y métodos getters y setters).
 * - Crear 3 objetos Auto utilizando parámetros
 * - Crear 1 objeto Auto sin parámetros.
 * - Mostrar por pantalla la marca, modelo y patente de los 3 autos creados 
 * con parámetros.
 * -Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún 
 * valor? De ser así… ¿Qué valor se obtiene?
*/
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
