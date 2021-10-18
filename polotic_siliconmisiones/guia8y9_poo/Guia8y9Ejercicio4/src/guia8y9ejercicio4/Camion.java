/*
 * Crear su clase hija que compartan sus atributos y métodos:
 * Camion: tieneAcoplado, cantidadEjes
 */
package guia8y9ejercicio4;


public class Camion extends Vehiculo {
    private boolean tieneAcoplado;
    private int cantidadEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, int cantidadEjes, String patente, int numeroChasis, String motor, String color, String marca, int modelo, int cantidadAsientos) {
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
        return "Camion : "+ super.toString() + "tieneAcoplado = " + tieneAcoplado + 
                ", cantidadEjes = " + cantidadEjes + '.';
    }
    
    // Camion: método para mostrar un mensaje en pantalla que diga
    // “Hola soy un camión y mi cantidad de Ejes es de: ” (mostrar cantidad de ejes).
    @Override
    public String saludo(){
        return "Hola soy un camion y mi cantidad de ejes es de : " + getCantidadEjes() ;
    }
    
}
