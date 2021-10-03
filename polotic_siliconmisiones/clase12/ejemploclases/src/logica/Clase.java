package logica;

import java.util.ArrayList;

public class Clase {
    //Atributos
    private String nombreClase;
    private String nombreProfesor;
    private Integer horasSemanales;
    private ArrayList<Alumno> alumnos;
    //Constructor vacio
    public Clase() {
    }
    //Constructor con parametros
    public Clase(String nombreClase, String nombreProfesor, Integer horasSemanales, ArrayList<Alumno> alumnos) {
        this.nombreClase = nombreClase;
        this.nombreProfesor = nombreProfesor;
        this.horasSemanales = horasSemanales;
        this.alumnos = alumnos;
    }
    //Getters y Setters
    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(Integer horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    //toString

    @Override
    public String toString() {
        return "Clase{" + "nombreClase = " + nombreClase + ", nombreProfesor = " 
                + nombreProfesor + ", horasSemanales = " + horasSemanales 
                + ", alumnos = " + alumnos + '}';
    }
    
    
    
}
