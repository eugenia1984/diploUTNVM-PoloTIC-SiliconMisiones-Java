/*
 * Un fanático de Pókemon desea implementar para el modelado de un videojuego 
 * los diferentes ataques de cada una de estas criaturas. 
 * Para ello, cuenta con una clase abstracta llamada Pokemon, la cual posee 
 * los atributos: num_pokedex, nombrePokemon, pesoPokemon, sexo, 
 * temporadaQueAparece y tipo, e implementa métodos para los ataques comunes 
 * que suele tener la mayoría, entre ellos se encuentran: atacarPlacaje(), 
 * atacarArañazo() y atacarMordisco().
 * Una vez implementadas la clase abstracta e interfaces, sobrescribir los métodos 
 * correspondientes para adaptarlos a cada Pókemon mostrando un mensaje en pantalla 
 * que indique qué pókemon es y qué ataque está realizando, por ejemplo: 
 * “Soy Charmander y estoy atacando con Ascuas”
 */
package guia7y8ejercicio5;

public abstract class Pokemon {
    protected int numPoxedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected String temporadaQueAparece;
    protected String tipo;
    
    protected abstract  void atacarPlacaje();
    
    protected abstract  void atacarAraniazo();
    
    protected abstract  void atacarMordisco();
    
}
