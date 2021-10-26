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

**Personalizadas**

---

:star: Proxima clase : aula invertida para configurar JPA

Ver los [videos](https://www.youtube.com/playlist?list=PLQxX2eiEaqbx-JlkcrMlq9zIPxTA82kzk) asi se puede hacer la configuración y en la clase despejar dudas, por telegram

---