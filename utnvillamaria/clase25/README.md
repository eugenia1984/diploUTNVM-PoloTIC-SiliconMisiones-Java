# Clase 25 : 19 Octubre

---

Temas a ver:

- Palabra reservada **this**

- **Herencia**: palabras reservadas: **extends**, **protected**, **super**.

- Comparación de Strings

---

## Palabra reservada THIS

Cuando se llama a un método, se pasa automáticamente un argumento implícito que es una referencia al objeto invocado (es decir, el objeto sobre el que se llama el método). Esta referencia se llama **this**.

Como sabe, dentro de un método, se puede acceder directamente a los atributos de una clase, sin necesidad de especificar **this** o el nombre de la clase.

Fuente : [https://javadesdecero.es/palabra-clave/this](https://javadesdecero.es/palabra-clave/this)

Lo vemos en las clases en los **setters**, que el this nos indica cual hace referencia a los atributos de la clase, ya que el parametro que recibe el setter es igual al parámetro.

En cambio en los **getters** somo no tienen parámetros, en el return no se aclara con **this**, pero Java sobreentiende que se devuelve el valro del atributo.

---

## Herencia

La **herencia** es un pilar fundamental de la Programación Orientada a Objetos.

Es un mecanismo en el cual a una clase se le permite *heredar* las características de otra (atributos y métodos). Asi reutilizamos el código.

**Superclase**: (clase padre / madre). La clase sobre la cual se heredan sus atributos y métodos.

**Subclase**: (clase hijo / hija) la lase que hereda atributos y métodos de la superclase.

## Herencia: palabra reservada: extends

Su sintaxis:

```JAVA
class derivedClass extends claseBase {
//methods and fields
}
```

## Herencia: palabra reservada: protected

Modificadores de acceso:

| modificador | clase | package | subclase | todos |
| ----------- | ----- | ------- | -------- | ----- |
| public | si | si | si | si |
| protected | si | si | si | no |
| no especificado | si | si | no | no |
| private | si | no | no | no |

Con protected van a poder aceder todas las clases que sean de herencia

En diagrama de clases:

```
            ----------------------------
                    Vehiculo
            -----------------------------
             -matricula
             -potencia
             -capacidadTanqueCombustible
             -modelo
             -velocidadMaxima
            ----------------------------
             +acelerar()
            ----------------------------
                       ^
                       |
   -------------------------------------------------
   |                   |                           |
----------       -----------------       ---------------------
  Auto              Motocicleta              Camion
----------       -----------------       ---------------------
-nroChasis       -----------------        -kgCarga
-----------      -----------------        -nroAcoplado
+acelerar()                              ---------------------
------------
```

Lo que si hay que tener cuidado porque la **herencia rompe el encapsulamiento**. Por eos hay que tener equilibrio, y solo usarlo de ser necesario.

En Java solo hay herencia simple, no existe la herencia múltiple.


## Herencia: palabra reservada: super

---

## Comparación de Strings

---
