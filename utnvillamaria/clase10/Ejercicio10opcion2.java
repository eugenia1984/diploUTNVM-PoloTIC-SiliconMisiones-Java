/*
 * Dado un número entero positivo menor que cien, leerlo desde teclado, indicar
 * si es primo.
 * Los números primos son aquellos que sólo son divisibles por sí mismos y por
 * uno.
 * En el caso del ejemplo, por ser el número leído menor que cien, sólo hay 
 * que comprobar que el número no sea 2 - 3 - 5 - 7 o múltiple de alguno de 
 * estos.
 * Si se cumple esta condición, se trata entonces de un número primo.
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Con RETURN puedo salir del metodo y finalizar el programa
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numeroIngresado = sc.nextInt();
        
        //El 0, 1 y 4 no son primos
        if ( numeroIngresado == 0 || numeroIngresado == 1 || numeroIngresado == 4) {
           System.out.println("El número "+numeroIngresado+" no es primo");
           return; 
        }
        
        for (int i = 2; i < numeroIngresado; i++) {
            //si es divisible por cualquiera de estos numeros, no es primo
            if ( numeroIngresado % i == 0 ) {
                System.out.println("El numero "+numeroIngresado+" no es primo");
                return;
            }
        }
        //si no se puede dividir por ninguno de los de arriba: si es primo
        System.out.println("El numero "+numeroIngresado+"5"
                + " es primo");
    }
    
}
