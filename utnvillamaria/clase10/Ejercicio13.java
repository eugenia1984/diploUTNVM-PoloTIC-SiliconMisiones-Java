/*
 * Leer una serie de 15 números enteros, informar mediante un mensaje 
 * cuántos son mayores que 100.
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int acumulador;
        acumulador = 0;
        // como son 15 numeros enteros los guardo en un vector
        int[] numerosEnteros = new int[15]; 
        //Pido que ingrese los valores por teclado y los guardo en el vector
        System.out.println("Ingrese los valores del vector de tamaño " + numerosEnteros.length + ":");
        //int i = 0, porque los subindices de los arreglos en java inicializan en 0
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("v[" + i + "] = ");
            numerosEnteros[i] = leer.nextInt(); //accede al valor i del vector
        }
        //con otro for voy a ir recorriendo el vector y si el numero es mayor 
        //a 100 lo voy contando en mi acumulador
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] > 100) {
                acumulador = acumulador + 1;
            }
        }
        System.out.println("Ingreso "+acumulador+" numeros mayores a 100" );  
    }
}
