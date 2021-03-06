# POO : 

## Características Esenciales :

### Abstraccion

Se centra en las características en esenciales de un objeto en relación a la perspectiva del observador.

Nos quedamos con lo que consideramos es relavante y con lo que no, es nuestra abstracción de las clases de lo que vamos a necesitar para resolver el problema o trabajar en el proyecto. Me permite manejar la complejidad de lo que voy a hacer.

**Clasificación** -> las *clases* y *objetos* deberían estar al nivel de abstrascción adecuado: ni demasiado alto ni demasiado bajo.


### Encapsulamiento

Oculta los detalles de implementación de un objeto, sirve para separar *interfaz* de su *implementación*.

Voy a tener *atributos PRIVADOS* y *métodos PUBLICOS*, asi otras clases no pueden verlo, si voy a necesitar saber qué hace? Qué métodos tiene? Pero solo el nombre del método, no el cómo. El *código debe estar protegido*, su *implementaciçon debe estar oculta* asi lo voy a poder *reutilizar* ya que nadie lo ve, no me lo toca, no me lo va a cambiar; no me va a afectar  la implementación del resto.

Convierto las *clases* en *cajas negras*, se que hacen sus objetos pero no cómo lo hacen.

Las **abstracción** y el **encapsulamiento** son conceptos complementarios: la primera se centra en el **comportamiento** observable de un objeto, mientras el encapsulamiento se centra en la **implementación** que da lugar a este comportamiento.

Se ve en los distintos tipos de accesos: si es PUBLIC tods acceden no hay encapsulamiento. En cambio si tengo PRIVATE solo lo van a ver las clases que lo hereden.

### Modularidad

Empaqueta abstracciones en unidades discretas.

La estructura de un módulo debería:

   * Ser lo bastante simple como para ser comprendida en su totalidad.
   
   * Ser posible cambiar la implementación de los módulos sin saber nada de los otros y sin afectar su comportamiento.
   
   * Y la facilidad de realizar un cambio debería guardar una relación razonable con la probabilidad de que ese cambio fuese necesario.

Tratar de que los módulos sean lo más independiente posibles con sus clases adentro.

Paquetes

### Jerarquía

La jerarquía es una *clasificación* u * ordenación* de abstracciones.

Me define los niveles de importancia.

Y también defino hasta donde debo llegar.

Jerarquía de partes:

-> **AGREGACIÓN**. x ej: una COMPUTADORA está formada por: CPU; monitor, teclado, mouse, parlante, camara web. Puedo hacer agregación entre clases para definir que disco tengo, x ej. Es de todas las partes. Esto se traslada a los objetos, la computadora X tiene este teclado, este mouse, esta impresora, y cada objeto tiene sus particularidades específicas. La relación de la clase todo está formada por clases partes, no está formada por objetos. En tiempo de ejecución se instancian los objetos, en nuesto modelo UML voy a tener las clases.

-> **HERENCIA** (GENERALIZACION DE CLASES). La herencia es una herramienta que permite definir nuevas clases en base a otras clases existentes. Voy a ir espeificando, y me voy a basar en otras clases existentes. 

Es una de las herramientas más poderosas que tiene la POO, y me va a permitir re usar métodos. 

Siempre se busca HERENCIA DE COMPORTAMIENTO, nunca con atributos, y siempre ver que esos atributos se apliquen en las clases hijas siempre.

Pero hay que tener cuidado, no todo es HERENCIA, usarla cuando voy a tener herencia de comportamiento, por la implementación de métodos, no por atributos.


Ejemplo con UML:

```
                     Animal
                  <<abstraact>>
               ------------------------
                -foto: String
                -tipo_comida: String
                -localizacion: String
                -tamaño: String
               --------------------------
                +comer()
                +dormir()
                +rugir()
                      ^
                      |
                      |
       -----------------------------------------
       |                                       |
       |                                       |
     Felino                                 Canino
   <<abstract>>                          <<abstract>>
        ^                             --------------------
        |                               +hacerRuido()
        |                                     ^
        |                                     |
   -----------------------              --------------------
   |         |           |              |                  |
Leon        Tigre      Gato            Lobo              Perro
--------   ---------  --------        -------------    -------------
+comer()   +comer()   +comer()        +comer()          +comer()
+rugir()   +rugir()   +rugir()        +hacerRuido()     +hacerRuido()
                      +jugar()        +rugir()          +rugir()
                                                        +jugar()
                                                        +vacunar()
```

Al hacer HERENCIA debo *romper* el encapsulamiento, voy a dejar de tener *PRIVATE*, voy a tener *PROTECTED* para que los hijos también lo puedan ver al atributo. Y   además voy a *generar dependencia*, si cambio algo por ejemplo en ANIMAL voy a efectar a todos las clases que hereden del mismo.

## POLIMORFIRSMO

-> **Sobreescritura de métodos** -> puedo heredar un método, pero lo puedo modificar, sobreescribir para poder utilizarlo. **@Override**

Es la capacidad de heredar un método y sobreescribirlo

**Herencia** y **polimorfismo**: objetos de distintas clases pertenecen a una misma jerarquía, pueden responder de forma distinta a un mismo método.

Ejemplo con otro UML:

```
                     Cuenta Bancaria
                 ------------------------
                  -saldo
                 ------------------------
                  +saldo()
                  +depositar: unMonto()
                  +extraer: unMonto()
                         ^ 
                         |
                         |
         --------------------------------------------
         ^                                          ^ 
         |                                          |
      CajaDeAhorro                           CuentaCorriente
    -----------------------------      -----------------------------
    -extraccionesPosibles               -rojoPermitido
    ------------------------------     ----------------------------
    +extraccionesPosibles()             +puedoExtraer:unMonto()
    +extraccionesPosibles: unMonto()    +realizarExtraccion:unMonto()
    +hayExtraccionesPosibles()          +rojoPermitido()
    +decrementarunaExtraccion()         +rojoPermitido:unMonto()
    +realizarExtraccion:unMonto()
    +puedoExtraer:unMonto()    
```
         
        
Otro ejemplo es en base a la clase *figura geometrica* tengo las clases hijas: *circulo*, *cuadrado* , *triangulo*.     

*figura geometrica* va a ser abstracta, va a tener lados y los metodos abstractos calcularArea, este metodo los van a heredar las clases hijas las cuales van a customizar el método, cada una va a calcular su área. Lo que si que al heredar ese metodo abstracto lo tiene que definir si o si, o si lo dejo abstracto es porque tengo otras clases hijas que lo heredan e implementan.
        
Si tengo una **clase abstracta** no voy a poder instanciar objetos de ella, voy a tener métodos abstractos que van a implementar las clases hijas, y son las clases hijas las que podrán instanciar objetos.

Las clases siempre en **UpperCamelCase**

Los atributos y los métodos en **camelCase**

No importa el largo del nombre de la clase, ni del atributo ni del método, lo que importa es que cualquiera que lo vea entienda que hace, deben ser bien descriptivos, es mejor tneer: numeroIngresado que a o num que no me dice nada, no me da indicio de que voy a guardar.


En cada clase voy a tener:

   * nombre
   * atributos
   * constructor
   * métodos: si no es *void* voy a tener un *return*

---

## Características Secundarias : 

### Tipificación

### Concurrencia

### Persistencia


---

## Relaciones: Asociación

Es una relación que especifica que los objetos de un elemento se conectan a los objetos de otros.

```
asociacion ----               -----multiplicidad
              |               |
              |               v
              v               1
Gato ---------------------------------> TipoDeGato
                               ^ 
                               |
                            navegabilidad
```

---
