/*
 * Un instituto de inglés desea informar a sus alumnos los días y horarios de 
 * sus clases. Para ello, decidió la creación de una aplicación que, a partir 
 * del ingreso de la edad del alumno, le informe en qué días y horarios los 
 * alumnos tienen clases. Como información, la academia proporciona los 
 * siguientes datos respecto a los grupos y los diferentes horarios.
 * a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
 * b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
 * c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
 * d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
 * Realizar el programa solicitado por el instituto, donde a partir del ingreso
 * de la EDAD del alumno, el sistema informe por pantalla los días y horarios 
 * de cursada.
 */
package ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {
    public static void main(String[] args) {
        //declaro mi variable
        int edadAlumno;
        //Inicializo mi variable
        edadAlumno = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad del alumno (en NUMERO) para poder"
                + "informarle los días y horarios de clase");
        edadAlumno = leer.nextInt();
        if ( edadAlumno >= 4 && edadAlumno <= 6  ) {
            System.out.println("Alumno de Kinder : Lunes y Miércoles de 16 a 17"); 
        } else if  ( edadAlumno> 6 && edadAlumno <= 8) {
            System.out.println("Alumno de 1st year : Martes y Jueves de 16:30 a 17:30"); 
        } else if ( edadAlumno == 9 || edadAlumno == 10){
            System.out.println("Alumno de 2nd year : Martes y Jueves de 17:30 a 19"); 
        } else if( edadAlumno>= 11 && edadAlumno <= 13) {
            System.out.println("Alumno de 3rd year : Lunes y Miércoles de 17 a 18:30");
        } else {
            System.out.println("Edad incorrecta!");
        }
    }
    
}
