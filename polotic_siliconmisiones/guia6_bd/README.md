# Guía de Ejercicios Nº 6: Bases de Datos y Consultas SQL

## Ejercicio 1

Una empresa desea una base de datos para gestionar los departamentos en los cuales se encuentra cada uno de sus empleados. 

Para ello necesita la creación de dos tablas:

• Empleados que debe contener los datos: Nº de legajo, dni, apellido, nombre, fecha de nacimiento, fecha de incorporación, cargo, sueldo neto.

• Departamentos que debe contener los datos: ID departamento, nombre departamento, dirección departamento.

✓ Se solicita crear una nueva base de datos llamada “emple_dep”, a partir de ella, realizar el Diagrama Entidad Relación (DER) para el presente escenario. 

Asignar al mismo tiempo las relaciones existentes entre ambas tablas y responder a las siguientes preguntas:

a. ¿Cuál es la primary key para la tabla empleados? Justificar respuesta

b. ¿Cuál es la primary key para la tabla departamentos? Justificar respuesta

c. ¿Qué relación/es existiría/n entre las tablas? ¿En qué tabla debería haber foreign key? 
¿A qué campo de qué tabla hace referencia dicha foreign key? 
Justificar respuesta

✓ Una vez realizado el planteo del diagrama y de haber respondido estas preguntas, ingresar a PHPMyAdmin e incorporar 5 registros en la tabla departamentos 
y 15 en la tabla empleados. Realizar las asociaciones/relaciones correspondientes.

---

## Ejercicio 2 : Consultas SQL

A partir del escenario planteado en el Ejercicio Nº 1, realizar las siguientes consultas mediante SQL:

a. Obtener la lista completa de todos los empleados.

b. Obtener la lista completa de todos los departamentos.

c. Obtener los empleados que tengan el cargo “secretario”.

d. Obtener una lista de los nombres y sueldos de cada uno de los empleados.

e. Obtener los datos de los empleados que tengan el cargo de “vendedores” y que su sueldo sea mayor a $25.000.

f. Obtener una lista con el nombre, cargo y salario de cada uno de los empleados. 
Ordenar esta lista por salario.

---

## Ejercicio 2 : Modelado de BD y DER
 
Un club de deportes necesita de una base de datos para gestionar el torneo de tenis que realizará. 
Para esto, el encargado del club manifiesta que necesitaría almacenar los datos de los jugadores/participantes, 
las diferentes categorías (con sus respectivos rangos de edad y sexo) y las inscripciones de cada uno de los participantes 
en donde se debe especificar si el mismo abonó o no la inscripción). 

Sugiere como estructura de las tablas lo siguiente:

• Participantes: dni_participante, apellido, nombre, dirección, edad, teléfono, sexo

• Categorías: id_categoria, nombre, edad_min, edad_max, sexo

• Inscripciones: num_inscripcion, fecha_insc, abono_inscrip

El encargado manifestó que las categorías presentes serán:

• Damas A (18 a 34 años)

• Damas B (de 35 a 45 años)

• Damas C (de 46 a 100 años)

• Caballeros A (de 18 a 34 años)

• Caballeros B (de 35 a 50 años)

• Caballeros C (de 51 a 100 años)

• Juveniles Varones (de 13 a 17 años)

• Juveniles Mujeres (de 13 a 17 años)

✓ Se solicita crear una nueva base de datos llamada “torneo_tenis”. 
A partir de ella, realizar el Diagrama Entidad Relación (DER) para el presente escenario.
Determinar al mismo tiempo, las relaciones correspondientes.

✓ Asignar las correspondientes primary keys, foreign keys y tipos de datos.

✓ Una vez realizado el planteo del diagrama y de haber respondido estas preguntas, 
ingresar a PHPMyAdmin e incorporar, además de las categorías mencionadas, 25 participantes 
y las 25 inscripciones de los mismos (tener en cuenta las edades y sexo para las categorías).

---

## Ejercicio 4: Consultas SQL

A partir del escenario planteado en el Ejercicio Nº 2, realizar las siguientes consultas mediante SQL:

a. Obtener la lista completa de todos los participantes.

b. Obtener la lista completa de todas las categorías.

c. Obtener todas las participantes mujeres.

d. Obtener el nombre y apellido de las mujeres inscriptas en la categoría “Damas B”.

e. Obtener los datos de los participantes que tengan una edad entre 25 y 37 años.

f. Obtener la lista completa de inscripciones, especificando nombre y apellido de cada uno de los inscriptos.

---

## Ejercicio 5 (opcional)

A) 

Una biblioteca necesita una base de datos para gestionar los préstamos de libros que realiza diariamente a sus socios. 

Para esto debe registrar a sus socios, los libros que posee actualmente y los préstamos.

Como los encargados de los préstamos no conocen mucho de informática, solicitan una sugerencia de estructura para el almacenamiento de los datos en la nueva base de datos. La bibliotecaria a cargo manifestó que necesitan principalmente conocer el nro de préstamo, qué día se llevó a cabo, los datos de quien lo solicitó, la fecha de devolución del préstamo, qué libro o libros solicitó, qué cantidad de esos libros y si el préstamo posee una multa por demora o no.

Se solicita:

✓ Crear una base de datos que se llame biblioteca.

✓ Establecer la estructura que consideren apropiada para este escenario y llevarla a cabo el correspondiente DER. Establecer primary keys, foreign keys, relaciones, atributos, entidades, etc.

✓ Una vez confeccionado el diagrama, implementarlo en PHPMyAdmin e ingresar una serie de datos.

B) A partir de la estructura armada en el punto a, realizar las siguientes acciones mediante consultas SQL:

✓ Insertar registros en las tablas de la estructura (mínimamente 10 registros por tabla).

✓ Modificar las cantidades existentes de un determinado libro.

✓ Modificar los datos personales de algún socio.

✓ Eliminar un socio que se haya dado de baja. Eliminar de igual manera los préstamos que tenga asociados.

✓ Obtener todos los socios que tengan alguna multa en algún préstamo.

✓ Obtener todos los préstamos que hayan sido posteriores a la fecha 23/11/2018.

---
Obtener todos los libros que tengan una cantidad mayor a 5..


---
