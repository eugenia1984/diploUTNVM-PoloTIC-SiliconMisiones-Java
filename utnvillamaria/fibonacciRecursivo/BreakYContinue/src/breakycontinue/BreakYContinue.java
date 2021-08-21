/*
Palabras reservadas BREAK y CONTINUE
 */
package breakycontinue;


public class BreakYContinue {

    public static void main(String[] args) {
        
        System.out.println("-- Ciclo for que imprime numeros del 0 al 9 --");
        //ciclo for con 10 iteraciones con i de 0 a 9
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i es : " + i);   
        }
        
        System.out.println("-- Ciclo for que imprime numeros pares entre 0 y 9 --");
        /* ciclo for con 10 iteraciones con i de 0 a 9 que imprime 
        * solo los numeros pares
        */
        for (int i = 0; i < 10; i++) {
            //si i es impar no imprime nada (continue) salta los impares
            if ( i % 2 != 0 ) {  
                continue;
            }
            System.out.println("Valor de i es : " + i); 
        }
        
        System.out.println("-- Ciclo for que imprime numeros impares entre 0 y 9 --");
        /* ciclo for con 10 iteraciones con i de 0 a 9 que imprime 
        * solo los numeros pares
        */
        for (int i = 0; i < 10; i++) {
            //si i es par no imprime nada (continue) salta los impares
            if ( i % 2 == 0 ) {  
                continue;
            }
            System.out.println("Valor de i es : " + i); 
        }
        
        System.out.println("-- Ciclo for de 10 iteraciones cortado con break --");
        /*Ciclo for con 10 iteraciones de ciclos
        * pero que se corta con BREAK
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la variable i : " + i); 
           
            if( i == 5) {
                break;
            }
             /* Tambien funcionaba con :
            * if( i > 5) {
            *    continue;
            * }
            * Pero en este caso el ciclo for va a hacer las iteraciones 
            * de i: 6 hasta i : 9
            * En cambio con el break corta cuando i:5 y hago menos ciclos
            * Mi algoritmo consume menos memoria es mejor el BREAK,
            * requiere menos procesamiento
            */  
        }
        
    }
    
}
