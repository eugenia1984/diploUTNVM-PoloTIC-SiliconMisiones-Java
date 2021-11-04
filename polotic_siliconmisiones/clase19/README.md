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

```
...//localhost:3306/nombre_de_mi_bd?serverTimezone=UTC
```

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

## JPA Controllers + ORM + Create

Dentro de las clases controladoras de JPa, existen métodos creados por defecto para realizar operaciones **ABML** (Alta, Baja, Modificacion, Lectura ,**CRUD** en ingles) en las bases de datos.

### Alta de Registros

**Método Create** ```create(ObjetoAcrear)```

### Baja de Registros

**Método Destroy** ```destroy(idRegistroADestruir)```

### Encontrar un Registro

**Método Find** ```find(RegistroAEncontrar)```

### Traer todos los registros

**Método Find Entities** ejemplo ```List<Alumno> findAlumnoEntities()```

### Modificar un Registro

**Método Edit** ``` edit(ObejtoAEditar)```

---

## Volviendo la ejemplo practico de NetBeans

En el **paquete Persistencia** voy a tener la clase **ControladoraPersistencia**:

```JAVA
package Persistencia;

import Logica.ALumno;

public class ControladoraPersistencia {
//instancio unobjeto para poder utilizar sus metodos
   AlumnoJpaController aluJPA = new AlumnoJpaController();
   
   public void crearAlumno(Alumno alu) {
     //a traves del alu que te paso por parametro con JPA creame un Alumno
     try {
      aluJPA.create(alu);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
}
```

Voy a mi main:

```JAVA
package Logica;

import java.util.Date;
import Persistencia.ControladoraPersistencia;

public class TestJPA {
    public static void main(String[] args) {
    
        //instancio un alumno ya con constructor con parametros
        Alumno alumno = new Alumno("123456", "Eugenia" , "Costa", new Date("01/09/1984"));   //la fecha va como el formato en Estados Unidos dia/mes/año
        
        //instancio al controlador de persistencia
        ControladoraPersistencia control = new ControladoraPersistencia();
        //llamo al metodo que recien cree y le paso por parametro el alumno que recien instancie
        control.crearAlumno(alumno);
    }
}
```

Si corro mi main, y voy a phpMyAdmin voy a mi base de datos creada **escuela** y voy a ver a mi alumno creado.

---

## Destroy (Eliminar) 

Vamos a crear un nuevo alumno y agregarlo a la base de datos:

```JAVA
package Logica;

import java.util.Date;
import Persistencia.ControladoraPersistencia;

public class TestJPA {
    public static void main(String[] args) {
    
        Alumno alumno = new Alumno("123456", "Eugenia" , "Costa", new Date("03/11/2021")); 
        Alumno alumno2 = new Alumno("456789", "Analia" , "Perez", new Date("03/10/1962"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();

        control.crearAlumno(alumno);
        control.crearAlumno(alumno2);
    }
}

```

Voy a eliminar un alumno:

```JAVA
package Logica;

import java.util.Date;
import Persistencia.ControladoraPersistencia;

public class TestJPA {
    public static void main(String[] args) {
    
        Alumno alumno = new Alumno("123456", "Eugenia" , "Costa", new Date("03/11/2021")); 
        Alumno alumno2 = new Alumno("456789", "Analia" , "Perez", new Date("03/10/1962"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();

        control.crearAlumno(alumno);
        control.crearAlumno(alumno2);
        
        //para ELIMINAR al alumno le paso por parametro el id
        //debo tener en mi Persistecia el metodo
        control.eliminarAlumno("123456");
    }
}
```


```JAVA
package Persistencia;

import Logica.ALumno;

public class ControladoraPersistencia {
//instancio unobjeto para poder utilizar sus metodos
   AlumnoJpaController aluJPA = new AlumnoJpaController();
   
   //METODO PARA CREAR UN ALUMNO
   public void crearAlumno(Alumno alu) {
     //a traves del alu que te paso por parametro con JPA creame un Alumno
     try {
      aluJPA.create(alu);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   
   //METODO PARA ELIMINAR UN ALUMNO
   public void aliminarAlumno(String idAlumno) {
      try {
         aluJPA.destroy(idAlumno);
      } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
 }
```

En mi main comento donde creo a los alumnos, para no volver a crear los mismos, y solo dejo el metodo para eliminarlo.

Si voy a phpMyAdmin voy a actualizar la base de datos y veo que el alumno se elimino

---

##  Edit (Modificar)


Para modificar un alumno:

