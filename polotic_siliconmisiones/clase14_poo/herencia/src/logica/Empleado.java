package logica;

public class Empleado extends Persona {
    //Atributos
    private int numLegajo;
    private String cargo;
    private double sueldo;

    //constructor vacio
    public Empleado() {
    }
    //constructor con parametros

    public Empleado(int numLegajo, String cargo, double sueldo) {
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado(int numLegajo, String cargo, double sueldo, int id_persona, String dni, String nombre, String apellido, String domicilio, String numTel) {
        super(id_persona, dni, nombre, apellido, domicilio, numTel); //heredados
        this.numLegajo = numLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    //getters y setters
    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "numLegajo = " + numLegajo + ", cargo = " + cargo + 
                ", sueldo = " + sueldo + '}';
    }
    
    
    
}
