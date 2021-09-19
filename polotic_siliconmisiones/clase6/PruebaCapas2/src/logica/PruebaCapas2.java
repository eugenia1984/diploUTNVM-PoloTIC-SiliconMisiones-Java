package logica;

import igu.Principal;

public class PruebaCapas2 {

    public static void main(String[] args) {
        //llamo a mi interfaz grafica instanciando un nuevo objeto de la clase 
        //Principal y la guardo en mi variable pantalla
        //-> creo la pantalla
        Principal pantalla = new Principal();
        //hago visible la pantalla
        pantalla.setVisible(true);
        //ubico la pantalla en el medio
        pantalla.setLocationRelativeTo(null);
    }
    
}
