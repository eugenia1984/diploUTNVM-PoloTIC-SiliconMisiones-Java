# Diplomatura Java UTN Villa Maria

## Modulo 1 : pensamiento lógico

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

:computer: [**Clase 9**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/utnvillamaria/clase9)

Donde se vieron los siguientes temas:

     * Estructuras : listas, pilas, colas, arboles
     * Algoritmos fundamentales de búsqueda, recorrido y ordenamiento.
     

----

Fuentes de Información

Sommerville, Ian -“INGENIERIA DE SOFTWARE” 9na Edicion (Editorial Addison-Wesley Ano 2011).

Pressman Roger -“Ingenieria de Software” 7ma. Edicion -(Editorial Mc Graw Hill Ano 2010).

Jacobson,  Booch  y  Rumbaugh -“EL PROCESO UNIFICADO  DE DESARROLLO” (Editorial Addison-Wesley -Ano 2000 1ªedicion).

Guerequeta Rosa, Vallecillo Antonio -TECNICAS DE DISENO DE ALGORITMOS(Servicio de Publicaciones de la Universidad de Malaga, Ano 1998)

Hernandez, Pier Paolo Guillen -[ALGORITMOS](http://pier.guillen.com.mx/algorithms/09-busqueda/09.1-introduccion.htm)

Curso de Estructuras de Datos y Algoritmos / Algoritmos [ver](recursivoshttps://es.wikiversity.org/wiki/Curso_de_Estructuras_de_Datos_y_Algoritmos_/_Algoritmos_recursivos)

McConnell Steve -CODE COMPLETE -Segunda edicion (Editorial Microsoft Press, Ano 2004)

Joyanes  Aguilar  Luis PROGRAMACION  EN  C++:  ALGORITMOS,  ESTRUCTURAS  DE  DATOS  Y OBJETOS –Segundaedicion (Editorial McGraw-Hill, Ano 2006)

Joyanes   Aguilar   Luis,   Rodriguez   Baena Luis,   Fernandez   Azuela   Matilde -Fundamentos de Programacion

Frittelli  Valerio -Algoritmos  y  Estructuras  de  Datos -Segunda  edicion  (Editorial  Cientifica Universitaria, Ano2004)

Streib  James  T.,  Soma  Takako -GUIDE  TO  JAVA -A  CONCISE  INTRODUCTION  TOPROGRAMMING (EditoriaSpringer, Ano 2014)

Guttag  John  V. -INTRODUCTION  TO  COMPUTATION  AND  PROGRAMMING  USING  PYTHON (Editorial MITPress, Ano 2013)

Ley de Moore [ver](https://es.wikipedia.org/wiki/Ley_de_Moore)

Tanenbaum Andrew S., Wetherall David J. -REDES DE COMPUTADORAS -Quinta edicion (Editorial Pearson,Ano 2012

)Tanenbaum  Andrew  S.-SISTEMAS  OPERATIVOS  MODERNOS -Tercera  edicion  (Editorial Pearson, Ano 2009)

Cola (Informática) [ver](https://es.wikipedia.org/wiki/Cola_(inform%C3%A1tica))

Bubble Sort [ver](https://en.wikipedia.org/wiki/Bubble_sort)

Ordenamiento por Inserción [[ver](https://es.wikipedia.org/wiki/Orden)

---

## Módulo 2 : POO

Formación en técnicas de programación y especificaciones técnicas bajo el paradigna de POO


---

## Módulo 3 : Desarrollo de aplicaciones webs

Formación en programación en ambientes web, utilizando el lenguaje POO
