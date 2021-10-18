/*
 * A partir de la clase abstracta creada crear las siguientes subclases hijas:
 * PlayStation2: La cual tiene los atributos propios norma, chipeadaONo y tamañoMemoryCard.
 * Al mismo tiempo, implementa un método propio “leerDvd” el cual recibirá el nombre 
 * de un juego como parámetro e indicará un mensaje por pantalla indicando esta situación. 
 * Por ejemplo: “Leyendo DVD Fifa 2009”. 
 * Por otro lado, también implementa un método propio llamado “grabarEnMemory” 
 * el cual debe informar al usuario que se ha guardado correctamente un juego en la memory card.
 */
package gui8y9ejercicio3;

public class PlayStation2 extends Consola {
    private String norma;
    private boolean chipeadaONo;
    private int tamanioMemoryCard;

    public PlayStation2() {
    }

    public PlayStation2(String norma, boolean chipeadaONo, int tamanioMemoryCard, String codigoConsola, String nombre, String EmpresaDesarrollo, int anioLanzamiento) {
        super(codigoConsola, nombre, EmpresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }
    
    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeadaONo() {
        return chipeadaONo;
    }

    public void setChipeadaONo(boolean chipeadaONo) {
        this.chipeadaONo = chipeadaONo;
    }

    public int getTamanioMemoryCard() {
        return tamanioMemoryCard;
    }

    public void setTamanioMemoryCard(int tamanioMemoryCard) {
        this.tamanioMemoryCard = tamanioMemoryCard;
    }
    
    //metodo heredado de la clase abstracta de la que etiende
    @Override
    public String cargarJuego() {
        return "Cargando juego. Por favor espere";
    }
    
    //Al mismo tiempo, implementa un método propio “leerDvd” el cual recibirá el 
    // nombre de un juego como parámetro e indicará un mensaje por pantalla 
    // indicando esta situación. Por ejemplo: “Leyendo DVD Fifa 2009”. 
    public String leerDvd(String nombreJuego) {
        return "Leyendo "+ nombreJuego;
    }
    
    //Por otro lado, también implementa un método propio llamado “grabarEnMemory” 
    //el cual debe informar al usuario que se ha guardado correctamente un juego en la memory card
    public String grabarMemory(PlayStation2 playStation2) {
        return "Se ha guardado correctamente " + playStation2.getNombre();
    }
}
