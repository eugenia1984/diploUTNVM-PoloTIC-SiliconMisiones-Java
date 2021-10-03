package objetos;

public class Objetos {


    public static void main(String[] args) {
        //Instancio 3 objetos Auto con su constructor con parametros
        Auto auto1 = new Auto("Blanco", "Fiat", 2021, "AE485WS", 4);
        Auto auto2 = new Auto("Gris", "Citroen", 1998, "AA756EI", 4);
        Auto auto3 = new Auto("Azul", "Volswagen", 2020, "AB768EJ", 4);
        //instancio un nuevo objeto Auto con su constructor sin parámetros
        Auto auto4 = new Auto();
        System.out.println("\n******* CLASE AUTO ********\n");
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
        
        System.out.println("\n********* CLASE MUEBLE *******\n");
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
    }
    
}
