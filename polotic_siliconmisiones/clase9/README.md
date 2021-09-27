# Clase 9 : 15 SEPTIEMBRE


---

:computer: [Video en YouTube de TodoCode](https://www.youtube.com/watch?v=tyyhIsDmVM0&list=PLQxX2eiEaqbwcW3dkmUqJq7B-SXHyCglf&index=5)

## FOREING y PRIMARY Key

-Representamos las relaciones del ejemplo de la tienda en la base de datos

Las **Primary Keys -PK - (Claves Primarias)** son valores que identifican de *manera única* a cada fila o registro de una tabla, esto quiere decir que **no se pueden repetir**.

Algunos ejemplos: DNI, un código de un producto (como un código de barras).

Cuando pasemos a Java el campo **id** (la columna que va a ser la PK) de la tabla va a coincidir con un **atributo** de mi clase (que va a tener el mismo nombre que la tabla).


Las **Foreing Keys -FK - (Claves Foráneas)** es un campo de una tabla 'X' que sirve para enlazar o relacionar entre sí co otra tabla 'Y' en la cual el campo de esta tabla es una **llave primaria**. Para que sea una **clave foránea**, esta tiene que ser una *llave primaria en otra tabla*. 

Un ejemplo: en la tabla *clientes* el *dni* es una PRIMARY KEY, pero en una tabla *pedidos* representa a quienes pertenece ese determinado pedido.


-Cuando **hay una relación** la **FK** va solo de **un lado**.

## Ejemplo práctico

**Base de datos** -> **ejercicioelectro**

**Tablas** -> **clientes**, **pedidos**, **productos**

### Tabla clientes

| dni | nombre | apellido | telefono | fecha_nac |
| --- | ------ | -------- | -------- | ----------|
| INT(11) | VARCHAR (40) | VARCHAR (40) | VRCHAR (12) | DATE |

Voy a agregar la **PK**

``` Agregar     1 columna      al comienzo de la tabla    continuar```

Y le doy el nombre de *num_cliente* y de tipo *INT*

Entonces la tabla me queda:

| num_cliente | dni | nombre | apellido | telefono | fecha_nac |
| ----------- | --- | ------ | -------- | -------- | ----------|
| INT | INT(11) | VARCHAR (40) | VARCHAR (40) | VRCHAR (12) | DATE |


La **PK** va a ser *num_cliente* porque no se va a repetir, es único por cada cliente.

Para que sea mi PK, tengo que ir a la estructura de la tabla, seleccionar el renglon de num_cliente y hacer click en el icono de la llave.

Ahora si voy a ver la llave en num_cliente


### Tabla pedidos

| numero | fecha |
| ------ | ----- |
| INT | DATE |

Mi **PK** va a ser *numero* que no se repite, es único.

Entonces voy a la estructura de la tabla, marco el renglon de numero y le doy click en la llave para que sea mi PK

En esta tabla voy a necesitar mi **FK** que se debe llamar *num_cliente* para poder relacionar las talbas, por lo que vuelvo a la estructura y le ```agrego 1 columna después de fecha``` -> continuar

Debe tener el mismo nombre *num_cliente* y ser dle mismo tipo de dato (*INT*) que el campo d ela PK de mi tabla clientes.

Como aca estamos parados del lado de la N de la relación, en este cso voy a **vista de relaciones** para decirle de que manera este *num_cliente* se va a relacionar con el *num_cliente* de la tabla de clientes.

-Debo ponerle un nombre a la relación -> ``` num_cliente```  (para acordarme fácil le pongo el mimo nombre que el campo)

-Elijo que columna de la tabla es la que se va a relacionar, la base de datos y con qué tabla

``` 
columna -  num_cliente
base de datos - ejercicioalectrodomestico
tabla - clientes
columna - num_cliente
```

Si vuelvo a la estructura de la tabla voy a ver que *num_cliente* tiene la llave gris clara, que indica esla FK.


-Para ver la relación, voy a ir a la *tabla clientes* -> *insertar* -> ingreso un cliente

Para la fecha debo ingresar yyyy-mm-dd  ( años - mes - dia), por ejemplo 1984-09-01

-Voy a ir a la *tabla pedidos* -> *insertar* -> ingreso un pedido

En este cao, cuando estoy completando el pedido, voy a ver en *num_cliente* que voy a tener un *drop down* y veo el cliente que recién ingresé. De este modo veo que se relacionan.

-Si veo la tabla de pedidos ya lo veo ingresado, y si hago click en el número que veo en *num_cliente* me va a llevar a al tabla clientes a los datos de mi cliente agregado.

### Tabla productos

---
