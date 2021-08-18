/*
Indicar si un número ingresado es par o impar
Algoritmo NumeroPar
    Entero numero
    Escribir 'Ingrese un numero:'
    Leer numero
    Si numero MOD2 == 0 Entonces
      Escribir numero,' es par'
    SiNo
      Escribir numero,' no es par '
    FinSi
FinAlgoritmo
 */
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        //Declaro mi variable
        int numero;
        
        //Importo Scanner para ingresar datos y leerlos
        Scanner leer = new Scanner(System.in);
        
        //Pido que ingrrese un número y lo asigno a la variable
        System.out.println("Ingrese un número: ");
        numero = leer.nextInt();
        
        //Con if else y acorde a lo que da el modulo de 2 muestro si es par o impar
        if ( numero % 2 == 0) {
            System.out.println( numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
    
}
