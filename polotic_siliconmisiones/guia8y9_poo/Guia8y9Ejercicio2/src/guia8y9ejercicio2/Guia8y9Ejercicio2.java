package guia8y9ejercicio2;


public class Guia8y9Ejercicio2 {


    public static void main(String[] args) {
        //Crear en el Main un vector de tipo Vehículo y almacenar 3 autos, 
        //3 motos, 2 colectivos y 1 camión (crear un objeto para cada uno de ellos).
        Vehiculo vehiculos[] = new Vehiculo[9];
        Auto auto1 = new Auto("cuero", 1.7, "AA789BB", 123456, 2.7, "blanco" , "Fiat", "2018", 3);
        vehiculos[0] = auto1;
        Auto auto2 = new Auto("tela", 1.7, "CD781RT", 122334, 2.7, "azul" , "Renault", "2019", 5);
        vehiculos[1] = auto2;
        Auto auto3 = new Auto("cuero", 1.2, "AD790BB", 123444, 2.7, "rojo" , "Fiat", "2020", 4);
        vehiculos[2] = auto3;
        Moto moto1 = new Moto(1.5, "cuero","AA123CA", 123895, 1.2, "negro y rojo", "Leon", "2020", 1);
        vehiculos[3] = moto1;
        Moto moto2 = new Moto(1.2, "cuero","AA827CA", 123111, 1.2, "verde y rojo", "Leon", "2021", 1);
        vehiculos[4] = moto2;
        Moto moto3 = new Moto(1.5, "cuero","BA257CA", 125896, 1.2, "negro y rojo", "Leon", "2018", 1);
        vehiculos[5] = moto1;
        Colectivo colectivo1 = new Colectivo(true, true, "colectivo interurbano", "AD148AA", 245789, 3.2, "verde y blanco", "Scania", "2020", 36);
        vehiculos[6] = colectivo1;
        Colectivo colectivo2 = new Colectivo(true, true, "larga distancia", "AC148AA", 115789, 3.2, "verde y rojo", "Scania", "2021", 56);
        vehiculos[7] = colectivo2;
        Camion camion1 = new Camion(true, 20, "AA715AD", 157985, 5.2, "blanco", "Volswagen", "2019", 2);
        vehiculos[8] = camion1;
        
        // Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].mostrarDatos());
        }
    }
    
}
