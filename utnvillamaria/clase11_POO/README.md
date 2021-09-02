# Clase 11


## Objetivos

   * Interpretar las especificaciones formales o informales del Lider del Proyecto, tomarnos unos minutos para analizar y si no estamos de acuerdo brindar una alternativa o solucion mejor.
   
   * Analizar el problema a resolver.
   
   * Interpretar el material recibido y clarificar eventuales interpretaciones, simepre preguntar sobre dudas o de lo que no se sabe.
   
   * Determinar el alcance del problema y convalidar su interpretación a fin de identificar aspectos faltantes, es muy importante saber hasta donde llego, no programo ni de menos ni de más.
   
   * Comprender lo específicado observando reglas del lenguaje de POO, como por ejemplo tengo que respetr que en Java todo es un objeto y la comunicación es a través de métodos.
   
   * Comunicarse en un lenguaje preciso y adecuado con los integrantes del equipo de trabajo.


### Prácticas formativas de carácter profesional

Prácticas de resolución de una situación problemática, real o simulada de acuerdo a especifícaciones de diseño, desarrollando aplicaciones que den solución a problemas específicos.

La programación orientada a objetos intenta simular el mundo real a traves del significado de objetos que contiene características y funciones.

Esta basado en la idea de encapsular estado y operaciones en objetos.

En general, la programación se resuelve comunicando dichos objetos a traves de mensajes.

Su principal ventaja es la reutilización de código y su facilidad para pensar soluciones a determinados problemas.

El lenguaje de programación elegido para trabajar es **Java**, que pertenece al paradigma orientado a objetos.


Me va a permitr reutilizar codigo, y viendo los objetos ya me voy a dar una idea de que voy a tener.

También ayuda en la documentación.

## Paradigma

Los paradigmas son poderosas porque crean los cristales o las lentes a través de los cuáles vemos el mundo.

El poder de un cambio de paradigma es el poder de un cambio considerable, ya se trate de un proceso instantáneo o lento y pausado.

-Stephen Covey


Un PARADIGMA tiene:

   * Modelo de reglas y normas
   * Hochos y predicciones limitadas
   * Universal o particularmente aceptado


##   Programación Orientada a Objetos

Hacer una lista de objetos, y saber que caracterisitcas y que comportamientos va a tener.

Fundamentalmente es un cambio cultural, más que tecnológico.

Implica ver al DEsarrollo de software como una actividad de ingeniería, es decir:

   * Dejar de inventar la rueda, reusarla
   * Utilizar componentes
   * Reorganizar el mercado de software

En este contexto se entiende por orientación a objetos a un paradigma de programación que facilita la creación de **software de calidad**, debido a sus características específicas que potencian el **mentanimiento**, la **extensión** y la **reutlización** del software generado.

software de calidad -> facilidad en la documentacion, buenos habitos de como nombrar las cosas, poder reutilizarlo

## Objetos

Representa un elemento, unidad o entidad indivudual e identificable, ya sea real o abstracta, con un rol bien definido en el dominio del problema.

Debo saber lo que hacer, cómo identificarlo y qué hace??

Propiedades de Objetos:

   * **Estado**: abarca todas las propiedades (normalmente estáticas) del mismo más los valores actuales (normalmente dinámicos) de cada una de esas propiedades. Como una foto instantánea un un momento determinado en la vida de un objeto.
   
   * **Comportamiento** : cómo actúa y reacciona un objeto, en términos de sus cambios de estado y paso de mensajes. Operaciones (Modificador, Selector, Iterador, Constructor, Destructor).
   
   * **Identidad**: propiedad de un bjeto que lo distingue de todos los demás objetos

## Relaciones entre objetos

Hay dos jerarquías de especial interés:

   * ENLACES: conexión física  o conceptual entre objetos. Roles **Actor**, **Servidor** y **Agente**.
   
Como participante de un enlace, un objeto puede desempeñar uno de los tres lores:

