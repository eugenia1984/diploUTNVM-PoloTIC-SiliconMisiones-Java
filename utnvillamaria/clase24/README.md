# Clase 24 : 14 Octubre

---

Temas a ver:

-**Constructores**

-Palabra reservada **static**

-Palabra reservada **final**

-Método **toString()**

---

## Constructor

-Es un método especial de una clase que se llama automáticamente siempre que se declara un objeto de esa clase.

-Su función es inicializr el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos.

-Si para una clase no se define ningún método constructor se crea uno automáticamente por defecto.

-El **constructor por defecto** es un **consructor sin parámetros** que no hace nda. los atributos del objeto son inicializaados con los valores predeteminados por el sistma (null, 0).

-Tiene el mismo nombre que la clase a la que pertenece

-En una clase puede haber varios constructores con el mismo nombre y distinto número de argumentos (sobrecarga)

-No se hereda

-No puede devolver ningún valor (incluyendo void)

-Debe declararse público (salvo casos excepcionales) para que pueda ser invocado desde cualquier partte donde se crea un objeto de su clase

---

## Palabra reservada static

Se puede utilizar tanto en **variables** como en **métodos**. 

Una variable estática (**static**) en Java es una variable que pertenece a la clase en que fue declarada y **se iniciliza solo una vez al inicio de la ejecución del programa**, la característica principal de este tipo de variables es que se puede acceder directamente con el nombre de la clase sin necesidad de crear un objeto.

Otros detalles de la variable **static** en java:

-Es una variable que **pertenece a la clase y no al objeto**

-Las variables static se inicializan sol ouna vez, al inciio de la ejecución. Estas variables se inicializarán primero, antes de la inicilización de cualquier variable de instancia.


Se suele tener e los proyectos una **clase Util** donde se guardan constantes,  o métodos que voy a utilizar en varios lugares, a veces es para manipular fechas.

Por ejemplo

```JAVA
package miProyecto;

public class Util {
  private static String anioactual = "2021";
}
```

Y a esta variable **anioActual** voy a poder acceder desde cualquier lugar de **miProyecto** sin necesidad de tener que instanciar un objeto de la clase *Util*.

```JAVA
pakage miProyecto;

public class Main {
  public static void main(String[] args){
    System.out.println(Util.anioActual);  //2021
  }
}
```

---

## Palabra reservada final

---

## Método toString()
