/*
 * Ingresar como dato el perímetro de un cuadrado. 
 * Calcular e imprimir el volumen del cubo que tiene como lado el cuadrado
 * antes mencionado. 
 * (V=a3).
 *
 * El volumen es lado * lado * lado, es decir lado al cubo
 * Java tiene en su clase Math el metodo pow
 * Math.pow(base, exponente)
 *
 * perimetroCuadrado = lado * 4  -> perimetroCuadrado / 4 = lado
 * Y el volumenDelCubo = lado al cubo = Math.pow(lado,3)
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaro mis variables
        double perimetroCuadrado, lado, volumenDelCubo;
        //pido el perimetro del cuadrado para calcular el lado
        System.out.println("Ingresa el perimetro del cuadrado : ");
        perimetroCuadrado = leer.nextDouble();
        lado = perimetroCuadrado / 4;
        //En base al lado calculo el volumen y lo muestro
        volumenDelCubo = Math.pow(lado, 3);
        System.out.println("El volumen del cubo que tiene como lado "+lado+
                " es: "+volumenDelCubo);
    }
    
}
