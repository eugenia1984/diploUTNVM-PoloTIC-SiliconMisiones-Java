# Clase 10 : 20 Septiembre


## Repaso arquitectura cliente - servidor

-Es un **modelo** de **aplicación distribuida** en el que las tareas se reparten entre los proveedores de recursos o servicios, llamados **servidores** y los demandantes, llamados **clientes**

-Un *cliente* realiza peticiones a otro programa

-El *servidor* es quien le da respuesta

Actualmente al estar trabajando en **base de datos** se ofrece un servicio de **información** de **alojamiento de datos**, ese server que levanta XAMPP me permite hacer consultas.

phpMyAdmin es la interfaz gráfica de la base de datos

---

## Cliente Servidor en Bases de Datos


-Las bases de datos en general utilizan la arquitectura cliente-servidor para proveer servicios de alacenamiento de información a determinados usuarios (clientes)


```
  Servidor                              Cliente
            <-----solicitud---------
            --------respuesta------>
           
|----------------------red-------------------------|         
```

---

## ¿ Cómo un cliente se conecta a un servidor de Base de Datos?

-El software intermediario entre un usuario y el servidor que provee el servicio de almacenamiento en bases de datos es conocido como **SGDB** (*Sistema Gestor de Bases de datos*)

-A través de los SGBD los usuarios pueden hacer **consultas** en **lenguaje SQL (Lenguaje para Bases de Datos)** para así realizar operaciones (conocidas como **ABML**) que pueden ser:

**A**: ALTA

**B**: BAJA

**M**: MODIFICACION

**L**: LECTURA

En inglés es **CRUD** (create, delete, update, delete)


```
                       Access
Base                   MySQL
 de     <--------->    Oracle    <--------->   usuarios
datos                 SQLServer
```



---

## Consultas SQL (structure query language / lenguaje estructurado de consulta)

-Las consultas SQL son *dialogos* o *preguntas* que se generan entre el usuario y el sistema gestor de bases de datos donde se encuentran almacenados ciertos datos.

-Existen diferentes sentencias de ñas consultas SQL. Las más conocidas son:

#### De lectura :
  
-**SELECT**: sentancia utilizada para especificar a qué atributo (dato) se pretende acceder.

-**FROM**: es utilizda en conjunto co el SELECT para especificar desde qué tabla (entidad) se pretende leer el dato.

-**WHERE**: sentencia para proponer la condición específica que debe cumplir el dato que se pretende traer (no es una sentencia obligatoria)

Un ejemplo:

``` SELECT * FROM producto WHERE id_producto = 35```

*producto* -> nombre de mi tabla

*WHERE id = 35* -> es mi condición, quiero ver el id_producto que tenga como valor 35 

Otro ejemplo, supongo que tengo uan tabla de empleados y quiero ver los empleados que hayan nacido después de 1970 incluído.

```
SELECT nombre, apellido, fecha_nacimiento
FROM empleado
WHERE empleado.fecha_nacimiento >= '01-01-1970'
```

Como estoy trabajando con una misma tabla, no es necesario poner empleado.fecha_nacimiento, puedo solo poner fecha_nacimiento ya que solo tengo la tabla empleado, en cambio si estoy trabajando con más de una tabla, en este caso sí tengo que aclarar con qué tabla.

Si al poner la fecha no lo tengo entre comillas simples, el lenguaje cree que es una RESTA, SIEMPRE PONER ENTRE COMILLAS

Si tengo muchos campos y quiero verlos todos -> hago un SELECT ALL -> ```SELECT *```


#### De escritura:
  
-**INSERT INTO**: es utilizada para especificar en qué tabla se pretende insertar un dato.

-**VALUES**: se utilizan en conjunto con INSERT INTO para especificr qué valores irán de la tabla

```
INSERT INTO 'empleados' ('id_empleado', 'nombre', 'apellido', 'fecha_nacimiento') 
VALUES (NULL, 'Guillermo, 'Gomez', '1980-09-01')
```

-**Los datos deben estar en el mismo orden en que tengo mis columnas, si pongo menos columnas o invierto el orde entonces debo indicar los nombres como el primer ejemplo, sino los omito como el ejemplo de abajo**(*) 

-**NULL significa que no existe**, porque en este caso yo no puse nada en id_empleado, pero porque en este caso no puse que sea autoincremental


Otro modo (*) :

```
INSERT INTO 'empleados' 
VALUES (NULL, 'Guillermo, 'Gomez', '1980-09-01')
```



#### De modificación:

-**UPDATE**: es utilizado para especificar en qué tabla se pretende modificar un dato.

-**SET**: se utiliza en conjunto con UPDATE para especificar cuál será el nuevo valor/dato.

-**WHERE**: sentencia para proponer la condición específica que debe cumplir el dato de referencia del registro que se pretende modificar (no es una sentencia obligatoria pero si es **recomendada**). Si NO pongo where se me va a actualizar en todos los registros no en el que quiero actualizar.

*set* -> *setear* / poner / establecer

En ejemplo, si quiero editar el nmbre que ingrese

```
UPDATE empleados
SET apellido = 'Gimenez'
WHERE id_empleado = 4
```

Si no ponía el where me actualiza el apellido Gomez a todos los registros


#### De baja

-**DELETE FROM**: es utilizado para eliminar de una tabla de forma permanente. Me borra todo un registro completo, no solo un campo, me borra todo el empleado

-**WHERE**: sentencia para proponer la condición específica que debe cumplir el dato de referencia del registro que se pretende dar de baja (no es una sentencia obligatoria pero si es **recomendada**). Siempre el WHERE porque sino borro TODO de la tabla


```
DELETE FROM empleados
WHERE id_empleado = 4
```

La condición del WHERE puede ser con cualquiera de los campos, en el ejemplo usamos el id_empleado porque al ser la PK me voy a asegurar que voy a borrar a un único empleado.

Si por ejemplo borraba acorde al apellido, y tenía más de un empleado con el mismo apellido iba a borrar a más de uno.

En alguns sistemas uno puede hacer un COMMIT y podés hacer un ROLLBACK, pero si no lo tengo y no puse el WHERE borre toda la base de datos.


#### De ordenamiento

-**ORDER BY**

Supongamos que tenemos una tabla de empleados y que queremos obtener todos sus elementos y ordenarlos por apellido, entonces:

```
SELECT *
FROM empleados
ORDER BY apellido DES
```

El resultado de esta consulta será traer TODOS los empleados, pero en lugar de estar ordenados por id(identificador) van a estar ordenados por apellido

Nota: El * significa que me traiga TODOS (ALL) los elementos, sin distinción.

-**Va siempre de la mano del SELECT**. Le indico de qué forma los quiero ordenar, le indico la condición por la que yo quiero ordenar. Le puedo indicar de qué forma se ordena: **ASC** (*ascendente*) ó **DES** (*descendente*). Por defecto se ordena en orden ASC

---

:computer: [**Guia práctica 6 de Base de Datos**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/blob/main/polotic_siliconmisiones/clase10/guia_de_ejercicios_6_bases_de_datos_sql.pdf)


#### Primera parte para practicar moelado de Base de Datos y Diagrama de Entidad Relacion (DER)

#### Segunda parte con consultas de SQL

#### Tercera parte Modelado de Base de Datos y DER

#### Cuarta parte consultas SQL que se pueden hacer sin o con subconsultas y joins

#### Quinta parte, ejercicio opcional,  va a ayudar saber de join y de subconsultas

---
