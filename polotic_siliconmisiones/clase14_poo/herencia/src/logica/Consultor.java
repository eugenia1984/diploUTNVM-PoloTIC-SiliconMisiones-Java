package logica;

public class Consultor extends Persona { // extiende / hereda de Persona
    //atributos propios de Consultor
    private int idConsultor;
    private String empresaConsultora;

    //constructor vacio
    public Consultor() {
    }
    //constructor con parametros
    public Consultor(int idConsultor, String empresaConsultora) {
        this.idConsultor = idConsultor;
        this.empresaConsultora = empresaConsultora;
    }

    public Consultor(int idConsultor, String empresaConsultora, int id_persona, String dni, String nombre, String apellido, String domicilio, String numTel) {
        super(id_persona, dni, nombre, apellido, domicilio, numTel);
        this.idConsultor = idConsultor;
        this.empresaConsultora = empresaConsultora;
    }

    //getters y setters
    public int getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(int idConsultor) {
        this.idConsultor = idConsultor;
    }

    public String getEmpresaConsultora() {
        return empresaConsultora;
    }

    public void setEmpresaConsultora(String empresaConsultora) {
        this.empresaConsultora = empresaConsultora;
    }
    
    
}
