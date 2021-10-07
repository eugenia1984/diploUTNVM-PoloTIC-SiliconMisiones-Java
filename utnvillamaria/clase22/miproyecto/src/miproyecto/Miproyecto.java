package miproyecto;

import java.util.ArrayList;
import java.util.Scanner;


public class Miproyecto {


    public static void main(String[] args) {
         //ArrayList de peliculas
        ArrayList<Pelicula> peliculasDisponibles = new ArrayList<>();
        
        
        //Puedo ya crear un objeto Pelicula -> Titanic
        Pelicula titanic = new Pelicula();
        //seteo el nombre
        titanic.setNombre("Titanic");
        //seteo el año de estreno
        titanic.setAnioEstreno("1998");
        //seteo disponibildiad
        titanic.setDisponible(true);
        //seteo titulo original
        titanic.setTituloOriginal("Titanic");
        //seteo la duracion
        titanic.setDuracion(3.2);
        //seteo la fecha de ingreso
        titanic.setFechaIngreso("22/10/1998");
        
        //veo si se me grabo el nombre, el año de estreno y disponibilidad
        //System.out.println("Pelicula añadida : " + titanic.getNombre());
        //System.out.println("Año de estreno : "+titanic.getAnioEstreno());
        //System.out.println("Está disponible : " + titanic.estaDisponible());
        
        //Creo una segunda pelicula
        Pelicula pelicula2 = new Pelicula();
        //seteo el nombre
        pelicula2.setNombre("Shrek");
        //seteo el año de estreno
        pelicula2.setAnioEstreno("1995");
        //seteo disponibildiad
        pelicula2.setDisponible(true);
        //seteo titulo original
        pelicula2.setTituloOriginal("Shrek 2");
        //seteo la duracion
        pelicula2.setDuracion(3.2);
        //seteo la fecha de ingreso
        pelicula2.setFechaIngreso("22/10/1995");
        
        //Creo un nuevo genero -> terror
        Genero terror = new Genero();
        terror.setDescripcion("Es una pelicula de terror, por lo cual te vas a asustar");
        terror.setNombre("Terror");
        
        //Creo un nuevo genero -> comedia
        Genero comedia = new Genero();
        comedia.setDescripcion("Es una pelicula de comedia, te vas a reir");
        comedia.setNombre("Comedia");
        
       
        
        //asocio el genero terror a la pelicula
        titanic.setGenero(terror);
        //anido métodos, de la clase Pelicula accedo la OBJETO GENERO y tengo sus métodos
        System.out.println("el genero de Titanic : "+titanic.getGenero().getDescripcion());
        
        //asocio el genero de comedia a Shrek
        pelicula2.setGenero(comedia);
        System.out.println("El genero de Shrek : "+pelicula2.getGenero().getDescripcion());
        
        //creo las calificaciones
        
        //Creo el pais de origen
        PaisDeOrigen paisDeOrigen1 = new PaisDeOrigen();
        paisDeOrigen1.setIdioma("Ingles");
        paisDeOrigen1.setNombre("Estados Unidos");
        
        //Asocio el pais de origen con mis peliculas
        titanic.setPaisDeOrigen(paisDeOrigen1);
        System.out.println("El pais de origen de Titanic es: "+titanic.getPaisDeOrigen().getNombre());
        
        pelicula2.setPaisDeOrigen(paisDeOrigen1);
        System.out.println("El pais de origen de Shrek es: "+pelicula2.getPaisDeOrigen().getNombre());
        
        //Creo las calificaciones
        Calificacion calificacion1 = new Calificacion();
        calificacion1.setDescripcion("Una estrella");
        calificacion1.setNombre("Uno");
        
        Calificacion calificacion2 = new Calificacion();
        calificacion2.setDescripcion("Dos estrellas");
        calificacion2.setNombre("Dos");
        
        Calificacion calificacion3 = new Calificacion();
        calificacion3.setDescripcion("Tres estrella");
        calificacion3.setNombre("Tres");
        
        Calificacion calificacion4 = new Calificacion();
        calificacion4.setDescripcion("Cuatro estrella");
        calificacion4.setNombre("Cuatro");
        
        Calificacion calificacion5 = new Calificacion();
        calificacion5.setDescripcion("Cinco estrella");
        calificacion5.setNombre("Cinco");
        
        //agrego la calificacion a la pelicula
        titanic.setCalificacion(calificacion5);
        System.out.println("La calificacion de Titanic es de : "+titanic.getCalificacion().getDescripcion());
        pelicula2.setCalificacion(calificacion5);
        System.out.println("La calificacion de Shrek es de : "+pelicula2.getCalificacion().getDescripcion());
        
        //agrego las peliculas disponibles al Arraylist de Pelicula
        peliculasDisponibles.add(titanic);
        peliculasDisponibles.add(pelicula2);
        
        
        
        //EN ESTE PUNTO DE MI PROGRAMA TENGO CARGADAS 2 PELICULAS
        System.out.println(" ********************************** ");
        System.out.println("Desea ver todas las peliculas disponibles?\nIngrese 1"
        +" si las desea ver, ingrese 2 se desea salir");
        Scanner sc = new Scanner(System.in);
        int seleccionUsuario = sc.nextInt();
        System.out.println(seleccionUsuario);
        
        //SI EL USUARIO LAS QUIERE VER, TENGO QUE USAR ARRAY, PARA ITERAR SOBRE
        //ELLAS Y MOSTRARLAS POR PANTALLA 
        if (seleccionUsuario == 1) {
            //Mostrar las peliculas
            // peliculasDisponibles.size() -> me da la longitud de mi ArrayList
            for (int i = 0; i < peliculasDisponibles.size(); i++) {
                //accedo a los objetos mediante su índice con .get(i)
                System.out.println( peliculasDisponibles.get(i));
                //Si solo quiero mostrar el nombre
                // System.out.println( peliculasDisponibles.get(i).getNombre());
            }   
        } else {
            System.out.println("Hasta la proxima, lo esperamos pronto en el cine");
        }
        System.out.println(" ********************************* ");
        System.out.println("Ingrese el numero de pelicula para ver su país de origen");
        
        int nroDePelicula = sc.nextInt();
        
        System.out.println( peliculasDisponibles.get(nroDePelicula -1).getNombre()+ " " +peliculasDisponibles.get(nroDePelicula -1).getPaisDeOrigen().getNombre());
        /* peliculasDisponibles -> Muchas peliculas en un arreglo
         * .get(nroDepeliculas-1) -> Pelicula en el indice nrodepelicula -1
         * .getPaisDeOrigen() -> Pais de Origen de la Pelicula 
         * .getNombre() -> Nombre de el pais de origen Argentina, que a su vez el pais de origen de la pelicula 
        */
        System.out.println(" ********************************* ");
        System.out.println("Ingrese el numero de pelicula para ver su calificación");
        
        nroDePelicula = sc.nextInt();
        
        System.out.println( peliculasDisponibles.get(nroDePelicula -1).getNombre()+ " " +peliculasDisponibles.get(nroDePelicula -1).getCalificacion().getNombre());
    }
    
}
