# Clase 18: 25 Octubre : Excepciones en Java

Problem Occurs -> Create Exception -> Throw Exeption -> Handle Exception


## Definición

Es un evento que ocurre durante la ejecución de un programa que rompe el flujo normal de ejecución.

Muchas cosas pueden generar excepciones: un error en algún elemento de hardware, operaciones ( por ejemplo dividir por cero), errores generales de un programa (error por desbordamiento de un arreglo), apertura de archivo inexistente, etc.

Al abrir un archivo puedo tener 4 excepciones:


-el archivo puede existir como no

-el archivo puede abrir y funcionar bien, como que no

-la  url puede estar bien o puede estar mal

-puede estar dañado o no

---

## Tipos de excepciones

**Propias de Java** que se dividen en dos grandes grupos:

-**RunTimeException**:  *Excepciones en tiempo de ejecución*. Representa las excepciones que ocurren de la máquina virtua Java (durante el tiempo de ejecución). Un ejemplo de estas excepciones: NullPointerException, cuando apunto a una posición que no existe o está vacía, suele surgir cuando se trabaja con Listas.

-**IOException**: *Excepciones de Entrada y Salida*. Significa que se ha producido un error en la entrada/salida. por ejemplo, cuando estamos leyendo de la consola, un fichero, etc. Es obligatorio tratar la excepción, ya sea en la cabeza del método con *throws IOException* o con un bloque *try-catch*.

```
                                Object
                                  |
                              Throwable
                                   |
            -----------------------------------------------------
            |                                                   |
          Error                                            Exception
            |                                                  |
  --------------------------------                   --------------------------
  |                |             |                   |                         |
OutOfMemoryError  LinkageError  StackOverFlowError   RunTimeException      IOException
                                                       |                    |
                                                       |                    |--FileNotFoundException
                             ------------------------------------           |
                             |              |                   |           |--SockerException
                             |              |                   |
             IlegalArgumentException   ArithmeticException   IndexOutOfBoundsException  
                            |                                   |
            NumberFormatException                ArrayIndexOutBoundsException
```

**Error** es para los errores graves

**Personalizadas**: Java nos permite crear nuestras excepciones personalizadas, estableciendo un mensaje de error que queramos devolver en determinada situación como así también diferentes expecificaciones. 

para poder crear una **excepción personalizada// debemos crear una nueva clase, la cual extenderá de la clase **Exception**.


Ejemplo en código:

```JAVA
public class MiExcepcionPropia extends Exception {
  public MyExcepcionPropia() {
  }
  
  public metodoUno (parametroQueRecibo) {
    hacerAlgo();
  }
  
  public metodoDos (otroParametroQueRecibo) {
    hacerOtraCosa();
  }
}
```

---

Ejemplo práctico de dividir por cero:

```JAVA
package excepciones;

public class Excepciones{
  public static void main(String[] args) {
    try {
      //divido por cero para tener la excepcion que la atrapo en el try-catch
      //Y asi no frenar la ejecucion de mi programa
      double division = 35/0; 
    } catch (Exception e) {
      System.out.println("No se puede dividir por cero");
    }
  }
}
```

Ejemplo prático de desbordamiento de vector:

```JAVA
package excepciones;

public class Excepciones{
  public static void main(String[] args) {
    int edades[] = {3,4,5,6};
    try {
       //Me equivoque y puse un indice que no tengo
       System.out.println("La edad de la posicion 4 es : " + edades[4]); 
    } catch (Exception e) {
       System.out.println("Probacaste un error por desbordamiento"); 
    }
  }
}
```

---

## Sintaxis de escepciones

**try**: bloque donde puede ocurrir la excepcion.

**catch**: es como el *else* del try (se ejecuta al dispararse una excepcion en el bloque try)

**finally**: bloque *opcional* de código que se ejecuta siempre (sin importar si hubieron errores o no)

**throw**: lanzar una excepcion cualquiera

**throws**: determinar que excepciones puede lanzar un método. Se suele utilizar en los métodos que pueden arrojar o arroja una excepcion, por ejemplo tengo un *método calcularPromedio() throws Exception*

Ejemplo prático de throws:

```JAVA
//Mi clase prueba
package excepciones;

public class Pruebita{
    public double calcularPromedio(double nota1, double nota2, int cantidad;) throws() ArithmeticException{
      return nota1 + nota2 / cantidad;;
    }
}

//Mi Main class
package excepciones;

public class Excepciones {
  public static void main(String[] args) {
    Pruebita prueba = new Pruebita();
    prueba.calcularpromedio(5,6,0);
  }
}
```

---

## ¿ Cómo se capturan las excepciones ?

-En Java para capturar las excepciones que se hayan podido producir utilizamos las expresiones **try** y **catch** para delimitar el codigo que queremos controlar.

-Cuando se produce una excepcion, el bloque **try** termina y **catch** muestra o ejecuta el código que está pensado para la excepcion

Ejemplo en codigo:

```JAVA
try {
  localizar archivo;
  abrir archivo;
  leer archivo;
  cerrar archivo;

} catch (falloDeLocalizacionDelArchivo) {
  hacerAlgo();
} catch (falloAlAbrirElArchivo) {
  hacerAlgo();
} catch (falloAlLeerElArchivo) {
  hacerAlgo();
} catch (falloAlCerrarElArchivo) {
  hacerAlgo();
}

```

Estas mismas operaciones pueden ser para conectarme a una base de datos.

---

:star: Proxima clase : aula invertida para configurar JPA

Ver los [videos](https://www.youtube.com/playlist?list=PLQxX2eiEaqbx-JlkcrMlq9zIPxTA82kzk) asi se puede hacer la configuración y en la clase despejar dudas, por telegram

---
