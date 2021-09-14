# Diplomatura Java UTN Villa Maria

## Modulo 1 : Pensamiento lógico

Formación en la construcción de las capacidades técnicas en torno a la lógica de progrmación.

:computer: en [practica de pensamiento logico](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/practica_de_pensamiento_logico) hay ejercicios de logica y teoría.


---

:computer: en [fibonacciRecursivo](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/fibonacciRecursivo)
Hay un ejercicio de practica que muestra los 10 primeros numeros de Fibonacci, aplicando recursividad. Y ejercicios y explicación de la clase 5 con:

-**Palabras reservadas break - continue en ciclos**.

-**Arrays**.

-**Iteració**n.

-**Ejercicios para la próxima clase**.


---


:computer: en [Diplomatura UTNVM](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java)  van a poder ver 7 ejercicios prácticos de estructuras de control en ciclos / loops / bucles.

Los ejercicios son los siguientes:

[Ejercicio1](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio1)

Pasar a código Java:


Indicar si un número ingresado es par o impar

```
Algoritmo NumeroPar
    Entero numero
    Escribir 'Ingrese un numero:'
    Leer numero
    Si numero MOD2 == 0 Entonces
      Escribir numero,' es par'
    SiNo
      Escribir numero,' no es par '
    FinSi
FinAlgoritmo
```

[Ejercicio2](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio2)

Pasar a codigo Java:

Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y  la  cantidad  de alumnosinscriptos  para  un  curso,  permita  determinar  si alcanzan  los  bancos  existentes.

De  no  ser  así,  informar además  cuantos bancos sería necesario agregar. 

El usuario deberá ingresar por teclado tanto la cantidad  de  bancos   que  tiene  el  aula,  como  la  cantidad  de  alumnos inscriptos para 
el curso.

```
BEGIN
Integer cantBancosAula
Integer cantAlumInscriptos
Integer bancosFaltantes
PRINT: “Ingrese la cantidad de bancos disponibles en el aula:”
INPUT: cantBancosAula;
PRINT: “Ingrese la cantidad de alumnos inscriptos al cursado:”
INPUT: cantAlumInscriptos;
    IF (cantBancosAula >= cantAlumInscriptos)
    THEN: PRINT: “Los bancos del aula son suficientes”.
    ELSE
    bancosFaltantes = cantAlumInscriptos -cantBancosAula
    PRINT: “La cantidad de bancos faltantes es:” + bancosFaltantes.
    END IF
END
```

[Ejercicio3](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio3)

Pasar a codigo Java:

Diseñar  un  algoritmo  que  permita  aplicar  un  descuento  del  10%  al  monto total de una compra si laforma de pago empleada es de contado. 

El usuario deberá ingresar el monto de la compra realizada y la forma de pago utilizada. Si es contado, deberá aplicar el descuento, sino se deberá mostrar un mensaje informando que para dicha forma de pago no tiene  descuento.

```
BEGIN
Decimal montoTotal
Text formaDePago
Decimal montoConDesc
PRINT: “Ingrese monto total de la compra”
INPUT: montoTotal;
PRINT: “Ingrese forma de pago”
INPUT: formaDePago;
    IF (formaDePago == “contado”)
    THEN:montoConDesc = montoTotal * 0.9
    PRINT: “El monto Total con descuento aplicado por forma de pago 
    alcontado, es de:” + montoConDesc + “pesos”.
    ELSEPRINT: “La forma de pago ingresada no tiene descuento asociado”.
    END IF.
END
```

[Ejercicio4](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio4)

Pasar a codigo Java:

Diseñar un algoritmo que devuelva el nombre de la semana, a partir de un número ingresado por el usuario.

```
algoritmoDiaSemana
entero: dia
escribir("Escribe un número entre 1 y 7: ")
leer(dia)
segun_sea(dia)hacer
    caso1:
        escribir("LUNES")
    caso2:
        escribir("MARTES")
    caso3:
        escribir("MIÉRCOLES")
    caso4:
        escribir("JUEVES")
    caso5:
        escribir("VIERNES")
    caso6:
        escribir("SÁBADO")
    caso7:
        escribir("DOMINGO")
    otros:
        escribir("Error. El número debe estar entre 1 y 7.")
    fin_segun
fin
```

[Ejercicio5](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio5)

Diseñar   un   algoritmo   que   muestre   por   pantalla   la   tabla   de multiplicación  del  número  que  ingrese  elusuario.  

