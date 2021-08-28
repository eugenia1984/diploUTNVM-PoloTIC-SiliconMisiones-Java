/*
 * Dado un número entero positivo menor que cien, leerlo desde teclado, 
 * indicar si es primo.
 * Los números primos son aquellos que sólo son divisibles por sí mismos 
 * y por uno.
 * En el caso del ejemplo, por ser el número leído menor que cien, sólo hay 
 * que comprobar que el número no sea 2 - 3 - 5 - 7 o múltiple de alguno de estos.
 * Si se cumple esta condición, se trata entonces de un número primo.
 *
 * números primos entre 1 y 100, ellos son: 
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
 * 73, 79, 83, 89 y 97
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        System.out.println("Ingrese un numero entero positivo menor que 100"+
                " para decirle si es primo: ");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado< 0 || numeroIngresado>100) {
            System.out.println("No ingreso un nro. entero positivo menor que 100.");
        } else {
            if (esPrimo(numeroIngresado)) {
                System.out.println("ES PRIMO");
            } else {
                System.out.println("NO ES PRIMO");
            }
                    
        }
    }
    
    static boolean esPrimo(int n) {
        for(int i=2; i<n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
}
