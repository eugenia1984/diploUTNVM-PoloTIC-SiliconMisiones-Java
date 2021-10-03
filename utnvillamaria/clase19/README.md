# Clase 19

## UML : DIAGRAMA DE MÁQUINA DE ESTADOS

En algún momento del proyecto voy a necesitar saber en qué estadoestán mis clases.

Por ejemplo tengo una clase **Pedido** y voy a querer saber si está en estado : entregado, aceptado, cancelado; todos estos estados se relacionan a otros eventos que van pasando que me van a ir modificando el estado (con métodos).

A medida que avanza el proceso del sistema, tengo que plasmar cómo se comporta un objeto dentro de su existencia, asi cuando tengo clases complejas plasmo como se comporta el objeto a lo largo de su vida.

### Clasificación:

-De comportamiento

-Dinámico

-Lógico

### Uso:

-Explorar el comportameinto complejo de una clase, actor, subsistema o componente.

-Modelar sistemas de tiempo real.

### muestra una máquina de estados, cimpuesta por estados, transiciones, eventos y actividades.

### Contiene comúnmente:

-**Estados**: inicial, final, historia de estado, estados compuestos. No todas las clases tienen un estado, y de las que tienen, solo se modela lo más complejo.

-**Transiciones**: elementos que intervienen:

```
evento disparador-------                           -----condición de control
                       |                           |
                       |  derivarAFabricacion      |
                       | [materiaPrima = completa] |
                       | /enviarNotificacion       |
                 GENERADA -------------------> EN FABRICACIÓN
                      |           |                 |
                      |           |                 |
     estado origen-----        acción           estado destino
                      
```

Antes de cambiar de estado tengo que controlar que la materia prima me alcance para fabricar -> cambio el estado.

Por eso se utiliza para objetos que requieren condición de control.


Elementos que intervienen -> **subestados** que una vez que pasa de **Generada**  derive a **en fabricación**, primero va a estar en:

-en corte de caños

-en moldeado

-en pontura

-en secado

Y una vez que sale puede pasar a -> estructura lista -> terminada

O mismo en fabricación puede pasar a -> cancelar fabricación -> cancelada

-**Eventos** 


Otro ejemplo: una sala de cine:

```
                                            actualizar Estado de Sala
  registrar Sala/new()                     [y la sala está disponible]
* -----------------------------> CREADA ------------/habilitar----------------> HABILITADA
                                   |                                             |      ^
                                   |                                             |       | Actualizar Estado de Sala
                          Eliminar |                           Actualizar Estado |       |  /habilitar()
                    Sala/darBaja() |                      de Sala/deshabilitar() |       |
                                   |                                             |       |
                                   |                                             |       |
                                   v                                             v       |
                                 DE BAJA                                     DESHABILITADA  
```

---

# Requerimientos

**Dominio del Problema**

-Requerimientos de negocio: para entender el dominio del problema, no solo lo que el software me resuele a mi

-Requerimientos de usuario

-Requerimiento de Software: tiene que ver con el tipo de desarrollo de software, debo saber que voy a programar.

**Dominio de la Solución**

## Requerimientos Funcionales

-Relacionados con la descripción del comportameinto fundamental de los componentes del software

-Las funciones on específicas en términos de entradas, procesos y salidas.

-Una vista dinámica podria considerar aspectos como el contro, el tiempo de las funciones (de comienzo a fin) y su comportamiento en situaciones excepcionales.

## Funcionales

-Establecen:

  * los objetivos del negocio con respecto a la aplicaicón 
  
  * los servicios que la aplicación debe proporcionarle al negocio

-Determiann la funcionalidad de la aplicación:

  * Qué funciones debe ejecutar la aplicación
  
  
## No - Funcionales o de Calidad

-No están relacionados directamente con el comportamiento de la aplicación

-Restringen el diseño de la aplicación (la solución)

  * establecen las limitaciones para su desarrollo

-Definen la calidad que la aplicación debe tener

-Hay RESTRICCIONES:

  * Técnicas: por ejemplo que mi equipo no sepa el lenguaje con el que debo programar.
  * de negocio
  * de Producto
  
Las RESTRICCIONES DE PRODUCTO pueden ser de:

  * Performance: concurrencia, uso de recursos, tiempo de respuesta
  * Usanilidad
  * Seguridad: lógica, física
  * Confiabilidad
  * Portabilidad
  * Interfaz: hardware, software, comunicación, usuario
 
---

## DIAGRAMAS DE CASOS DE USO

### Clasificaicón:

-de comportamiento

