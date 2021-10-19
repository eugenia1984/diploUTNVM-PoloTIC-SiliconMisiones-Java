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

public class Bulbasaur extends Pokemon implements IPlanta {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Palizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Latigo Cepa");
    }
    
}
