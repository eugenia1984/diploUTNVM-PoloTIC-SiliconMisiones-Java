/*
 * Realizar un programa que dado por teclado un límite ( por ejemplo 100) 
 * muestre en pantalla los números hasta ese límite (empezar por 1)
 */
package clase3ejercicio2;

import java.util.Scanner;

public class Clase3Ejercicio2 {

    public static void main(String[] args) {
        int numeroLimite; //la variable que guardara el límite ingresado por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo para usar de limite : ");
        numeroLimite = leer.nextInt();
        if ( numeroLimite <= 1 ) {
            System.out.println("No ingreso un número entero positivo :-(");
        } else {
            for (int i = 1; i <= numeroLimite; i++) {
                System.out.println( i);
            }
        }
    }
    
}
