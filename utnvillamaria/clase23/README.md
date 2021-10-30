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
archivo de código formato java -> compilado -> archivo compilado formato .class -> Java VM -> maquina virtual -> 0101001... -> computadora
```

*Escribir una vez, correr para siempre. El mismo código se puede ejecutar en cualquier máquina.


### JVM 

Ees una plataforma dependiente del sistema operativo y el hardware que interpreta y ejecuta el codigo del usuario.

```
JavaCode(java file) -> Java Compiler -> Java Bytecode (class file) -> JRE 
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

