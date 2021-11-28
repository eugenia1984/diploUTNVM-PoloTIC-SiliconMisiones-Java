#  Clase 34 : 18 Noviembre

Temas:

- Exámenes:

2/12 : simulacro del examen

17/2 : primer examen

A confirmar (en Enero o Febrero): segundo examen

- Excepciones: palabras reservadas **throw** y **throws**

- Fechas: **LocalTime** y **LocalDateTime**

- Introducción a **JUnit**

---

[video](https://www.youtube.com/watch?v=B-0PlyO5Tfw)

---

## Throw - Throws

**Throw**: palabra reservada que se utiliza para lanzar explicitamente una excepción.

**Throws**: palabra reservada que se utiliza en la firma del método para declarar que una excepción puede ser lanzada a partir de la ejercitación de ese método. Quienes llamen a un método que se encuentre marcado con **throws** debe manejar la excepción dentro de un bloque try-catch. 


Ejemplo en codigo:

```Java
public class Main {
  public static void main(String [] args) {
     try {
         System.out.println(dividir(10.0 , 0.0));
     } catch (//aca aclaro la excepcion) {
          //aca la manejo a la excepcion
     }    
  }
  
  public static Double dividir(Double a, Double b) throws AritmeticException {
     if (b == 0) {
        throw new AritmeticException("No se puede dividir por cero");
     }
     return (a/b);
  }
  
}
```

---

## Fechas :  Localtime y LocalDateTime. DateFormatter


**LocalTime**: representa una hora sin fecha. 

Podemos crearla utilizando los metodos **now()**, **parse()** y **of()**; d ela misma manera que con **LocalDate**.

**LocalDateTime**: representa una fecha con hora. De la misma manera que **LocalDate** y **LocalTime**, se puede crear utilizando el método: **now()**, **parse(String)** y **of()**.


**DateFormatter** es una clase que nos permite formatear la hora de acuerdo a un formato personalizado.

para el formato se deben utilizar los símbolos que nos proporciona la documentación de DateFormatter:

```DateTimeFormatter f = DateTimeFormatter.ofPattern("Hoy es 'd' de 'M' del 'yyy'. Son las 'hh' horas'.");
---

## JUnit
