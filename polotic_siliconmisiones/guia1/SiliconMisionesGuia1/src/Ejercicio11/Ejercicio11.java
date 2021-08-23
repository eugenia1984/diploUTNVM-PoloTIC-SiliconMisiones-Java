/*
 * Probar realizar las operaciones que se citan a continuación en el IDE Netbeans, 
 * registrar los errores obtenidos y responder a las preguntas citadas.
 * a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo 
 * String.
 * b. Asignar un valor a la variable de tipo entero y asignar esta última a la
 * variable de tipo double. ¿Existe un error? ¿Se puede hacer esta operación?
 * c. Asignar un valor a la variable de tipo double y asignar esta última a la 
 * variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta operación?
 * d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se 
 * puede hacer esta operación?
 * e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo 
 * realizar la asignación?
 */
package Ejercicio11;


public class Ejercicio11 {
    public static void main(String[] args) {
    //a. Declarar una variable de tipo entero, otra de tipo double y otra de tipo String.
        int numeroEntero;
        double numeroDouble;
        String variableTipoString;
    //b. Asignar un valor a la variable de tipo entero y asignar esta última a la
    //variable de tipo double. ¿Existe un error? ¿Se puede hacer esta operación?
    numeroEntero = 2;
    numeroDouble = numeroEntero;
    System.out.println("Se puede asignar el valor de una variable de tipo entero"
            + "a una variable te tipo double, porque el entero es tambien double"
            + "con 0 de decimal");
    //c. Asignar un valor a la variable de tipo double y asignar esta última a la 
    //variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta operación?
    numeroDouble = 2.57;
    numeroEntero = (int) numeroDouble;
        System.out.println("No puedo asignar el valor de la variable de tipo double"
                + "a la variable de tipo entero porque estoy perdinedo precisión, "
                + "pierdo los decimales.");
        System.out.println("Lo que si puedo hacer es castear a int el valor de "
                + "tipo double");
    //d. Asignar el valor 35 a la variable de tipo String. ¿Existe un error? 
    //¿Se puede hacer esta operación?
    //variableTipoString = 35; -> da error de compatibilidad que no puede ser convertido a String
    System.out.println("No puedo asignar un valor de tipo int a una variable"
            + "de tipo String, tengo el erro de que no puede ser convertido"
            + "a String");
    //e. Si quiero almacenar el número 48 en la variable String. ¿Cómo debo 
    //realizar la asignación?
    variableTipoString = "48";
    System.out.println("Puedo asignar 48 a la variable de tipo String, pero"
            + "si lo paso como String, teniendo le numero entre comillas dobles");
    }
    
}
