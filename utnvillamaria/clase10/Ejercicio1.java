/*
 * Si un lote de terreno tiene X metros de frente por Y metros de fondo: 
 * calcular e imprimir la cantidad de metros de alambre para cercarlo
 * (X e Y serán leídos al comenzar el programa).
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Pido se ingresen los tamaños de frente y fondo
        Scanner leer = new Scanner(System.in);
        //declaro las varaibles para frente y fondo
        double frenteTerreno;
        double fondoTerreno;
        double perimetro;
        System.out.println("Ingresa la medida del frente del terreno: ");
        frenteTerreno = leer.nextDouble();
        System.out.println("Ingresa la medida del frente del terreno: ");
        fondoTerreno = leer.nextDouble();
        perimetro = frenteTerreno * 2 + fondoTerreno *2;
        System.out.println("La cantidad de alambre para cercar el terreno de "+
                frenteTerreno + " de frente y de " + fondoTerreno + " de fondo es "+
                perimetro);
    }
    
}
