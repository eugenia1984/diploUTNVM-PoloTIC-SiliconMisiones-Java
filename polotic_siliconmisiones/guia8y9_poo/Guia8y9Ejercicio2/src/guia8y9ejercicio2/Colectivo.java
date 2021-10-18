/*
 * Crear la clase hija que compartn sus atributos y métodos:
 *  Colectivo: aptoDiscapacitados, poseeLectorSube, tipoColectivo
 */
package guia8y9ejercicio2;

public class Colectivo extends Vehiculo {
    //Atributos propios del Colectivo
    private boolean aptoDiscapacitados;
    private boolean poseeLectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapacitados, boolean poseeLectorSube, String tipoColectivo, String patente, int numeroChasis, double motor, String color, String marca, String modelo, int cantidadAsientos) {
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
        return "Colectivo : " + "aptoDiscapacitados=" + aptoDiscapacitados + ", poseeLectorSube=" + poseeLectorSube + ", tipoColectivo=" + tipoColectivo + '}';
    }
    
    //Crear el siguiente método:
    //mostrar un mensaje en pantalla que diga “Hola soy un colectivo y mi cantidad de asientos es de: ” (mostrar cantidad de asientos).
    @Override
    public String mostrarDatos() {
        return "Hola soy un colectivo y mi cantidad de asientos es : " + 
                this.getCantidadAsientos();
    }
    
}