```JAVA
package Logica;

import java.util.Date;
import Persistencia.ControladoraPersistencia;

public class TestJPA {
    public static void main(String[] args) {
    
        Alumno alumno = new Alumno("123456", "Eugenia" , "Costa", new Date("03/11/2021")); 
        //Alumno alumno2 = new Alumno("456789", "Analia" , "Perez", new Date("03/10/1962"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();

        control.crearAlumno(alumno);
        control.crearAlumno(alumno2);
        
        //para ELIMINAR al alumno le paso por parametro el id
        //debo tener en mi Persistecia el metodo
        //control.eliminarAlumno("123456");
        
        //para modificar el apellido
        alumno.setApellido("Sanchez");
        //para modificar el nombre
        alumno.setNombre("Maria");
        
        //para MODIFICAR al alumno debo tneer en Persistencia el metodo
        control.modificaralumno(alumno);
    }
}
```

Y en mi Persistencia creo el metodo para modificar:

```JAVA
package Persistencia;

import Logica.ALumno;

public class ControladoraPersistencia {
//instancio unobjeto para poder utilizar sus metodos
   AlumnoJpaController aluJPA = new AlumnoJpaController();
   
   //METODO PARA CREAR UN ALUMNO
   public void crearAlumno(Alumno alu) {
     //a traves del alu que te paso por parametro con JPA creame un Alumno
     try {
      aluJPA.create(alu);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   
   //METODO PARA ELIMINAR UN ALUMNO
   public void eliminarAlumno(String idAlumno) {
      try {
         aluJPA.destroy(idAlumno);
      } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   
   //metodo para MODFICAR al alumno
    public void modificarAlumno(Alumno alumno) {
      try {
         aluJPA.edit(alumno);
      } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
 }
```

Si veo en la base de datos, voy a ver alumno modificado

---

##  Find y Find Entities

Para traer todos los alumnos de la base de datos, o como traer uno en particular


En mi mian:

```JAVA
package Logica;

import java.util.Date;
import java.util.List;

import Persistencia.ControladoraPersistencia;

public class TestJPA {
    public static void main(String[] args) {
         ControladoraPersistencia control = new ControladoraPersistencia();
         
         //genero una lista con registros de tipo Alumno
         List<Alumno> alumnos = control.traerAlumnos();  //en mi controlador de persistencia tengo que tener este metodo
         
         System.out.println("\n--- La lista de alumnos ---");
         //recorro la lista para mostrar todos los alumnos
         for(Alumno alu : listaAlumnos) {
            System.out.println("-"+alu.getDni()+" "+alu.getApellido()+" "+alu.getNombre());
         }
         
         //en el caso de querer mostrar un alumno en particular
         Alumno alu3 = control.traerAlumnoEnParticular("123456");  
         //este metodo traerAlumnoEnParticular lo tengo que crear en mi persistencia que tiene como parametro al id
         System.out.println("-"+alu3.getDni()+" "+alu3.getApellido()+" "+alu3.getNombre());
    }
}
```

En mi persistencia creo el metodo para traer los alumnos:

```JAVA
package Persistencia;

import Logica.ALumno;

public class ControladoraPersistencia {
//instancio unobjeto para poder utilizar sus metodos
   AlumnoJpaController aluJPA = new AlumnoJpaController();
   
   //METODO PARA CREAR UN ALUMNO
   public void crearAlumno(Alumno alu) {
     //a traves del alu que te paso por parametro con JPA creame un Alumno
     try {
      aluJPA.create(alu);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   
   //METODO PARA ELIMINAR UN ALUMNO
   public void eliminarAlumno(String idAlumno) {
      try {
         aluJPA.destroy(idAlumno);
      } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   
   //metodo para MODFICAR al alumno
    public void modificarAlumno(Alumno alumno) {
      try {
         aluJPA.edit(alumno);
      } catch (Exception ex) {
         Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
   }
   
   //metodo para TRAER los alumnos
   public List<Alumno> traerAlumnos() {
      //primero creo la lista de alumnos
      List<Alumno> listaDeAlumnos = aluJPa.findAlumnoEntities();
      //y luego la retorno
      return listaDeAlumnos;
   }
   
   //metodo para MOSTRAR UN DETERMINADO ALUMNO
   public Alumno traerAlumnoEnParticular(String id) {
       //me lo asigno a una variable auxiliar para guardar el resultado de la busqueda
       Alumno alu = aluJPA.findAlumno(id);
       //retorno
       reurn alu;
   }
   
 }
```

---
