/*
 * Crear una clase Planta con los atributos:
 * nombre, alto del tallo, tieneHojas, clima ideal.
 * (con sus métodos y constructores correspondientes)
 */
package guia8y9ejercicio2;


public class Planta {
    //Atributos
    protected String nombre;
    protected double altoDelTallo;
    protected boolean tieneHojas;
    protected String climaIdeal;
    //constructor vacio
    public Planta() {
    }
    //constructor con parametros
    public Planta(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
    //getters y setters
    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", altoDelTallo = " + altoDelTallo +
                ", tieneHojas = " + tieneHojas + ", climaIdeal = " + climaIdeal + '.';
    }
    
    //metodo saludo que va a ser sobreescrito por las clases hijas
    public void saludo() {
        System.out.println("Hola soy una PLANTA");
    }
    
}
