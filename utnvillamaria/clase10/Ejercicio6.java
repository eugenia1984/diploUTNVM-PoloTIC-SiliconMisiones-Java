/*
 * Ingresar por teclado los precios correspondientes a cinco articulos y
 * las cantidades vendidas de cada uno de ellos. 
 * Calcular e imprimir el importe total de ventas de cada uno y un importe
 * total de lo vendido. 
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precioPorArticulo, cantidadVentasPorArticulo,totalVentaPorArticulo, totalVentas;
        int cantidadArticulo;
        
        totalVentas = 0;
        //con un for voy a pedir los 5 articulos con su precio y cantidad de ventas
        //calculo el total e ventas y voy acumulando para el total general
        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese el precio del articulo"+i+" : ");
            precioPorArticulo = leer.nextDouble();
            System.out.println("Ingrese las cantidades vendidas del articulo"+i+" : ");
            cantidadVentasPorArticulo = leer.nextInt();
            totalVentaPorArticulo = precioPorArticulo  * cantidadVentasPorArticulo;
            System.out.println("El importe total de las ventas del articulo"+i+" es: "+
                    totalVentaPorArticulo);
            totalVentas = totalVentas + totalVentaPorArticulo;  
        }
        System.out.println("El importe total de lo vendido es :"+totalVentas);
        
    }
    
}
