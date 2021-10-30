# Clase 23 : 12 Octubre

---

# Modulo 3: Desarrollo de aplicaciones webs


-Lenguajes de POO. introducción a Java

-Características del Lenguaje. Sintaxis y estructura del lenguaje. Estructura de una clase

-Variables de instancia

-Métodos e acceso y de modificación

-Constructores

-contructores y Métodos sobrecargados

-Métodos accesorios o auxiliares

-Documentación de clases y de métodos

-constantes y variables de clase

-Interfaz e implementación de una clase

-Librería de claes de lenguaje

-Clases de fines específicos: agrupamiento de objetos. Coleccion de tamaño fijo.

-El modelo cliente-servidor

-Desarrollo de aplicaciones web con Spring Framework

-Introducción a HTML5, CSS3 y JS. Diseño de interacción de usuario. Despliegue de aplicaciones web con Apache Tomcat

---

## JAVA

-Surge en 1995.

-Compilado e interpretado

```
archivo de código  -> compilado -> archivo compilado  -> Java VM -> maquina virtual -> 0101001... -> computadora
formato java                        formato .class
```

*Escribir una vez, correr para siempre. El mismo código se puede ejecutar en cualquier máquina.


### JVM 

Ees una plataforma dependiente del sistema operativo y el hardware que interpreta y ejecuta el codigo del usuario.

```
  JavaCode -> Java Compiler -> Java Bytecode -> JRE 
(java file)                     (class file)
```

### JDK (Java Development Kit)

Es el Java Development Kit, con el compilador javac que es el encargado de convertir nuestro codigo fuente (.java) en bytecode(.class), el cual posteriormente será interpretado y ejecutado con la JVM, también dentro de esas herramientas encontramos los siguiente programas: javadoc (genera la documentación d nuestro código), el jvisualvm (muestra información a detalle sobre las aplicaciones que están corriendo actualmente en la JVM), entre muchas otras.

### JRE (Java Runtime Enviroment ó Entorno de Ejecución de Java)

Es la implementación de la Máquina Virtual de Java que realmente ejecuta los programas Java, encontraremos todo lo necesario para ejecutar nuestras aplicaciones escritas en Java. Normalmente el JRE está destinado a usuarios que no requieren el JDK, pues a diferencia de este no contiene programas necesarios para crear aplicacionesh en el lenguaje Java, es así, que el JRE se puede instalar sin necesidad de instalar el JDK, pero al instalar el JDK, este siempre cuenta en su interior con el JRE.

¿ Podemos instalar el JDK sin el JRE ? No.

¿ Podemos instalar el JRE sin el JDK ? Si, debido a que el JDK está destinado a usuarios que requieran crear aplicaciones en el lenguaje Java.

---

:computer: ver a imagen para entender todo el entorno de Java completo

---

## Características de java

### Orientado a Objetos

Es un lenguaje creado originalmente para trabajar con **objetos**. De hecho, todo lo que hay en Java son objetos.

### Independiente de la plataforma

Existen máquinas virtuales para diversas plataformas de hardware.

### Compilado e Interpretado

Todo programa ha de compilarse yigo que se genere **bytecode** es interpretado por una máquina virtual.

### Robusto

Su diseño contempla el manejo de errores a través del mecanismo de Excepciones.

### Gestiona la memoria automáticamente

La JVM gestiona la memoria dinámicamente, existe el **garbage colector**.

### No permite el uso de técnicas de programación inadecuadas

Para crear un programa es necesario aplicar correctamente el paradigma de objetos

### Multihilos

Soporta la creación de partes de código que podrán ser ejecutadas de forma paralela y comunicarse entre sí.

### Cliente - Servidor

Java permite la creación de aplicaciones que pueden funcionar tanto como clientes como servidores.

### Mecanismos de seguridad

Posee un gestor de seguridad con el que puede restringir el accehso a los recursos del sistema y la JVM funciona como un **sandbox**

### Herramientas de documentación

Creación automática de documentación asociada al cçodigo mediante la herramienta **Javadoc**

---

## Sintaxis

-La extensión de los archivos fuente es **.java** codificados en Unicode (al compilarse, que pasa a **.class**), codificación de caracteres de 16 bits que soporta la mayoría de los idiomas del mudo.

-Hay diferencia entre mayúsucals y minúsculas (es **case sensitive**).

-Cada línea de código debe terminar en un ; (**punto y coma**).

-Una instrucción puede abarcar más de una línea.

-Cada bloque de código comienza con **llave que abre** y termina con **llave que cierra**.

---

-Los tipos de variables disponibles son tres:

  * **Tipos básicos** (no son objetos, los primitivos, como: int, double, float,byte, short, long, char, boolean). Al declararlo su primer letra comienza en minúscula.
  
  * **Arreglos** (arrays o vectores)
  
  * **Clases** e **interfaces**
  
---

## Manejo de Escepciones

Es cierto tipo de error o una condición normal que se ha producido durante la ejecución de un programa.

Algunas excepciones son fatales y provocan el din de ejecución del programa.

```
              Throwable
                 |
                 |
   --------------------------------------------  
   |                                          |
 Error                                     Exception
                                              |
                                              |
          --------------------------------------------------------------------
          |                                      |                           |
          |                                      |                           |
       RunTimeException                      IOException                  AWTException
        |                                     |
        |--NullPointerException               |--EOFException
        |--IndexOutOfBoundsException          |--FileNotFoundException
        |--NegativeArraySizeException         |--MalformedURLException

```

---