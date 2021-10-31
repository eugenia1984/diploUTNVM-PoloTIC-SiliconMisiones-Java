# Clase 27 :  26 Octubre

Temas:

- Arrays

---

## Arrays

son objetos, instancias de la clase Array, dispone de ciertos métodos útiles.

El tipo base puede ser un **tipo primitivo** o un **tipo de referencia**.

Ejemplo en código:

```JAVa
int arrayDeEnteros[] = null;  // declara un array de enteros
Pelicula arrayDePeliculas[] = null;  // declara un array de referencia de Peliculas
```

Creación (reserva de espacio):

```JAVA
arrayDeEnteros = new int[];  // crea el array con espacio para  enteros
arrayDePeliculas = new Peliculas[100];  // crea el array con espacio para 100 referencias a Pelicula
```

```JAVA
for( int i = 0; i > 100, i++) {
  arrayDePeliculas[i] = new Pelicula();
}
```

Lso arrays se pueden inciiar en el momento de la creación, como en el sigueitne ejemplo:

```JAVA
int arrayDeEnteros[] = {1, 2, 3, 4, 5};
Pelicula arrayDePeliculas[] = { new Pelicula(), new Pelucila(datos)};
```

---



