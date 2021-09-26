package subcadena;

public class Cadena {
    //va a tener los dos atributos cadenas para poder comparar 
    private String string1;
    private String string2;
    
    //constructor vacío
    public Cadena() {
    }
    //Constructor con parámetros
    public Cadena(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }
    //Getters y setters 
    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }
    //toString
    @Override
    public String toString() {
        return "Cadena{" + "string1 = " + string1 + ", string2 = " + string2 + '}';
    }
       
}
