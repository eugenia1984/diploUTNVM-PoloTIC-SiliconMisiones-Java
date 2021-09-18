package miproyecto;


public class Main {

    public static void main(String[] args) {
        // Instancio un nuevo objeto de la clase auto
        Car car = new Car();
        Car anotherCar = new Car();
        //En este momento los atributos tiene valor null, se los tengo que setear
        //int = 0
        //String = null
        //Integer no es primitivo y permite utilizar null en vez de 0, si no declaro valor incicial
        System.out.println("El valor por defecto del atributo color -> "+car.color);
        //con el . accedo al atributo
        System.out.println("El valor por defecto del atributo velocidad -> "+car.velocidadMaxima);
        //seteo las velocidades a ambos autos
        car.velocidadMaxima = 180;
        anotherCar.velocidadMaxima = 100;
        System.out.println("La velocidad máxima de car es de "+car.velocidadMaxima+
                " la velocidad máxima de anotherCar es de "+anotherCar.velocidadMaxima);
    //le doy un color a car
         car.color="verde";
    //Voy a usar el metodo mostrarColor, para mostrar el color del auto   
    //Ya el método tiene incluido el System.out.println, pr eso solo llamo al 
    // objeto.metodo y me v a imprimir
    System.out.println("objeto CAR -> ");
    car.mostrarColor();
    //NULL es un valor vacío, que no tiene valor, con esto podemos usar los condicinales
    //chequeamos si es NULL entonces lo tengo que setear a un valor
    //la clase INTEGER es mucho más amplia que INT, se la puede pasar a String
    //es mejor usar Integer a int
    
    //Ahora instancio objetos de mi clase BUs con ATRIBUTO PRIVADO
    Bus bus = new Bus(3000);
    //no voy a poder acceder con el . al atributo maximoDeKilosPorTotalPasajeros
    //desde otro clase no puedo acceder, solo lo puedo ver con get y modificar con set
    //Pero en este caso como tengo el constructor con parametros ya lo setee al instanciarlo
    //pasandoselo como atributo
    System.out.println("El máximo de kilos por pasajeros que puede tener el bus es de "+ 
        bus.getMaximoDeKilosPorTotalPasajeros());
    }
    
}
