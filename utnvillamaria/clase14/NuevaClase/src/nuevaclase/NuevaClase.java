package nuevaclase;

public class NuevaClase {

    public static void main(String[] args) {
        // Para crear unOBJETO de clase AUTO voy a tener como variable miAuto
        //para INSTANCIAR (crer) el objeto tengo NEW
        Car miAuto = new Car();
        //instancio un nuevo objeto -> otroAuto
        Car otroAuto = new Car();
        //Asigno un String a el objeto miAuto
        miAuto.color = "rojo";
       //Asigno la velocidad a el objeto miAuto
       miAuto.velocidadMaxima = 120;
        //Asigno el atributo color a el objeto otroAuto
        otroAuto.color = "azul";
        //Asigno la velocidad maxima a el objeto otroAuto
        otroAuto.velocidadMaxima = 100;
        System.out.println("miAuto es de color = "+miAuto.color+
                "\ny tiene de velocidad maxima = "+miAuto.velocidadMaxima+
                "\n**********");
        System.out.println("otroAuto es de color = "+otroAuto.color+
                 "\ny tiene de velocidad maxima = "+otroAuto.velocidadMaxima+
                "\n**********");
    }
    
}
