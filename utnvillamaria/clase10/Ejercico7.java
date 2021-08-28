/*
 * Indicar si un número ingresado es par o impar. 
 * Si el modulo del numero ingresado es cero -> es par, sino -> es impar
 * Descarto que si ingresa numero negativo o 0 no es par ni impar
 */
package ejericio7;

import java.util.Scanner;


public class Ejercico7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroIngresado;
        //pido el numero y lo uardo en variable
        System.out.println("Ingrese un numero entero para decirle si es par o impar : ");
        numeroIngresado = leer.nextInt();
        if (numeroIngresado <= 0) {  //si el numero ingresado es negativo o 0
            System.out.println("Se pidio un numero entero, no puede ingresar negativos o cero");
        } else if( numeroIngresado % 2 == 0 ) {  //Si el resto al dividirlo por 2 es 0 -> es par
            System.out.println(numeroIngresado+" es PAR");
        } else {  // es impar
            System.out.println(numeroIngresado+" es IMPAR");
        }
    }  
}

