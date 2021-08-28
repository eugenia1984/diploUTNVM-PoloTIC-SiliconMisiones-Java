/*
 * Se leen el sueldo básico y la categoría de un empleado. 
 * Para calcular el sueldo neto se efectúan los siguientes descuentos: 
 * Categoría 1: 30% 
 * Categoría 2: 25% 
 * Categoría 3: 25% 
 * Categoría 4: 10% 
 * Para otras Categorías no hay descuentos. 
 * Imprimir el sueldo neto básico y Categoría.
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double sueldoBasico, sueldoNeto;
        int categoriaEmpleado;
        
        sueldoBasico =0;
        sueldoNeto = 0;
        System.out.println("Ingrese el sueldo básico: ");
        sueldoBasico = leer.nextDouble();
        System.out.println("Ingrese la categoria (1 / 2/ 3 / 4): ");
        categoriaEmpleado = leer.nextInt();
        //con un switch acorde a la categoria calculo sueldo basico
        switch (categoriaEmpleado) {
            case 1:
                sueldoNeto = sueldoBasico * 0.7;
                break;
            case 2:
            case 3:
                sueldoNeto = sueldoBasico * 0.75;
                break;    
            case 4:
                sueldoNeto = sueldoBasico * 0.9;
                break;    
            default:
                sueldoNeto = sueldoBasico;
        }
        System.out.println("El sueldo neto básico es "+sueldoNeto+" para la categoria "+
                categoriaEmpleado);
    }
    
}
