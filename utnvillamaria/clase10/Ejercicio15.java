/*
 * De una serie de 20 valores, se quiere saber cuántos cumplen con la condición 
 * de ser impares mayores que cincuenta y menores que cien.
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int acumulador;
        acumulador = 0;
        // como son 20 numeros enteros los guardo en un vector
        int[] numerosEnteros = new int[20]; 
        //Con Math.random voy asignando numeros aleatorios entre 0 y 100 al vertor de 50 numeros
        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (int) ( Math.random()*100 + 1); //aasigno valores
        }
        //muestro el vector
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.print(numerosEnteros[i]+" - ");
        }
        //con otro for voy a ir recorriendo el vector y si el numero es impares
        //mayores que cincuenta y menores que cien lo voy contando en mi acumulador
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] % 2 != 0 &&   //si es impar
                    numerosEnteros[i] > 50 &&  //si es mayor a 50
                    numerosEnteros[i] < 100) { //si es menor a 100
                acumulador = acumulador + 1;
            }
        }
        System.out.println("\nIngreso "+acumulador+" numeros impares mayores a "+
                " 50 y menores que 100"); 
    }
}
