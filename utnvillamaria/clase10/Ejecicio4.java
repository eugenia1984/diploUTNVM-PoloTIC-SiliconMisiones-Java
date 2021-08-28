/*
 * Dadas dos variables numéricas A y B, que el usuario debe teclear, se 
 * pide realizar un algoritmo que intercambie los valores de ambas variables 
 * y muestre cuánto valen al final las dos variables (recuerda la asignación)
*/
package ejercicio4;

import java.util.Scanner;

public class Ejecicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaro las variables
        double a, b, auxiliar;
        //Pido al usuario los numeros y asigno
        System.out.println("Ingrese un primer numero que guardamos en varaible A: ");
        a = leer.nextDouble();
        System.out.println("Ingrese un segundo numero que guardamos en varaible B: ");
        b = leer.nextDouble();
        System.out.println("El valor ingresado en A es: "+a+" el valor ingresado en B es: "+b);
        //con la variable auxiliar voy a intercambiar los valores
        auxiliar =a;
        a = b;
        b = auxiliar;
        System.out.println("El valor intercambiado es -> A: "+a+" y B: "+b);
    }
    
}
