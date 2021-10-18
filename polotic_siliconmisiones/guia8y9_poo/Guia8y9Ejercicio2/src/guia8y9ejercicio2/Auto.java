/*
 • Crear la clase hija que compartn sus atributos y métodos:
 * Auto: materialasientos, cantidad_caballos
 */
package guia8y9ejercicio2;

public class Auto extends Vehiculo {
    //Atributos propios de Auto
    private String materialAsiento;
    private double cantidadCaballos;

    public Auto() {
    }

    public Auto(String materialAsiento, double cantidadCaballos, String patente, int numeroChasis, double motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.materialAsiento = materialAsiento;
        this.cantidadCaballos = cantidadCaballos;
    }

    public double getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setCantidadCaballos(double cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    public String getMaterialAsiento() {
        return materialAsiento;
    }

    public void setMaterialAsiento(String materialAsiento) {
        this.materialAsiento = materialAsiento;
    }

    @Override
    public String toString() {
        return "Auto : " + super.toString() +  "materialAsiento = " + materialAsiento + 
                ", cantidadCaballos = " + cantidadCaballos + '.';
    }
    
    //• Crear el siguiente método:
   //para mostrar un mensaje en pantalla que diga “Hola soy un auto y mi marca es: ” (mostrar marca)
    @Override
    public String mostrarDatos() {
        return "Hola soy un auto y mi marca es : " + this.getMarca();
    } 
    
}
