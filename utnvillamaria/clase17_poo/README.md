# Clase 17 : POO

## Modelos y la importancia de modelar

Es el paso ANTERIOR a PROGRAMAR

Siempre se **trabaja en equipo** y el porcentaje de éxito depende de la buena comunicación entre todos, para ponernos de acuerdo en: ¿ qué vamos a hacer? ¿ Cómo lo vamos a hacer?

### ¿ Qué e sun modelo?

Es una SIMPLIFICACIÓN de la realidad, y el equipo define que tan detalaldo, o acercado a la realidad necesitan para el proyecto. Mientras más detallado el modelo, se dejan libradas al azar menos cosas, y se pueden llegar a tener menos problemas por falta de comunicación

### ¿ Por qué modelamos ?

-Para visualizar en sistema: cómo es? o cómo queremos qué sea?

-Para especificar la estructura o el comportamiento de un sistema.

-Nos dan una plantilla que nos guía en la construcción del sistema.

-Documentan las decisiones que hemos tomado. Nadie quiere documentar, ni el programador, ni el analista, ni el equipo. Pero es importante, hay que tenrla acualizada, y nos ayuda a tomar decisiones en un momento determinado. Ya que durante el proceso los requerimientos pueden ir modificándose , empezamos a planificar una cosa y al final termianmos con algo disntitno, ya que cambian leyes, sistemas, las necesidades. Y a medida que el equipo crece la comunicación es fundamental. Y la documentación nos aclara qué hay que hacer.

### La importancia de modelar

Modelamos para comprender mejor el sistema que estamos desarrollando.

Por medio del modelado conseguimos cuatro objetivos:

1-Los modelos nos ayudan a visualizar cómo es o queremos que sea un sistema.

2-Los modelos nos permiten especificar la estructura o el comportamiento de un sistema.

3-Los modelos proporcionan plantillas que nos guían en la construcción de un sistema.

4-Los modelos documentan las decisiones que hemos adoptado


## ¿ Qué es un UML ?

Es un **lenguaje de modelado** de **propósito general** usado para la **visualización**, **especificacion**, **construcción** y **documentación** de Sistemas Orientados a Objetos.

No es un lenguaje de programación.

Es el lenguaje con el que nos vamos a comunicar en el equipo y con el exterior de nuestro equipo de desarrollo.

### ¿ Por qué UML es un lenguaje ?

-Provee un vocabulario y reglas para combinar los elementos del vocabulario con el propósito de comunica.

-Es un lenguaje de modelado, esos vocabularios y reglas se focalizan en representaciones conceptuales y físicas de un sistema.

### Hay tres grandes tipos de modelos:

1) **Bloques de construcción**: que tienen:

**Elementos**: estructurales, cmportamentales, de agrupación, de anotación

**Relaciones**: dependencias, asociación, agregación, composición, contención, generalización, realización

**Diagramas**: clase, estructura compuesta, objeto, paquete, despliegue, componente, cosas de uso, comunicación, secuencia, descr. de interac., de actividad, DTE, timming

2) **Mecanismos comunes**: que tienen:

**especificaciones**

**adornos**

**divisiones comunes**: clasificación e instancia, interfaz e implementación.

**mecanismos de extensibiliad**: estereotipos, restricciones, valores rotulados

3) **Arquitectura**: que tiene:

**vista de casos de uso**

**vista de implementación**

**vista de despliegue**

**vista de diseño**

**visata de proceso**


Algunos diagramas:

```
Diagramas de UML
  |
  |
  |------Estructura ---------------------------------------------------
  |        |                   |                |                     |  
  |        |              De clases      De componentes     De estructura compuesta
  |        |                   |                |                     | 
  |        |-------------------|----------------|---------------------|
  |                            |                |                     |
  |                      De paquetes      De despliegue        De objetos
  |                            |                |                     |
  |----Comportamiento----De actividad------De casos de Uso--------De estados
              |
              |
         Interacción-----------------------------------------------------------------------------
                           |                  |               |                                 |
                     De Secuencia    De Comunicación    De Descripción de Interacción    De Timming

```

