/*
Diseñar  un  algoritmo  que  permita  aplicar  un  descuento  del  10%  al 
monto total de una compra si laforma de pago empleada es de contado. 
El usuario deberá ingresar el monto de la compra realizada y la forma de pago 
utilizada. Si es contado, deberá aplicar el descuento, sino se deberá mostrar
un mensaje informando que para dicha forma de pago no tiene  descuento

BEGIN
Decimal montoTotal
Text formaDePago
Decimal montoConDesc
PRINT: “Ingrese monto total de la compra”
INPUT: montoTotal;
PRINT: “Ingrese forma de pago”
INPUT: formaDePago;
    IF (formaDePago == “contado”)
    THEN:montoConDesc = montoTotal * 0.9
    PRINT: “El monto Total con descuento aplicado por forma de pago 
    alcontado, es de:” + montoConDesc + “pesos”.
    ELSEPRINT: “La forma de pago ingresada no tiene descuento asociado”.
    END IF.
END
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        //Declaro variables
        double montoTotal;
        String formaDePago;
        double montoConDesc;
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        //Pido monto y forma de pago y asigno a variables
        System.out.println("Ingrese monto total de la compra: ");
        montoTotal = read.nextInt();
        System.out.println("Ingrese forma de pago ( contado / otra forma): ");
        formaDePago = read.next().toLowerCase();
        
        //con el if else muestro mensaje acorde a la forma de pago
        if ( formaDePago.equals( "contado" ) ) {  
    //con el metodo equals comparo Strings si son iguales da true
            montoConDesc = montoTotal * 0.9;
            System.out.println("El monto Total con descuento aplicado por forma "
                    + "de pago a lcontado, es de : " + montoConDesc + "pesos.");
        } else {
            System.out.println("La forma de pago ingresada no tiene descuento "
                    + "asociado");
        }
        
    }
    
}