Para  definir  hasta  que numero  desea  que  muestre  la  tabla  de  multiplicación  el  usuariotambién deberáingresar este valor. La tabla de multiplicación a mostrar debe empezar en la multiplicación por 1.

```
BEGIN
integer tablaNum;
integer tablaHasta;
integer contador=1;
integer multiplicacion
PRINT: “Ingrese el número del cual desea conocer la tabla de multiplicación:”
INPUT: tablaNum;
PRINT: “Ingrese el numero hasta donde desea conocer la tabla:”
INPUT: tablaHasta;
    WHILE(contador <=tablaHasta)
        multiplicacion=tablaNum*contador;
        PRINT: tablaNum + “*” + contador + “=” + multiplicacion
        contador++
    END WHILE
END
```

[Ejercicio6](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio6)

Diseñar   un   algoritmo   que   muestre   por   pantalla   la   tabla   de multiplicación  del  número  que  ingrese  elusuario.  

Para  definir  hasta que numero  desea  que  muestre  la  tabla  de  multiplicación  el  usuario también deberáingresar este valor. La tabla de multiplicación a mostrar debe empezar en lamultiplicación por 1. 

Se le preguntara al usuario si desea imprimir otra tabla y se terminara cuando ingrese un “no”

```
BEGIN
integer tablaNum;
integer tablaHasta;
integer contador=1;
integer multiplicacion;
Text salir
PRINT: “Ingrese el número del cual desea conocer la tabla de multiplicación:”
INPUT: tablaNum
PRINT: “Ingrese el numero hasta donde desea conocer la tabla:”
INPUT: tablaHasta
DO
    DO
        multiplicacion=tablaNum*contador
        PRINT: tablaNum + “*” + contador + “=” + multiplicacion
        contador++;
    WHILE(contador <=tablaHasta)
    END_DO
    PRINT “Desea imprimir otra tabla? Ingrese Si o No”
    INPUT: salir
WHILE(salir==”Si”)
END DO
END
```

[Ejercicio7](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/DiplomaturaUTNVM/src/ejercicio7)

Diseñar  un  algoritmoque  realice  el  promedio  de  4  números.  

Los  números podrán ser decimales y serán ingresados por pantalla por  el usuario.
```
BEGIN
    Decimal acumulador=0
    Decimal promedio=0
    Decimal numero
    FOR(int i=1, i<= 4, i++)
        PRINT: “Ingrese el numero:” + i
        INPUT numeroacumulador += numero
    END FOR
    promedio=acumulador/4
    PRINT: “El promedio de los números ingresados es:” + promedio
END
```

----

:computer: [En la carpeta **Clase 9**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase9)

Se vieron los siguientes temas:

     * Estructuras : listas, pilas, colas, arboles
     * Algoritmos fundamentales de búsqueda, recorrido y ordenamiento.
     
---

:computer: [En la carpeta **Clase 10**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase10)

Está la resolución de los siguientes ejercicios:

## Ejercicios de práctica

### [Ejercicio 1](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio1.java)

Si un lote de terreno tiene X metros de frente por Y metros de fondo: calcular e imprimir la cantidad de metros de alambre para cercarlo (X e Y serán leídos al comenzar el programa).

### [Ejercicio 2](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio2.java)

Realizar algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.

### [Ejercicio 3](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio3.java)

Un pintor sabe que con una pintura determinada puede pintar 3,6 metros cuadrados por cada medio litro. Sabiendo la altura y el largo de la pared a pintar, informar cuántos litros de pintura utilizará (Altura y Largo en metros). 

### [Ejercicio 4](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejecicio4.java)

Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuánto valen al final las dos variables (recuerda la asignación)

### [Ejercicio 5](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio5.java)


Ingresar como dato el perímetro de un cuadrado. 

Calcular e imprimir el volumen del cubo que tiene como lado el cuadrado antes mencionado. 

(V=a3).

### [Ejercicio 6](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio6.java)

Ingresar por teclado los precios correspondientes a cinco articulos y las cantidades vendidas de cada uno de ellos. 

Calcular e imprimir el importe total de ventas de cada uno y un importe total de lo vendido. 

### [Ejercicio 7](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercico7.java)

Indicar si un número ingresado es par o impar. 

### [Ejercicio 8](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio8.java)

Leer un número e indicar si este es múltiplo de dos. 

