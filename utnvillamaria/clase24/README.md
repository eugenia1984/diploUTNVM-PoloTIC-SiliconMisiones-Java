# Clase 24 : 14 Octubre

---

Temas a ver:

-**Constructores**

-Palabra reservada **static**

-Palabra reservada **final**

-Método **toString()**

---

## Constructor

-Es un método especial de una clase que se llama automáticamente siempre que se declara un objeto de esa clase.

-Su función es inicializr el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos.

-Si para una clase no se define ningún método constructor se crea uno automáticamente por defecto.

-El **constructor por defecto** es un **consructor sin parámetros** que no hace nda. los atributos del objeto son inicializaados con los valores predeteminados por el sistma (null, 0).

-Tiene el mismo nombre que la clase a la que pertenece

-En una clase puede haber varios constructores con el mismo nombre y distinto número de argumentos (sobrecarga)

-No se hereda

-No puede devolver ningún valor (incluyendo void)

-Debe declararse público (salvo casos excepcionales) para que pueda ser invocado desde cualquier partte donde se crea un objeto de su clase

---
