# Clase 26 : 24 Noviembre * JS

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

Voy a pedir que se ingrese un dato , con confirm tengo un valor **booleano** (*true* o *false*) y me lo voy a guardar en una variable, luego lo muestro con alert.

```Javascript
let respuesta = window.confirm("Hoy llueve ? ");

if( respuesta == true) {
    alert("Agarra paraguas");
} else {
    alert("Disfruta del día que no llueve");
}
```

---


## Temas extras en estas dos clases de YouTube:

[https://www.youtube.com/watch?v=-BpR0BcF45Q&t=176s](https://www.youtube.com/watch?v=-BpR0BcF45Q&t=176s)

[https://www.youtube.com/watch?v=UCWYvj4bVKE](https://www.youtube.com/watch?v=UCWYvj4bVKE)

---