# Clase 11 : 22 Septiembre

## Funciones agregadas / avanzadas

Se agregan a las sentencias de SQL


### CURRENT DATE (Fecha actual)

Devuelve la fecha actual como un valor en el formato **'YYYY-MM-DD'** ó **YYYYMMDD**

Ejemplo:

```
SELECT CURRENT_DATE();
```

Siempre es la **fecha actual del servidor**, entonces si mi servidor está en otro país voy a tener diferencia de fechas o cambios de horarios. Hay que ver cuando hay cambios e horarios que se atraza o adelanta una hora.


### COUNT (contar)

Retorna la cantidad de valores que contiene un campo específicado.

Como me va a ir sumando y mostrando el total, es recomendable indicar entre los paréntesis un campo que siempre esté.

Ejemplo:

```
SELECT COUNT(dni) FROM clientes;
```

Le podría agregar el WHERE como condición:

```
SELECT COUNT(dni) 
FROM clientes
WHERE localidad= 'Obera';
```


### SUM (sumar)

Retorna la suma de valores que contiene un campo especificado.

Cabe destacar que este campo debe de ser numérico.

Ejemplo:

```
SELECT SUM(sueldo) FROM empleados;
```

Le puedo agregar el WHERE:

```
SELECT SUM(sueldo) 
FROM empleados
WHERE sueldo > 10000;
```


### MIN MAX (minimo maximo)


Son funciones que se utilizan para obtener el mínimo o el máximo en un campo especificado dentro de una tabla.

Generalmente este campo suele ser numérico o date.

Ejemplo:

```
SELECT MAX(sueldo) FROM empleado;
```

```
SELECT MIN(sueldo) FROM empleado;
```

### AVG (average - promedio)

Retorna el promedio entre los valores que contiene un campo especificado.

Cabe destacar que este campo debe ser numérico.

```
SELECT AVG(sueldo) FROM empleado;
```

Les puedo agregar el WHERE:

```
SELECT AVG(sueldo) 
FROM empleado
WHERE sueldo <100000;
```

---

## Ejemplo práctico

Tabla productos

| cod_prod | marca | modelo | precio | stock|
| -------- | ----- | ------ | ------ | ----- |
| 37589657 | Samsung | S7 Edge | 20000 | 15 |
| 654701233 | Samsung | S8 + | 29000 | 20 |
| 548793221 | Xiaomi | Redmi Note 7 | 15000 | 36 |
| 112354879 | Xiaomi | Redmi Mi 8 | 21000 | 12 |
| 002154350 | Iphone | Xi Pro | 20100 | 3 |

Consultas:

-1: Contar la cantidad total de productos de la tabla

```
SELECT COUNT(cod_prod) FROM productos;
```

-2: Sumar el precio de todos los productos

```
SELECT SUM(precio) FROM productos;
```

-3: Calcular la cantidad máxima y mínima en stock para los celulares de la marca Samsung

```
SELECT MAX(stock) 
FROM productos
WHERE marca = 'Samsung';
```

```
SELECT MIN(stock) 
FROM productos
WHERE marca = 'Samsung';
```

-4: Calcula el promedio de precio de los celulares de la marca Xiami

```
SELECT AVG(precio) 
FROM productos
WHERE marca = 'Xiaomi';
```

-5: Obtener la fecha actual en que se están realizando estas consultas

```
SELECT CURRENT_DATE();
```

```
SELECT CURDATE();
```


Si quiero saber la hora: 
```
SELECT CURRENT_TIME();
```

Si quiero saber el usuario:
```
SELECT CURRENT_USER();
```

---

:computer:

📌MATERIAL ASOCIADO A LA CLASE :

✅ [GROUP BY y ORDER BY](https://www.youtube.com/watch?v=eVzmJv2B2wk&t=0s)

✅ [COUNT, SUM, MIN, MAX y AVG](https://www.youtube.com/watch?v=kQwDyx1wiXM)

✅ [INNER JOIN](https://www.youtube.com/watch?v=0BstRqp6Svg)

✅ [LEFT y RIGHT JOIN](https://www.youtube.com/watch?v=nw6tK0E5iyo)

✅ [SUBCONSULTAS](https://www.youtube.com/watch?v=xuASGBwNboU)

---
