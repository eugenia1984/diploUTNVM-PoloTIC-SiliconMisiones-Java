/*
 * Leer un número e indicar si es divisible por tres. 
 * Si el modulo del numero dividido 3 es 0 -> es divisible por 3
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        //pido el numero y lo uardo en variable
        System.out.println("Ingrese un numero entero para decirle si es divisible por 3 : ");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado <= 0) {  //si el numero ingresado es negativo o 0
            System.out.println("Se pidio un numero entero, no puede ingresar negativos o cero");
        } else if( numeroIngresado % 3 == 0 ) {  //Si el resto al dividirlo por 3 es 0 -> es divisible por 3
            System.out.println(numeroIngresado+" es DIVISIBLE POR 3");
        } else {  // es impar
            System.out.println(numeroIngresado+" NO es DIVISIBLE POR 3");
        }
    }  
}
