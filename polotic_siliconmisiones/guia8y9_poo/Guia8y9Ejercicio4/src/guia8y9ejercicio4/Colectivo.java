/*
 * Crear su clase hija que compartan sus atributos y métodos:
 * Colectivo: aptoDiscapacitados, poseeLectorSube, tipoColectivo
 */
package guia8y9ejercicio4;

public class Colectivo extends Vehiculo {
    private boolean aptoDiscapacitados;
    private boolean poseeLectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeLectorSube, String tipoColectivo, String patente, int numeroChasis, String motor, String color, String marca, int modelo, int cantidadAsientos) {
        super(patente, numeroChasis, motor, color, marca, modelo, cantidadAsientos);
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public void setAptoDiscapacitados(boolean aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public boolean isPoseeLectorSube() {
        return poseeLectorSube;
    }

    public void setPoseeLectorSube(boolean poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }

    @Override
    public String toString() {
        return "Colectivo : " + super.toString() +  "aptoDiscapacitados = " + 
                aptoDiscapacitados + ", poseeLectorSube = " + poseeLectorSube + 
                ", tipoColectivo = " + tipoColectivo + '.';
    }
    
    //Colectivo: método para mostrar un mensaje en pantalla que diga 
    //“Hola soy un colectivo y mi cantidad de asientos es de: ” (mostrar cantidad de asientos).
    @Override
    public String saludo(){
        return "Hola soy un colectivo camion y mi cantidad de asientos es de : " + 
                getCantidadAsientos() ;
    }
    
    
}
