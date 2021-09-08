/*
 * Realizar un programa que permita la carga de 10 números en un vector.
 * una vez cargados, se necesita que el programa determine cuál es el mayor y 
 * cuál es el menor.
 */
package guia3ejercicio2;

import java.util.Scanner;

public class Guia3Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaro mi variable que va a ir comparando para tener el maximo de los nros ingresados
        int numeroMaximo;
        int numeroMinimo;
        numeroMaximo = 0;
        numeroMinimo = 0;
        // Declaro mi vector de numeros enteros y de dimension 10
        int[] vector = new int[10]; 
        //Pido por teclado que ingrese los 10 numeros y voy a ir calculando 
        //cual es el mayor
        System.out.println("---- Rellene el vector con numeros enteros positivos----");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v[" + i + "] = ");
            vector[i] = leer.nextInt(); //accede al valor i del vector
            if(vector[i] > numeroMaximo) { //para ir acumulando el maximo
                numeroMaximo = vector[i];
            }  
            if(vector[i] < numeroMinimo) { //para ir acumulando el minimo
                numeroMinimo = vector[i];
            }  
        }
        System.out.println("El número máximo ingresado es: " + numeroMaximo);
        System.out.println("El número mínimo ingresado es: " + numeroMinimo);
    }
    
}
