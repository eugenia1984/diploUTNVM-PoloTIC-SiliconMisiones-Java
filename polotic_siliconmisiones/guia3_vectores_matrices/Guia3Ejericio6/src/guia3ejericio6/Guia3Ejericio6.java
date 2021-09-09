/*
 * Llevar a cabo un programa que permite cargar completamente con números 
 * 5 una matriz de 4x5 (4 filas, 5 columnas).
*/
package guia3ejericio6;

import java.util.Scanner;

public class Guia3Ejericio6 {


    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        //Nombro mi matriz de 4 filas y 5 columnas
        int[][] matriz = new int[4][5];
        //Pido que ingresen los datos para cargar la matriz
        for (int f = 0; f < 4; f++) {  //para cada fila
            for (int c = 0; c < 5; c++) { //para cada columna
                System.out.println("Ingrese el número para la fila "+(f+1)+" columna "+(c+1)+": ");
                matriz[f][c] = leer.nextInt();
            }
        }
        //Muestro la matriz
        for (int f = 0; f < 4; f++) {  //para cada fila
            for (int c = 0; c < 5; c++) { //para cada columna
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
