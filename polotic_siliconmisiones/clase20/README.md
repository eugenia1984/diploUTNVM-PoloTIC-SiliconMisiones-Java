# Clase 20 : 1 Noviembre

Aclaración de algunos inconvenientes que podriamos tener con JPA:

[Si faltaba alguna libreria hacer click aca que esta en el drive](https://drive.google.com/drive/u/1/folders/1F_wEYkCxu6Q_lfDwXFLakEqubfufn4GW)

Crear con **Java with Ant** ó **Java Application** y no con **Maven** porque por ahora no necesitamos todas las dependencias que nos ofrece Maven. De este modo asi nosotros podemos agregar las librerías manualmente, justo la versión que necesitamos, y además al ser proyectos chicos, no queremos que pese un montón por todas las librerías de Maven.

---

## Ejercicio practico

1- En **phpMyAdmin** croe una base de datos llamada **hotel** con **utf8-spanish2_ci**. Solo CREO la base de datos y la DEJO VACIA. 

Tambien puedo ir a las **usuarios** y crear uno con todos los privilegios para esta base de datos hotel. En el usuario en el nombre del servidor poner **%** y si me da error, poner **127.0.0.1** o sino **localhost**. 

Siempre para sacar de apuro está el usuario **root** que tiene todos los permisos, es el usuario y contraseña que se usa para entrar a phpMyAdmin.

2- En **Netbeans** creo un proyecto nuevo llamado **probandoJPA**

3- Configuro mi base de datos en **Databases**, ya veo algunas base de datos que ya viene pre creadas con NetBeans. Voy a **New Connection** y agrego el Driver, si no lo veo lo agrego con **Add**, siempre que agrgo pongo el **.jar** que es el ejecutable de Java. Si no lo tengo el mismo NetBeans me va a sugerir bajar la version 8, sino con el driver que nos compartió la profesora en el Drive.

Y en **Customize Connection**

Host: localhost

Database : hotel  (aca va el nombre de la base de datos que creo antes)

User Name: root (o el usuario que cree en el phpMyAdmin)

Password: (con la clave del usuario que creo en phpMyAdmin)

JDBC URL: jdbc:mysql:localhost:3306/hotel?serverTimezone=UTC

**serverTimezone=UTC** esto es muy importante cambiarlo para no tener incompatibilidad por el horario entre nuestra computadora y donde este el servidor

-> Con NetBeans 8 hay que usar el driver version 5

-> Test Conection

4- En **Database** veo mi base de datos, es muy importante hacer:

**click derecho** -> **Desconectar**

Sino cuando luego me quiero conectar me va a decir que ya estoy conectada.

5- Creo los paquetes :

**logica**

**igu**

**persistencia**

6- En el paquete **logica** croe la clase **Huesped** que va a ser la entidad que voy a mapear.

```JAVA
package logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Huesped {
  //atributos
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Basic
  private String nombre;
  private String apellido;
  @Temporal(TemporalType.DATE)
  private Date fechaNac;
  
  //cosntructor vacio
  public Huesped(){
  }
  
  //constructor con parametro
  public huesped(int id, String nombre, String apellido, Date fechaNac){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechanac = fechaNac;
  }
  
  //getters y setters
  public int getId(){
    return id;
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public int getNombre(){
    return nombre;
  }
  
  public void setId(String nombre){
    this.nombre = nombre;
  }
  
   public int getApellido(){
    return apellido;
  }
  
  public void setId(String apellido){
    this.apellido = apellido;
  }
  
   public int getFechaNac(){
    return fechaNac;
  }
  
  public void setId(Date fechaNac){
    this.fechaNac = fechaNac;
  }
}
```

* Si para **@Entity** no me sale la libreria, ir a **Libaries** -> **Add JAR Folder** -> buscar javax.persistence.2.0.0 (en las versiones más nuevas de NetBeans no viene, hay que agregarla).

* Al trabajar con Date es **Temporal** y tengo que aclarar que tipo de Temporal es : 

- @Temporal(TemporalType.DATE) : para la fecha

- @Temporal(TemporalType.TIME) : para la hora

- @Temporal(TemporalType.TIMESTAMP) : para la fecha y hora

* En mi Id puedo hacer que se me autogenere un valor, para ello:

 @Id
 
 @GeneratedValue() : puede ser SECUENCE (si tengo un proveedor de secuencia), AUTO, IDENTITY , TABLE, etc. Siempre empezar con AUTO, si llego a tneer errores pasar a IDENTITIES o SECUENCE.
 
7- Teniendo mapeado todo puedo ir a crear la **unidad de persistencia**

En mi paquete **persistencia**, click derecho -> New -> Persistence Unit:

Presistence Unit Name : ProbandoJPAPU  (en general tengo el nombre de mi proyecto+PU)

Persistence Library: EclipseLink

DataBase Connection : (elijo la conexion que cree de hotel)

Seleccionar *Create*

Finish

Ya me queda creada. si voy a **source** veo el codigo xml. Y en **Design** tengo que agregar las **clases entidades** -> Add class y ahi elijo mi clase Huesped y la agrego.

8- Creo mi Controlador de Persistencia Huesped, en el paquete **persistencia** -> New -> Other -> Persistence -> JPA Controller Clases from Entity Clases -> elijo el paquete persistencia -> lo agrego y veo que voy a tener una carpeta de **persistence exception**

-> **HuespedJPAController** que ya tiene codigo pre armado.

9- Creo los clases **Controladora** en el paquete **logica** creo la clase **Controladora.java** y en el paquete **persistencia** creo **ControladoraPersistencia**

---
