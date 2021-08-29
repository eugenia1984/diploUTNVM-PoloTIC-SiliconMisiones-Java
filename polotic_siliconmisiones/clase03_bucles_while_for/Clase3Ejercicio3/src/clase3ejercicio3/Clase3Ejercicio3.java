/*
 * Realizar un programa que muestre por pantalla los números del 200 al 250, 
 * saltando de 2 en 2.
 * Las secuencia debería ser: 200 ... 202 ... 204 ... etc
 */
package clase3ejercicio3;

public class Clase3Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("--- Ciclo for para mostrar por pantalla del 200 al 250"+
                " saltando de 2 en 2 ---");
        for (int i = 200; i <= 250; i+=2) { 
    //como voy a ir mostrando de dos en dos -< incremento: i+=2
            System.out.println(i);
        }
    }
    
}
