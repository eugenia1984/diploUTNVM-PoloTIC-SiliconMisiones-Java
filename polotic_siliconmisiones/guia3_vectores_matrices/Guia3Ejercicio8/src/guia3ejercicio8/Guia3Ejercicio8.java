/*
 * Llevar a cabo un programa que permita cargar mediante teclado una matriz de
 * 3 x 3 (3 filas, 3 columnas) con razas de perros. 
 * Una vez cargada, se debe permitir al usuario ingresar por teclado una raza 
 * de perro que quiera buscar; el programa deberá poder encontrarla y mostrar 
 * un mensaje con la posición (fila, columna) donde la encontró. 
 * En caso de que la raza de perro no se encuentre en la matriz, se deberá 
 * informar la situación mediante un mensaje por pantalla
 */
package guia3ejercicio8;

import java.util.Scanner;

public class Guia3Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        // creo la matrix de 3x3 de raza de perros
        String razaDePerros[][] = new String[3][3];
        //Variable que guarda la raza de perro a buscar
        String razaABuscar;
        //Con un for voy recorriendo filas y columnas para ir pidiendo 
        //las razas de perros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa una raza de perro para la fila "+
                        +i+" y la columna "+j+" = ");
                razaDePerros[i][j] = sc.next().toUpperCase();
            }
        }
        
        //Muestro la matriz con los perros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El perro en la fila "+i+
                        " y la columna "+j+" es = "+ razaDePerros[i][j]);                
            }
        }
        
        //Pido la raza de perro a buscar
        System.out.println("Ingrese una raza de perros a buscar: ");
        razaABuscar = sc.next().toUpperCase();
        //muestro que se quiere buscar
        System.out.println("Quiere buscar la raza = "+razaABuscar);
        
        //Recorro la matriz razaDePerros para buscar a la raza ingresada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( razaDePerros[i][j].equals(razaABuscar)) {
                    System.out.println("Se encontro la raza en la posicion: "+
                            " Fila :"+i+" columna= "+j+":-) !!!");
                }  else {
                    System.out.println("No se encontro la raza en la posicion: "+
                            " Fila :"+i+" columna= "+j);
                }            
            }
        }
    }
    
}
