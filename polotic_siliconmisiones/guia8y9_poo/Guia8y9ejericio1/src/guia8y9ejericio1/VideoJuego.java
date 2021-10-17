/*
 * Crear una clase llamada VideoJuego, que tenga los siguientes atributos: 
codigo, titulo, consola, cantidadJugadores, categoría (tener en cuenta todos 
sus atributos, constructores, métodos getters y setters).
 */
package guia8y9ejericio1;

import guia8y9ejericio1.Utils.Categorias;

public class VideoJuego {
    //Atributos
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;

    //constructor vacio
    public VideoJuego() {
    }

    //constructor con parametros
    public VideoJuego(int codigo, String titulo, String consola, int cantidadJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
    }

    
    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo = " + codigo + ", titulo = " + titulo +
                ", consola = " + consola + ", cantidadJugadores = " + 
                cantidadJugadores + ", categoria = " + categoria + '}';
    }
    
}
