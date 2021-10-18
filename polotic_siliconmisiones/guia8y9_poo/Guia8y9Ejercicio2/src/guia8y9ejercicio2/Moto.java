/*
 * Crear la clase hija que compartn sus atributos y métodos:
 * Moto: cilindrada, material_manubrio
 */
package guia8y9ejercicio2;

public class Moto extends Vehiculo {
    //Atributos propios de Moto
    private double cilindrada;
    private String materialManubrio;

    public Moto() {
    }

    public Moto(double cilindrada, String materialManubrio, String patente, int numeroChasis, double motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto : "+ super.toString() + "cilindrada = " + cilindrada + 
                ", materialManubrio = " + materialManubrio + '.';
    }
    
    //Crear el siguiente método:    
    //para mostrar un mensaje en pantalla que diga “Hola soy una moto y mi cilindrada es de: ” (mostrar cilindrada)
    @Override
    public String mostrarDatos() {
        return "Hola oy una moto y mi cilindada es : " + this.getCilindrada();
    }
    
}
