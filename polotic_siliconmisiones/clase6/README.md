# Clase 6


:computer: **Links a los videos**

[EXPLICACION IGU - 1](https://www.youtube.com/watch?v=Fc4uFeMXBS8)

[EXPLICACION IGU - 2](https://www.youtube.com/watch?v=DAU0rDqcArs)

[EXPLICACION MODELOS DE CAPAS](https://www.youtube.com/watch?v=C6J0TOlCieM)

## Modelos de capas

Una de todas las formas en que se implementan **capas** en Java

### Capa de interfaz fráfica de usuario (IGU / GUI GRAPHIC USER INTERFACE)

Se ve todo lo que tiene que ver con lo gráfico, las pantallas, los botones, todo lo que usuario ve y con todo lo que el usuario interactçua.

Es la parte del Front End, la presentación hacia el usuario


### Capa lógica

Todos los métodos, clases, etc; es la lógica.

Es la que va a controlar todo, se encanrga de:
  * iniciar la PERSISTENCIA
  * se encarga de que la IGU se muestre

Es la parte más relacionada al Back End

### Capa de persistencia

Nos permite conectar la lógica con una base de Datos para guardar la información.

```
 ------------------
       IGU
 ------------------  
   |          ^
   v          |
 ------------------
       LOGICA
 ------------------  
   |          ^
   v          |
  ------------------ 
    PERSISTENCIA
  ------------------ 
```

---
