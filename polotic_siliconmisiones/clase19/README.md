# Clase 19 : 27 de Octubre

---

## Introduccion a JPA (Java Persistence API)

-Es una API (Application Programming Interface) desarrollada principalmente para la plataforma Java EE

-Es la propuesta estandard que ofrece Java para implementar un Framework Object Relational Mapping (ORM), que permite interactuar con la base de datos por medio de objetos.

-JPA es el encargado de convertir los objetos Java en instrucciones para el Manejador de Base de Datos (MDB).

---

## ¿ Cómo funciona ?


Capa Presentacion: el .html, .jsp

Capa Logica de Negocio: lac clases y las entidades

Capa JPA: ORM.mxl, JPAProvider

---

## Proveedores de JPA :

Como JPA es una API open source, existen distintos proveedores como Oracle, RedHat, Eclipse, etc, que proporcionan nuevos productos mediante la adiciñon de la persistencia.

Algunos de estos productos incluyen: 

-Hibernate

-Eclipselink

-Toplink

-ObjectDB

-Open JPA

---

## MySQL Connection + Persistence Unit

Proveedor de JPA, en **XAMPP** en **phpMyAdmin** en la parte de **Privilegios** vamos a **Agregar cuenta usuario**.

Y completamos:

Nombre de Usuario:

Nombre del Host: cualquier servidor - %

Contraseña : use el campo de texto - completo con la contraseña-

Debe volver a escribi -ingreso de nuevo la contraseña-

Le doy clik en Datos, Estructura, Adminsitración, para darle permisos a todo.

Y click en **continuar**.

Si esta bien en un cartel avisa que se creo un nuevo usuario.

Si hago de nuevo click en **Privilegios** voy a ver mi usuario creado.

-Ahora en **NetBeans** hay que configurar:

```
File -> New Proyect -> Java -> JavaApplication 
```

-Para configurar la base de datos hay que ir a la pestaña **Service**. Y adentro voy al apartado **Data Bases**. Con *click derecho* -> **New Connection**, elejimos el Drive (**MySQL**). Si no lo tengo en forma predeterminada y no me lo detecta, le doy click a **Add...**, busco el Drive y lo agrego. Datos a completar:

-host: localhost

-port: 3306

-database: aca pongo el nombre d ela base de datos que cree en pgpMyAdmin

-UserName

-Password

Click en *test Connection*


Si esta ok perfecto, pero como me detecta la zona horaria y puedo llegar a tener problemas, debo cambiar en **JDBC URL**:

...//localhost:3306/nombre_de_mi_bd?serverTimezone=UTC

Y volvemos a testear, si esta ok, le doy a **Finish**.

Y ahora en **Services** veo la conexion a mi base de datos.

-Volviendo a la pestaña de **Proyects** corroboro que en **Libraries** tenga el **JDK 1.8** y la de **SQL** si no la tengo, le doy *click derecho* en Libraries y **Add JAR/Folder** y agregamos el mysql-connector-java.

-Desde el proyecto, *click derecho* -> Add -> **Persistence Unit..**, si no la veo como opcion la busco desde Other... -> carpeta Persistence -> Persistence Unit..

Me va a poner como nombr eel mismo del proyecto + PU (Persistence Unit), en *Persistence Library* seleccion **Eclipselink** y en *Data Base Connection* elijo la Base de datos que recien cree, abajo dejo seleccionado **Create** y le doy a **Finish**

Si hice todo bien voy a ver un paquete **META-INF** con un archivo *persistance.xml* y en Source se ve en formato .xml

---

## ORM (Object Relational Mapping)

El mapeo Objeto-Relacional, ORM en inglés, es una técnica de programación para convertir datos entre el sistema de tipos utilizado en un lenguaje de programación orientado a objetos y la utilización de una base de datos relacional como motor de persistencia.

```
--------------------              -----------------------
   Class1                           Class2
-------------------               ------------------------
-field: type                         -field: type
--------------------              ------------------------
+method(Type): Type                  +method(Type): Type
--------------------              ------------------------
     |                                |
     |                                |
     ----------------> ORM <-----------
                       ^ ^
                       |  |
                       |  |
                       BASE
                        DE
                       DATOS
```
Para esto se utilizan **anotaciones**, como:

-**@Entity**: especifica la creación de una *entidad*. Se coloca al inicio de la clase.

-**@Id**: Primary Key de la entidad.

**@GeneratedValue(strategy=GenerationType.SEQUENCE)**: establece que la ID se va a generar de forma automática y secuencial.

-**@Basic**: para hacer referencia a atributos comunes-

-**@Temporal**: se usa normalmente en fechas.

Si se quiere tener en cuenta la hora se utiliza: **@Temporal(TemporalType.TIMESTAMP)**

Si solo se tiene en cuenta la fecha (DATE): **@Temporal(TemporalType.DATE)**

-**@OneToMany**: indica una relación unidireccional de **1 a n**

-**OneToMany**: indica una relacion de **1 a 1**

---

## Volviendo al ejemplo de codigo en NetBeans

-Creo los paquetes: 

**logica** (donde tengo mis clases Entidades y el Main)

**igu** (interfaz de usuario)

**persistencia**

Asi voy a tener el **modelo de capaz**

1- En el paquete **logica** creo la clase **Alumno**

```JAVA

package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TemporalType;

@Entity
public class Alumno {
  //Atributos
  @Id
  private String dni;
  @Basic
  private String nombre;
  private String apellido;
  @Temporal(TemporalType.DATE)
  private Date fechaNac;
  
  //constructor sin parametros
  public Alumno() {
  }
  //constructor con parametros
  public Alumno(String dni, String nombre, String apellido, Date fechaNac) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNac = fechaNac;
  }
  //getters y setters
  public String getDni(){
    return dni;
  }
  public String setDni(String dni) {
    this.dni = dni;
  }
  public String getNombre(){
    return nombre;
  }
  public String setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getApellido(){
    return apellido;
  }
  public String setApellido(String apellido) {
    this.apellido = apellido;
  }
  public Date getFechaNac(){
    return fechaNac;
  }
  public date setFechaNac( Date fechaNac) {
    this.fechaNac = fechaNac;
  }
}
```

2-Voy a mi **META-INF** en **persistence** para agregar la Entidad que acabo de mapear (con las anotaciones con @que agregue en la clase y lso atributos).

Voy a **Add class** y ya NetBeans me muestr ala clase creada.

La **Agrego**

---
