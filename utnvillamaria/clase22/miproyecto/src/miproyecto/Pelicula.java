package miproyecto;

public class Pelicula {
    //Atributos
    private String anioEstreno;
    private Boolean disponible;
    private Double duracion;
    private String fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    //Asocio a la clase Genero
    private Genero genero;
    //Asocio a la clase Calificacion
    private Calificacion calificacion;
    //Asocio a la clase PaisDeOrigen
    private PaisDeOrigen paisDeOrigen;
    //Getters y Setters
    public String getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(String anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
    //metodo para ver si está disponible, es muy parecido al getDisponible
    // por eso lo borro
    public Boolean estaDisponible(){
        return disponible;
    }
    //metodo para ver si está en cartel o no, comparando la fecha de ingreso
    public Boolean estaEnCartel() {
        //desarrollo la lógica para el método en base a la lógica del negocio
        //a mi me dicen que a la semana del ingreso esta en cartelera
        //crequear si la fecha de ingreso es una semana posterior a la fecha de hoy
        //para acortar aca seteo a TRUE sin hacer logica
        return true;
    }
    //toString

    @Override
    public String toString() {
        return "Pelicula{" + "anioEstreno = " + anioEstreno + ", disponible = " + 
                disponible + ", duracion = " + duracion + ", fechaIngreso = " + 
                fechaIngreso + ", nombre = " + nombre + ", tituloOriginal=" + 
                tituloOriginal + ", genero = " + genero + ", calificacion = " + 
                calificacion + ", paisDeOrigen = " + paisDeOrigen + '}';
    }
    
}
