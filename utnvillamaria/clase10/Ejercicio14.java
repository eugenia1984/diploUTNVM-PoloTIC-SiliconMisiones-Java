/*
 * Leer cincuenta números e indicar la cantidad de valores mayores que diez.
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int acumulador;
        acumulador = 0;
        // como son 50 numeros enteros los guardo en un vector
        int[] numerosEnteros = new int[50]; 
        //Con Math.random voy asignando numeros aleatorios entre 0 y 100 al vertor de 50 numeros
        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (int) ( Math.random()*100 + 1); //aasigno valores
        }
        //muestro el vector
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.print(numerosEnteros[i]+" - ");
        }
        //con otro for voy a ir recorriendo el vector y si el numero es mayor 
        //a 10 lo voy contando en mi acumulador
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] > 10) {
                acumulador = acumulador + 1;
            }
        }
        System.out.println("\nIngreso "+acumulador+" numeros mayores a 10" ); 
    }
    
}
