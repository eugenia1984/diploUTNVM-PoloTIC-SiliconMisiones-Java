package herencia;

public class Auto extends Vehiculo { //con extends indico que HEREDA de la clase Vehiculo
    //atributos
    private Integer nroChasis;
    
    //constructor sin parametros
    public Auto() {    
    }

    //constructor con parametro
    public Auto(Integer nroChasis) {
        this.nroChasis = nroChasis;
    }
    
    @Override
    protected void acelerar() {
        //con el super voy a ver el metodo acelarar de la super clase, porque hace referencia a la super clase
        super.acelerar();
        System.out.println("El auto está acelerando");
    }
}
