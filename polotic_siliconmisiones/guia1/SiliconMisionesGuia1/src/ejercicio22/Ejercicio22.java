/*
 * 2) Una mercería vende canutillos y mostacillas al por mayor mediante su 
 * página web. Como se trata de una mercería mayorista, solicita la cantidad de 
 * paquetes en cada venta y dependiendo de esta realiza los siguientes controles:
 * a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje 
 * indicando que no se permiten compras inferiores a 5 productos.
 * b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15:
 * Se debe emitir un mensaje que el costo de envío es de $200.
 * c) Si la cantidad de productos es mayor a 15: Se debe emitir un mensaje de 
 *  que el envío es gratuito.
 * Realizar el programa necesario para llevar a cabo los 3 controles citados.
 */
package ejercicio22;

import java.util.Scanner;


public class Ejercicio22 {
    public static void main(String[] args) {
        //declaro la variable
        int cantidadProductos;
        //La inicializo
        cantidadProductos = 0;
        
        Scanner leer = new Scanner(System.in);
        //Pido que ingrese la cantidad de paquetes y la asigno a la variable
        System.out.println("Por favor ingrese la cantidad de paquetes a comprar: ");
        cantidadProductos = leer.nextInt();
        
        if (cantidadProductos < 0) {
            System.out.println("No va a comprar ningún producto");
        } else {
            if (cantidadProductos <5) {
                System.out.println("No se puede comprar menos de 5 paquetes!");
            } else  if ( cantidadProductos > 5 && cantidadProductos<15 ) {
                System.out.println("Su compra tendrá un recargo de $200 por costos de envío.");
            } else {
                System.out.println("Su compra tiene el envío bonificado(es gratuito)!");
            }
        }
        
    }
}
