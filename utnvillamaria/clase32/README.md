# 馃摌 Clase 32 : 11 Noviembre

Temas:

- Manejo de excepciones try-catch-finally

- Manejo de fechas en Java

- Librerias en Java. import.

---

## Manejo de excepciones try-catch-finally

Una **excepci贸n** es **un errorque ocurre en tiempo de ejecuci贸n**.

Utilizando el subsistema de manejo de excepciones de Java, se puede de una manera estructurada y controlada, manejar los errores de tiempo de ejecuci贸n.

En java, todas las excepciones est谩n representadas por clases. Todas las clases de excepci贸n se derivan de una clase lllamada **Throwable**. Por lo tanto se produce una excepci贸n en un programa, se genera un objeto de alg煤n tipo de clase de excepci贸n.

[Nota aca](https://javadesdecero.es/intermedio/manejo-de-excepciones)

### Hay dos subclases directas de Throwable: Exception y Error

1- Las execpciones de tipo **Error** est谩n relacionadas con errores que ocurren en la M谩quina Virtual de java. Este tipo de excepciones escapan al control del programa en s铆.

2- Los errores que resultan de la actividad del programa est谩n representados por subclases de **Exception**. Por ejemplo, dividir por 0, l铆mite de matriz (**IndexOutOfBoundException**), errores de archivo. En general el programa debe manejar las excepciones de estos tipos.


Ejemplo en c贸digo:

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
Luego del **try** - **catch** se puede tener **finally**, de tener FINALLY siempre se va a ejecutar, tengamos tratamiento de excepcion o no. Se suele usar para cortar la conexi贸n a una API.

Finally no es obligatorio.

En el bloque TRY va el c贸digo que peude generar una excepci贸n.

En el bloque CATCH va el tratamiento de la excepci贸n, podemos tener m谩s de un catch, acorde a las excepciones que podemos tener.

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

A partir de java 8 se incluye la librer铆a **localDate**, **localTime** y **LocalDateTime** para el manejo de fechas y horas.

- **LocalDate** nos permite manejar fechas sin tiempo. Representa una fecha en formato **ISO** (yyyy-MM-dd) **sin tiempo**.

creaci贸n de objetos LocalDate:


```JAVA
LocalDate date = Localdate.now();
System.out.println(date);  //voy a ver por pantalla al fecha de hoy 2021-11-13
```

```JAVA
LocalDate date2 = LocalDate.of(2018,10,30);
LocalDate3 = LocalDate.parse("2018-10-30");
```

Manipulaci贸n de fechas (Sumar o restar dias, meses, a帽os, etc):

```JAVA
LocalDate date = Localdate.parse("2018-10-30");
LocalDate newDate = date.plusDays(10); //sumo 10 d铆as a mi fecha date
LocalDate newDate = date.minusDays(10); //resto 10 d铆as a mi fecha date
```

Los meses se toman del 0 al 11.

Tengo la excepcion **DateTimeParseException**, es decir que no se puede parsear, cuando tengo mal el paseo con: Localdate.parse(); , puede poner mla un dia que no tenga el me, por ejemplo.


- **LocalTime** tiempo sin fechas.

- **LocalDateTime** fechas con tiempo.

---

## Librerias en Java - import

Una **librer铆a** en java se puede entender como un conjunto de clases, que poseen una serie de m茅todos y atributos que nos permiten reutilizar c贸digo para solucionar problemas de una manera m谩s r谩pida.

Ejemplos: commons, math


Desde **Apache** busco la **librer铆a commons math**, el archivo importante es el **.jar** que es el que debo agregar a mi librer铆a, luego tengo m谩s cosas como documentaci贸n, por ejemplo.

1- Agrego los archivos .jar en el proyecto. Desde la carpeta raiz del proyecto (donde tengola taza), click derecho,  build path, Add External Archives, aca agrego los .jar que descargue(en este caso son 6).

2- Lo importo en mi c贸digo, utilizo el * para importar toda la librer铆a, si voy a utilizar muchas calses de la misma, sino aclaro la clase a utilizar.

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
