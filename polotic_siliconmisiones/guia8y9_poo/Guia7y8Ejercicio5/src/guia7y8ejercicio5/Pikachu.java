/*
* A partir de estas interfaces, el Pokefanático desea crear las clases que 
 * manejen a los personajes principales del videojuego, los cuales son los pokemons 
 * starters de la primera temporada (Charmander, Bulbasaur y Squirtle) y Pikachu; 
 * para ello tener en cuenta que: Charmander es de tipo fuego, Bulbasaur es de 
 * tipo planta, Squirtle es de tipo agua y Pikachu de tipo eléctrico.
 * Una vez implementadas la clase abstracta e interfaces, sobrescribir los métodos 
 * correspondientes para adaptarlos a cada Pókemon mostrando un mensaje en pantalla 
 * que indique qué pókemon es y qué ataque está realizando, por ejemplo: 
 * “Soy Charmander y estoy atacando con Ascuas”
 */
package guia7y8ejercicio5;


public class Pikachu extends Pokemon implements IElectrico {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy un Pukachu y estoy atacando con Ascuas");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy un Pukachu y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy un Pukachu y estoy atacando con Mordiscos");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy un Pukachu y estoy atacando con Impact Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy un Pukachu y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy un Pukachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy un Pukachu y estoy atacando con RAyo Carga");
    }
    
}
