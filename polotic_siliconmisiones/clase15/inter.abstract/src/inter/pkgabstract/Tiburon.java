
package inter.pkgabstract;


public class Tiburon extends Animal implements Acuatico{
//extiende de animal va a implementar su metodo abstracto
//implementa la interfaz Acuatico, debe implementar los métodos de las interfaces
//debo tener el constructor con super lalma al constructor de la clase madre
    public Tiburon(String nombreAnimal, String especie) {
        super(nombreAnimal, especie);
    }

    @Override
    public void soyAnimal() {
        System.out.println("Soy un animal, soy un tiburon");
    }   

    @Override
    public void nadar() {
        System.out.println("Soy un tiburon y nado por abajo del agua");
    }
}
