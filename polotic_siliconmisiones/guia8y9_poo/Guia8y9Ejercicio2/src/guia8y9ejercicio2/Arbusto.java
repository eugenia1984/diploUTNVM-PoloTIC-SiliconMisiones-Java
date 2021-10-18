/*
 * Crear sus clases hijas que compartan sus atributos y métodos:
 * Arbusto: Ancho arbusto, esDomestico, variedad arbusto, color de hojas, sePodaONo
 * Arbusto: método para mostrar un mensaje en pantalla que diga “Hola soy un arbusto”
 */
package guia8y9ejercicio2;


public class Arbusto extends Planta { // hereda de planta
    //Atributos propios de arbusto
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;

    //Constructor vacio
    public Arbusto() {
    }

    //Constructor con parametros
    public Arbusto(double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }
   

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
        @Override
    public void saludo() {
        System.out.println("Hola soy una ARBUSTO");
    }

    @Override
    public String toString() {
        return "Arbusto " + super.toString() + "anchoArbusto = " + anchoArbusto + ", esDomestico = " + 
                esDomestico + ", variedadArbusto = " + variedadArbusto + 
                ", colorDeHojas = " + colorDeHojas + ", sePodaONo = " + sePodaONo + '.';
    }
    
    
}
