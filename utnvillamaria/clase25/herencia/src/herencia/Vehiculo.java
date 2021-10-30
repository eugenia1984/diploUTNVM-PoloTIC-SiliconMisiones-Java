package herencia;

public class Vehiculo {
    //atributos si los tengo PRIVATE las clases hijas no van a poder acceder
    //por eso deben ser PROTECTED
    private String matricula;
    private Double potencia;
    private Double capacidadTanqueCombustible;
    private Integer modelo;
    private Double velocidadMaxima;
    private String numeroChasis;
    
    //con el modificaor de acceso PROTECTED también lo peude usar al calse hija
    protected void acelerar() {
        System.out.println("El vehiculo acelera");
    }
    
    //constructor sin parametros
    public Vehiculo() {
    }

    
    //getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getCapacidadTanqueCombustible() {
        return capacidadTanqueCombustible;
    }

    public void setCapacidadTanqueCombustible(Double capacidadTanqueCombustible) {
        this.capacidadTanqueCombustible = capacidadTanqueCombustible;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
    
}
