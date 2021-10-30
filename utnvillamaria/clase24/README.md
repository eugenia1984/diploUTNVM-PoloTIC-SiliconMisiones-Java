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

#### Como variable:

Una variable estática (**static**) en Java es una variable que pertenece a la clase en que fue declarada y **se iniciliza solo una vez al inicio de la ejecución del programa**, la característica principal de este tipo de variables es que se puede acceder directamente con el nombre de la clase sin necesidad de crear un objeto.

Otros detalles de la variable **static** en java:

-Es una variable que **pertenece a la clase y no al objeto**

-Las variables static se inicializan sol ouna vez, al inciio de la ejecución. Estas variables se inicializarán primero, antes de la inicilización de cualquier variable de instancia.


Se suele tener en los proyectos una **clase Util** donde se guardan constantes,  o métodos que voy a utilizar en varios lugares, a veces es para manipular fechas.

Por ejemplo

```JAVA
package miProyecto;

public class Util {
  private static String ANIO_ACTUAL = "2021";
}
```

Y a esta variable **anioActual** voy a poder acceder desde cualquier lugar de **miProyecto** sin necesidad de tener que instanciar un objeto de la clase *Util*.

```JAVA
pakage miProyecto;

public class Main {
  public static void main(String[] args){
    System.out.println(Util.ANIO_ACTUAL);  //2021
  }
}
```

#### Como método:

Un método **static** en Java es un método que pertenece a la clase y no al objeto.

-Un método static **solo puede acceder a datos static**. No puede aceder a datos no statc (variables de instancias).

-Un método staic puede llamar sólo a otros métodos static y no puede invocar un método no static a partir de él.

-Un método static se puede acceder directamente por el nombre de la clase y no necesariamente crear un objeto para acceder al método (aunque se puede hacerlo).


```JAVA
package miProyecto;

public class Util {
  private static integer ANIO_ACTUAL = 2021;
  
  public static Integer calcularDiferenciaDeAnios(Integer anio) {
    //no tengo que hacer this.anioActual, solo nombro la variable constante y la reconoce
    return ANIO_ACTUAL - anio;
  }
}
```

```JAVA
pakage miProyecto;

public class Main {
  public static void main(String[] args){
    System.out.println(Util.ANIO_ACTUAL);  //2021
    System.out.println(Util.calcularDiferenciaDeAnios(2020)),  //1
  }
}
```

---

## Palabra reservada final

Cuando una variable se declara con la palabra reservada **final**, su valor no se puede modificar, esencialmente, es una **constante**.

Si la variable final es referencia, esto significa que la variable no se puede volver a vincular para hacer referencia a otro objeto, pero el estado interno dl objeto apuntado por esa varaible de referencia se puede cambiar, es decir, puede agregar o eliminar elementos de la matriz final o colección final.

Es una buena práctica representar las variables finales en **MAYÚSCULAS**, utilizando guiones bajos para separar las palabras.


La única diferencia entre una variable normal y una variable final es que podemos reasignar el valor a una variable normal, pero no podemos cambiar el valor de una varaible final una vez asignada. Por lo tanto, las varaibles finales **deben usarse solo para los valores que queremos que permanezcan constantes** durante la ejecución del programa.


Un ejemplo es la librería, con la clase **Math** que tiene:

```JAVA
public static fnal double PI = 3.1415926535897932846;
```
---

## Método toString()

El **método toString()** en Java, se utiliza para convertir a String (a una cadena de texto) cualquier **objeto java**.

Sobreescribir el método toString() es sencillo. Solo tienes que tener en cuenta que este método es:

-público

-devuelve un String

-no acepta ningún parámetro

Ejemplo en mi clase **Pelicula** tengo el toString que me va a mostrar todos los atributos de mi clase.

```JAVA
@Override
    public String toString() {
        return "Pelicula{" + "anioEstreno = " + anioEstreno + ", disponible = " + 
                disponible + ", duracion = " + duracion + ", fechaIngreso = " + 
                fechaIngreso + ", nombre = " + nombre + ", tituloOriginal=" + 
                tituloOriginal + ", genero = " + genero + ", calificacion = " + 
                calificacion + ", paisDeOrigen = " + paisDeOrigen + '}';
    }
 ```  
 
 si sólo quiero mostrar una determinada información, lo puedo sobrrescribir, si sólo quiero ver el nombre:
 ```JAVA
@Override
    public String toString() {
        return "Pelicula{" + ", nombre = " + nombre +'}';
    }
 ```

---
