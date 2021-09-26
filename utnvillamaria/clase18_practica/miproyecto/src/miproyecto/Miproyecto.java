package miproyecto;

public class Miproyecto {

    public static void main(String[] args) {
        //instancio nuevos objetos de mi clase Car
        Car myCar = new Car();
        Car anotherCar = new Car();
        
        //utilizo el setter para establecer la velocidad
        myCar.setVelocidadMaxKm(100);
        
        //setteo los colores
        myCar.setColor("azul");
        anotherCar.setColor("verde");
        
        System.out.println("---- myCar ----");
        System.out.println("La velocidad máxima de myCar es: "+
                myCar.getVelocidadMaxKm());
        System.out.println("Color :" +myCar.getColor());
        System.out.println("---- anotherCar ----");
        //utilizo el setter para establecer la velocidad pero como es major a 400
        //no la voy a settear, me queda null
        anotherCar.setVelocidadMaxKm(560);
        System.out.println("La velocidad máxima de anotherCar es: "+
                anotherCar.getVelocidadMaxKm());
        System.out.println("Color: "+anotherCar.getColor());
        //voy a utilir el metodo sobrecargado de setColor
        anotherCar.setColor("Azul", "Blanco");
        System.out.println("Color llamando el setColor sobrecargado: " +anotherCar.getColor());
    }
    
}
