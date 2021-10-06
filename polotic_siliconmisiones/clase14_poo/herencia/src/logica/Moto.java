
package logica;


public class Moto extends Vehiculo { //hereda/extiende de Vehiculo
    //atributos propios
    private double cilindrada;
    private boolean haceRuidoEscape;
    //constructor vacio
    public Moto() {
    }
    //constructor con parametro
    public Moto(double cilindrada, boolean haceRuidoEscape, int idVehiculo, String patente, int canRuedas, boolean tieneSeguro) {
        super(idVehiculo, patente, canRuedas, tieneSeguro);
        this.cilindrada = cilindrada;
        this.haceRuidoEscape = haceRuidoEscape;
    }
    //getters y setters
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isHaceRuidoEscape() {
        return haceRuidoEscape;
    }

    public void setHaceRuidoEscape(boolean haceRuidoEscape) {
        this.haceRuidoEscape = haceRuidoEscape;
    }
    //toString
    @Override
    public String toString() {
        return "Moto{" + "cilindrada = " + cilindrada + ", haceRuidoEscape = " + 
                haceRuidoEscape + '}';
    }
    
    
}
