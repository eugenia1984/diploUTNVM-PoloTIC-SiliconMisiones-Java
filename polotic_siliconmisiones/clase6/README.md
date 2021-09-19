# Clase 6


:computer: **Links a los videos** y un poco de explicación

---

:computer: Video 1 -> [EXPLICACION MODELOS DE CAPAS](https://www.youtube.com/watch?v=C6J0TOlCieM)


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

:computer: Video 2 -> [EXPLICACION IGU - 1](https://www.youtube.com/watch?v=Fc4uFeMXBS8)

## Swing

**Java Swing** es una librería de Java que está compuesta por 3 partes:

 * **Contenedores gráficos** : los elementos de la interfaz gráfica que nos permite tener elementos dentro de ellas. Son las ventanas: minimizar, maximizar, la x. En java tenemos los **jFrame** y *jPanel**
 
 * **Componentes gráficos** : cada uno de los elementos que puedo poner dentro del contenedor, como los botones, lista desplegable, texto, radio button, imagenes.
 
 * **Eventos**: son situaciones o comportamientos que puede tener una interfaz gráfica dependeindo de una acción, por ejemplo el evento al hacer click en un botón, o al apretar una tecla en particular.

La usamos como interfaz gráfica en escritorio.

Volviendo al proyecto del video anterior:

En el paquete **igu** click derecho -> **New** -> **jFrame** -> lo nombro, en este caso lo nombro **Pantalla** -> click en **Finish**

Y se abre un apartado para editar la pantalla, del lado derecho se pueden ver los **Swing Containers** y los **Swing Controls** (los elementos que podemos agregar dentro del contenedor)

1ro: agrego un **panel** que me ocupe la mitad de la pantalla y luego agrego un segundo **panel** al lado. Porque cada uno de mis paneles van a ser los contenedores, y todos los elementos que estén dentro estén disribuidos en partes y no se mueva a la par de que se mueva todo. Me permite controlar el panel.

2do: para que sea mas sencillo, por el momento me quedo con un solo panel y voy a ir agregando elementos. Voy a elegir desde **Swing Controls**:

 * **label** -> para agregar *texto*, si le hago click derecho -> *edit text* y puedo modificar el texto. Así voy a tener 2 labels con los siguientes textos: **Copiadora** e **ingrese un texto**
 
 * **Text Field** -> campo de texto, por defecto viene con un texto predeterminado, si le hago click derecho -> *edit text* y le puedo borrar el texto.

3ro: agrego otro **label** y le modifico el texto por : *El texto qe usted ingreso es:*

4to: ingreso otro **Text Field**

Si le hago click al **ojito verde** voy a ver cómo me está quedando la interfaz gráfica.

5to: para ue se pueda copiar el texto debo ingresar -> **Button**. Click derecho -> Edit Text -> **Copiar**

Hasta acá tenemos toda la parte gráfica armada, ahora debemos con **LÓGICA** gregarle la funcionalidad.

Dejo la pestaña de **Design** y paso a al de **Source**

Voy al paquete **logica** a la clase main **PruebaCapas**

Y aca voy a lalmar a la pantalla al ejecutar el programa

```JAVA
import igu.Pantalla;

public class PruebaCapas {

    public static void main(String[] args) {
        //Instancio un objeto de clase Pantalla y guardo en al variable : panta
        //Importa la interfaz gráfica lógia (el paquete de igu)
        Pantalla panta = new Pantalla();
        //La tengo que hacer visible llamando la método setVisible
        //TRUE -> muestra pantalla
        //FALSE -> no la muestra
        panta.setVisible(true);
        //Tengo que determinar donde la ubico
        //llamo al método .setLocationRelativeTo()
        //null -> no va a estar relativa a nada, no toma nada como referencia, está en el medio
        panta.setLocationRelativeTo(null);
    }
    
}
```

Si vamos al proyecto entero vamos a ver que tanto **Pantalla.java** como **PruebaCapas.java** ambas tienen el play verde, Java toma a amba como ejecutables.

Pero al trabajar con **modelo de capas**, el que se encarga de ejecutar el programa es nuestro Main.

¿ Cómo saco el play verde a Pantalla para que solo mi PruebaCapas sea la encargada e ejecutar el programa ?

Voy  a mi clase **Patalla.java** y en vez de en **Design** voy a **Source** para ver el código.

Veo que dentro de mi clase Pantalla tengo un main:

```JAVA
  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
 ```
 
 **Debo BORRARLO todo**
 
 Asi ya al no tener main -> no tiene run
 
 Ahra si puedo ir a mi main **Prueba capas** y dar al -> **RUN**
 
 Se me va a levantar la pantalla, voy a poder ingresar texto y hacer click en el botón Copiar, pero todavía no hace nada porque no le agregué la funcionalidad, eso se ve en el proximo video.
 

---

:computer: Video 3 -> [EXPLICACION IGU - 2](https://www.youtube.com/watch?v=DAU0rDqcArs)

