/*
 * Crear una clase abstracta llamada consola, la cual tenga los atributos:
 * codigo_consola, nombre, empresaDesarrollo y año de lanzamiento.
 * Al mismo tiempo, crear un método abstracto “cargarJuego” que indique un 
 * mensaje por pantalla que diga “Cargando juego. Por favor espere”.
 * Como esta es la clase abstracta el metodo abstracto no puede tener cuerpo, el 
 * mensaje lo van a tener las hijas que extiendan de ella
 */
package gui8y9ejercicio3;


public abstract class Consola {
    private String codigoConsola;
    private String nombre;
    private String EmpresaDesarrollo;
    private int anioLanzamiento;

    public Consola() {
    }

    public Consola(String codigoConsola, String nombre, String EmpresaDesarrollo, int anioLanzamiento) {
        this.codigoConsola = codigoConsola;
        this.nombre = nombre;
        this.EmpresaDesarrollo = EmpresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public String getCodigoConsola() {
        return codigoConsola;
    }

    public void setCodigoConsola(String codigoConsola) {
        this.codigoConsola = codigoConsola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return EmpresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String EmpresaDesarrollo) {
        this.EmpresaDesarrollo = EmpresaDesarrollo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    //clase abstracta que la definen las clases hijas
    public abstract String cargarJuego();

    @Override
    public String toString() {
        return "Consola : " + "codigoConsola = " + codigoConsola + ", nombre =" + 
                nombre + ", Empresa Desarrollo = " + EmpresaDesarrollo + 
                ", año de Lanzamiento = " + anioLanzamiento + '.';
    }
    
    
}
