/**
 * 
 */
package guia8y9ejercicio4;


public class Guia8y9Ejercicio4 {

    public static void main(String[] args) {
        // Una vez creada las clases, crear en el Main un vector de tipo Vehículo
        Vehiculo vehiculos[] = new Vehiculo[9];
        // y almacenar 3 autos, 3 motos, 2 colectivos y 1 camión 
        //(crear un objeto para cada uno de ellos).
        Auto auto1 = new Auto("cuero", 2.8, "AA123BB", 111222, "naftero" , "blanco", "Fiat", 2019, 4);
        vehiculos[0] = auto1;
        Auto auto2  = new Auto("tela", 2.0, "AB789CS", 111158, "gasolero" , "gris", "Renault" , 2020, 4);
        vehiculos[1] = auto2;
        Auto auto3 = new Auto("cuero", 2.8, "AD458AD", 111278, "naftero" , "negro" ,"Ford" , 2018 , 4);
        vehiculos[2] = auto3;
        Moto moto1 = new Moto(1.2, "cuerina" , "AR458AS", 123477, "naftero", "gris y negro" , "Lion" , 2019, 2);
        vehiculos[3] = moto1;
        Moto moto2 = new Moto(1.0 ,"plastico", "AQ774AE", 147850, "naftero", "rojo y azul", "Harley DAvidson", 2020, 2);
        vehiculos[4] = moto2;
        Moto moto3 = new Moto(1.2 , "cuerina" , "BB758AD", 145789, "naftero" , "gris", "Honda", 2018, 2);
        vehiculos[5] = moto3;
        Colectivo colectivo1 = new Colectivo( true, true, "inter urbano" , "AA759BT", 112233, "gasolero", "verde y blanco", "Scania", 2018, 56);
        vehiculos[6] = colectivo1;
        Colectivo colectivo2 = new Colectivo(false, true, "larga distancia" , "AD728DE" , 257896, "gasolero" , "rojo y amarillo" , "Mercedes Benz" , 2019, 80);
        vehiculos[7] = colectivo2;
        Camion camion1 = new Camion(false , 20 , "AR875AD" , 147853, "gasolero" , "blanco" , "Scania" , 2020, 2);
        vehiculos[8] = camion1;
        //Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo. 
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].toString());
            System.out.println(vehiculos[i].saludo());
        }
                
    }
    
}
