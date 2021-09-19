# Clase 7 : 8 SEPTIEMBRE

---
### PRIMER TRABAJO PRACTICO

:computer: Ver el **TRABAJO PRACTICO OBLIGATORIO CON ENTREGA EL 22/09** -> [**guia5_tp1**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia5_tp1)

:computer: [**Video**](https://www.youtube.com/watch?v=HTH5nPYE8HA) con la explicación del Trabajo Práctico

#### Consigna

### 1) Escenario
Se necesita un programa para gestionar los contactos de una agenda electrónica.

A)En la agenda se debe permitir ingresar los siguientes datos: dni, nombre, apellido, fecha
de nacimiento, teléfono y dirección (cada uno en su correspondiente textField).

-> Esta parte es el **igu** solo con **TextField**

B) Se necesitan almacenar los datos de 10 personas. Para ello se propone la utilización de
1 vector para almacenar los valores de cada uno de los campos (teniendo en cuenta
que pueden existir distintos tipos de datos), en donde cada índice indicará los datos de
una determinada persona en todos los vectores. Por ejemplo:


| vector DNI |
| ---------- |
| 31685795 |
| 28968752 |


| vector nombres |
| -------------- |
| Ana Maria |
| Carlos |

| vector apellidos |
| ---------------- |
| Costes |
| Perez |

Tengo 6 vectores, uno por cada dato almacenado y me va a coincidir el índice de cada vector con los datos de una misma persona

Primer persona de mi agenda:

DNI -> vector dni[0]

nombre -> vector nombres[0]

Y así en cada dato. Como son 10 personas en cada vector voy a tener del índice 0 al 9

C) El programa debe permitir cargar valores en una determinada posición del vector (al
hacer click en el botón **cargar**) y recorrer el vector encontrando los datos cargados. Por
ejemplo:

```
          Agenda Electrónica
-----------------------------------------
DNI:                    Dirección:
Nombre:                 Teléfono:
Apellido:               F.Nac:
------------------------------------------
        <<     Grabar      >>
        Índice:   0
```

El **indice** me va a indicar en que persona estoy en el momento (coincide con el índice del vector)

D) Al hacer click en las fechas de derecha e izquierda se debe incrementar (o decrementar)
el índice y con ello los datos correspondientes al usuario. (La misma lógica se utiliza
para cargar los datos)


### 2-  Condiciones de entrega

• El presente trabajo es de tipo OBLIGATORIO y bajo la modalidad INDIVIDUAL (sin
excepción).

• La fecha de entrega será el día Miércoles 22/09/2021 hasta las 23:59 hs.

• El formato de entrega consistirá en un ejercicio en formato ZIP o RAR (comprimido) que
contenga dentro EL PROYECTO COMPLETO, que permita ser ejecutado en el IDE Netbeans. 

El nombre del archivo debe ser **apellido_nombre_tpo1** por ejemplo dePaula_Luisina_tpo1. 

Por favor respetar dicha nomenclatura.

• La entrega se llevará acabo mediante correo electrónico (sin excepción) a la dirección
de e-mail **javafullstackpolotic@gmail.com** con el asunto: TPO Nº 1. 

Por favor respetar las mayúsculas y formato del asunto para que el correo pueda ser filtrado correctamente.


• Recomendación: En ocasiones Gmail, Hotmail o Yahoo detectan los archivos rar de
proyectos Java como virus. 

Se recomienda subir el archivo a Google Drive, darle acceso público y facilitar el link en el correo electrónico enviado para evitar estos casos.


### 3 ) Condiciones de Evaluación

Se evaluará:

• El correcto funcionamiento del programa desarrollado.

• Entrega del proyecto en tiempo y forma.

• Las buenas prácticas implementadas.

• El orden del código, correcta implementación de las estructuras y el uso de comentarios
de guía/ayuda.

• El cumplimiento de los formatos solicitados para cada uno de los archivos

---

## Teoría vista en clase

Se hablo un poco sobre las dudas que teníamso de la salida laboral del curso.

Se ve los requerimientos del trabajo práctico.

Y el video que muestra como debe quedar.

---
