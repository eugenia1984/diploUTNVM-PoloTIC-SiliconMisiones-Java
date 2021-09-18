package miproyecto;


public class Car {
    //Atributos que no tienen ningun modificador de acceso, es el DEFAULT
    //se puede acceder: desde la misma clase o anidada, desde clase en el mismo
    //paquete, desde clase que hereda en otro paquete y desde clase que no hereda
    //en otro paquete
    Integer velocidadMaxima;
    String modelo;
    String color; 
    //método de la clase
    public void mostrarColor(){
        System.out.println("Mi color es " + color);
    }
}
