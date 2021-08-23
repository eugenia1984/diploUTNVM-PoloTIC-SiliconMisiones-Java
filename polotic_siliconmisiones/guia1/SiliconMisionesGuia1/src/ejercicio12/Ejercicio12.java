/*
 * Realizar un programa que permita el intercambio de valores entre dos 
 * variables. Por ejemplo: Si una variable numero vale 35, y una variable 
 * valer 20 y numero2 pase a valer 35. Una vez realizado el cambio mostrar el 
 * resultado por pantalla.
 */
package ejercicio12;


public class Ejercicio12 {
    public static void main(String[] args) {
        //Declaro mis variables
        int numero1, numero2, auxiliar;
        //Les asigno valor o inicializo
        numero1 = 35;
        numero2 = 20;
        auxiliar = 0;
        System.out.println("El valor de la variable numero1 es :"+numero1+
                " y el valor de la variable numero2 es: "+numero2);
        //Intercambio los valores
        auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;
        System.out.println("----Intercambiando los valores ----");
        System.out.println("El valor de la variable numero1 es :"+numero1+
                " y el valor de la variable numero2 es: "+numero2);   
    } 
}
