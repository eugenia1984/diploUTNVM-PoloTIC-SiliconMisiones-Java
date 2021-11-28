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

```DateTimeFormatter f = DateTimeFormatter.ofPattern("Hoy es 'd' de 'M' del 'yyy'. Son las 'hh' horas'.");```

Algunos símbolos:

| simbolo | significado | ejemplo |
| ------- | ----------- | ------- |
| G | era | AD; A |
| y | año | 2004 ; 04 |
| D | dia del año | 189 |
| d | dia del mes | 10 |
| a | si es mañana o tarde | AM ; PM |
| H | hora | 0 |
| m | minutos | 20 |
| s | segundos | 20 |


Ejemplo en codigo 

```Java
java.time.LocalDate;
java.time.LocalDateTime;
java.time.format.DateTimeFormatter;
java.time.format.DateTimeParseException;

class Main {
  public static void main(String[] args) {
  //Creo el formatter con e formato que necesito
    DateTimeFormatter dtf = DateTimeFormatter
                                 .ofPattern("Hoy es 'dd' de 'MM' del 'yyy'. Son las 'hh' horas'.");
    //creo la variable con la fecha
    LocalDateTime date1 = LocalDateTime.now();
    //otro modo con .of
    LocalDateTime anotherDay = LocalDateTime.of(200,01,15,08,20); //2000-01-15T08:20
    //la variable la paso al format
    System.out.print(dtf.format(date1));
  }
}
```

Sin formatear, la fecha me la muestra así:

```2021-11-18T17:06:25.036587``` -> ```año-mes-dia-T-hora:minutos:segundos:milisegundos```

Si en el **.ofPattern()** solo ponía d y M cuando tenia días o meses entre 1 y 9 no me antepone el 0, por eso debo poner dd o MM

Para el formato latinoamericano **.ofPattern("dd/MM/yyyy Hh:mm:ss)**, ejemplo en codigo:

```Java
DateTimeFormatter dtf = DateTimeFormatter
                             .ofPatter("dd/MM/yyyy HH:mm:ss");
LocalTime hora = LocalTime.of(10,05,26);
LocalDate fache = localDate.now();

LocalDateTime fechaYHora = LocalDateTime.of(fecha, hora);
System.out.println.format(fechaYHora);    // 18/11/2021 10:05:26
```

---

## JUnit

El testing unitario implica probar unidades de código o componentes. El propósito del testing unitario es validar que cada pieza de código se comporta de la forma esperada.

Existen varios niveles de testing: **Unitario**, **Integración**, **Aceptación**, **Performance**, etc. El testing unitario es el de más bajo nivel ya que implica testear componentes de código.

El testing unitario nos permite encontrar errores en fases tempranas dl desarrollo del software-

El testing unitario puede set automático o manual. **jUnit** es un framework open-source para la automatización de pruebas, tanto unitarias como de integración.


JUnit nos permite realizar pruebas unitarias de manera automatizada.

Por ejemplo: podemos probar si nuestro DateTimeFormatter está foramteando la fecha correctamente

Se utilizan los **asserts** para chequear los resultados de los casos de prueba.


Ejemplo en pseudo-codigo:

```Java
class DateTimeFormatterTestCase {
  @Test
  void test() {
    //metodo para inicializar las variables
    //puedo tener la lógica
    assertEquals("valor esperado", "valor obtenido");
  }
}
```

Tengo que tener un paquete llamado **test**


Ejemplo en codigo:

```Java
class dateTimeFormatterTestClass {
  private DatetimeFormatter dtf;
  
  @BeforeEach
  void setUp() throws Exception {
    dft = DateTimeFormatter
             .ofPattern("dd/MM/yyyy HH:mm:ss");   
  }
  @Test
  void testDTFConbarras() {
     //creo las variables para la fecha y hora
     LocalDate myDate = LocalDate.of(2021, 10, 10);
     LocalTime myTime = LocalTime.of(10, 10);
    
     LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);
    
     assertEquals.("10/10/2021 10:10:00", dtf(myDateTime));
  }
}
```


Hay distintos assert, además de **assertEquals** hay **assertTrue**.

---
