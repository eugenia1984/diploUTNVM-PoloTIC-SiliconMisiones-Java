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

**Atributos** definen o identifican las características propias y por lo general únicas de una entidad.

Cada entidad contiene distintos atributos, que dan información sobre ella misma.

Estos atributos pueden ser de distintos tipos (numéricos, texto, fecha, etc), y se representan por medio de un óvalo o elipse.

Un ejemplo:

Entidad -> Alumnos

Atributos -> DNI / Nombre / Apellido / Fecha Nac.

**Relaciones** tienen una característica conocida como *cardinalidad*, la cual indica el sentido y la cantidad de *relaciones* existentes entre una entidad y otra. 

Al ser DER se debe poder leer de los dos lados, y de ambos deben tener sentido.

Estas pueden ser:

**1 a n (1 a muchos)** : por ejemplo una persona puede tener **n** autos y viceversa, muchos autos pueden ser de una persona.

Persona--1----------Tiene------------n--Autos

**1 a 1**: por ejemplo a **un** alumno le pertenece únicamente **una** libreta y viceversa, **una** librta pertenece çunicamente a **un** alumno.

Alumno --1--------Tiene-----------------1--Libreta

**N a n (muchos a muchos)**: por ejemplo, **muchos** alumnos pueden tener **muchas** materias y viceversa, **muchas** materias pueden contener a **muchos** alumnos.

Alumno--n---------Tiene----------n--Materias

---

## Ejemplo práctico

Supongamos que una empresa de venta de electrodomésticos tiene:

-Clientes

-Pedidos

-Productos

Se desea modelar a través de DER, la forma en que se implementaría una Base de Datos


1) Detercamos las entidades, como sabemos eran 3:

 * Clientes
 * Pedidos
 * Productos

2) Detectamos qué atributos tienen cada uno de ellos:

 * Clientes: dni, nombre, apellido, telefono, fecNac
 * pedidos: nro, fecha
 * productos: codigo, nombre, precio, cantidad

3) Pienso las relaciones que van a tener

```
Clientes--1------tiene-------n--Pedidos--1-------tiene-------n--Productos
    |                               |                              |
  dni                              nro                           codigo
  nombre                           fecha                         nombre
  apellido                                                       precio
  telefono                                                      cantidad
  fechaNac
```

```
Pedidos--n-------tiene-------n--Productos
```

Porque si el produto esta en un solo pedido, sería que solo tengo una heladera la vendo y me quedo sin stock, pero tengo muchas heladeras para varios pedidos

4) Paso del DER a una tabla para una Base de Datos

Mi entidad es el nombre de la tabla y el atributo va a ser el nombre de cada columna de la tabla

| Clientes |
| -------- |
| DNI / Nombre / Apellido / FechaNac / Tel |

| Pedidos |
| ------- |
| Nro / fecha |

| Productos |
| --------- |
| Código / Nombre / Precio / Cantidad |

5) Tengo que establecer qué tipo de datos van a tener

---

## ¿ Cómo crear una Base de Datos?

-Si instalé **XAMPP** se abre y se debe tenr en verde **MySQL** y **Apache** (para poder acceder a la interfaz gráfica localhost:phpmyadmin).

En **MySQL** a la derecha de **Stop** tengo **Admin** le hago click y me va a abrir [http://localhost/phpmyadmin/](http://localhost/phpmyadmin/)

Del lado izquierdo en donde tengo **phpMyAdmin** y los iconos veo: **Nueva** si le doy click hago mi nueva base de datos.

A la derecha veo:

```Bases de datos```

```+Crear base de datos```

```(aca completo con el NOMBRE de la base de datos) (en la codificacion poner utf8-spanish_ci) (Crear)```

Si en la codificación pongo utf8-spaish2-ci voy a notar que es case sensitive y me va a hacer diferencia entre las mayúsculas y la minúsculas. Por eso es mejor poner **utf8-spanish_ci**

Entonces ya tengo creada mi **Base de Datos**  con el nombre de **tienda**.

Si yo tengo mi **entidad Clientes** debo crear la **tabla Clientes** con **5** columnas

```+Crear tabla```

```(nombre) Numero de columnas: (nro)```

Ahora tengo que completar de cada atributo:

 * Nombre : siempre todo en minúscula, sin espacios, puedo separar palabras con guión bajo(_)
 
 * Tipo: **varchar**(es el String en Java, el **DNI** y el **numero de telefono** van como varchar, porque ambos usan numeros, pero no los voy a usar en ningún cálculo matemático, además el númeor de teléfono así puede tener guiones), **date** (para las fechas), **int** para enteros, **double** para un decimal.
 
 * Lontitud/valores
 
 * Predeterminado
 
 * Cotejamiento
 
 * Atributos
 
 * Nulo
 
 * Índice
 
 * Autoincremental
 
 * Comentarios
 
 Y en **Motor de almacenamiento** debo tener seleccionado **InnoDB**, hay que ver porque acorde a la versión del XAMPP no se ven opciones a futuro.
 
 Me están faltando las **relaciones entre las bases de datos** con las **Foreing Key** y las **Primary keys** que se va a ver en la próxima clase.
 
-Tengo mi Base de Datos **Tienda**

-Mis tablas creadas van a ser:
 
| Clientes |
| -------- |
| dni(VARCHAR (15)) / nombre(VARCHAR (40)) / apellido(VARCHAR (40)) / fecha_nac(DATE) / tel(VARCHAR (15)) |

| Pedidos |
| ------- |
| nro(INT) / fecha(DATE) |

| Productos |
| --------- |
| codigo(VARCHAR (12)) / nombre(VARCHAR (50)) / precio(DOUBLE) / cantidad(INT) |
 
 ---

## :computer: Ejercicio práctico de base de datos para practicar

Suponemos un escenario de una **veterinaria** con **pacientes** (las mascotas), **tratamientos** (vacunacion, operacion, etc) y **profesionales** (los veterinarios).

Pensar que atributos pueden tener cada uno.

Lo que pensé:

| Pacientes |
| --------- |
| id(INT (PK) NOTNULL AUTOINCREMEN) / nombre(VARCHAR (40)) / dueño(VARCHAR (40)) / telefono(VARCHAR (15)) / e_mail(VARCHAR(50)) / direccion(VARCHAR (50)) / alergias / vacuna_antirrabica / castrado |

| Tratamientos |
| ------------ |
| profesional(id) / paciente(id) / tipo_de_tratameinto(VARCHAR(40)) |

| Profesionales |
| ------------- |
| nombre(varchar (40)) / paciente(id) |

---

:computer: [**lista en YouTube de TodoCode de base de Datos](https://www.youtube.com/playlist?list=PLQxX2eiEaqbwcW3dkmUqJq7B-SXHyCglf)


---
