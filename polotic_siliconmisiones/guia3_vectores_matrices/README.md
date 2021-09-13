# Guia de ejercicios Vectores y Matrices

---

## Ejercicios extra de practica

## VECTORES

##  Ejercicio 1

Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.

Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.

:computer: [resolucion -> Guia3Ejercicio1](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio1)


##  Ejercicio 2

Realizar un programa que permita la carga de 10 números en un vector.

una vez cargados, se necesita que el programa determine cuál es el mayor y cuál es el menor.

:computer: [resolucion -> Guia3Ejercicio2](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio2)


##  Ejercicio 3

Realizar un programa que permita la carga de 15 números en un vector. una vez cargados, se necesita que el programa cuente e informe por pantalla cuántes veces se cargó el número 3.

:computer: [resolucion -> Guia3Ejercicio3](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio3)


##  Ejercicio 4

un empleado desea almacenar en un vector sus 12 sueldos del año.

A partir de esto, necesita un programa que muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.

:computer: [resolucion -> Guia3Ejercicio4](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio4)

## Ejercicio 5

En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de 5 ciudades de la provincia de Misiones. 

En el primer vector se guardan los nombres delas ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última semana. 

Se necesita un programa que permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).

| Ciudades |
| -------- |
| Oberá |
| Posadas |
| L. N. Alem |


| Temperatura Minima |
| ----------- |
| 16 |
| 18 |
| 15 |

| Temperatura Maxima |
| ------------------ |
| 29 |
| 32 |
| 28 |

## MATRICES


## Ejercicio 6

Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5 (4 filas, 5 columnas).

:computer: [resolucion ->Guia3Ejericio6](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejericio6)


## Ejercicio 7

Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal de una matriz de 6 x 6. Entiéndase por diagonal principal aquella que comienza en [0,0] y termina en [6,6].

:computer: [resolucion -> Guia3Ejercicio7](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio7)


## Ejercicio 8

Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 (3 filas, 3 columnas) con razas de perros. 

Una vez cargada, se debe permitir al usuario ingresar por teclado una raza de perro que quiera buscar; el programa deberá poder encontrarla y mostrar un mensaje con la posición (fila, columna) donde la encontró. 

En caso de que la raza de perro no se encuentre en la matriz, se deberá informar la situación mediante un mensaje por pantalla

:computer: [resolucion -> Guia3Ejercicio8](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio8)


## Ejercicio 9

En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario.

Cada fila corresponde a las notas y al promedio de cada alumno.

i. Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del alumno y que en la última columna se calculen los promedios.

ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz. 

Ejemplo:

```
           NOTA 1  NOTA 2  NOTA 3   PROMEDIO
ALUMNO 1     8       8       7         ?
ALUMNO 2     7       9       10        ?
ALUMNO 3    10       9       5         ?
ALUMNO 4     4       9      8,50       ?
```

💻[ resolucion -> Guia3Ejercicio9](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia3_vectores_matrices/Guia3Ejercicio9)

## Ejercicio 10

Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, uno por la mañana, otro al mediodía y otro por la noche. Para administrar estos datos, utiliza una matriz, donde cada fila es un destino y en cada columna se  guarda la cantidad de asientos disponibles. 

Por Ejemplo:

```
           0         1        2
         MAÑANA   MEDIODIA  NOCHE
0  RIO     120       15      30
1  CUN     65        1       2
2 MAD      4         52      7
3 ROM      46        32      16
4 MIL      64        23      11
5 IGR      61        12      91

```

1) Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo.

2) Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al que quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la  mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita.

3) A partir de la solicitud del usuario, el programa debe controlar si hay la cantidad suficiente de asientos para la cantidad de pasajes que se requiere. 

En caso de que así sea, se debe mostrar un cartel por pantalla que diga “su reserva fue realizada con éxito” y se debe descontar del total de asientos los solicitados por el usuario. 

En caso de no haber más asientos disponibles, se debe informar otro cartel que diga “disculpe, no se pudo completar su operación dado que no hay asientos disponibles”.


Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas ventas/reservas se
hacen por día. Por lo cual, para finalizar las ventas se ingresa la palabra “finish”.
