# Clase 8 : 13 SEPTIEMBRE

📌MATERIAL ASOCIADO A LA CLASE

✅ [Instalación Xampp Server -Todos los SO-](https://www.youtube.com/watch?v=pwTbAKRiRvA)

✅ [Instalación Wamp Server -Solo Windows-](https://www.youtube.com/watch?v=LV-lXcja_VU)

✅ [Videos introductorios sobre Bases de Datos](https://www.youtube.com/playlist?list=PLQxX2eiEaqbwcW3dkmUqJq7B-SXHyCglf)

✅ [Curso gratuito especializado en Base de Datos](https://todocodeacademy.com/course/introduccion-a-las-bases-de-datos-con-mysql/)

---

## SGBD * Sistemas Gestores de Bases de Datos

  * Una **Base de datos** o conjunto de atos pertenecientes a un mismo contexto y almacenados sistemáticamente para su posterior uso.
  
  * Pueden ser datos cuyo contenido o temática difieren entre sí, pero que poseen **relaciones en común**.
  
  * Por ejemplo: una lista de alumnos no tiene nada que ver con una lista de libros. Pero si un alumno desea retirar los libros de una biblioteca, existe una relación.
  
  * las bases de datos se encuentran en el nivel más bajo dentro de u entorno de un sistema de bases de datos.
  
  * Generalmente se considera como parte *física*, ya que, aunque sea un contenido lógico, se encuentran almacenadas o creadas en un dispositivo físico. Por ejemplo: un servidor.
  
  * Para que un usuario pueda acceder a los datos en una Base de Datos, necesita de un software especial conocido como **SGDB (Sistema Gestor de Base de Datos)**ó **DBMW(Data Base Managment System)**


```
       UsuariosProgramadores
               |
 -----------------------------------------------------------
               |                  Sistema de bases de datos
               |
     Programas de aplicacion/consulta
               |             
               |             
    -------------------------------------------
    |          |               Software DBMS   |
    |          |                               |
    |  Software para procesar                  |
    |   consultas/programas                    |
    |          |                               |
    |          |                               |
    |  Software para acceder a                 |
    |   los datos almacenados                  |
     -------------------------------------------
           /               \
          /                 \
  Definición de           Base de 
  la base de datos         datos
    almacenda            almacenada
    (metadatos)
------------------------------------------------------            
                 
```

 * Dependiendo si la base de datos a tratar es **relacional** o **no relacional** existen diferentes SGBD. Entre ellos se pueden mencionar:

RELACIONALES:

-MySQL

-MariaDB

-PostgresSQL

-Ms. Access

NO RELACIONALES:

-Mongo DB

-Kasandra

En el curso vamos a usar **MySQL**, que es bastante similar a MariaDB, ya que antes eran una msima empresa y luego se pelearon y separaron.

---

## Abstracción y modelado

La **abstracción de datos**, por lo general, significa lograr una forma de representación lógica de las situaciones y objetos del mundo real. Se buscan objetos de la vida real y se lo transforam a una forma de representación a un mundo lógico.

Un **modelo de datos** proporciona los medios necesarios para conseguir una abstracción.


## Modelo relacional

En la terminalogía formal del modelo relacional, una fila recibe el nombre de **tupla**, una cabecera de columna es un **atributo** y el nombre de la tabla una **relación**.

El tipo de dato que describe los valores que pueden aparecer en cada columna está representado por un **dominio** de posibles valores.

Nombre de la relación (nombre de la tabla) : Estudiante

Atributos: Nombre, Dni, edad

| Nombre | Dni | Edad |
|------- | --- | ---- |
| Ana Caceres | 18987536 | 61 |


## Modelo entidad - relación

Es un método para diseñar Bases de Datos que posteriormente serán implementads a través de un SGBD. Este modelo se representa a través de diagramas y está formado por varios elementos.

Este tipo de diagrama utilizado para realizar el modelado Entidad-Relación es de DER(Diagrama de Entidad-Relación)

Es una forma de diseñar Base de Datos


## DER Componentes

**Entidades** representan cosa u objetos (ya sean reales o abstractos). Se representan en los diagramas como rectángulos, por ejemplo: alumnos, libros, empleados, materias, autos. Son sustantivos los que se suelen usar como nombre de la entidad. No hay convensión clara, se suele escribir en MAYUSCULA y en PLURAL, pero en java como luego son clases va en SINGULAR y en camelCase

**Atributos** definen o identifican las características propias y por lo general çunicas de una entidad.

Cada entidad contiene distintos atributos, que dan información sobre ella misma.

Estos atributos pueden ser de distintos tipos (numéricos, texto, fecha, etc), y se representan por medio de un óvalo o elipse.

Un ejemplo:

Entidad -> Alumnos

Atributos -> DNI / Nombre / Apellido / Fecha Nac.

**Relaciones** tienen una característica conocida como *cardinalidad*, la cual indica el sentido y la cantidad de *relaciones* existentes entre una entidad y otra. Estas pueden ser:

**1 a n (1 a muchos)** : por ejemplo una persona puede tener **n** autos y viceversa, muchos autos pueden ser de una persona.

Persona--1----------Tiene------------n--Autos

---
