/*
 * Crear una clase Vehiculo con los atributos: 
 * patente, num de chasis, motor, color, marca, modelo, cantidad de asientos 
 * (con sus métodos y constructores correspondientes).
 */
package guia8y9ejercicio2;

public class Vehiculo {
    //atributos
    private String patente;
    private int numeroChasis;
    private double motor;
    private String color;
    private String marca;
    private String modelo;
    private int cantidadAsientos;

    public Vehiculo() {
    }

    public Vehiculo(String patente, int numeroChasis, double motor, String color, String marca, String modelo, int cantidadAsientos) {
        this.patente = patente;
        this.numeroChasis = numeroChasis;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public String toString() {
        return "Vehiculo : " + " patente = " + patente + ", numeroChasis = " + 
                numeroChasis + ", motor = " + motor + ", color = " + color +
                ", marca = " + marca + ", modelo = " + modelo + ", cantidadAsientos = " + 
                cantidadAsientos;
    }
    
    public String mostrarDatos() {
        return "Hola soy un vehiculo!";
    }
    
}
