/*
 * A partir de la clase abstracta creada crear las siguientes subclases hijas:
 * Xbox One: La cual tiene una serie de atributos propios para manejar:
 * Si está conectada a internet o no, si la calidad 4K está activada y si se 
 * permite la descarga automática de actualizaciones. 
 * Al mismo tiempo implementa un método propio “leerJuegoDigital” el cual recibirá 
 * el nombre de un juego como parámetro e indicará un mensaje por pantalla 
 * indicando esta situación. Por ejemplo: “Leyendo GTA V desde tienda”.
 */
package gui8y9ejercicio3;

public class XboxOne extends Consola {
    private boolean estaConectadaAInternet;
    private boolean activadaCalidad4k;
    private boolean permiteDescargaAutomaticaActualizaciones;

    public XboxOne() {
    }

    public XboxOne(boolean estaConectadaAInternet, boolean activadaCalidad4k, boolean permiteDescargaAutomaticaActualizaciones, String codigoConsola, String nombre, String EmpresaDesarrollo, int anioLanzamiento) {
        super(codigoConsola, nombre, EmpresaDesarrollo, anioLanzamiento);
        this.estaConectadaAInternet = estaConectadaAInternet;
        this.activadaCalidad4k = activadaCalidad4k;
        this.permiteDescargaAutomaticaActualizaciones = permiteDescargaAutomaticaActualizaciones;
    }
    
    public boolean isEstaConectadaAInternet() {
        return estaConectadaAInternet;
    }

    public void setEstaConectadaAInternet(boolean estaConectadaAInternet) {
        this.estaConectadaAInternet = estaConectadaAInternet;
    }

    public boolean isActivadaCalidad4k() {
        return activadaCalidad4k;
    }

    public void setActivadaCalidad4k(boolean activadaCalidad4k) {
        this.activadaCalidad4k = activadaCalidad4k;
    }

    public boolean isPermiteDescargaAutomaticaActualizaciones() {
        return permiteDescargaAutomaticaActualizaciones;
    }

    public void setPermiteDescargaAutomaticaActualizaciones(boolean permiteDescargaAutomaticaActualizaciones) {
        this.permiteDescargaAutomaticaActualizaciones = permiteDescargaAutomaticaActualizaciones;
    }

    //Customiza el metodo abstracto heredado
    @Override
    public String cargarJuego() {
        return "Cargando juego. Por favor espere";
    }
    
    //Al mismo tiempo implementa un método propio “leerJuegoDigital” el cual 
    //recibirá el nombre de un juego como parámetro e indicará un mensaje por 
    //pantalla indicando esta situación. Por ejemplo: “Leyendo GTA V desde tienda”.
    public String leerJuegoDigital(XboxOne xboxOne){
        return "Leyendo " + xboxOne.getNombre() + " desde tienda";
    }
    
    @Override
    public String toString() {
        return "XboxOne : " + super.toString() + "esta Conectada A Internet  = " + 
                estaConectadaAInternet + ", activada Calidad 4k = " +
                activadaCalidad4k + ", permite Descarga Automatica Actualizaciones = " + 
                permiteDescargaAutomaticaActualizaciones + '.';
    }
    
    
}
