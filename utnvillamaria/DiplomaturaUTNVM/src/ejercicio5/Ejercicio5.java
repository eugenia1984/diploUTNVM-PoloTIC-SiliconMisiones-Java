/*
Diseñar   un   algoritmo   que   muestre   por   pantalla   la   tabla   de 
multiplicación  del  número  que  ingrese  elusuario.  Para  definir  
hasta  que numero  desea  que  muestre  la  tabla  de  multiplicación  
el  usuariotambién deberáingresar este valor. La tabla de multiplicación 
a mostrar debe empezar en la multiplicación por 1.

BEGIN
integer tablaNum;
integer tablaHasta;
integer contador=1;
integer multiplicacion
PRINT: “Ingrese el número del cual desea conocer la tabla de multiplicación:”
INPUT: tablaNum;
PRINT: “Ingrese el numero hasta donde desea conocer la tabla:”
INPUT: tablaHasta;
    WHILE(contador <=tablaHasta)
        multiplicacion=tablaNum*contador;
        PRINT: tablaNum + “*” + contador + “=” + multiplicacion
        contador++
    END WHILE
END
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        //declaro mis variables
        int tablaNum;
        int tablaHasta;
        int contador=1;
        int multiplicacion;
        
        Scanner read = new Scanner(System.in);
        
        //pido los numeros y los guardo en variables
        System.out.println("Ingrese el número del cual desea conocer la tabla "
                + "de multiplicación: ");
        tablaNum = read.nextInt();
        System.out.println("Ingrese el numero hasta donde desea conocer la tabla: ");
        tablaHasta = read.nextInt();
        
        while ( contador <= tablaHasta ) {
            
            multiplicacion = tablaNum * contador;
            System.out.println(tablaNum + " * " + contador + " = " + multiplicacion);
             contador++;
        }
    }
    
}
