/*
 * Una vez desarrolladas cada una de las clases, se solicita desde la clase Main, 
 * crear una instancia de cada una de ellas y llamar a sus correspondientes métodos. 
 * Tener en cuenta que todas las consolas, al heredar de una clase abstracta, 
 * deben implementar el/los método/s de su clase madre utilizando sobreescritura de métodos.
 */
package gui8y9ejercicio3;


public class Gui8y9ejercicio3 {


    public static void main(String[] args) {
        Nintendo64 nintendo64 = new Nintendo64("ISO 900", false, "112233" , "Fifa", "Nintendo", 2020);
        System.out.println(nintendo64.toString());
        System.out.println(nintendo64.cargarJuego());
        System.out.println(nintendo64.leerCartucho(nintendo64.getNombre()));
        
        PlayStation2 playStation2 = new PlayStation2("ISO 900", true, 8, "224455", "La casa", "Casa", 2015);
        System.out.println(playStation2.toString());
        System.out.println(playStation2.cargarJuego());
        System.out.println(playStation2.grabarMemory(playStation2));
        
        XboxOne xboxOne = new XboxOne(true, true, true, "587788", "El restaurante", "Casa" , 2021);
        System.out.println(xboxOne.toString());
        System.out.println(xboxOne.cargarJuego());
        System.out.println(xboxOne.leerJuegoDigital(xboxOne));
    }
    
}
