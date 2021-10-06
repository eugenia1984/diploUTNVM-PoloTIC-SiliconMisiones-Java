package logica;

public class Herencia {


    public static void main(String[] args) {
        //instancio un nuevo objeto Empleado
        Empleado empleado1 = new Empleado(1587, "Desarrollador", 90000, 15,
                "12345678", "Hola", "Chau", "Hawai 123", "+5491112345678");
        //Si lo muestro por pantalla con toString voy a ver solo los atributos
        //propios de Empleado, no me muestra los que hereda de Persona
        System.out.println(empleado1.toString());
        //si quiero ver el nombre que es atributo de la superclase
        System.out.println("Nombre: "+empleado1.getNombre());
        
        //instancio cuatro objetos
        Auto auto = new Auto();
        Bus bus = new Bus();
        Moto moto = new Moto();
        Vehiculo vehiculo = new Vehiculo();
        
        //creo un vector de tipo Vehiculo
        Vehiculo vector[] = new Vehiculo[5];
        //aplico POLIMORFISMO, porque lo declaro del tipo de la CLASE SUPER
        //entonces le puedo asignar objetos de las CLASES HIJAS tambien
        vector[0] = auto;
        vector[1] = bus;
        vector[2]= moto;
        vector[3]= vehiculo;
        //a vehiculo le peudo asignar la moto, porque a la SuperClase le asigno 
        //la CLASE HIJA, sigo aplicando polimorfismo
        vehiculo = moto;
    }
    
}
