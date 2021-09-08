/*
 * Llevar a cabo un programa que incluya un vector que almacene los nombres: 
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro recorrido para 
 * mostrar los mismos por pantalla.
 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creo el vector de dimension 8
        String vector[] = new String[8];
        System.out.println("Reelena el vector con los siguientes nombres: "+
                "\nAlejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila");
        //Recorrido del vector para cargar los datos
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v[" + i + "] = ");
            vector[i] = leer.next(); 
        }
        //Recorrido del vector para mostrar los datos
         for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
