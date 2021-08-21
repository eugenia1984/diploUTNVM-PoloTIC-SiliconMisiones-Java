/*
* ARRAY
*/
package array;

public class Array {

    public static void main(String[] args) {
        //Declaro mi array y le doy dimension 10
        //Por defecto al inicializarlo todos sus elementos son 0
        int[] miArray = new int[10];
        //Para ver la longitud utilizo length
        System.out.println("La longitud de miArray es: " + miArray.length);       
        
        //Inicializo otro array y le asigno los valores
        int[] otroArray = {10, 15 , 20};
        //Accedo a uno de los elementos asi -> miArray[0]
        //Como es de DIMENSION 3 mi i va de 0 al 2
        System.out.println("El primer elemento de otroArray es : " + otroArray[0]);
        
        //Asigno valores de manera manual -> miArray[0] = 2;
        /*Tambien lo puedo asignar con un ciclo for
        *for (int i = 0; i < miArray.length; i++) {
        *     //Aca el bloque que va a ir asignando los valor -> miArray[i] = valor_a_asignar; 
        *}
        */
        
        //con un ciclo FOR también puedo mostrar los valores
        for (int i = 0; i < otroArray.length; i++) {
            System.out.println("El valor de otroArray en su índice : " + i +
                    " es : " + otroArray[i]);
        }

    }
    
}
