
package logica;


public class Persona {
    //atributos
    private int id_persona;
    private String dni;
    private  String nombre;
    private String apellido;
    private  String domicilio;
    private  String numTel;

    //constructor vacio
    public Persona() {
    }
    
    //constructor con parametros
    public Persona(int id_persona, String dni, String nombre, String apellido, String domicilio, String numTel) {
        this.id_persona = id_persona;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.numTel = numTel;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", numTel=" + numTel + '}';
    }
    
    
    
}
