/*
 * Crear en el Main un objeto de cada clase hija. 
 * Llamar a los 3 métodos desde cada objeto.
 *Cambiar el modificador de acceso de los métodos de public a private. Intentar acceder desde el main a estos métodos.
 */
package guia8y9ejercicio2;


public class Guia8y9Ejercicio2 {

    public static void main(String[] args) {
        //Crear en el Main un objeto de cada clase hija. 
        Flor flor1 = new Flor("rosa", 10, "amarillo", "perfumada", "primavera", "Rosa", 1.20 , true, "primavera");
        System.out.println(flor1.toString());
        Arbusto arbusto1 = new Arbusto(0.50, true, "arbusto enano","verde", true,"arbustito", 0.60, true, "templado");
        System.out.println(arbusto1.toString());
        Arbol arbol1 = new Arbol();
        System.out.println(arbol1.toString());
        //Llamar a los 3 métodos desde cada objeto.
        flor1.saludo();
        arbusto1.saludo();
        arbol1.saludo();
        
    }
    
}
