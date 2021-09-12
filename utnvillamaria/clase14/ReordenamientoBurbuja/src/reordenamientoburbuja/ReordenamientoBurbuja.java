package reordenamientoburbuja;

import java.util.Arrays;

public class ReordenamientoBurbuja {

    public static void main(String[] args) {
        int[] miArray = {10, 54, 3, 14, 22, 78, 44};
        
        //Primer bucle que va desde 0 hasta la longitud del array -1
        for (int i = 0; i < miArray.length -1; i++) {
            //segundo bucle que va desde 0 hasat la longitud del array -1
            //(se usara pra obtener el adyacente)
            for (int j = 0; j < miArray.length -1; j++) {
                //Si el numero almacenado en la posicion j es mayor que el de 
                //la posicion j+1 (el sigueinte del array)
                if (miArray[j] > miArray[j+1]) {
                    //Gurdamos el numero de la posicion j+1 en una variale (el menor)
                    int temp = miArray[j+1];
                    //lo interambiamos de posicion
                    miArray[j+1] = miArray[j];
                    miArray[j] = temp;
                    //Vuelve al inicio para iniciar nuevamente la comparacion
                    
                }
            }
        }
        System.out.println(Arrays.toString(miArray));
    }
    
}
