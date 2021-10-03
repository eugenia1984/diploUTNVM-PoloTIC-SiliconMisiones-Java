/*
 * Crear una clase Mascota, que tenga los siguientes atributos: nombre, 
 * especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, 
 * constructores y métodos getters y setters).
 * -Crear un vector de tipo Mascota que pueda almacenar 5 mascotas. 
 * Crear 5 mascotas y guardarlas en el vector.
 * -Recorrer el vector creado y mostrar por pantalla el nombre, especie y 
 * sexo de las mascotas almacenadas.
 * -Cambiar el nombre de dos mascotas. Mostrar por pantalla los datos de las 
 * dos mascotas cuyos nombres fueron cambiados.
 * -Recorrer el vector y mostrar por pantalla únicamente a las mascotas que 
 * sean de la especie “perro”.
 */
package objetos;


public class Mascota {
    //Atributos
    private String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;
    //constructor vacio
    public Mascota() {
    }
    //Constructor con parametros
    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //toString

    @Override
    public String toString() {
        return "nombre = " + nombre + ", especie = " + especie +
                ", sexo = " + sexo + ", color = " + color + ", pelaje = " +
                pelaje + ", raza = " + raza + '}';
    }
    
    
}
