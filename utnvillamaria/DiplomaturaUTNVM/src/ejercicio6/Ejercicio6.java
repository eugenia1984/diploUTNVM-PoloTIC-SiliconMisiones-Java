/*
Diseñar   un   algoritmo   que   muestre   por   pantalla   la   tabla   de 
multiplicación  del  número  que  ingrese  elusuario.  Para  definir  hasta 
que numero  desea  que  muestre  la  tabla  de  multiplicación  el  
usuario también deberáingresar este valor. La tabla de multiplicación 
a mostrar debe empezar en lamultiplicación por 1. Se le preguntara al 
usuario si desea imprimir otra tabla y se terminara cuando ingrese un “no”.

BEGIN
integer tablaNum;
integer tablaHasta;
integer contador=1;
integer multiplicacion;
Text salir
PRINT: “Ingrese el número del cual desea conocer la tabla de multiplicación:”
INPUT: tablaNum
PRINT: “Ingrese el numero hasta donde desea conocer la tabla:”
INPUT: tablaHasta
DO
    DO
        multiplicacion=tablaNum*contador
        PRINT: tablaNum + “*” + contador + “=” + multiplicacion
        contador++;
    WHILE(contador <=tablaHasta)
    END_DO
    PRINT “Desea imprimir otra tabla? Ingrese Si o No”
    INPUT: salir
WHILE(salir==”Si”)
END DO
END
 */
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        //declaro mis variables
        int tablaNum;
        int tablaHasta;
        int contador=1;
        int multiplicacion;
        String salir;
        
        Scanner read = new Scanner(System.in);
        
        //Con do while mientras no elija NO para dejar de imprimir
        do {            
            //Pido ingrese los datos y los guardo en variables
            System.out.println("Ingrese el número del cual desea conocer la tabla "
                + "de multiplicación:");
            tablaNum = read.nextInt();
            System.out.println("Ingrese el numero hasta donde desea conocer la tabla: ");
            tablaHasta = read.nextInt();
        
            do {            
                multiplicacion = tablaNum * contador;
                System.out.println(tablaNum + " * " + contador + " = " + multiplicacion);
                contador++;
            } while ( contador <= tablaHasta );

            System.out.println("Desea imprimir otra tabla? Ingrese Si o No : ");
            //uso el metodo .toUpperCase() para pasar a mayuscula asi no es case sensitive
            salir = read.next().toUpperCase();
            System.out.println(salir);
        
        } while (salir != "SI");
        
        
        
        
    }
    
}
