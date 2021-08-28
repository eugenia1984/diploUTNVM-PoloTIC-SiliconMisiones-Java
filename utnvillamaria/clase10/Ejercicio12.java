/*
 * Leer un número comprendido entre uno y siete, ambos inclusive e imprimir 
 * el nombre del día de la semana Correspondiente.
 */
package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int diaSemana;
        String diaSemanaCorrespondiente;
        System.out.println("Ingresa un numero entre el 1 al 7 inclusive para"
                + " decirte el dia de la semana al que corresponde "+
                "(1-Lunes / 2-Martes/.../7-Domingo): ");
        diaSemana = leer.nextInt();
        switch (diaSemana) {
            case 1:
                diaSemanaCorrespondiente = "Lunes";
                break;
            case 2:
                diaSemanaCorrespondiente = "Martes";
                break; 
            case 3:
                diaSemanaCorrespondiente = "Miercoles";
                break;    
            case 4:
                diaSemanaCorrespondiente = "Jueves";
                break;   
            case 5:
                diaSemanaCorrespondiente = "Viernes";
                break;    
            case 6:
                diaSemanaCorrespondiente = "Sabado";
                break;    
            case 7:
                diaSemanaCorrespondiente = "Domingo";
                break;    
            default:
                diaSemanaCorrespondiente = "INCORRECTO";
        }
        System.out.println(diaSemana+" corresponde al día "+diaSemanaCorrespondiente);
    }
}
