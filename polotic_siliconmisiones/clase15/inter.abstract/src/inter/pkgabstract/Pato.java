
package inter.pkgabstract;


public class Pato extends Animal implements Volador, Acuatico{  
//extiende de animal va a implementar su metodo abstracto
//implementa las interfaces: Volador y Acuatico, debe implementar los métodos de las interfaces
    //debo tener el constructor con super lalma al constructor de la clase madre
    public Pato(String nombreAnimal, String especie) {
        super(nombreAnimal, especie);
    }

    @Override
    public void soyAnimal() {
        System.out.println("Soy un animal, soy un pato");
    } 

    @Override
    public void volar() {
        System.out.println("Soy un pato, y vuelo bajito");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un pato y puedo nadar por arriba del agua");
    }
}
