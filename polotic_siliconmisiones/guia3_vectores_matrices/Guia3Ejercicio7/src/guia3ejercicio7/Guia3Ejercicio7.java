/*
 * Llevar a cabo un programa que permita completar con números 1 toda la 
 * diagonal principal de una matriz de 6 x 6. Entiéndase por diagonal principal 
 * aquella que comienza en [0,0] y termina en [6,6].
 */
package guia3ejercicio7;

import java.util.Scanner;

public class Guia3Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Nombro mi matriz de 4 filas y 5 columnas
        int[][] matriz = new int[6][6];
        //Pido que ingresen los datos para cargar la matriz
        for (int f = 0; f < 6; f++) {  //para cada fila
            for (int c = 0; c < 6; c++) { //para cada columna
                if( f == c) {
                    matriz[f][c] = 1;
                } else {
                    System.out.println("Ingrese el número para la fila "+(f+1)+" columna "+(c+1)+": ");
                    matriz[f][c] = leer.nextInt();
                }
                
            }
        }
        //Muestro la matriz
        for (int f = 0; f < 6; f++) {  //para cada fila
            for (int c = 0; c < 6; c++) { //para cada columna
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
