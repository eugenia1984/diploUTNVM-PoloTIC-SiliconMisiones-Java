# 📘 Clase 32 : 11 Noviembre

Temas:

- Manejo de excepciones try-catch-finally

- Manejo de fechas en Java

- Librerias en Java. import.

---

## Manejo de excepciones try-catch-finally

Una **excepción** es **un errorque ocurre en tiempo de ejecución**.

Utilizando el subsistema de manejo de excepciones de Java, se puede de una manera estructurada y controlada, manejar los errores de tiempo de ejecución.

En java, todas las excepciones están representadas por clases. Todas las clases de excepción se derivan de una clase lllamada **Throwable**. Por lo tanto se produce una excepción en un programa, se genera un objeto de algún tipo de clase de excepción.

[Nota aca](https://javadesdecero.es/intermedio/manejo-de-excepciones)

### Hay dos subclases directas de Throwable: Exception y Error

1- Las execpciones de tipo **Error** están relacionadas con errores que ocurren en la Máquina Virtual de java. Este tipo de excepciones escapan al control del programa en sí.

2- Los errores que resultan de la actividad del programa están representados por subclases de **Exception**. Por ejemplo, dividir por 0, límite de matriz (**IndexOutOfBoundException**), errores de archivo. En general el programa debe manejar las excepciones de estos tipos.


Ejemplo en código:

```JAVA
public class ExcDemo {
  public static void main(String[] args) {
    int nums[] = new int;
    try {
      ExcEjemplo.genExcepcion();
    } catch ( ArrayOutOfBoundsException exc) {
      //Capturando la excepcion
      System.out.println("Indice fuera de los limites);
    }
    System.out.println("Despues de que se genere la excepcion");
  }
}
```
Luego del **try** - **catch** se puede tener **finally**, de tener FINALLY siempre se va a ejecutar, tengamos tratamiento de excepcion o no. Se suele usar para cortar la conexión a una API.

Finally no es obligatorio.

En el bloque TRY va el código que peude generar una excepción.

En el bloque CATCH va el tratamiento de la excepción, podemos tener más de un catch, acorde a las excepciones que podemos tener.

Otro ejemplo, al hacer click en un boton quiero mostrar 10 clientes, manejando excepciones:

```JAVA
@Override
public void mouseClicked( MouseEvent e) {
  String customerListString = "";
  
  try {
      for (int i = 0; i < 10; i++) {
         customerListString = customerListString.concat(customerControler.getAllCustomers().get(i).toString());
         customerListString  = customerListString .concat("<br>");
      }
      lblCustomerList.setText("<html>"+ customerListstring + "</html>");
  } catch (IndexoutofBoundsException exc) {
         lblCustomerList.setText("Hay menos de 10 clientes en el sistema. Error!");
  } catch (Exception exc) {     
         lblCustomerList.setText("Excepcion general");
  } finally {
         System.out.println("Entro al finally");
  }
  
}
```

---

## Manejo de fechas en Java

A partir de java 8 se incluye la librería **localDate**, **localTime** y **LocalDateTime** para el manejo de fechas y horas.

- **LocalDate** nos permite manejar fechas sin tiempo. Representa una fecha en formato **ISO** (yyyy-MM-dd) **sin tiempo**.

creación de objetos LocalDate:


```JAVA
LocalDate date = Localdate.now();
System.out.println(date);  //voy a ver por pantalla al fecha de hoy 2021-11-13
```

```JAVA
LocalDate date2 = LocalDate.of(2018,10,30);
LocalDate3 = LocalDate.parse("2018-10-30");
```

Manipulación de fechas (Sumar o restar dias, meses, años, etc):

```JAVA
LocalDate date = Localdate.parse("2018-10-30");
LocalDate newDate = date.plusDays(10); //sumo 10 días a mi fecha date
LocalDate newDate = date.minusDays(10); //resto 10 días a mi fecha date
```

Los meses se toman del 0 al 11.

Tengo la excepcion **DateTimeParseException**, es decir que no se puede parsear, cuando tengo mal el paseo con: Localdate.parse(); , puede poner mla un dia que no tenga el me, por ejemplo.


- **LocalTime** tiempo sin fechas.

- **LocalDateTime** fechas con tiempo.

---

## Librerias en Java - import

Una **librería** en java se puede entender como un conjunto de clases, que poseen una serie de métodos y atributos que nos permiten reutilizar código para solucionar problemas de una manera más rápida.

Ejemplos: commons, math


Desde **Apache** busco la **librería commons math**, el archivo importante es el **.jar** que es el que debo agregar a mi librería, luego tengo más cosas como documentación, por ejemplo.

1- Agrego los archivos .jar en el proyecto. Desde la carpeta raiz del proyecto (donde tengola taza), click derecho,  build path, Add External Archives, aca agrego los .jar que descargue(en este caso son 6).

2- Lo importo en mi código, utilizo el * para importar toda la librería, si voy a utilizar muchas calses de la misma, sino aclaro la clase a utilizar.

```JAVA
import org.apache.commons.math3.analyst.function.*;

public class main {
  public static void main(String[] args) {
     Log10 lagmanager = new log10();
     System.out.println(logmanager.value(100));  //2.0
  }

}
```

---
