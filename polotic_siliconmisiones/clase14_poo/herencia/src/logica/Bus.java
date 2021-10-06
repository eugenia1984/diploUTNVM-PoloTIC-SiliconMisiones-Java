
package logica;

public class Bus extends Vehiculo { //hereda/extiende de Vehiculo
    //atributos
    private int cantAsientos;
    private boolean tieneMartillo;
    //constructor vscio

    public Bus() {
    }
    //constructor con parametros
    public Bus(int cantAsientos, boolean tieneMartillo, int idVehiculo, String patente, int canRuedas, boolean tieneSeguro) {
        super(idVehiculo, patente, canRuedas, tieneSeguro);
        this.cantAsientos = cantAsientos;
        this.tieneMartillo = tieneMartillo;
    }
    //getters y setters
    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public boolean isTieneMartillo() {
        return tieneMartillo;
    }

    public void setTieneMartillo(boolean tieneMartillo) {
        this.tieneMartillo = tieneMartillo;
    }
    //toString
    @Override
    public String toString() {
        return "Bus{" + "cantAsientos = " + cantAsientos + ", tieneMartillo = " +
                tieneMartillo + '}';
    }
    
    
    
}
