# Clase2

## Tipo de datos

-Se vio en la clase 1

---

## Variables

-Se vio en la clase 1

---

## Condicionales


### Condicional IF (SI)

La estructura de control IF permite decidir entre dos opciones resultantes de la evaluación de una sentencia.

Si la evaluación es positiva ( verdadera / true ) se ejecuta una parte del códgio, de lo contrario el código dentro de la condición no se ejecuta o se establece otra serie de acciones para que se ejecuten en ese caso.

Cuando se procesa una declaración IF se evalúa la expresión de condición y el resultado es interpretado como un valor BOOLEANO. Si es resultado es VERDADERO se ejecutan sentencias contenidas dentro del IF. Caso sontrario, el programa saltea lo que se encuentra destro de este bloque.

Si EXPRESION LOGICA == TRUE  -> Sentencia logica -> FIN

Si EXPRESION LOGICA != TRUE -> FIN


```JAVA
IF (condicionAEvaluar) {
  //bloque a ejecutar si la condicion es true
}
```

Ejemplo en código:
```JAVA
int suma = 0;
int num = 5;
int resta = 0;
int bloqueif = 0;

if( num > 3) {
  suma = num + num;
  System.out.println("El resultado es : " + suma);
  bloqueif = 1;
}

if( num <= 3) {
  resta = 15 - num;
  System.out.println("El resultado es : " + resta);
  bloqueif = 2;
}

System.out.println("El bloque de if al que estre fue el " + bloqueif);
```

Como **num =5**   ->   cumple esta condición: **num > 3** por lo que entra en este if:
```JAVA
if( num > 3) {
  suma = num + num;
  System.out.println(suma);
}
```

Y voy a ver por pantalla:
```
El resultado es : 10
El bloque de if al que estre fue el 1
```

Como nunca cumple con esta condición **num <= 3** nunca entra al segundo if.

Siempre ejecuta el primer bloque if.

---

### Condicional IF ELSE (SI / SINO)

Es la expresión de la sentencia IF, significa '**de lo contrario**' y permite la ejecución de un bloque de código si la condición de la sentencua IF fue FALSA.

La sentencia ELSE se ejecuta solamente si la expresión IF se evalúa como falsa.

Si EXPRESION LOGICA == TRUE   ->   Sentencia logica1   -> FIN

Si EXPRESION LOGICA != TRUE   ->   Sentencia logica2   ->   FIN


```JAVA
IF (condicionAEvaluar) {
  //bloque a ejecutar si la condicion es true
} else {
  //bloque a ejecutar si la condicion es false
}
```

Ejemplo en código:
```JAVA
int suma = 0;
int num = 5;
int resta = 0;
String bloqueif = "";

if( num > 3) {
  suma = num + num;
  System.out.println("El resultado es : " + suma);
  bloqueif = "if";
} else {
  resta = 15 - num;
  System.out.println("El resultado es : " + resta);
  bloqueif = "else";
}

System.out.println("El bloque de if al que estre fue el " + bloqueif);
```

---

### Condicional Multiple

Se utiliza cuando se necesita anidar varias condiciones IF si no se cumple la primera.

Consiste en realizar una primera evaluación de una condición, si esta no se cumple, por el lado del else se plantea una nueva condición y así sucesivamente la cantidad de veces que sean necesarias.


Ejemplo en codigo:

```JAVA
int num = 5;
int resta = 0;
String bloqueif = "";

if( num > 3) {
  suma = num + num;
  System.out.println("El numero es mayor que 3";
  bloqueif = "if";
} else {

  if( num == 1) {
    System.out.println("El numero es menor o igual a 3 y es 1");
    bloqueif = "else + if";
  } else {
  resta = 15 - num;
  System.out.println("El numero es menor o igual 3, pero no es 1");
  bloqueif = "else + else";
  }
}

System.out.println("El bloque de if al que estre fue el " + bloqueif);
```

---

## Switch

La estructura **switch** permite múltiples caminos a partir de la evalución de una cola espresión / condición.

La espresión puede ser una variable o cualquier otro tipo, siempre y cuando se evalue un valor simple (char, int).

La condición se ejecuta mediante la evaluación de la condiciñon y un conjunto de sentancias **case**. Cada case es una posible respuesta a la evaluación de esa condición, si el valor que se busca coincide con algún case, se ejecuta el mismo hasta la sentencia **break** o hasta el final del switch ( dependiendo dle caso).



---
