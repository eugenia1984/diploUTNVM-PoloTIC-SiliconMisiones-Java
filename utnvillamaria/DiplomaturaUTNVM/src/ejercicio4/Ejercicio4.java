/*
Diseñar un algoritmo que devuelva el nombre de la semana, 
a partir de un número ingresado por el usuario 

algoritmoDiaSemana
entero: dia
escribir("Escribe un número entre 1 y 7: ")
leer(dia)
segun_sea(dia)hacer
    caso1:
        escribir("LUNES")
    caso2:
        escribir("MARTES")
    caso3:
        escribir("MIÉRCOLES")
    caso4:
        escribir("JUEVES")
    caso5:
        escribir("VIERNES")
    caso6:
        escribir("SÁBADO")
    caso7:
        escribir("DOMINGO")
    otros:
        escribir("Error. El número debe estar entre 1 y 7.")
    fin_segun
fin

 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Declaro variable
        int dia;
        
        Scanner read = new Scanner(System.in);
        
        //Pido que ingrese un dia en numero y guardo en variable
        System.out.println("Escribe un número entre 1 y 7: ");
        dia = read.nextInt();
        
        //con el switch acorde al numoero muestro el dia
        switch ( dia ) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("No ingreso un número válido");;
        }
        
    }
    
}
