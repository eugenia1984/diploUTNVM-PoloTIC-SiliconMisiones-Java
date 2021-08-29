/*
 * Realizar un programa que muestre por pantalla palabras que sean ingresadas 
 * por teclado hasta que se ingrese la palabra 'salir'
 */
package clase3ejercicio5;

import java.util.Scanner;

public class Clase3Ejercicio5 {

    public static void main(String[] args) {
       String palabraIngresada; //declaro la variable
       palabraIngresada = "";  //la inicializo vacia
       Scanner leer = new Scanner(System.in);
       
       while(!palabraIngresada.equals("salir")) { //mientras no ingresa salir sigo pidiendo palabra
           System.out.println("*Ingrese una palabra para mostrarla por pantalla"+
                   "\n-Si ingresa 'salir' el programa se interrumpe-\n");
           palabraIngresada = leer.next().toLowerCase(); //lo paso a minuscula
       }
    }
    
}
