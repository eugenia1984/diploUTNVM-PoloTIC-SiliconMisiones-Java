/*
 * Resolver los siguientes ejercicios con estructuras selectivas. Intentar 
 * ejecutarlos y probarlos con datos de prueba.
 * 1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los 
 * puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 
 * 3-supervisor.
 * a) Los repositores cobran $15.890 + un bono de 10%.
 * b) Los cajeros cobran $25.630,89 fijos.
 * c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta 
 * un 11% de jubilación.
 * Se necesita una aplicación que, dependiendo el tipo de empleado del que se 
 * trate, calcule y muestre en pantalla el correspondiente sueldo.
 */
package ejercicio21;

import java.util.Scanner;


public class Ejercicio21 {
    public static void main(String[] args) {
        //Declaro mis variables
        Double repositor, cajero, supervisor;
        int opcion;
        //Las inicializo
        repositor = 0.0;
        cajero = 0.0;
        supervisor = 0.0;
        opcion = 0;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de empleado, en NUMERO, para "
                + "indicarle el sueldo."+"\n1-repositor"+"\n2-cajero"+
                "\n3-supervisor"+"\n");
        opcion = leer.nextInt();
        
        if ( opcion ==1 || opcion ==2 || opcion == 3) {
             
            switch (opcion) {
            case 1:
                repositor = 15890.00 + ( 15890 * 0.10);
                System.out.println("El sueldo de un repositor es de $ : " + repositor);        
                break;
            case 2:
                cajero = 25630.89;
                System.out.println("El sueldo de un cajero es de $ : " + cajero);
                break;
            case 3:
                supervisor = 35560.20 - ( 35560.20 * 0.11);
                System.out.println("El sueldo de un supervisor es de $ : " + supervisor);
                break;    
            default:
                System.out.println("Eligio una opción incorrecta");
            }
        } else {
            System.out.println("Eligio una opción incorrecta.");
        }
    }
    
}
