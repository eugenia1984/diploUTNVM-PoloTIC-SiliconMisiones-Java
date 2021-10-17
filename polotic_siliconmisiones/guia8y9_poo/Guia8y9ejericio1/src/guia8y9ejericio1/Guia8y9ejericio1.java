/*
 * 1) Repaso objetos
 * -Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. 
 * Crear 5 videojuegos y guardarlos en el vector.
 * -Recorrer el vector creado y mostrar por pantalla el titulo, consola y 
 * cantidad de jugadores de los videojuegos almacenados.

 * -Cambiar el nombre y la cantidad de jugadores de dos videojuegos. 
 * -Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
 * -Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que 
 * sean de la consola “Nintendo 64”.
 */
package guia8y9ejericio1;

import java.util.Scanner;

public class Guia8y9ejericio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        //Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. 
        VideoJuego videoJuegos[] = new VideoJuego[5];
        
        //Crear 5 videojuegos y guardarlos en el vector.
        //lo voy a hacer con un for que vaya pidiendo los datos, los setee y agregue el viedo juego
        System.out.println("--- CARGAR 5 VIDEO JUEGOS : ");
        for (int i = 0; i < 5; i++) {
            //instancio un objeto video juego
            VideoJuego videojuego = new VideoJuego();
            //voy pidiendo los datos de sus atributos y los setteo
            System.out.println("Ingresa el CODIGO del video juego "+(i+1)+" (en números): ");
            videojuego.setCantidadJugadores(sc.nextInt());
            System.out.println("Ingresa el TITULO del video juego "+(i+1)+" : ");
            videojuego.setTitulo(sc.next());
            System.out.println("Ingresa la CONSOLA del video juego "+(i+1)+" : ");      
            videojuego.setConsola(sc.next());
            System.out.println("Ingresa la CANTIDAD DE JUGADORES del video juego "+(i+1)+" (en números): ");
            videojuego.setCantidadJugadores(sc.nextInt());
            System.out.println("Ingresa la CATEGORIA del video juego "+(i+1)+" : ");
            videojuego.setCategoria(sc.next());
            //Lo agrego a mi array 
            videoJuegos[i] = videojuego;
        }
        //Recorrer el vector creado y mostrar por pantalla el titulo, consola y 
        //cantidad de jugadores de los videojuegos almacenados.
        System.out.println("--- LOS VIDEO JUEGOS INGRESADOS SON : ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Video Juego"+(i+1)+" titulo : "+ videoJuegos[i].getTitulo());
            System.out.println("Video Juego"+(i+1)+" consola : "+ videoJuegos[i].getConsola());
            System.out.println("Video Juego"+(i+1)+" cantidad de jugadores : "+ videoJuegos[i].getCantidadJugadores());
            System.out.println(" ");
        }
        
        //Cambiar el nombre y la cantidad de jugadores de dos videojuegos. 
        System.out.println("Vamos a modificar el nombre y la cantidad de jugadores de dos video juegos!");
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el nuevo nombre del video juego Nro. "+ (i+1));
            videoJuegos[i].setTitulo(sc.next());
            System.out.println("Ingresa la nueva cantidad de jugadores del video juego Nro. "+ (i+1));
            videoJuegos[i].setCantidadJugadores(sc.nextInt());
            
        }
        //Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
        System.out.println("-- Los nuevos datos de los viedo juegos son ---");
        for (int i = 0; i < 5; i++) {
            videoJuegos[0].toString();
            System.out.println(" ");
        }
        //Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”.
        System.out.println("-- Mostramos los video juegos que tengan consola Nintendo 64 --"+
                "\nDe no tener no mostraremos nada");
        for (int i = 0; i < 5; i++) {
            if(videoJuegos[i].getConsola().equals("Nintendo 64")) {
                videoJuegos[i].toString();
            }
        }
    }
    
}
