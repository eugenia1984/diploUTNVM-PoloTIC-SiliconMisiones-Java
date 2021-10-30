package herencia;


public class Camion extends Vehiculo { //con axtends indoco que hereda de Vehiculo
    //Atributos
    private Double kgCarga;
    private Integer nroAcoplado;

    public Camion() {
    }

    public Camion(Double kgCarga, Integer nroAcoplado) {
        //con el super indico que seteo los atributos que hereda de la super clase
        super();
        this.kgCarga = kgCarga;
        this.nroAcoplado = nroAcoplado;
    }
    

    
    
    
}