## El diagrama que más se utiliza es el DIAGRAMA DE CLASES

**Clasificación**: 

-de estructura

-estático

-lógico

**uso**:

-explorar conceptos del dominio

-analizar requerimientos

-mostrar el diseño detalaldo d software oritnado a objetos

**muestra un conjuntos de clases, interfaces y colaboraciones y sus relaciones**

**contiene comunmente**:

-clases: de **entidad**, de**interfaz**, de**control**
  
-relaciones de sociación (qgregación / composición), generalización, dependencia (traza , realización) y/o anidado


Siempre recordar cómo llamar las clases, los métodos, que representen bein lo que van a hacer o crear, asi al ver el diagrama es claro.

---

## Diagrama de Clases


| NombreDeLaClase |
| --------------- |
| atributos(private) |
| metodos(publicos) |

En un ejemplo:

| Alumno |
| --------------- |
| -legajo |
| -nombre |
| -domicilio |
| +crear() |
| +mostrar(nombre) |
| +borrar() |

---

## Relación de ASOCIACION

Relación estructural qeu especifica que **los objetos de un elemento se conectan a los objetos de otro**

```
     asociación---        ---multiplicidad
                  |      |
                  |      |
                  |      1
 | Gasto | -----------------> | TipoDeGasto |  
                          |
                          |
         navegabilidad ----      
```

**Gasto** y **TipoDeGasto** son dos clases en esta relación veo la asociación con:

-------->

La flecha em da la navegabilidad que se relaciona con qué

La multiplicadad me da al relación de con cuántos se asocian: 1 a 1

Pero ojo que esto no es un DER(que tiene más que ver con al base de datos), acá veo la estructura de mis clases.

## Relación de AGREGACIÓN

Es un tipo especial de asociación, que representa un relación completamente conceptual entre un **todo** y sus **partes**

```
todo-------                    --------parte
          |                    |
          |                  1...*
     | Factura |-<>---------> | DetalleFactura |
                    |
                    |
 agregación----------                   
```
El <> va vacío

## Relación de COMPOSICIÓN

Es una variación de la agregación simple, con una fuerte relación de pertenencia y vidas coincidentes de la parte con el todo

```
  todo                             parte
    |                                 |
 | estanteria |----<>------------> | Estante |
                  |
    composición---- 
                 
```

El <> va pintado

---

## Relaciones de GENERALIZACIÓN

Es una relación entre un elemento general (puperclase o padre) y un tipo más específico de ese elemento (subclase o hijo).

El hijo puede añadir nueva estructura y comportamiento, o modificar el comportamiento del padre.


```
    |ElementfoConInterés|   |ElementoAsegurable|
                    ^         ^
                    |         |                herencia multiple
                  |CuentaBancaria|
                   ^             ^
                   |             |               herencia simple
          |CuentaCorriente|   |CuentaDeAhorro|      
                      
```

No es recomendable hacer un diagrama con **herencia múltiple** porque Java no lo tiene, lo mejor es mostrar las interfaces, ya que una clase puede implementar más de una Interfaz y de esta forma podemos simular la herencia multiple

---

## Relaciones de DEPENDENCIA

Es una sociación de uso, la cual especifica que un cambio en la especificaciñon de un elemento puede afectar a otro elemento que lo utiliza, pero no necesariamente a la inversa.

esto es aconsejable NO utilizar

```
| Persona                         |
|---------------------------------|
| -nombre                         |           | InformacionDeContacto |
| -legajo                         |           |-----------------------|
| -cargo                          |---------> | -direccion            |       |---------------------------------|
| +obtenerInforamcionDeContacto() |
```

-----> es la dependencia que es de **corto plazo**, solo existe cuando tengo una llamada a un método

---

## Diagrama de Clases: Visibilidad

| Visibilidad | Símbolo  | Accesible a : |
| ----------- | -------- | ------------- |
| Pública | + | Todos los objetos del sistema |
| Protegida | # | Instancias de la clase de sus subclases |
| Privada | - | Instancias de la clase |
| Paquete | ~  | Instancias de la clase del mismo paquete |

---
