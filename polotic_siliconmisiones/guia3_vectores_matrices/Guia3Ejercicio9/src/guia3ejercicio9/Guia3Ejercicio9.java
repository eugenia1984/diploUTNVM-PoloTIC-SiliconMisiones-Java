/*
 * En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de 
 * secundario.
 * Cada fila corresponde a las notas y al promedio de cada alumno.
 *   i. Se necesita un programa que permita a un profesor cargar en las 3 
 * primeras posiciones de cada fila las notas del alumno y que en la última 
 * columna se calculen los promedios.
 *  ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada 
 * alumno y el promedio correspondiente recorriendo la matriz.
 * Ejemplo:
 *            NOTA 1  NOTA 2  NOTA 3   PROMEDIO
 * ALUMNO 1    8        8       7         ?
 * ALUMNO 2    7        9       10        ?
 * ALUMNO 3    10       9       5         ?
 * ALUMNO 4     4       9      8,50       ?
 */
package guia3ejercicio9;

import java.util.Scanner;

public class Guia3Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    //determino la matriz de 4 x 4 con las notas de los alumnos, es double por el promedio
        double notaAlumnos[][] = new double[4][4];
    
    //Recorro la matriz para ir pidiendo las notas de los alumnos la cuarta nota la calculo como promedio
        for (int i = 0; i < 4; i++) {
            System.out.println("------ Alumno "+ (i+1)+" -----");
            for (int j = 0; j < 4; j++) {
                if ( j == 0 || j == 1 || j == 2) {
                    System.out.println("Ingrese la "+(j+1)+" nota = ");
                    notaAlumnos[i][j] = sc.nextDouble();
                } 
                double sumaNotas = notaAlumnos[i][1] + notaAlumnos[i][0] + notaAlumnos[i][2];
                notaAlumnos[i][3]= sumaNotas / 3 ;
            }
        }
    //muestro la tabla con las notas
        for (int i = 0; i < 4; i++){
            System.out.println(" ---- Alumno : " + (i+1)+" -----");
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota : " + notaAlumnos[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
