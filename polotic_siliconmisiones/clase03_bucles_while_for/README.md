# Clase 3


## Estructuras repetitivas


   * Permiten ejecutar una cierta porción de código por una determianda cantidad de veces (N cantidad de veces).
   * Esta ejecución repetitiva se conoce como **bucle**
   * Existen dos tipos de bucles: **controlador por un CONTADOR** y **controlados por un CENTINELA**

Se puede pensar un bucle como un espiral para los mosquitos, que van en circulo en cada vuelta (iteracion) y en un momento termina (cuando la condición deja de ser true y pasa a ser false, el contador y el centinela son los encargados de que pase a ser false en algún momento).


---


##   Bucles controlados por contador y centinela

### Por Contador

En ellos existe una **variable** que **cuenta la cantidad de 'vueltas'** (ejecuciones) del bucle.

Cuando se llega a la cantidad que establece como máximo la varaible, el programa sale del mismo.

Yo SE LA CANTIDAD DE VUELTAS NECESARIAS, entonces uso al **contador** que es una *variable auxiliar* que se suele incializar en 0 y me va a ir contando las iteraciones (vueltas) del bucle.



Ejemplo en diagrama de flujo:


```
          Inicio
            |
            V
      contador < 10 -------------
             |                  |
  ---------> |                  |
  |          V                  |
  |         S I                 | 
  |          |                  |
  |          V                  V
  |    (Hago un conjunto       N O
  |      de acciones)           |
  | contador = contador +1      |
  |          |                  |
  |----------|                  |
                                |
       (sigo con el  <-----------
    resto del programa)
             |
             |
             V
            Fin
```           


### Por centinela


   * Existe una variable (generalmente booleana) que establece un **valor** o **condición de salida del bucle**, a esta variable la suelen llamar *bandera* o *centinela*

   * **No existe una cantidad numérica que limite las ejecuciones** del bucle.

Por ejemplo, un bucle se puede ejecutar mientras una **variable tenga el valor verdadero**, si esta pasa a falso, se debe **salir** del mismo. No necesariamene tiene que ser un boolean, puede ser una String o una relación.


Ejemplo en diagrama de flujo:


```
          Inicio
            |
            V
      centinela = true-----------
             |                  |
  ---------> |                  |
  |          V                  |
  |    centinela = true         | 
  |          |                  |
  |          V                  V
  |    (Hago un conjunto       N O
  |      de acciones)           |
  |        ...                  |
  |          |                  |
  |          |                  |
  |----------|                  |
             |                  |
       (sigo con el  <-----------
    resto del programa)
             |
             |
             V
            Fin
 ```         

Un ejemplo sería si voy a anotar clientes y no se cuántos tengo.

Con un bucle va  haciendo todo hasta encontrar la parada.


---


##  While (Mientras)


   * Permite ejecutar un bloque de código en forma repetitiva **mientras** (**while**) se cumpla una determinada condición
   * La condición se evalúa **siempre** al inicio del bucle -> si la condición nunca se cumple -> nunca entra al bucle, nunca se *ejecuta*.
   * Si la condición es válida, ingresa al bucle y ejecuta el código.
   * En cada iteración mi contador se va a ir modificando (incrementa o decrementa) para que en cierto punto pasa de ser true a false.
   * Cuando deja de cumplirse la condición, el programa sale del bucle y continúa con el resto del programa.


Ejemplo de bucle controlado por contador:

```JAVA
int contador =0;

while ( contador <= 10) {
  System.out.println("Estoy en la vuelta nro.: "+ contador);
  contador = contador + 1;
}
```

Ejemplo de bucle controlado por centinela:

```JAVA
boolean bandera = true;

while ( bandera == true ) {
  System.out.println("El valor de la variable es: " + bandera);
  
  Scanner teclado = new Scanner(System.in);   //leemos por teclado
  int tecla = teclado.nextInt();   //buscamos si hay un entero
  
  if ( tecla == 1 ) {   //conparamos si el entero es 1
    bandera = false;
  }
}
```

Si mi centinela es variable de tipo **String** y necesito comparar debo utilizar **.equals()**

Mientras mi centinela sea "exit":

```
while( centinela.equals("exit") )
```

Mientras mi centinela sea distinto de exit:

```
while( !centinela.equals("exit") )
```

---


## Bucles infinitos

   * un bucle infinito se produce cuando por algún motivo el programa entra en un bucle pero el mismo no tiene una condición de salida.
   
   * Esto puede suceder tanto en los bucles controlados por contador como en los controaldos por centinela.
   
   * Se llama bucle **infinito** porque al no haber una condición de salida, el bucle continúa ejecutándose.


---


## For (Para)

   * El bucle For realiza un bucle una determinada cantidad de veces. Se lo puede considerar un bucle **controlado por contador**, sin embargo posee su variable contadora propia.
   
   * Está compuesto por tres partes:
   
- **Inicialización de la variable** que utilizaremos en la condición (se ejecuta solo una vez al principio del ciclo). Es mi contador.

- **Condición de fin de ciclo** se evalúa esta expresión al comienzo de cada iteración.

- **Modificación de la variable** se ejecuta el final de cada iteración

Ejemplo en pseudocódigo

```
for ( inicializacion; condicion; modificacion) {
    // sentencias
}
```

Ejemplo en Java:

```JAVA
for ( int i = 0; i <= 10; i++) {
    System.out.println("Estoy en la vuelta " + i + " del ciclo for");
}
```

Es lo mismo que tiene un while, pero todo en una sola linea.


---

## Ejercicios de practica


### [Ejercicio 1 -> resuelto en Clase3Ejercicio1](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio1)

Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro).

Utilizar para esto alguna estructura repetitiva.


### [Ejercicio 2 -> resuelto en Clase3Ejercicio2](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio2)

Realizar un programa que dado por teclado un límite ( por ejemplo 100) muestre en pantalla los números hasta ese límite (empezar por 1)


### [Ejercicio 3 -> resuelto en Clase3Ejercicio3](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio3)

Realizar un programa que muestre por pantalla los números del 200 al 250, saltando de 2 en 2.

Las secuencia debería ser: 200 ... 202 ... 204 ... etc


### [Ejercicio 4 -> resuelto en  Clase3Ejercicio4](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio4)


Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo, la cuenta debe comenzar en 10 y terminar en 1.


### [Ejercicio 5 -> resuelto en Clase3Ejercicio5](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio5)

Realizar un programa que muestre por pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra 'salir'


---

### Ejercicios integradores

Resolver los siguientes ejercicios. Intentar ejecutarlos y probarlos con datos de prueba.

### [Ejercicio 6 -> resuelto en Clase3Ejercicio6](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/clase03_bucles_while_for/Clase3Ejercicio6)

Un gerente de una empresa prestadora de servicios de internet necesita un programa que permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio. Los tipos de servicio son 3:

i. Internet 30 megas (cuyo valor es de $890 – 10% de descuento)

ii. Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)

iii. Internet 100 megas (Cuyo valor fijo es de $1600)

El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar y el número de servicio con el que cuenta.


### Ejercicio 7

Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto necesita un programa que, para cada cálculo, permita el ingreso de los dos números por separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.

Por ejemplo:

Número 1 = 25 Número 2 = 15 Operador = +


### Ejercicio 8

En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber. Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre, apellido y edad.

En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

• Menores A (de 6 a 10 años)

• Menores B (de 11 a 17 años)

• Juveniles (de 18 a 30 años)

• Adultos (de 31 a 50 años)

• Adultos mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.

---
