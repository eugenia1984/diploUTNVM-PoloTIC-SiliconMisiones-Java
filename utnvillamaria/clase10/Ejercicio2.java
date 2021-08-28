/*
 * Realizar algoritmo que lea dos números, calculando y escribiendo el valor 
 * de su suma, resta, producto y división.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaro las variables
        double numero1, numero2, suma, resta, producto, division;
        //pido que ingresen los numeros
        System.out.println("Ingresa un primer numero : ");
        numero1 = leer.nextDouble();
        System.out.println("Ingresa un segundo numero : ");
        numero2 = leer.nextDouble();
        //calculo las operaciones entre los dos y las muestro
        suma = numero1 + numero2;
        System.out.println("La SUMA de "+numero1+" y "+numero2+" es: "+suma);
        resta = numero1 - numero2;
        System.out.println("La RESTA de "+numero1+" y "+numero2+" es: "+resta);
        producto = numero1 * numero2;
        System.out.println("El PRODUCTO de "+numero1+" y "+numero2+" es : "+producto);
        //para la division tengoque descartar que numero2 sea 0 ya que no se 
        //puede dividir por 0
        if(numero2 == 0 ) {
            System.out.println("No se puede realizar la división por cero!!");
        } else {
            division = numero1/numero2;
            System.out.println("La DIVISION entre "+numero1+" y "+numero2+
                    " es: "+division);
        }
    }
    
}