-estático

-lógico

### Uso:

-comunicar el alcance

-proveer descripción de todo o una aprte de los requerimientos de un sistema u organización

### Muestra un conjunto de casos de uso, actores y sus relaciones

### Contine comúnmente:

-casos de uso

-actores

-relaciones de extensión, inclusión, generalización y/o dependencia

-paquetes




### ¿ Qué es un caso de uso ?

Es una descripción de las posibles secuencias de interacción entre el sistema bajo discusión y actores externos, relacionadas al objetivo de un actor particular, al actor principal.

Un caso de uso registra un contrato entre los involucrados del sistema, acerca del comportameinto del sistema en discusión en varias circunstancias, organizadas por los objetivos de los actores seleciconados.

*Me ayuda a ver hasta donde puedo aplicar mi sistema

### Elementos que intervienen en un caso de uso:

-El conjunto de todos los casos de uso, debe cubrir los requerimientos del sistema en su totalidad

-Se pueden definir cosa de uso en diferentes niveles: a nivel de sistema de negocio , a nivel de sistema de software

-Las descripciones de los casos de uso son cruciales para la comprensión del sistema

-propiedades:

  * captura alguna función visible para el usuario
  
  * puede ser grande o pequeño
  
  * debe alcanzar un objetivo específico para el actor

### Elementos que intervienen : actores

-**representan lo que interactúa con el sistema, puede ser un usuario humano u otro sistema o dispositivo de hardware**.

-como simboliza el ambiente del sistema no lo describimos en forma detallada

-Una persona puede ejecutar distintos **roles** en el sistema

-hay **actores principales**: son los que usan el sistema directamente; para queines desarrollamos el sistema

-hay **actores secundarios**: son aquellos de los que el sistema necesita ayuda para poder cumplir con el objetivo del caso de uso.

Están relacionados con los permisos de cada usario en base a lo que va a hacer en el sistem, para lo que debo saber:

¿ Quién o qué inicia eventos con el sistema ?

¿ Quién proveerá, usará o quitará información ?

¿ Quién usará esta funcionalidad ?

¿ Quién está interesado en cierto requerimiento ?

¿ En qué parte de la organización será usado el sistema ?

¿ Quién dará soporte y mantendrá el sistema ?

¿ Cuáles son lso recursos externos del sistema ?

¿ Qué otros sistemas necesitarán interactuar con este sistema ?


## ¿ Cómo encontrar los casos de uso ?

Para cada actor identificado ¿ cuáles son las tareas en las cuales el sistema debería estar involucrado ?

¿ Necesita el actor ser informado acerca de ciertas ocurrencias en el sistema?

¿ Necesita el actor informar acerca de cambios externos, repentinos ?

¿ El sistema brinda al negocio el comportamiento correcto ?

¿ Pueden ejecutarse todos los aspectos por los casos de uso que se han identificado ?

¿ QUé casos de uso soportarán y mantendrán el sistema ?

¿ Qué información debe ser modificada o creada en el sistema?


## Uso del Diagrama de Casos de uso:

-Actores que pertenecen al msio paquete de caso de uso

-Un actor y todos los casos de usos con los que interactúa

-casos de uso que manejan la misma información

-casos de uso usados por el mismo grupo de actores

-casos de uso que pertenecen al mismo paquete de casos de uso

-los casos de usos más importantes. Un diagrama de este tipo que puede servir como un resumen del modelo

-los casos de usos desarrollados junto, en el mismo incremento

-un caso de uso específico y sus relaciones con actores y casso de uso

## ¿ Qué modelan los casos de uso ?

Todos los escenarios posibles. Un ejemplo, de acuerdo a con que usuario me logueo es a lo que voy  a tener acceso en el sistema, solo accede a una parte:


```               |------ VENDEDOR -----> registrar ventas de entradas  <<include>>
                  |
                  |----RESPONSABLE DE---------> registrar peliculas------> <<extends>>
                  |      PROGRAMACION    |                                     |
Iniciar sesion    |                      |                                     v
de trabajo        |                      |------> generar Programación de funciones
   ^              |       
   |              |
   |              |-----CLIENTE------------> registrar Reserva Web  -------->Registrar Reserva
   |              |         WEB                                                         ^
 USUARIO <--------|                                                                     |
                  |                                                                     |
                  |------OPERADOR TELEFONICO --------> registrar reserva telefonica-----|

```


---

## Niveles de detalle en la descripciones de casso de uso

-brevemente descripta

-con resumen básico

-con resumen esencial

-completamente descripta (trazo fino)

---


