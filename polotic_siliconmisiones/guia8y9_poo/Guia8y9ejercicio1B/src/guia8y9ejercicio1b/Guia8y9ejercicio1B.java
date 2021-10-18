package guia8y9ejercicio1b;

import java.util.Scanner;


public class Guia8y9ejercicio1B {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String opcion;
        String nombre;
        String color;
        Double calorias;
        String tipoCascara;
        
        opcion = "";
        
        //Crear un vector de tipo Fruta que pueda almacenar 5 frutas. 
        Fruta frutas[] = new Fruta[5];
        
        //Crear 5 frutas y guardarlas en el vector.
        System.out.println("--- POR FAVOR INGRESE 5 FRUTAS ---\n");
        for (int i = 0; i < frutas.length ; i++) {
            //instancio un objeto de fruta
            Fruta fruta = new Fruta();
            //String nombre
            System.out.println("FRUTA " + (i+1)+" :");
            System.out.println("INGRESE EL NOMBRE :");
            nombre = sc.next();
            if(nombre == null || nombre.trim().isEmpty()){
                System.out.println("DEBE INGRESAR UN NOMBRE");
            }
            fruta.setNombre(nombre.toUpperCase());
            
            //String color
            System.out.println("INGRESE EL COLOR: ");
            color = sc.next();
            if(color == null || color.trim().isEmpty()){
                System.out.println("DEBE INGRESAR UN COLOR");
            }
            fruta.setColor(color.toUpperCase());
            
            //Double calorias
            System.out.println("INGRESE LAS CALORIAS (SI ES NUMERO DECIMAL CON ,): ");
            calorias = sc.nextDouble();
            fruta.setCalorias(calorias);
            
            //String tipoCascara
            System.out.println("INGRESE EL TIPO DE CASCARA \n (dura - blanda): ");
            tipoCascara = sc.next();
            
            if(tipoCascara == null || tipoCascara.trim().isEmpty()){
                System.out.println("DEBE INGRESAR EL TIPO DE CASCARA");
            } 
            fruta.setTipoCascara(tipoCascara.toUpperCase());
            
            //Boolean esComestible            
            do {
                System.out.println("ES COMESTIBLE ? INGRESE Y/N (Y SI ES COMESTIBLE / N SI NO ES COMESTIBLE):");
                opcion = sc.next().toUpperCase();
                System.out.println(opcion);
                if(opcion == null || opcion.trim().isEmpty()){
                    System.out.println("DEBE INGRESAR UNA OPCION ENTRE Y O N");
                } 
                
                switch (opcion) {
                    case "Y":   
                        fruta.setComestible(true);
                        break;
                    case "N":   
                        fruta.setComestible(false);
                        break;
                    default:
                        System.out.println("No eligió una opción válida");
                }
            } while(!opcion.equalsIgnoreCase("Y") && !opcion.equalsIgnoreCase("N")); 
            
            //Agrego el objeto fruta al vector
            frutas[i]= fruta;
        }
        
        //Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las frutas almacenadas.
        for (int i = 0; i < 5; i++) {
            System.out.println("La fruta "+ frutas[i].getNombre()+" tiene "+ 
                    frutas[i].getCalorias()+" calorias.");
        }
        
        //Cambiar todos los datos de dos frutas
        System.out.println("--VAMOS A MODIFICAR LOS DATOS DE LAS DOS PRIMERAS FRUTAS INGRESADAS --\n");
        for (int i = 0; i < 2; i++) {
            //String nombre
            System.out.println("INGRESE EL NOMBRE :");
            if(sc.next() == null || sc.next().trim().isEmpty()){
                System.out.println("DEBE INGRESAR UN NOMBRE");
            } 
            //String color
            frutas[i].setNombre(sc.next().toUpperCase());
            System.out.println("INGRESE EL COLOR: ");
            if(sc.next() == null || sc.next().trim().isEmpty()){
                System.out.println("DEBE INGRESAR UN COLOR");
            }
            frutas[i].setColor(sc.next().toUpperCase());
            
            //Double calorias
            System.out.println("INGRESE LAS CALORIAS (SI ES NUMERO DECIMAL CON ,): ");
            frutas[i].setCalorias(sc.nextDouble());
            //String tipoCascara
            System.out.println("INGRESE EL TIPO DE CASCARA \n (dura - blanda): ");
            if(sc.next() == null || sc.next().trim().isEmpty()){
                System.out.println("DEBE INGRESAR EL TIPO DE CASCARA");
            } 
            frutas[i].setTipoCascara(sc.next().toUpperCase());
            //Boolean esComestible            
             do {
                System.out.println("ES COMESTIBLE ? INGRESE Y/N (Y SI ES COMESTIBLE / N SI NO ES COMESTIBLE):");
                opcion = sc.next().toUpperCase();
                System.out.println(opcion);
                if(opcion == null || opcion.trim().isEmpty()){
                    System.out.println("DEBE INGRESAR UNA OPCION ENTRE Y O N");
                } 
                
                switch (opcion) {
                    case "Y":   
                        frutas[i].setComestible(true);
                        break;
                    case "N":   
                        frutas[i].setComestible(false);
                        break;
                    default:
                        System.out.println("No eligió una opción válida");
                }
            } while ( !opcion.equalsIgnoreCase("Y") && !opcion.equalsIgnoreCase("N")); 
        }
        
        //Mostrar por pantalla los datos de todas las frutas luego del cambio.
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i].toString()+"\n");
        }
        
        //Recorrer el vector y mostrar por pantalla únicamente a las frutas que sean de color verde.
        System.out.println("--MOSTRAMOS LAS FRUTAS DE COLOR VERDE "+
                " (de no tener no mostramos ninguna) --");
         for (int i = 0; i < frutas.length; i++) {
            if(frutas[i].getColor().equalsIgnoreCase("VERDE")){
                System.out.println(frutas[i].toString()+"\n");
            }
        }
    }
    
}
