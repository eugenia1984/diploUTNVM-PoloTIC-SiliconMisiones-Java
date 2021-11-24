# 📖 Clase 26 : 24 Noviembre * JS

**JS** es un **lenguaje de programación** utilizado principalmente para creación de páginas y aplicaciones web **dinámicas**.

Una página o aplicación web es considerada como **dinámica** cuando permite cambios, animaciones y efectos constantemente.

Se ejecuta principalmente del lado del **cliente** en un navegador web, que es el encargado de interpretarlo.


## ¿ Qué se puede hacer con JS ?


- Validar datos de un formulario, por ejemplo : verificar que el formato de un e-mial sea correcto, que se hayan completado todos los campos, etc.

- Mostrar mensajes o advertencias

- Hacer galerías de imágenes dinámicas.

- Abrir ventanas

- Realizar efectos

- Mover objetos

- Cambiar la resoluciín de una web / apicación


## ¿ Cómo se usa JS ?


Js generalmente se utiliza en conjunto con **HTML** y **CSS**

Se hace referencia al mismo mediante las etiquetas ```<script> </script>```.

Usualmente se utilia dentro del ```<head>``` -cuando quiero que se precargue con la página- o del ```<body>``` de un archivo html (dependiendo de que acciones se quieran hacer) -se ejecuta luego de que la página ya se cargo-.

Al igual que CSS, se puede implementar de manera **interna** o **externa**


Ejemplo de codigo con JS en el head y en el body:

```
<!DOCTYPE html>
<html lang="es">
	<head>
           <meta charset="UTF-8">
           <title> Mi primera web </title>
           <link rel="stylesheet" href="css/style.css">
           <script> alert("Esto de ejecuta antes");</script>
	</head>
	<body>
	    <h1>Bienvenidos!</h1>
            <script> alert("Esto de ejecuta durante");</script>
	</body>
            <script> alert("Esto de ejecuta despues");</script>
</html>
```


Si tengo mi JS en un archivo aparte en el **head** le pongo el atributo **defer**:

```
<!DOCTYPE html>
<html lang="es">
	<head>
           <meta charset="UTF-8">
           <title> Mi primera web </title>
           <link rel="stylesheet" href="css/style.css">
           <script src="js/saludo.js" defer></script>
	</head>
	<body>
	    <h1>Bienvenidos!</h1>
	</body>
</html>
```

Si tengo mi JS en un archivo aparte al final del  **body**, sin el defer :

```
<!DOCTYPE html>
<html lang="es">
	<head>
           <meta charset="UTF-8">
           <title> Mi primera web </title>
           <link rel="stylesheet" href="css/style.css">
	</head>
	<body>
	    <h1>Bienvenidos!</h1>
             <script src="js/saludo.js"></script>
	</body>
</html>
```


## Variables


Ahora es mejor usar **let** o **const** en vez de **var**

```Javascript
let numero1 = 30;
let numero2 = 29;
let resultado = numero1 + numero2;

alert(`El resultado es : ${resultado}`);
```

Use comillas francesas con el **template literal** aca ```alert(`El resultado es : ${resultado}`);``` para no tener que andar concatenando **string** con **variable**, sino tendria que poner así: ```alert("El resultado es : " + resultado);```

---

## Funciones de JS:

### PROMPT

- Permite ingresar un determinado dato para pode ser usado más adelante (en el caso de ser necesario).

Si se hace click en **Aceptar** se guarda el dato en la variable, sino, si se hace click en **cancelar** no se guarda como variable.

Voy a pedir que se ingrese un dato y me lo voy a guardar en una variable, luego lo muestro con alert o la podría utilizar como dato para hacer luego otra cosa.

Ejemplo en código :

```Javascript
let nombre = window.prompt("Decime tu nombre: ");
alert(`Buen día ${nombre}`);
```

Otro ejemplo, con dos parametros, el segundo es una respuesta ya predeterminada:

```Javascript
let respuesta = window.prompt("Ya te suscribiste a mi canal?", "Más vale que si");
```

### CONFIRM

Voy a pedir que se ingrese un dato , con confirm tengo un valor **booleano** (**true** si hace click en **ACEPTAR** o **false** si hace click en **CANCELAR**).

Lo voy a aprovechar con un **IF/ELSE** para controlar que le muestro en un alert.

```Javascript
let respuesta = window.confirm("Hoy llueve ? ");

if( respuesta == true) {
    alert("Agarra paraguas");
} else {
    alert("Disfruta del día que no llueve");
}
```


El típico ejemplo de CONFIRM es cuando uno va a salir de una página y le sale la consulta: Está seguro que quiere dejar esta página?

---


## Temas extras en estas dos clases de YouTube:

