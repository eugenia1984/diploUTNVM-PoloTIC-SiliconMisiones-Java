/*
 * Realizar un programa que compruebe si una cadena de texto contiene una 
 * subcadena. Las dos cadenas se introducen por teclado.
 * Pista: hacer uan clase separada que tenga dos atributos publicos que sean
 * la cadena 1 y 2 y que tena el método de acceso público que chequee si 
 * contiene o no la cadena
 * Buscando en la documentacion en Oracle veo el método: string1.contains(string2)
 */
package subcadena;

import java.util.Scanner;

public class Subcadena {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in).useDelimiter("\n");
        //instancio un nuevo objeto de clase Cadena
        Cadena cadena = new Cadena();
        //Pido la cadena y la subcadena y las setteo como los atributos
        //string1 y string2 de mi objeto cadena y la paso a Upper Case asi no
        //tengo inconveneinte con ls mayusculas y minusculas
        System.out.println("Ingrese la cadena de palabras :");
        cadena.setString1(sc.next().toUpperCase());
        System.out.println("Ingrese la subcadena que quiere ver si está "+
                " contenida en la cadena ingresada anteriormente : ");
        cadena.setString2(sc.next().toUpperCase());
        //Llamo a substring para ver que se setteo bien
        //System.out.println(cadena.toString());
        comparadorDeCadenas(cadena.getString1(), cadena.getString2());
    }
    
    public static void comparadorDeCadenas(String string1, String string2){
        if(string1.contains(string2)){
            System.out.println("' "+string1+ " ' si contiene a  ' "+ string2+" '");
        } else {
            System.out.println("' "+string1+ " ' no contiene a  ' "+ string2+" '");
        }
    }
    
}

 
