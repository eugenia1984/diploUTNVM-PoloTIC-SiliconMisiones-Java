/*
 * Un gerente de una empresa prestadora de servicios de internet necesita 
 * un programa que permita realizar el cálculo del monto a pagar de la factura
 * de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo 
 * debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio.
 * Los tipos de servicio son 3:
 * i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
 * ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
 * iii. Internet 100 megas (Cuyo valor fijo es de $1600)
 * El programa debe poder calcular el monto a pagar (dependiendo del tipo de
 * servicio con el que cuente el cliente) e informar por pantalla el DNI del 
 * mismo junto con el monto a pagar y el número de servicio con el que cuenta.
 */
package clase3ejercicio6;

import java.util.Scanner;

public class Clase3Ejercicio6 {

    public static void main(String[] args) {
        int numeroDni;
        int servicioInternet;
        double valorInternet;
        
        valorInternet= 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su número de DNI : ");
        numeroDni = leer.nextInt();
        
        do {            
            System.out.println("Ingrese su plan de internet (1 - intenet 30 megas "+
                "/ 2 - internet 50 megas / 3 - internet 100 megas ):");
            servicioInternet = leer.nextInt();
        } while (servicioInternet != 1 && servicioInternet !=2 && servicioInternet !=3);
        
        switch (servicioInternet) {
            case 1:
                valorInternet = 890.0 - (890 * 0.10);
                break;
            case 2:
                valorInternet = 1050 - ( 10550 * 0.05);
                break; 
            case 3:
                valorInternet = 1600;
                break;    
            default:
                System.out.println("INCORRECTO");
        }
        System.out.println("El cliente con DNI : " + numeroDni + " y el servicio " +
                servicioInternet + " debe abonar : $ " + valorInternet);
                
    }
    
}
