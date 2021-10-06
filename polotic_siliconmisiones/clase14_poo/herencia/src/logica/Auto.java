
package logica;


public class Auto extends Vehiculo { //hereda/extiende de Vehiculo
    //atributos propios
    private int cantAsientos;
    private int cantPuertas;
    //constructor vacio
    public Auto() {
    }
    //constructor con atributos
    public Auto(int cantAsientos, int cantPuertas, int idVehiculo, String patente, int canRuedas, boolean tieneSeguro) {
        super(idVehiculo, patente, canRuedas, tieneSeguro);
        this.cantAsientos = cantAsientos;
        this.cantPuertas = cantPuertas;
    }
    //Getters y setters
    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "cantAsientos = " + cantAsientos + ", cantPuertas = " + 
                cantPuertas + '}';
    }
    
}
