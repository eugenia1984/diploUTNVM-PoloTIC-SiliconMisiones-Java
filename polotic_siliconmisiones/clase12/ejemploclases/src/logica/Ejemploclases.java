package logica;

import java.util.ArrayList;

public class Ejemploclases {

    public static void main(String[] args) {
        //instancio un nuevo objeto alumno con el contrucctor vacio
        Alumno alumno1 = new Alumno();
        //instancio un nuevo objeto alumno con el constructor con parametros
        Alumno alumno2 = new Alumno(1, "Ana", "Sanchez");
        
        System.out.println("El alumno 2 es mayor de edad :"+alumno2.detectarMayorEdad(20));
        
        //instancio una objeto de la clase Clase
        Clase claseMatematicas = new Clase();
        claseMatematicas.setNombreClase("Matematica I");
        claseMatematicas.setHorasSemanales(50);
        claseMatematicas.setNombreProfesor("Jorga Perez");
        //creo una ArrayList para guardar los alumnos de la Clase de Matematica I
        ArrayList<Alumno> alumnos = new ArrayList();
        //le agrego el alumno 2 al Array List asi al menos tiene un alumno
        alumnos.add(alumno2);
        //Setteo le ArrayList de alumnos
        claseMatematicas.setAlumnos(alumnos);
        //Muestro la Clase Matamatica I con el metodo toString
        claseMatematicas.toString();
    }
    
}
