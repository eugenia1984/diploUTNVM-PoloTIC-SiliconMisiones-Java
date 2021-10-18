/*
 * A partir de la clase abstracta creada crear las siguientes subclases hijas:
 * Nintendo64: La cual tiene un atributo propio norma y otro para determinar 
 * si lee cartuchos piratas.
 * Al mismo tiempo, implementa un método propio “leerCartucho” el cual recibirá el 
 * nombre de un juego como parámetro e indicará un mensaje por pantalla indicando 
 * esta situación. Por ejemplo: “Leyendo cartucho Banjo Kazooie”.
 */
package gui8y9ejercicio3;

public class Nintendo64 extends Consola {
    private String norma;
    private boolean leeCartuchosPirata;

    public Nintendo64() {
    }

    public Nintendo64(String norma, boolean leeCartuchosPirata, String codigoConsola, String nombre, String EmpresaDesarrollo, int anioLanzamiento) {
        super(codigoConsola, nombre, EmpresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.leeCartuchosPirata = leeCartuchosPirata;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isLeeCartuchosPirata() {
        return leeCartuchosPirata;
    }

    public void setLeeCartuchosPirata(boolean leeCartuchosPirata) {
        this.leeCartuchosPirata = leeCartuchosPirata;
    }

    @Override
    public String toString() {
        return "Nintendo64 : " + super.toString() + "norma = " + norma + 
                ", lee Cartuchos Pirata = " + leeCartuchosPirata + '.';
    }

    //Customiza el metodo abstracto heredado
    @Override
    public String cargarJuego() {
        return "Cargando juego. Por favor espere";
    }
    
    //Al mismo tiempo, implementa un método propio “leerCartucho” el cual recibirá el 
    //nombre de un juego como parámetro e indicará un mensaje por pantalla indicando 
    //esta situación. Por ejemplo: “Leyendo cartucho Banjo Kazooie”.
    public String leerCartucho(String nombreDelJuego ){
        return "Leyendo cartucho " + nombreDelJuego;
    }
    
}
