/*
 * un empleado desea almacenar en un vector sus 12 sueldos del año.
 * A partir de esto, necesita un programa que muestre por pantalla la suma 
 * total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
 */
package guia3ejercicio4;

import java.util.Scanner;

public class Guia3Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma;
        int promedio;
        suma = 0;
        promedio = 0;
        //Declaro el vector
        int[] sueldos = new int[12];
        //Pido ingrese los 12 sueldos
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingresa el sueldo del mes " + i );
            sueldos[i] = leer.nextInt(); //accede al valor i del vector
            suma = suma + i;
        }
        promedio = suma / 12;
        System.out.println("La suma de los 12 sueldos es: " + suma);
        System.out.println("El promedio de los sueldos es :"+ promedio);
    }
    
}
