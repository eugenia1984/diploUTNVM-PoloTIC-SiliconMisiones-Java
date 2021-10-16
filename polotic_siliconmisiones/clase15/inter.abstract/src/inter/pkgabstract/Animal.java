
package inter.pkgabstract;


public abstract class Animal { //es mi clase abstracta
    private String nombreAnimal;
    private String especie;

    //constructor
    public Animal(String nombreAnimal, String especie) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
    }
    
    
    //Metodo abstracto
    public abstract void soyAnimal();
    
}