📺 [https://www.youtube.com/watch?v=-BpR0BcF45Q&t=176s](https://www.youtube.com/watch?v=-BpR0BcF45Q&t=176s)

## Fechas y horas con JS

Nosotros somos hipanohablantes, pero ... en USA es DIA/MES/AÑO y tienen el formato de 0 -12.59 y luego pasa a ser la 1.

- Se pueden crear a partir de **new Date()** y existen diferentes combinaciones que se pueden tener en cuenta.

```Javascript
let fecha = new Date();
alert(`Hoy es ${fecha}`);
```

- **new Date()** permite obtener la fecha actual

- **new Date(year, month, day, hour, minutes, seconds, milliseconds)** permite crear una fecha estableciendo parámetros. Como detalle a tener en cuenta, **los meses arrancan desde 0**, por lo que Enero es 0 y Diciembre es 11.

```Javascript
let fecha2 = new Date(1991,10,23);
```

- **new Date(fecha en String)** permite crear una fecha a partir de una cadena de caracteres.

```Javascript
let fecha3 = new Date('11/23/2020');
```
*En este caso con MES/DIA/AÑO*

### Métodos para fechas

| funcion | resultado |
| ------- | --------- |
| getFullYear() | devuelve el año en formato YYYY |
| getMonth() | devuelve el mes del año 0-11 |
| getDate() | devuelve el día del mes/año (1-31) |
| getDay() | devuelve e dia de la semana (0-6) |
| getHours() | devuelve las horas (0-23) |
| getMinutes() | devuelve los minutos (0-59) |
| getSeconds() | devuelve los segundos (0-59) |

Como con getMonth va de 0 a 11, se suele poner **.getmonth()+1**

Lo mismo pasa con **.getDay()** que tiene los días del 0 al 6. Pero en este caso si tenemos en cuenta que empieza de 0 no es necesario el **+1**.


Ejemplo en codigo:

```Jaascript
//creo una fecha
let fecha4 = new Date('11/23/2020');

//voy obteniendo por partes
let dia = fecha4.getDate();
let mes = fecha4.getMonth();
let anio = fecha4.getFullYear();

//muestro por pantalla
alert(`Dia ${dia} . Mes ${mes}. Año ${anio}.);
```

## Console Log

- Cuando queremos mostrar un resultado de una operación JS, no es precisamente necesario que utilicemos siempre ventanas emergentes (alerts).

- También podemos mostrar resultados en nuestro documento HTML o en la consola del navegador.

- Para acceder a la consola de nuestr navegador, generalmente podemos acceder con la tecla **F12** (modo desarrollador) y la pestaña **Console**.


Ejemplo en código:

```Javascript
let suma = 2 + 8;
console.log('El resultado de la suma es: ' + suma);
```

---



📺 [https://www.youtube.com/watch?v=UCWYvj4bVKE](https://www.youtube.com/watch?v=UCWYvj4bVKE)

## Eventos

```
<!DOCTYPE>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> Probando JS </title>
</head>
<body>
     <button onclick="alert('Bien!')> Hace click </button>
     <button onmouseover="alert('Pasaste por aca el mouse')">Pasa la flechita por aca </button>
     <button onmouseout="alert('Me voy a alejar')"> Cuando salgo con el mouse </button> 
</body>
</html>
```


Otro ejemplo en codigo:

```
<!DOCTYPE>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> Probando JS </title>
</head>
<body>
    <p> Prueba de cambio de contenido de input </p>
    <input type="text" onchange="alert('Acabas de hacer un cambio en el input')">
    <p> Prueba de click en caja de texto</p>
    <input type="text" onfocus="alert('Acabas de hacer click en el input')">
    <p> Pruebo dejar de hacer foco en una caja de texto</p>
    <input type="text" onblur="alert('Acabas de dejar de hacer foco sobre el input')">
    <p>Prueba de dejar de presionar teclas</p>
    <input type="text" onkeyup="alert('Acabas de soltar una tecla')">
</body>
</html>
```


## Funciones


Ejemplo 1:


```Javascript
function funcionPrueba() {
    alert('Esto es una prueba de funciones');
}

funcionprueba();
```

Ejemplo 2:

```Javascript
function suma(numero1, numero2) {
  let resultado = numero1 + numero2;
  alert(`este es el resultado de tu suma ${resultado}`);
}

suma(35, 4);
```

Ejemplo 3:

```
<!DOCTYPE>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> Probando JS </title>
</head>
<body>
     <h4> El resultado de la suma es: </h4>
     <p id="parr1"> </p>
     <h4> El resultado de la resta es: </p>
     <p id="parr2"> </p>
     
     <script>
       function suma(num1, num2) {
         let resultado = num1 + num2;
	 return resultado;
       }
       
       function resta(num1, num2) {
         let resultado = num1 - num2;
	 return resultado;
       }
       
       document.getElementById("parr1").innerHTML = suma(28,35);
       document.getElementById("parr2").innerHTML = resta(28,12);
     </script>
</body>
</html>
```

Ejemplo 4:

```
$('p') ---> elementos
$('#nombre') ---> ID
$(.titulosprincipales') ---> clase
```

```
$().ready(funciones);

function funciones() {
  $('p').click("alert('hiciste click')");
  $('h1').mouseover("alert('Pasaste el mouse por arriba')");
}
```

---
