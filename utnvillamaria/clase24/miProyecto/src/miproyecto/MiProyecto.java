package miproyecto;

public class MiProyecto {


    public static void main(String[] args) {
        //CREO UN OBJETO GENERO PARA TENER AL MENOS UN GENERO Y PODER SETTEARLO A MI PELICULA
        Genero gRomantica = new Genero();
        gRomantica.setDescripcion("Es una película de género romántica");
        gRomantica.setNombre("Romántica");
        //CREO UN OBJETO PAIS DE ORIGEN PARA PODER LUEGO SETTEARLE A MI PELICULA
        PaisDeOrigen estadosUnidos = new PaisDeOrigen();
        estadosUnidos.setNombre("Estados Unidos");
        estadosUnidos.setIdioma("Ingles");
        //CREO UN OBJETO CALIFICACION PARA LUEGO SETTEARLE A MI PELICULA
        Calificacion aptaTodoPublico = new Calificacion();
        aptaTodoPublico.setDescripcion("Pelicula apta para todo publico");
        aptaTodoPublico.setNombre("Apta Todo Publico");
    /* Instancio una pelicula utilizando el constructor con los parametros: nombre, anioEstreno, genero, pais de origen
       Al settear mi pais de origen estadosUnidos en el contructor, me ahorro que luego de instanciar mi pelicula haga:
       pelicula.setPaisDeOrigen(estadosUnidos);
       Lo mismo para el género, no tengo que hacer: pelicula.setGenero(gRomantica);
       Y lo mismo para la calificación, no tengo que hacer:  pelicula.setCalificacion(aptaTodoPublico);
     */
        Pelicula pelicula = new Pelicula("Titanic","1995", gRomantica, estadosUnidos, aptaTodoPublico);
        pelicula.setDisponible(true);
        pelicula.setDuracion(1.25);
        pelicula.setFechaIngreso("22/10/1995");
          
    }
    
}
