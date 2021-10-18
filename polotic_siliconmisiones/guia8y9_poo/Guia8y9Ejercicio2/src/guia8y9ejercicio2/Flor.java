/*
 * Crear sus clases hijas que compartan sus atributos y métodos:
 * Flor: color de pétalos, cantidad promedio de pétalos, color del pistilo,
 * variedad de flor, estación que florece
 * Flor: método para mostrar un mensaje en pantalla que diga “Hola soy una flor”
 */
package guia8y9ejercicio2;

public class Flor extends Planta { //hereda de Planta
    //Atributos propios de Flor
    private String colorDePetalos;
    private int cantidadPromedioDePetalos;
    private String colorDePistillo;
    private String variedadDeFlor;
    private String estacionQueFlorece;
    
    //constructor vacio
    public Flor() {
    }

    public Flor(String colorDePetalos, int cantidadPromedioDePetalos, String colorDePistillo, String variedadDeFlor, String estacionQueFlorece, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDePistillo = colorDePistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }
    
    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDePistillo() {
        return colorDePistillo;
    }

    public void setColorDePistillo(String colorDePistillo) {
        this.colorDePistillo = colorDePistillo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
   
    @Override
    public void saludo() {
        System.out.println("Hola soy una FLOR");
    }

    @Override
    public String toString() {
        return "Flor: " + super.toString() + "colorDePetalos = " + colorDePetalos + 
                ", cantidadPromedioDePetalos = " + cantidadPromedioDePetalos + 
                ", colorDePistillo = " + colorDePistillo + ", variedadDeFlor = " +
                variedadDeFlor + ", estacionQueFlorece = " + estacionQueFlorece;
    }
    
    
}
