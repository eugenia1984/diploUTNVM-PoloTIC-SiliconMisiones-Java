/*
 * Crear su clase hija que compartan sus atributos y métodos:
 * Auto: materialasientos, cantidad_caballos
 */
package guia8y9ejercicio4;



public class Auto extends Vehiculo {
    //Atributos propios de Auto
    private String materialAsientos;
    private double cantidadCaballos;

    public Auto() {
    }

    public Auto(String materialAsientos, double cantidadCaballos, String patente, int numeroChasis, String motor, String color, String marca, int modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.materialAsientos = materialAsientos;
        this.cantidadCaballos = cantidadCaballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public double getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setCantidadCaballos(double cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    @Override
    public String toString() {
        return "Auto : " + super.toString() + "materialAsientos = " + 
                materialAsientos + ", cantidadCaballos = " + cantidadCaballos + '.';
    }
    
    //Auto: método para mostrar un mensaje en pantalla que diga 
    //“Hola soy un auto y mi marca es: ” (mostrar marca)
    @Override
    public String saludo(){
        return "Hola soy un auto y mi marca es : " + getMarca() ;
    }
    
    
}
