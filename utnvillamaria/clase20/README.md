# Clase 20

---

##  Asociaciones entre clases

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

## Ejercicio para la próxima clase.
