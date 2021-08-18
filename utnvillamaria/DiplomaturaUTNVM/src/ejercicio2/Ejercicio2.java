/*
Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y  
la  cantidad  de alumnosinscriptos  para  un  curso,  permita  determinar  
si alcanzan  los  bancos  existentes.
De  no  ser  así,  informar además  cuantos bancos sería necesario agregar. 
El usuario deberá ingresar por teclado tanto la cantidad  de  bancos  
que  tiene  el  aula,  como  la  cantidad  de  alumnos inscriptos para 
el curso.

BEGIN
Integer cantBancosAula
Integer cantAlumInscriptos
Integer bancosFaltantes
PRINT: “Ingrese la cantidad de bancos disponibles en el aula:”
INPUT: cantBancosAula;
PRINT: “Ingrese la cantidad de alumnos inscriptos al cursado:”
INPUT: cantAlumInscriptos;
    IF (cantBancosAula >= cantAlumInscriptos)
    THEN: PRINT: “Los bancos del aula son suficientes”.
    ELSE
    bancosFaltantes = cantAlumInscriptos -cantBancosAula
    PRINT: “La cantidad de bancos faltantes es:” + bancosFaltantes.
    END IF
END

 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //DEclaro las varaibles
        int cantBancosAula;
        int cantAlumInscriptos;
        int bancosFaltantes;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de bancos disponibles en el aula: ");
        cantBancosAula = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de alumnos inscriptos al cursado: ");
        cantAlumInscriptos = leer.nextInt();
        
        if ( cantBancosAula >= cantAlumInscriptos ) {
            System.out.println("Los bancos del aula son suficientes");
        } else {
            bancosFaltantes = cantAlumInscriptos -cantBancosAula;
            System.out.println("La cantidad de bancos faltantes es: " + 
                    + bancosFaltantes + ".");
            
        }
        
    }
    
}
