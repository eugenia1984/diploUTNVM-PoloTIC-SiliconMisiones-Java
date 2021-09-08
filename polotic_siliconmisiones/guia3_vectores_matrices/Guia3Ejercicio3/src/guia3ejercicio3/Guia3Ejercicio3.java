/*
 * Realizar un programa que permita la carga de 15 números en un vector. una 
 * vez cargados, se necesita que el programa cuente e informe por pantalla 
 * cuántes veces se cargó el número 3.
 */
package guia3ejercicio3;

import java.util.Scanner;

public class Guia3Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaro mi variable que va a ir comparando para tener el maximo de los nros ingresados
        int numeroTres;
        int contador;
        contador = 0;
        // Declaro mi vector de numeros enteros y de dimension 10
        int[] vector = new int[15]; 
        //Pido por teclado que ingrese los 10 numeros y voy a ir calculando 
        //cual es el mayor
        System.out.println("---- Rellene el vector con 15 numeros enteros positivos----");
        for (int i = 1; i < vector.length; i++) {
            System.out.println("v[" + i + "] = ");
            vector[i] = leer.nextInt(); //accede al valor i del vector  
            if(vector[i] == 3) { //para ir acumulando el minimo
                contador = contador +1;
            }  
        }
        System.out.println("El número 3 se ingreso " + contador + " veces.");
    }
    
}