- ACTOR: puede operar sobre otros objetos, pidiendo colaboración por medio de sus mensajes, pero nunca otros objetos operan sobre el, a veces, activo y actor son equivalentes.

- SERVIDOR: un objeto que nunca opera sobre otros, solo otros objetos operan sobre el.

- AGENTE: un objeto puede operar sobre otros objetos, y además otros objetos operan sobre el. Un agente se crea normalmente para reutilizar algún trabajo en nombre de un actor u otro agente. 
   
   
   * AGREGACION: denota una jerarquñia todo/parte, con la capacidad de ir desde el todo (agregando) hasta las partes; desde el todo hasta las partes, por ejemplo un colegio está formado por aulas
   
## Clases

una **clase** es un conjunto de objetos que comparten una estructura común y un comportamiento común.

Se diseñan clases y cuando se ejecuta el programa se crean los objetos.

Por ejemplo, si quiero fabricar una silla, debo tener un **molde** , ese molde es mi clase y la silla es el objeto que se instancia (crea) a traves de ese molde.

Lo que se hace es programar esos moldes, esas clases, desde la cual voy a crear objetos.

Los objetos se van a ir guardando en bases de datos: lista de clientes, listas de pedidos.

La clase en realidad como objeto no existe, es el molde del cual se van a tener los objetos.

En un programa voy a diseñar mi clase Clientes y luego voy a tener la lista de clientes. Vamos a saber cómo se llama, que hace pero desde afuera no se va a poder ver el cómo lo hace.


**Abstracción**: la acción de separar propiedades, en informática es muy utilizada como mecanismo de simplificación de realidad. Se separan características esenciales de las que no lo son tanto. Se separa el QUE ebe hacerse del COMO se hara.

La interfaz de una  clase puede ser:

- PUBLICA (**PUBLIC**): una declaración es accesible a todos.

- PROTEGICA (**PROTECTED**) : accesible a la propia clase, sus subclases y clases amigas

- PRIVADA (**PRIVATE**): solo a la propia clase

## Relaciones entre clases

En total existen 3 tipos básicos de relaciones entre clases:

- **GENERALIZACION / ESPECIFICACION** denota un tipo de relación "en un" o mejor aún "se comporta como"

- **TODO / PARTE** denota una relación " parte de"

- **ASOCIACION** que denota alguna dependencia semántica entre clases de otro modo indipendientes, muchas veces referenciada como hermano-hermano.


La mayoría de los lenguajes de Programación Orientada a Objetos ofrecen soporte directo para alguna combinación de las siguientes relaciones:

   * Asociación
   
   * Herencia
   
   * Agregación


## Ventajas del paradigma de POO

   * Es una forma más natural de modelar problemas
   
   * Permite manejar mejor la complejidad
   
   * Facilita el mantenimiento y extensión de los sistemas
   
   * Es más adecuado para la construcción del entorno GUI
   
   * Fomente el reuso, con gran impacto sobre la productividad y la confiabilidad.
   
   
---

## Ejemplo de clases y objetos

Una **clase** es la definición de un tipo de **objeto**.

Esta definición explica cuáles métodos y atributos tiene un **objeto** de esta **clase**.

Por lo tanto es una realización o instancia de una **clase**

La cuperclase tiene que ver con la herencia.

Voy a tener Acelerar() en Vehiculo y lo van a heredar mis clases: Taxi, Autobus, Tranvía.

No voy a tener objetos Vehiculo, sino objetos de las clases hijas: Taxi, Autobús, Tranvía.

Programo clases para en tiempo de ejecucion crear objetos.

```
SUPERCLASES       CLASES      OBJETOS
                    
                              Taxi matricula ABC7895
                   Taxi       Taxi matricula AFO8756
                              Taxi matricula BSLE8571
  
  Vehiculo         Autobús


                   Tranvía
```


Otra forma de entenderlo:

Cortador de galletitas -> CLASE

Galletitas -> OBJETOS

---