### [Ejercicio 9](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio9.java)

Leer un número e indicar si es divisible por tres. 

### [Ejercicio 10](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio10.java)

Dado un número entero positivo menor que cien, leerlo desde teclado, indicar si es primo. 

Los números primos son aquellos que sólo son divisibles por sí mismos y por uno.

En el caso del ejemplo, por ser el número leído menor que cien, sólo hay que comprobar que el número no sea 2 - 3 - 5 - 7 o múltiple de alguno de estos. 

Si se cumple esta condición, se trata entonces de un número primo. 

[Opcion 2, resuelta por Francisco](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio10opcion2.java)

### [Ejercicio 11](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio11.java)

Se leen el sueldo básico y la categoría de un empleado. 

Para calcular el sueldo neto se efectúan los siguientes descuentos: 

Categoría 1: 30% 

Categoría 2: 25% 

Categoría 3: 25% 

Categoría 4: 10% 

Para otras Categorías no hay descuentos. 

Imprimir el sueldo neto básico y Categoría.

### [Ejercicio 12](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio12.java)

Leer un número comprendido entre uno y siete, ambos inclusive e imprimir el nombre del día de la semana Correspondiente.

###  [Ejercicio 13](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio13.java)

Leer una serie de 15 números enteros, informar mediante un mensaje cuántos son mayores que 100. 

### [Ejercicio 14](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio14.java)

Leer cincuenta números e indicar la cantidad de valores mayores que diez.

### [Ejercicio 15](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase10/Ejercicio15.java)

De una serie de 20 valores, se quiere saber cuántos cumplen con la condición de ser impares mayores que cincuenta y menores que cien.

----


:computer:  **Clase 12**

Francisco nos pidio instalar el IDE

---

:computer: [En la carpeta **CLASE 13**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase13_poo)

Última clase práctica que vemos con Francisco los temas del módulo 1 para pasar a POO.

---

:computer: [En la carpeta **CLASE 14**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase14)


Seguimos con francisco resolviendo los ejercicios prácticos de la [clase 10](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase10)


#### Ordenamiento burbuja 


:computer: [ejercicio en **ReordenamientoBurbuja**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase14/ReordenamientoBurbuja)



---

