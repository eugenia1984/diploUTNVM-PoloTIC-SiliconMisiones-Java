# Clase 20

---

##  Asociaciones entre clases

En una clase voy a tener de *atributo* un **objeto de otra clase**, en mi ejemplo en Película tengo un atributo ```private Geneero genero```, ais voy a poder cargar un objeto género y asociarlo a la Película 

Entonces en la **clase Pelicula** tengo los geters y seter:

```JAVA
   public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
 ```
    
 Entonces en mi main:
 
 ```JAVA
 //Creo un nuevo terror
        Genero terror = new Genero();
        terror.setDescripcion("Es una pelicula de terror, por lo cual te vas a asustar");
        terror.setNombre("Terror");
        
        //asocio el genero terror a la pelicula
        titanic.setGenero(terror);
        //anido métodos, de la clase Pelicula accedo la OBJETO GENERO y tengo sus métodos
        System.out.println(titanic.getGenero().getDescripcion());
 ```
 
## Diagramas de clases

## Caso práctico.

El ejemplo de las películas en diagrama de clases:

```
---------------------  1..*                       -----------------------------                                  ------------------
|     <<entity>>    | <---------------------------|     <<entity>>            | -------------------------------> |    <<entity>>  |
|  PaisDeOrigen     |                             |       Pelicula            |                                  |     Genero     |
--------------------                              -----------------------------                                  ------------------
|  -idioma          |                             | -añoEstreno               |                                  | -descripcion   |
|  -nombre          |                             | -disponible               |                                  | -nombre        |
|-------------------|                             | -duracion                 |                                  |----------------|
                                                  | -fechaIngreso             |
                                                  | -nombre                   |                                   ------------------
                                                  | -tituloOriginal           |---------------------------------> |  <<entity>>    |
                                                  |---------------------------|                                   |  Calificacion  |
                                                  | -estaDisponible()         |                                   |----------------|
                                                  | -estaEnCartel()           |                                   | -descripcion   |  
                                                  | -mostrarFuncHabilitadas() |                                   | -nombre        |
                                                  |---------------------------|                                   |----------------|
```      




---

## Ejercicio para la próxima clase

Finalizar de asociar con las clases: **PaisDeOrigen** y **Calificacion**

:computer: lo van a poder fer en la carpeta [**miproyecto**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase20/miproyecto)

---
