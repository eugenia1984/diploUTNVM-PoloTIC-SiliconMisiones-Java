/*
 * Leer un número e indicar si este es múltiplo de dos. 
 * Si el numero es multiplo de 2 -> es par
 */
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        //pido el numero y lo uardo en variable
        System.out.println("Ingrese un numero entero para decirle si es multiplo de 2 : ");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado <= 0) {  //si el numero ingresado es negativo o 0
            System.out.println("Se pidio un numero entero, no puede ingresar negativos o cero");
        } else if( numeroIngresado % 2 == 0 ) {  //Si el resto al dividirlo por 2 es 0 -> es par
            System.out.println(numeroIngresado+" es MULTIPLO DE DOS");
        } else {  // es impar
            System.out.println(numeroIngresado+" NO es MULTIPLO DE DOS");
        }
    }
    
}
