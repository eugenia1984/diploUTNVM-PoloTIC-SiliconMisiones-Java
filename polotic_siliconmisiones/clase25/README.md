#  Clase 25 : 17 Noviembre

Temas:

- CSS

---

## CSS

**Cascading Style Sheet**, es decir **Hojas de Estilo en Castada**

Es considerado un *lenguaje de diseño* y es usado en conjunto con algún lenguaje de maquetado, como por ejemplo HTML.

Css se encarga de separar el contenido en sí de una página web y los estilos (colores, tamaños, diseño en geneeral).

---

## Sintaxis 

```
selector  clase
      |   |
     #id.clase {
        propiedad : valor;
     }
```

Luego de la clase puede tamibén tener:  ```:paseudoclase ```,  ```::pseudoelemento ``` y ```[atributo] ```

Los **selectores** con ellos podemos especificar a qué elementos de una determinada página nos estamos refiriendo.

Las **propiedades** están representadas por palabras reservadas que se utilizan para brindar difernetes tipos de estilos. Estos se escriben en inglés y minúscula, por ejemplo : color.

Los **valores** están por cada propiedad.

---

Pagina sugerida para ver ejemplos y practicar: **codepen.io**

---

## Para organizar el proyecto:

- index.html y todos los archivos .html

- carpeta **css** donde voy a tener todos mis archivos css

- carpeta **images** donde voy a tener mis imagenes

- carpeta **js** donde voy a poner mis archivos .js para JavaScript


## ¿ Como linkeo el CSS con mi HTML ?


1- No es lo más aconsejable, de forma interna, dentro de la etiqueta , por ejemplo:
```
<p style="font-size:12px"> Esta es un texto de 12px de tamaño </p>
```


2- También en el HTML, pero al principio del body, por ejemplo:
```
<body>
   <style type="text/css">
     h1 {
       color: red;
     }
   </style>
```


3- La mejor forma de las tres, es tener todo es css en  un archivo .css y linkeado en el HTML en el HEAD:

``` <link rel="stylesheet" href="./css/styles.css" >  ```

Si tengo más de un archivo css tengo que tener en cuenta en que orden lo voy a nombrar, ya que se lee de arriba hacia abajo, o sea que el que esté al final va a ir 'pisando' a los que tenga antes. Esto es importante si uso Bootstrap y con mi css quiero personalizarlo, en este caso va primero Bootstrap y luego mi archivo css.

---

## Selectores

- Los selectores nos permiten hacer referencia a elementos, clases o ids dentro de un documento HTML.


- Se utilizan para poder cambiar los determinados estilos de cada uno de estos.


- Nos permiten cambiar de estilos, no solo a elementos de forma particular, sino también a un bloque o conjunto de ellos.


- Hay distintos tipos de delectores:


**Universal**, es el ```*```, va a modificar todos los elementos. Se usa cuando se quiere resetear algo, por ejemplo hacer que quede con 0px el margin y el padding para no tener esos 8px que a veces molestan dependeindo del navegador.


**de Elementos**: es para seleccionar por etiquetas.


**de Clases**: en este caso una misma clase se puede usar para modificar el mismo estilo a más de una cosa. Dentro de la etiqueta ```class="nombre-clase"```. Y en el css, para indicar que se trabaja con un selector de clase se usa **.**


**de ID**: es uno solo, no se puede repetir.Dentro de la etiqueta HTML ``` id="nombre-del-id"```. En el css, para indicar que se trabaja con un selectorid se usa **#**

---

## Pseudoclase

Es como una previa a JS, antes de Js se buscaba que la página no sea tan estática y que por ejemplo cambie de color. 

Algunos ejemplos: ```:visited```, ```:hover``` , ```:link```.

---
