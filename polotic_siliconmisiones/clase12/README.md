# Clase 12 : 27 Septiembre

## ¿ Qué es un paradigma ?

Un **paradigma** es todo aquel modelo, patrón o ejemplo que debe seguir en determinada situación.

En un sentido amplio, se refiere a una teoría o conjunto de teorías que sirve de modelo a seguir para resolver problemas o situaciones determinadas que se planteen.

Es una forma de pensar -> ya hay un STANDAD a seguir

---

## Paradigma Orientado a Objetos

El paradigma de **Programación Orientada a Objetos** es la implementación de un Paradigma de Programación

La POO se basa en la idea de un mundo lleno de objetos y que la resolución  de problemas se realiza mediante el modelado/abstracción de objetos de la vida real

Los objetos pueden comunicarse entre si mediante mensajes

Se basa en un concepto de **agrupar código** y **datos** juntos dentro de una misma unidad llamada **clase**

Sus principales características son:

  * Abstracción
  * Encapsulamiento
  * Polimorfismo
  * Herencia
  * UML (diagrama de clases)

---

## Clase

Es una **plantilla**, o **molde** que permite construir objetos.

Por ejemplo, si tuvieramos la clase Auto, esta sería el plano para construir el Objeto (en este caso uno o varios autos).

Representan *entidades* del mundo real.

Poseen **atributos** y **métodos**.

No pueden ser utilizadas directamente (sino mediante instancias a objetos).

Ejemplos: Auto, Persona, Departamento, Fastura, Recibo, Producto, etc.

* Por convención todos los **nombres deben comenzar en mayúscula** (UpperCamelCase) y en **singular**.

EL ejemplo de la clase Alumno con código:

```JAVA
public class Alumno {
    //Atributos
    int id;
    String nombre;
    String apellido;
}
```

**public** -> modificador de acceso

Toda clase tiene al menos un **constructor** -> permite crear/instanciar objetos

## Constructor

-Las operaciones o métodos son acciones contenidas en una clase, y definen su comportamiento.

-Dentro de un sistema, las operaciones suelen detectarse como **verbos**.

-Desde la perspectiva de Diseño y Programación, se denominan **métodos**.

-Desde la perspectiva de Análisis, se denominan **Operaciones**.

-Puede tener opcionalmente valores de entrada (**parámetros**) y valores de salida (valores de **retorno**).

-Pueden existir **Procedimientos** (no retornan un valor) y **Funciones** (retornan un valor -> palabra reservada **return**)

## Valores de entrada o parámetros

-Los parámetros son valores enviados a una operación

-Los métodos toma los parámetros como **valores de entrada** y así puede realizar las acciones necesarias.

-Todos los parñametros deben tener un tipo de dato asociado (o pueden haber parámetros vacíos).

Ejemplo de la clase Auto:

```
-------------------
|   Auto          |
-------------------
| -color: String  |
------------------
| +encender()     |
| +acelerar(int)  |
| +frenar(int)    |
```

-Método encender() -> sin parámetros

-Método acelerar(int) -> recibe como parámetro la cantidad de km a acelerar

-Método frenar(int) -> recibe como parámetro la cantidad de km que debe bajar de velocidad

## Valor de salida o Retorno

-El **valor de salida** de un método es un **valor retirnado** por el mismo luego de realizar cierto procesamiento o conjunto de acciones.

-Los valores de entrada son **datos**, y los valores de salida son considerados **información**.

-Todos los valores de salida deben tener un tipo de dato asociado. Es posible retornar un **único valor de salida**.

ENTRADA -> PROCESO -> SALIDA

---

## Objeto

Un **objeto** es una **instancia de una clase**

Es la representación de un objeto que generalmente existe en la vida real.

Pposee un **estado** (de acuerdo a sus atributos).

Posee un **comportamiento** (realizan operaciones de acuerdo a sus métodos).

Por ejemplo: clase Alumno:


| Alumno |
| ------ |
| -apellido: String |
| -nombre: String |

Alumno1:

apellido="Sanchez";

nombre ="Mario"

Otro ejemplo:

*Objeto* -> Auto

*Atributos* -> Tiene: marca, color, modelo, peso

*Metodos* -> Puede: encender, acelerar, frenar, prender aire acondicionado, activar airbar

Los métodos son todos VERBOS EN INFINITIVO (sin conjugar) y se escriben en **camelCase**

---

## Ejercicio práctico

-Detectar los posibles métodos/operaciones que pueda tener cada una de las clases: Alumno, Curso, PlanillaAsistencia

Alumno: buscarAlumno, registrarAlumno, informarAlumno, obetenrAlumno

Curso: registrarCurso, informarCurso, obtenerCurso

PlanillaAsistencia: registrarPlantilla, informarPlantilla, obtenerPlantilla

---

