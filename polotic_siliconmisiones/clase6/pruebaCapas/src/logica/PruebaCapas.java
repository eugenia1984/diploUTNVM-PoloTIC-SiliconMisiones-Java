package logica;

import igu.Pantalla;

public class PruebaCapas {

    public static void main(String[] args) {
        //Instancio un objeto de clase Pantalla y guardo en al variable : panta
        //Importa la interfaz gráfica lógia (el paquete de igu)
        Pantalla panta = new Pantalla();
        //La tengo que hacer visible llamando la método setVisible
        //TRUE -> muestra pantalla
        //FALSE -> no la muestra
        panta.setVisible(true);
        //Tengo que determinar donde la ubico
        //llamo al método .setLocationRelativeTo()
        //null -> no va a estar relativa a nada, no toma nada como referencia, está en el medio
        panta.setLocationRelativeTo(null);
    }
    
}
