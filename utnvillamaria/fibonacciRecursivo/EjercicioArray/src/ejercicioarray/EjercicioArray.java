/*
 * Crear un ciclo for que calcule el promedio de un array de elementos enteros.
 * Los numeros del array ya los predefino yo al igual que la longitud
 */
package ejercicioarray;

public class EjercicioArray {


    public static void main(String[] args) {
        //Declaro el array, le doy dimension (8) y asigno valores
        double [] myArray = {1.0, 5.0, 8.0, 9.0, 15.0, 4.0, 6.0, 9.0};
        //Con un for voy a ir recorriendo los elementos de mi array 
        //y acumulando los valores de sus elementos en la varaible SUMA
        //Y declaro la variable Promedio para que sea de tipo doubl por si el 
        //promedio es un numero decimal
        double suma = 0.0;
        double promedio = 0.0;
        
        for (int i = 0; i < myArray.length; i++) {
            suma += myArray[i];
        }
        //Calculo el promedio
        System.out.println(suma);
        System.out.println(promedio);
        promedio = suma / 8;
        System.out.println("El promedio de la suma ( " + suma +" de los "
                + "elementos de miArray es: " + promedio);
    }
    
}
