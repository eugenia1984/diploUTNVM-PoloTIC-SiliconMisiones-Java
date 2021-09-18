# Clase 6


:computer: **Links a los videos** y un poco de explicación

---

[Video 1 -> EXPLICACION MODELOS DE CAPAS](https://www.youtube.com/watch?v=C6J0TOlCieM)


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

:computer:

Tengo mi mini proyecto en NetBeans al que llamo **pruebaCapas** se puede ver [**acá**]()

Voy a tener el **paquete pruebacapas** con mi clase main **pruebaCapas** -> LOGICA

Con **refactor** -> **rename** voy a cambiar el nombre del paquete a **logica** asi es más representativo

Haciendo click en **Source Package** -> **New** -> **Java Packege**

Y asi creo mi nuevo paquete **igu** y el paquete **persistencia**

Voy a tener mi proyecto así:

```
+PruebaCapas
    + Source Packages
         + igu
         + logica
              +PruebaLogica(Main)
         + persistencia   
    + Libraries    

```

¿ Cómo se comunican entre sí ? Es lo que nos falta ver en los próximos videos


---

[ Video 2 -> EXPLICACION IGU - 1](https://www.youtube.com/watch?v=Fc4uFeMXBS8)

## Swing

**Java Swing** es una librería de Java que está compuesta por 3 partes:

 * **Contenedores gráficos** : los elementos de la interfaz gráfica que nos permite tener elementos dentro de ellas. Son las ventanas: minimizar, maximizar, la x. En java tenemos los **jFrame** y *jPanel**
 
 * **Componentes gráficos** : cada uno de los elementos que puedo poner dentro del contenedor, como los botones, lista desplegable, texto, radio button, imagenes.
 
 * **Eventos**: son situaciones o comportamientos que puede tener una interfaz gráfica dependeindo de una acción, por ejemplo el evento al hacer click en un botón, o al apretar una tecla en particular.

La usamos como interfaz gráfica en escritorio.


---

[Video 3 -> EXPLICACION IGU - 2](https://www.youtube.com/watch?v=DAU0rDqcArs)

