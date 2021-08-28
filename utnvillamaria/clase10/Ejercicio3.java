/*
 * Un pintor sabe que con una pintura determinada puede pintar 3,6 metros 
 * cuadrados por cada medio litro. Sabiendo la altura y el largo de la pared 
 * a pintar, informar cuántos litros de pintura utilizará 
 * (Altura y Largo en metros). 
 *
 * Se que por cada 3,6 mts2 voy a usar 0,50 litros de pintura
 * Si averiguo la superficie de mi pared(supericiePared) con regla de 3 simple
 * avegiguo los litros de pintura (litrosPinturaPared)
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaro la variables
        double alturaPared, largoPared, superficiePared, litrosPinturaPared;
        //pido por teclado ingrese la informacion de la medida de la pared
        System.out.println("Ingrese la altura de la pared : ");
        alturaPared = leer.nextDouble();
        System.out.println("Ingrese el largo de la pared : ");
        largoPared = leer.nextDouble();
        superficiePared = alturaPared * largoPared; //calculo la superficie de la pared
        System.out.println(superficiePared );
        litrosPinturaPared = (superficiePared * 0.5) / 3.6;
        System.out.println("Va a necesitar "+litrosPinturaPared+" para pintar una pared de :"+
                alturaPared+" metros de altura y de "+largoPared+" metros de largo");
    }
    
}
