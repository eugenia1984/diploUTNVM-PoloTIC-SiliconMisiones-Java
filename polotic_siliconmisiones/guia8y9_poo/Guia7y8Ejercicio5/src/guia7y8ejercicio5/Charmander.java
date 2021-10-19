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

public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmender y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmender y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmender y estoy atacando con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmender y estoy atacando con Puño de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmender y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmender y estoy atacando con Lanza Llamas");
    }
    
}
