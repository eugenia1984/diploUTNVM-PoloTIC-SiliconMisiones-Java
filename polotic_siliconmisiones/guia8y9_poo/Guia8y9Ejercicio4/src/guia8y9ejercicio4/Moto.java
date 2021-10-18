/*
 * Crear su clase hija que compartan sus atributos y métodos:
 * Moto: cilindrada, material_manubrio
 */
package guia8y9ejercicio4;


public class Moto extends Vehiculo {
    //Atributos propios de Moto
    private double cilindrada;
    private String materialManubrio;

    public Moto() {
    }

    public Moto(double cilindrada, String materialManubrio, String patente, int numeroChasis, String motor, String color, String marca, int modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }

    @Override
    public String toString() {
        return "Moto : " + super.toString() + "cilindrada = " + cilindrada + 
                ", materialManubrio = " + materialManubrio + '.';
    }
    
    // Moto: método para mostrar un mensaje en pantalla que diga
    // “Hola soy una moto y mi cilindrada es de: ” (mostrar cilindrada)
    @Override
    public String saludo(){
        return "Hola soy una moto y mi cilindrada es de : " + getCilindrada();
    }
    
}
