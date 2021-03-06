# Clase 26 : 21 Octubre

Temas:

- Declaración de clases
- Tipos de datos de referencia
- Recolector de basura
- Ámbito de las variables
- Operadores, Operadores lógicos, operadores de Asignación, Operador ternario

---

## Declaración de clases

```
[public] [final|abstract] class NombreDeLaClase [extends ClaseMadre] [implements Interfase1, ..., InterfaceN]
```

Las porciones encerradas entre corchetes son opcionales a optar enre las posibilidades separadas por la barra vertical.

Ejemplo en código: 

```JAVA
public class Perro {
  //esto es un comentario
  //aqui completaremos luego el cuerpo de la clase
}
```

```JAVA
Perro miPerro = new Perro();
```

---

## Tipos de datos de referencia

En Java los objetos, instancias de clases, se manejan a través de referencias.

Cuando se crea una nueva instancia de una clase con el operador **new**, este devuelve una referencia al tipo de la clase.

Ejemplo:

```JAVA
public class Punto {
  private float x;
  private float y;
  ...
  public void setX( float x) {
    this.x = x;
  }
}
```

```JAVA
Punto unPunto = new Punto();
```

El operador **new** reserva espacio en memoria para contener un objeto del tipo Punto y devuelve una referencia que se asigna a unPunto, con los valores de atributos que se definieron en el constructor. A partir de ahora accedemos al objeto a través de su referencia.

Es posible, por tanto, tener **varias referencias al mismo objeto**.

```JAVA
Punto unPunto = new Punto();
unPunto.print();
Punto otroPunto = unPunto;
otroPunto.setx(1.0f);
otroPunto.sety(2.0f);
otroPunto.print();
```

La salida por pantalla es:

```JAVA
Coordenadas del punto (0.0f, 0.0f)
Coordenadas del punto (1.0f, 2.0f)
```

Como las dos referencias : unPunto y otroPunto, hacen referencia a la misma instancia, los cambios sobre el objeto se pueden realizar a través de cualquiera de ellas.

Dos instancias con la misma referencia al mismo objeto. Al objeto lo modifico a través de la referencia

```
            instancia de
Objeto ----------------------> clase Punto
  ^  ^     
  |  |
  |  |-------------------------------|
  |                                  |
Referencia                           |
 unPunto    <------------------ Referencia otroPunto
```

---

## Recolector de basura


Los objetos que dejan de estar referenciados a través de alguna variable no se pueden volver a recuperar.

Para que estos objetos **desreferenciados** no ocupen memoria, un recolector de basura se encarga de **destruirlos** y liberar la memoria que estaban ocupando.

Por lo tanto, para **destruiir** un ofbjeto basta con **asignar a su variable de referencia el valor null**.

-No borro al objeto, sino borro la referencia del objeto.

---

## Ámbito de las variables

Tienen un ciclo de vida:

1-En la **declaración** se **reserva el espacio** necesario para que se puedan comenzar a utilizar (digamos que se avisa de su futura existencia).

2-Se la **asigna a su primer valor** (la viariable nace)

3-Se la **utiliza** en diversas sentencias

4-Cuando finaliza el bloque en el que fue declarada, la **variable muere**. Es decir, **se libera el espacio que ocupa esa variable en memoria**. No se la podrá volver a utilizar. 


El ámbito de las variables está determinado por l **bloque de código donde se declran** y todos los **bloques que están anidados por debajo de este**.

```JAVA
{
  //aca tengo el bloque externo
  int entero = 1;
  Punto unPunto ) new Punto();
      {
        //aca tengo el bloque interno
        int entero = 2; //error ya está declarada
        unPunto = new Punto(1.0f, 1.0f);  //correcto
      }
}
```

---

## Operadores

```
+ suma
- resta
* multiplicacion
/ divicion
% resto de una división entre enteros (en otros lenguajes denominado mod)
```

Orden: ```  3 * 2 / 7 + 2 ``` no e slo mismo que ``` 3 * ( (2 / 7 ) + 2) ```

---

##  Operadores lógicos

| operador | descripción |
| -------- | ----------- |
| == | es igual |
| != | es distinto |
| <, <=, >, >= | menor, menor o igual, mayor, mayor o igual |
| && | AND (Y) |
| (||) | OR (O) |
| ! | NOT (NO) |

---

## Operadores de Asignación


Operadores aritméticos:

```
+= suma y asignación   -> a+= b  ->  a = a+b
-= resta y asignación  -> a-=  ->  a = a - b
*= multiplicación y asgnación  -> a*=b  ->  a = a * b
/= división y asignación  ->  a/=b  ->  a = a / b
%= resto de la división y asignación  ->  a%=b  ->  a =  a % b
```

Operadores a nivel de bits:

```
&= and binario y asignación   ->  a&=b  ->  a = a & b
|= or binario y asignación   ->  a|=b  ->  a = a | b
^= xor binario y asignación   ->  a^=b  -> a = a ^ b
<<= desplazamiento de bits hacia la izquierda en b posiciones y asignacion  ->  a<<=b  ->  a = a << b
>>=  desplazamiento de bits hacia la derecha en b posiciones y asignacion  ->  a>>=b  ->  a == a >> b
```

Con los **operadores** puedo **CONCATENAR ASIGNACIONES**:

```
x1 = X2 = X3 = 5;  //todas valen 5
```

Con los **operadores** tengo **dos formas de usar el incremento y decremento**:

```
int x = 5;
int y = 5;
int z;
z = x++;  // z vale 5, x vale 6
z = ++y;  // z vale 6, y vale 6
```

---

## Operador ternario

Este operador (**if de una linea**) permite devolver un valor u otro según el valor de la expresión analizada.

Su sintaxis es la sigueinte:

``` ExpresiónLógica ? valorSiVerdadero : valorSiFalso;```

Ejemplo en código:

```JAVA
float precioDeLista = aplicaDescuento == true ? 123 : 234;
```

En el caso de que la variable aplicaDescuento tenga valor verdadero, el precio de lista del producto que estamos analizando será menor; es importante destacar que la asignación anterior es equivalente a utilizar condicionales.

---


