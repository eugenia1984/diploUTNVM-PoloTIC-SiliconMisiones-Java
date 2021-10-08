# Clase 21 : 05 Octubre

---

## Diagrama de secuencia

**Clasificación**:

-de comportamiento

-dinámico

-lógico

**Uso**:

-validar y describir la lógica de un escenario

-explorar el diseño controlando la invocación de las operaciones definidas en las clases.

-detectar cuellos de botella en un diseño orientado a objetos

-analizar qué clases son complejas en el sistema, a las cuales hay que prestarle más atneción, porque llevan más logica.

**Diagrama de secuencia que enfatiza el orden de los mensajes en función del tiempo. Muestra un conjunto de objetos y los mensajes enviados y recibidos por esos objetos.**

**Contiene comúnmente**:

-objetos

-links

-mensajes


*Me muestra la relación de comportamiento entre OBJETOS, no se hace para todo, para las funcionalidades que necesitamso que estén bien claras.


---

## Clases de análisis:

**Clases de entidad**: modela información que podría mantenerse por muhco tiempo y podria sobrevivir a una ejecución de un sistema.

**Clases de interfaz**: modela el comportamiento e información que es dependiente de la frontera del sistema con el ambiente. Modela todo lo que concierne a cualqueir vínculo entre el sistema y los actores. -> es mi PANTALLA

**Clases de control**: modela funcionalidad que implica operar sobre varios objetos diferentes de entidad, haciendo algunos cálculos y retornando el resultado al objeto de interface. Tiene responsabilidades de COORDINACIÓN de la ejecución de un caso de uso y funciona como intermediario entre las CLASES DE INTERFAZ y las de CONTROL.

No se recomienda tneer más de una clase de control, proque sino tengo que ver como se comunican entre ellos, y cuál tiene más predominancia. Si puedo tner más de una interfaz.

---

## Elementos que intervienen

```
                           mensaje sinronico                  LineaDeVida        Mensaje de
                                                                    |            creacion de Objetos
                      Administrador     :InterfazCurso       GestorCurso             |
                            De                  |                   |                |   Objeto que es
                          Cursos                |                   |                |   creado en ese momento
                            |                   |                   |                |   |       
AdministradorDeCursos       |                   |                   |                |   |
selecciona la opcion        |-------------------|-------------------|-------------| Curso
"Registrar Curso"             agregarCurso(uml)    agregarCurso(uml)    new()
                                                                      <<create>>
Sistema: crea el curso
     |
     |
Nota que puede venir
de un texto, como un
CU, que describe
el flujo de
comportamiento
```

**interfazCurso** es el objeto de tipo interfaz que se llama curso

**Curso** es mi clase entidad

**actor** -> AdminiatradorDeCursos, quien va a disparar el evento

En el momento que empiezo a utilizar un objeto arranca una línea de vida

Los ```|-------|``` son mi **foco de control**, me muestra como va pasando el control

**mensaje sincrónico** el adminsitrador hace click en Agregar Curso y se queda esperando una respuesta

Los mensajes y la comunicación se representa con uan flecha con la punta con un triangulo negro. Tambien hay otra flecha con lineas punteadas para aclarar que en ese momento se crea un objeto dela clase entidad.

Hay **notas** para hacer observaciones y para aclarar.

Para ver el diagrama click aca](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/utnvillamaria/clase21/secuancia%20de%20caso%20de%20uso.pdf")

---
