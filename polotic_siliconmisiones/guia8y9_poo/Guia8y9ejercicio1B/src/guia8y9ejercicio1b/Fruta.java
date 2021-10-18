/*
 * Crear una clase llamada Fruta, que tenga los siguientes atributos:
 * nombre, color, calorías, tipoCascara, esComestible
 * (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
 */
package guia8y9ejercicio1b;

public class Fruta {
    //Atributos
    private String nombre;
    private String color;
    private Double calorias;
    private String tipoCascara;
    private boolean comestible;
    //constructor vacio
    public Fruta() {
    }
    //constructor con parametros
    public Fruta(String nombre, String color, Double calorias, String tipoCascara, boolean comestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.comestible = comestible;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    @Override
    public String toString() {
        return "Fruta{" + "nombre = " + nombre + ", color = " + color + ", calorias = " + 
                calorias + ", tipoCascara = " + tipoCascara + ", es comestible = " + comestible + '}';
    }
    
    
}
