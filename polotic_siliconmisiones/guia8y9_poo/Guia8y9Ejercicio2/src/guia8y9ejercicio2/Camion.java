/*
 * Crear la clase hija que compartn sus atributos y métodos:
 * Camion: tieneAcoplado, cantidadEjes
 */
package guia8y9ejercicio2;

public class Camion extends Vehiculo {
    //Atributos propios de camion
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, int numeroChasis, double motor, String color, String marca, String modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public String toString() {
        return "Camion : " + super.toString() + "tieneAcoplado = " + 
                tieneAcoplado + ", cantidadEjes = " + cantidadEjes + '.';
    }
    
    //Crear el siguiente método:
    //para mostrar un mensaje en pantalla que diga “Hola soy un camión y mi cantidad de Ejes es de: ” (mostrar cantidad de ejes).
    @Override
    public String mostrarDatos() {
        return "Hola soy un camion y mi cantidad de ejes es de : " + 
                this.getCantidadEjes();
    }  
    
}
