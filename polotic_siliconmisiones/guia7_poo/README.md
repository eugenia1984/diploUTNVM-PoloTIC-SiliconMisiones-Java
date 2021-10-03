# Guía de Ejercicios Nº 7: Programación Orientada a Objetos - Parte 1

## 1) Objetos

**A.** Crear una clase llamada Auto, que tenga los siguientes atributos: color, marca, modelo, patente, cantidad de puertas (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

✓ Crear 3 objetos Auto utilizando parámetros

✓ Crear 1 objeto Auto sin parámetros.

✓ Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con parámetros.

✓ Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

-> Como el cuarto auto se creo con el constructor vacío (sin parámetros) y no le setee los valores de los atributos, cuando los traigo con los getters, al ser todos atributos String su valor por defecto es NULL. Si en un paso anterior los hubiera seteado,e tnonces me mostraría los valores.

Todo en código:

```JAVA
package objetos;


public class Auto {
    //Atributos
    private String color;
    private String marca;
    private Integer modelo;
    private String patente;
    private Integer cantidadPuertas;
    //Constructor vacio
    public Auto() {
    }
    //constructor con parametros
    public Auto(String color, String marca, Integer modelo, String patente, Integer cantidadPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }
    //Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
}
```


Y en mi clase main:

```JAVA
//Instancio 3 objetos Auto con su constructor con parametros
        Auto auto1 = new Auto("Blanco", "Fiat", 2021, "AE485WS", 4);
        Auto auto2 = new Auto("Gris", "Citroen", 1998, "AA756EI", 4);
        Auto auto3 = new Auto("Azul", "Volswagen", 2020, "AB768EJ", 4);
        //instancio un nuevo objeto Auto con su constructor sin parámetros
        Auto auto4 = new Auto();
        //Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con parámetros.
        System.out.println("El auto1 tiene -> marca : "+auto1.getMarca()+
                " , modelo : " +auto1.getModelo()+" , patente : "+auto1.getPatente());
        System.out.println("El auto2 tiene -> marca : "+auto2.getMarca()+
                " , modelo : " +auto2.getModelo()+" , patente : "+auto2.getPatente());
        System.out.println("El auto3 tiene -> marca : "+auto3.getMarca()+
                " , modelo : " +auto3.getModelo()+" , patente : "+auto3.getPatente());
        //Intentar obtener la marca del auto creado sin parámetros. ¿Se obtiene algún 
        //valor? De ser así… ¿Qué valor se obtiene?
        System.out.println("El auto4 tiene -> marca : "+auto4.getMarca()+
                " , modelo : " +auto4.getModelo()+" , patente : "+auto4.getPatente());
        
```

---

**B.** Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, alto, ancho, material, cantidad.

✓ Crear 3 muebles utilizando parámetros.

✓ Mostrar por pantalla el nombre y el material de los 3 muebles.

✓ Colocar “Madera” como material de los 3 muebles creados.

✓ Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles que fueron cambiados.


La clase en código:

```JAVA
package objetos;

public class Mueble {
    //Atributos
    private String nombre;
    private Double alto;
    private Double ancho;
    private String material;
    private Integer cantidad;
    //constructor vacio
    public Mueble() {
    }
    //constructor con parámetros
    public Mueble(String nombre, Double alto, Double ancho, String material, Integer cantidad) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    //toString
    @Override
    public String toString() {
        return "Mueble{" + "nombre = " + nombre + ", alto = " + alto + ", ancho = " + 
                ancho + ", material = " + material + ", cantidad = " + cantidad + '}';
    }
    
    
}
```


Y en mi clase main:

```JAVA
 //Crear 3 muebles utilizando parámetros
        Mueble mueble1 = new Mueble("Silla nordica", 1.2, 0.80, "madera" , 16);
        Mueble mueble2 = new Mueble("Mesa nordica", 1.5, 1.2, "madera" , 4);
        Mueble mueble3 = new Mueble("Banqueta", 0.5, 0.5, "madera", 10);
        //cambiar a los tres el material a madera paraiso
        mueble1.setMaterial("medara paraiso");
        mueble2.setMaterial("medara paraiso");
        mueble3.setMaterial("medara paraiso");
        //Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles 
        // que fueron cambiados.
        System.out.println("Mueble 1: "+mueble1.getNombre()+" de : "+mueble1.getMaterial());
        System.out.println("Mueble 2: "+mueble2.getNombre()+" de : "+mueble2.getMaterial());
        System.out.println("Mueble 3: "+mueble3.getNombre()+" de : "+mueble3.getMaterial());
```
---

**C.** Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

✓ Crear un vector de tipo Mascota que pueda almacenar 5 mascotas. Crear 5 mascotas y guardarlas en el vector.

✓ Recorrer el vector creado y mostrar por pantalla el nombre, especie y sexo de las mascotas almacenadas.

✓ Cambiar el nombre de dos mascotas. Mostrar por pantalla los datos de las dos mascotas cuyos nombres fueron cambiados.

✓ Recorrer el vector y mostrar por pantalla únicamente a las mascotas que sean de la especie “perro”.


En la clase mascota:

```JAVA
package objetos;


public class Mascota {
    //Atributos
    private String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;
    //constructor vacio
    public Mascota() {
    }
    //Constructor con parametros
    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //toString

    @Override
    public String toString() {
        return "nombre = " + nombre + ", especie = " + especie +
                ", sexo = " + sexo + ", color = " + color + ", pelaje = " +
                pelaje + ", raza = " + raza + '}';
    }
    
    
}
```

En la clase main:

```JAVA
System.out.println("\n******* CLASE MASCOTA ********\n");
        //Crear un vector de tipo Mascota que pueda almacenar 5 mascotas.
        Mascota[] mascotas = new Mascota[5];
        //Crear 5 mascotas y guardarlas en el vector.
        //String nombre, String especie, String sexo, String color, String pelaje, String raza
        mascotas[0] = new Mascota("Pipi", "perro", "Macho", "marron", "pelo largo", "Perro");
        mascotas[1] = new Mascota("Tweeti", "canario", "Macho", "amarillo", "plumas", "Canario");
        mascotas[2] = new Mascota("Rumba", "perro", "Hembra", "negro y blanco", "pelo largo", "Border Collie");
        mascotas[3] = new Mascota("Manchitas", "gato", "Hembra", "gris y negro", "pelo corto", "Gato");
        mascotas[4] = new Mascota("Nemo", "pez", "Macho", "naranja", "escamas", "Pez");
        //Recorrer el vector creado y mostrar por pantalla el nombre, especie y sexo de las mascotas almacenadas.
        for (int i = 0; i < 5; i++) {
            System.out.println("Mascota : " + (i+1));
            System.out.println("Nombre: "+ mascotas[i].getNombre());
            System.out.println("Especie: "+mascotas[i].getEspecie());
            System.out.println("Sexo: "+mascotas[i].getSexo());
        }
        //Cambiar el nombre de dos mascotas. Mostrar por pantalla los datos de las 
        // dos mascotas cuyos nombres fueron cambiados
        mascotas[1].setNombre("Pajarito");
        mascotas[2].setNombre("Rumbita");
        System.out.println("Las mascotas a las que les cambie los nombres son :");
        System.out.println("Mascota 2 "+mascotas[1].toString());
        System.out.println("Mascota 3 "+mascotas[2].toString());
        //Recorrer el vector y mostrar por pantalla únicamente a las mascotas que sean de la especie “perro”.
        System.out.println("----- Mascotas con especie: PERRO -----");
        for (int i = 0; i < 5; i++) { 
            if (mascotas[i].getEspecie().equalsIgnoreCase("perro")) {
                System.out.println(mascotas[i].toString());
            }
        }      
```

---

:computer:  todo el código se puede ver en la carpeta [**objetos**](https://github.com/eugenia1984/diploUTNVM-PoloTIC-SiliconMisiones-Java/tree/main/polotic_siliconmisiones/guia7_poo/objetos)

---
