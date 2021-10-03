package logica;

public class PlanillaAsistencia {
    //Atributos
    private Integer alumnosPresentes;
    private Integer alumnosAusentes;
    private Integer alumnosConMediaFalta;
    //constructor vacio

    public PlanillaAsistencia() {
    }
    //constructor con parametros
    public PlanillaAsistencia(Integer alumnosPresentes, Integer alumnosAusentes, Integer alumnosConMediaFalta) {
        this.alumnosPresentes = alumnosPresentes;
        this.alumnosAusentes = alumnosAusentes;
        this.alumnosConMediaFalta = alumnosConMediaFalta;
    }
    //Getters y Setters
    public Integer getAlumnosPresentes() {
        return alumnosPresentes;
    }

    public void setAlumnosPresentes(Integer alumnosPresentes) {
        this.alumnosPresentes = alumnosPresentes;
    }

    public Integer getAlumnosAusentes() {
        return alumnosAusentes;
    }

    public void setAlumnosAusentes(Integer alumnosAusentes) {
        this.alumnosAusentes = alumnosAusentes;
    }

    public Integer getAlumnosConMediaFalta() {
        return alumnosConMediaFalta;
    }

    public void setAlumnosConMediaFalta(Integer alumnosConMediaFalta) {
        this.alumnosConMediaFalta = alumnosConMediaFalta;
    }
    //toString

    @Override
    public String toString() {
        return "PlanillaAsistencia{" + "alumnosPresentes = " + alumnosPresentes 
                + ", alumnosAusentes = " + alumnosAusentes +
                ", alumnosConMediaFalta = " + alumnosConMediaFalta + '}';
    }
    
    //Metodo para calcular total de alumnos
    public Integer calcularTotalAlumnos (Integer alumnosPresentes, Integer alumnosAusentes, Integer alumnosConMediaFalta) {
        return alumnosPresentes + alumnosAusentes + alumnosConMediaFalta;
    }
    
}
