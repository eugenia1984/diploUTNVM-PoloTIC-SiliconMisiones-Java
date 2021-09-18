package miproyecto;

public class Bus {
    //Atributo PRIVADO
    protected int maximoDeKilosPorTotalPasajeros;
    
    //Constructor
    public Bus() {
    }

    public Bus(int maximoDeKilosPorTotalPasajeros) {
        this.maximoDeKilosPorTotalPasajeros = maximoDeKilosPorTotalPasajeros;
    }
    
    //getter y Setter
    public int getMaximoDeKilosPorTotalPasajeros() {
        return maximoDeKilosPorTotalPasajeros;
    }

    public void setMaximoDeKilosPorTotalPasajeros(int maximoDeKilosPorTotalPasajeros) {
        this.maximoDeKilosPorTotalPasajeros = maximoDeKilosPorTotalPasajeros;
    }
    
}
