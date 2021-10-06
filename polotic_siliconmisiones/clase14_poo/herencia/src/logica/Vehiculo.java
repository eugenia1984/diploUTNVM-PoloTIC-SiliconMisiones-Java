
package logica;

public class Vehiculo {
    //Atributos
    private int idVehiculo;
    private String patente;
    private int canRuedas;
    private boolean tieneSeguro;
    //constructor vacio
    public Vehiculo() {
    }
    //constructor con atributos
    public Vehiculo(int idVehiculo, String patente, int canRuedas, boolean tieneSeguro) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.canRuedas = canRuedas;
        this.tieneSeguro = tieneSeguro;
    }
    //getters y setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCanRuedas() {
        return canRuedas;
    }

    public void setCanRuedas(int canRuedas) {
        this.canRuedas = canRuedas;
    }

    public boolean isTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }
    
    
    
}
