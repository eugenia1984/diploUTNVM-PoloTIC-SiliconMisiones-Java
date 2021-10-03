package logica;

public class Alumno {
    //Atributos
    int id;
    String nombre;
    String apellido;
    //Constructor vacio
    public Alumno() {
    }
    //constructor con parámetros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    //Métodos
    public void marcarPresente(){
        System.out.println("El alumno está presente");
    }
    public boolean detectarMayorEdad(int edad){
        if (edad > 18) {
            return true;
        } else {
            return false;
        }
    }
    
}
