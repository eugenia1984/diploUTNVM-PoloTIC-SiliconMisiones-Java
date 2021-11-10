#  Clase 23 : 10 Noviembre

---

## ¿ Como trabaja la web ?

- La web se basa en peticiones o consultas que hace un cliente desde un navegador web (por ejemplo Chorme) hacia un servidor web que se encuentra alojada en algún lugar.

- Ese cliente se comunica con el servidor, mediante un protocolo que se llama **HTTP** o Protocolo de Transferencia de Hipertexto.

- Mediante este protocolo, el cliente realiza consultas (**request**) -hace las solicitudes- y recibe respuestas (**response**)


``` 
         HTTP Request
        ---------------> 
CLIENT                    SERVER
        <--------------
          HTTP Response
```

El server es una computadora

---

## HTTP vs HTTPS

S de **security** para que la conexión sea segura.

Por eso están los certificados **SSL**.

Al buscar la web al ser HTTPS en general tiene un candadito.

---

## ¿ Qué son las URL ?

- **URL** significa Uniform Resource Locator (Localizador de recursos uniforme).

- Es la **dirección específica** que se le asigna a cada uno de los recursos disponibles en una red con la finalidad de que estos puedan ser localizados o identificados.

- Cada recurso (sea una página completa, una imágen, o un documento, etc) tiene su propia URL.

```
   protocolo    subdominio   nombre de dominio  extension    geolocalizacion   ruta
 -----------------------------------------------------------------------------------
 |           |            |                   |           |                  |
    http://       www.         google.          com.           ar              /hola

```

---

## Navegadores y Web Serves

#### Navegadores

- En una arquitectura cliente-servidor, representan al cliente que solicita pedidos al servidor

- 'Comprende' las respuesta provenientes del servidor, las interpreta y muesta en pantalla en modo gráfico.

#### Web servers

- Un servidor web o servidor HTTP representa al servidor que se encarga de procesar los pedidos de distintos clientes en una aplicación web.

- Tiene la capacidad de recibir y adminsitrar pedidos, para determinar la respuesta a enviar.

- Gestiona otros tipos de servicios tales como el de autenticación de usuario y la 'comprension' de las solicitudes del tipo seguras.

---

## ¿ Qué es HTML ?

- HTML es un lenguaje de maquetado o de etiquetas

- Muchos lo confunden como un lenguaje de programación, peor no lo es.

- Se utiliza mayoritariamente para la creación de páginas webs.

- Los navegadores se comunican mediante lenguaje HTML para mostrarnos el contenido de una página web.

- Se usa en conjunto con CSS, el cual permite agregar colores, estilos, entre otras cuetiones que dejan a nuestra maqueta HTMl con aspectos de diseños.

--- 

## Sintaxis HTML

```HTML
<!DOCTYPE html>
<html>
	<head>
		<title> Ejemplo </title>
		<link rel="stylesheet" href=" style.css">
	</head>
	<body>
		<h1>
		   <a href="/"> Header </a>
		</h1>
		<nav>
		   <a href="one"> One </a>
                   <a href="two"> Two </a>
		</nav>
	</body>
</html>

```

**Doctype** : indica al navegador que verison de HTML estamos utilizando; va al principio d eun archivo HTML.

**Elementos** : nos permiten estructurar y dar significado a cada una de las partes de un documento HTML. se representan en forma de etiqueta.

**Las etiquetas delimitan el principio y fin de un elemento**

Del **head** solo se ve el titulo, todo el resto que veo en el navegador está en **body**.


### Etiquetas más comunes

```<!--- --->```  para añadir comentarios

```<a> </a>``` para establecer un vinculo (anchor)

```<b>  </b>```  ó ```<strong> </strong>``` texto en negrita, strong tiene significado semantico de que es algo importante

```<body>  </body> ``` parte visible en pantalla del documento

```<br> ``` salto de linea, no tiene etiqueta de cierre

```<form>  </form>``` para los formularios

```<html>  </html>``` apertura y cierre del codigo

```<button>  </button>``` boton

```<h1> </h1>``` encabezados, hay desde 1 al 6

```<head> </head>``` cabecare del documento

```<i>  </i>``` cursiva -italic-

```<title>  </tile>  ``` establece el nombre del documento dentro del *head*

```<input>``` un campo de entrada de datos, no tiene etiqueta de cierre

```<img>``` para imagenes, no tiene etiqueta de cierre.

```<p>  </p>``` para parrafos

```<div>  </div>``` para separar bloques de codigo

```<footer>  </footer>```

```<nav>  </nav>```

```<ul> </ul>``` y ```<ol> </ol>``` lista desordenada y lista ordenada

```<li>  </li>``` list item, los items de la lista

---