/*
 * Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, 
 * alto, ancho, material, cantidad.
 * -Crear 3 muebles utilizando parámetros.
 * -Mostrar por pantalla el nombre y el material de los 3 muebles.
 * -Colocar “Madera paraiso” como material de los 3 muebles creados.
 * -Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles 
 * que fueron cambiados.
 */
package objetos;

public class Mueble {
    //Atributos
    private String nombre;
    private Double alto;
    private Double ancho;
    private String material;
    private Integer cantidad;
    //constructor vacio
    public Mueble() {
    }
    //constructor con parámetros
    public Mueble(String nombre, Double alto, Double ancho, String material, Integer cantidad) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    //toString
    @Override
    public String toString() {
        return "Mueble{" + "nombre = " + nombre + ", alto = " + alto + ", ancho = " + 
                ancho + ", material = " + material + ", cantidad = " + cantidad + '}';
    }
    
    
}
