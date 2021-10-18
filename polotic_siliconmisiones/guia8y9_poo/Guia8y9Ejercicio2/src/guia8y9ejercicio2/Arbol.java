/*
 * Crear sus clases hijas que compartan sus atributos y métodos:
 * Árbol: variedad, tipo de tronco, radio de tronco, color, tipo de hojas.
 * Árbol: método para mostrar un mensaje en pantalla que diga “Hola soy un árbol”
 */
package guia8y9ejercicio2;


public class Arbol extends Planta { //es hija de Planta
    //Atributos propios de arbol
    private String variedad;
    private String tipoDeTronco;
    private double radioDelTronco;
    private String color;
    private String tipoDeHojas;
    
    //constructor vacio
    public Arbol() {
    }
    
    //constructor con parametros
    public Arbol(String variedad, String tipoDeTronco, double radioDelTronco, String color, String tipoDeHojas, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDelTronco = radioDelTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }
    
    //getters y setters
    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioDelTronco() {
        return radioDelTronco;
    }

    public void setRadioDelTronco(double radioDelTronco) {
        this.radioDelTronco = radioDelTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Arbol : " + super.toString() + " variedad = " + variedad + ", tipoDeTronco = " + 
                tipoDeTronco + ", radioDelTronco = " + radioDelTronco + 
                ", color = " + color + ", tipoDeHojas = " + tipoDeHojas + '.';
    }
    
    @Override
    public void saludo() {
        System.out.println("Hola soy un ARBOL");
    }
    
}