## Fuentes de Información

 Sommerville, Ian -“INGENIERIA DE SOFTWARE” 9na Edicion (Editorial Addison-Wesley Ano 2011).

 Pressman Roger -“Ingenieria de Software” 7ma. Edicion -(Editorial Mc Graw Hill Ano 2010).

 Jacobson,  Booch  y  Rumbaugh -“EL PROCESO UNIFICADO  DE DESARROLLO” (Editorial Addison-Wesley -Ano 2000 1ªedicion).

 Guerequeta Rosa, Vallecillo Antonio -TECNICAS DE DISENO DE ALGORITMOS(Servicio de Publicaciones de la Universidad de Malaga, Ano 1998)

 Hernandez, Pier Paolo Guillen -[ALGORITMOS -> http://pier.guillen.com.mx/algorithms/09-busqueda/09.1-introduccion.htm ](http://pier.guillen.com.mx/algorithms/09-busqueda/09.1-introduccion.htm)

 Curso de Estructuras de Datos y Algoritmos / Algoritmos [recursivoshttps://es.wikiversity.org/wiki/Curso_de_Estructuras_de_Datos_y_Algoritmos_/_Algoritmos_recursivos](recursivoshttps://es.wikiversity.org/wiki/Curso_de_Estructuras_de_Datos_y_Algoritmos_/_Algoritmos_recursivos)

 McConnell Steve -CODE COMPLETE -Segunda edicion (Editorial Microsoft Press, Ano 2004)

 Joyanes  Aguilar  Luis PROGRAMACION  EN  C++:  ALGORITMOS,  ESTRUCTURAS  DE  DATOS  Y OBJETOS –Segundaedicion (Editorial McGraw-Hill, Ano 2006)

 Joyanes   Aguilar   Luis,   Rodriguez   Baena Luis,   Fernandez   Azuela   Matilde -Fundamentos de Programacion

 Frittelli  Valerio -Algoritmos  y  Estructuras  de  Datos -Segunda  edicion  (Editorial  Cientifica Universitaria, Ano2004)

 Streib  James  T.,  Soma  Takako -GUIDE  TO  JAVA -A  CONCISE  INTRODUCTION  TOPROGRAMMING (EditoriaSpringer, Ano 2014)

 Guttag  John  V. -INTRODUCTION  TO  COMPUTATION  AND  PROGRAMMING  USING  PYTHON (Editorial MITPress, Ano 2013)

 Ley de Moore [ver](https://es.wikipedia.org/wiki/Ley_de_Moore)

 Tanenbaum Andrew S., Wetherall David J. -REDES DE COMPUTADORAS -Quinta edicion (Editorial Pearson,Ano 2012)

 Tanenbaum  Andrew  S.-SISTEMAS  OPERATIVOS  MODERNOS -Tercera  edicion  (Editorial Pearson, Ano 2009)

 Cola (Informática) [https://es.wikipedia.org/wiki/Cola_(inform%C3%A1tica)](https://es.wikipedia.org/wiki/Cola_(inform%C3%A1tica))

 Bubble Sort [https://en.wikipedia.org/wiki/Bubble_sort](https://en.wikipedia.org/wiki/Bubble_sort)

 Ordenamiento por Inserción [https://es.wikipedia.org/wiki/Orden](https://es.wikipedia.org/wiki/Orden)

---

## Módulo 2 : POO

Formación en técnicas de programación y especificaciones técnicas bajo el paradigna de POO

:computer: [En la carpeta **CLASE 11**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase11_POO)

Temas:

     * Objetivos
     * Bloques
     * Objetos
     * Clases

---

:computer: [En la carpeta **CLASE 14**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase14)

#### POO : clases y objetos


:computer: [Ejercicio **NuevaClase** donde se crea una clase -> **Car**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase14/NuevaClase)

---

:computer: [Clase15 POO](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase15_poo)

---

## Fuentes de información:

 Armour Frank & Miller Granville –ADVANCED USE CASE MODELING-EDITORIAL ADDISON WESLEY, AÑO2000.

 Shneider, Geri & Winters, Jason-APPLYING USE CASES-A PRACTICAL GUIDE-ADDISON WESLEY, AÑO 1998.

 Sommerville, Ian -“INGENIERÍA DE SOFTWARE”9na Edición (Editorial Addison-Wesley Año 2011).

 Pressman Roger -“Ingeniería de Software”7ma. Edición -(Editorial Mc Graw Hill Año 2010).

 Jacobson, Booch y Rumbaugh -“EL PROCESO UNIFICADO DE DESARROLLO”(Editorial Addison-Wesley -Año 2000 1ªedición).

 Booch, Rumbaugh y Jacobson -“Lenguaje de Modelado Unificado”-(Editorial Addison-Wesley-Pearson Educación –2da edición -Año 2006).

 Booch, Grady -Análisis y Diseño Orientado a Objetos. (Editorial Addison-Wesley/Diaz de SantosAño 1996).

 Jacobson, Ivar -Object-Oriented Software Engineering. (Editorial Addison-Wesley Año 1994).

 [https://es.wikipedia.org/wiki/Tipo_de_dato#Java](https://es.wikipedia.org/wiki/Tipo_de_dato#Java)

 Belmonte Fernández Oscar -n al lenguaje de programación Java. Una guíabásicaSánchez Asenjo Jorge –Programación Básica en Lenguaje Java. (http://www.jorgesanchez.netAño 2009)

 García de Jalón Javier, Rodrígue José Ignacio, Mingo Iñigo, Imaz Aitor, Brazález Alfonso,Larzabal Alberto, Calleja Jesús, García Jon –Aprenda Java como si estuviera en primero (EscuelaSuperior de Ingenieros Industriales, Universidad de Navarra Año 1999)

 [http://java-white-box.blogspot.com.ar/2012/08/javadoc-que-es-el-javadoc-como-utilizar.html](http://java-white-box.blogspot.com.ar/2012/08/javadoc-que-es-el-javadoc-como-utilizar.html)

 [http://www.ecured.cu/Javadoc](http://www.ecured.cu/Javado)

 [http://www.ciberaula.com/articulo/listas_en_java](http://www.ciberaula.com/articulo/listas_en_java)

 [https://geekytheory.com/tutorial-14-java-swing-interfaces-graficas/https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=603:](https://geekytheory.com/tutorial-14-java-swing-interfaces-graficas/https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=603:)

---


## Módulo 3 : Desarrollo de aplicaciones webs

Formación en programación en ambientes web, utilizando el lenguaje POO
