/*
 * Un niño de primaria necesita realizar 10 cálculos diferentes entre dos 
 * números. Para esto necesita un programa que, para cada cálculo, permita 
 * el ingreso de los dos números por separado al igual que la operación que 
 * desea hacer entre ambos. Al mismo tiempo debe poder realizar el cálculo en 
 * cuestión y mostrar el resultado por pantalla.
 * Por ejemplo:
 * Número 1 = 25 Número 2 = 15 Operador = +
 */
package clase3ejercicio7;

import java.util.Scanner;

public class Clase3Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //con un for recorro de 1 a 10, para hacer los 10 calculos
        for (int i = 1; i <= 10; i++) {
            //Declaro las variables
            double numero1;
            double numero2;
            double resultado;
            String operacion;
            //Pido los numeros y la operacion y asigno a variables
            System.out.println("Ingrese el primer número: ");
            numero1 = leer.nextDouble();
            System.out.println("Ingrese el segundo número : ");
            numero2 = leer.nextDouble();
            System.out.println("Ingrese la operación que quiere realizar en símbolo"+
                    "\n 1 es resta "+
                    "\n 2 es multiplicacion "+
                    "\n 3 es suma"+   
                    "\n 4 multiplica por dos al primer numero"+
                    "\n 5 multiplica por tres al segundo numero"+
                    "\n 6 resta 5 al primer numero"+
                    "\n 7 resta 1 al segundo numero"+
                    "\n 8 multiplica por 3 al primer numero"+
                    "\n 9 multiplica por 6 al segundo numero"+
                    "\n 10 resta 2 al primer número");
            operacion = leer.next();
            //En un switch evaluo acorde a la operacion
            switch (operacion) {
                case "1":
                    resultado = numero1 - numero2;
                    System.out.println("La resta de "+numero1+" y "+numero2+" es : "+resultado);
                    break;
                case "2":
                    resultado = numero1 * numero2;
                    System.out.println("La resta de "+numero1+" y "+numero2+" es : "+resultado);
                case "3":
                    resultado = numero1 + numero2;
                    System.out.println("La resta de "+numero1+" y "+numero2+" es : "+resultado);
                case "4":
                    resultado = numero1 * 2;
                    System.out.println("El doble de "+numero1+" es : "+resultado); 
                case "5":
                    resultado = numero2 * 3;
                    System.out.println("El triple de "+numero2+" es : "+resultado); 
                case "6":
                    resultado = numero1 - 5;
                    System.out.println("El "+numero1+" menos 5 : "+resultado);
                case "7":
                    resultado = numero2 - 1;
                    System.out.println("El "+numero2+" menos 1 : "+resultado);
                case "8":
                    resultado = numero1 * 3;
                    System.out.println("El "+numero1+" por 3 es : "+resultado);
                case "9":
                    resultado = numero2 * 6;
                    System.out.println("El "+numero2+" por 6 es : "+resultado);
                case "10":
                    resultado = numero1 - 2;
                    System.out.println("El "+numero1+" menos 2 es : "+resultado);
            }  
        }
    }
    
}
