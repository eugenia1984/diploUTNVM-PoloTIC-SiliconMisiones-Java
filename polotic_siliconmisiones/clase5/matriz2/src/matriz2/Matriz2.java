package matriz2;

import java.util.Scanner;

public class Matriz2 {


    public static void main(String[] args) {
        
        //Declaro la matriz de 5 filas x 3 columnas
        int goles[][] = new int[5][3];
        //Declaro el vector
        double promedios[] = new double[5];
        Scanner teclado = new Scanner(System.in);
        //variable auxiliar para calcular la suma de los goles
        int suma = 0;

        //cargo la matriz con los goles
        for(int f = 0; f < 5; f++){  //for para las filas
          for( int c = 0; c < 3; c++){  //for para las columnas
            System.out.println("Jugador: "+f+" Partido: "+c+".Ingresar goles: ");
            goles[f][c] = teclado.nextInt();
          }
        }

        //calculo los promedios y guardo en vector
        //A medida que vaya ingresando los goles los voy a tener que sumar para 
        //luego calcular promedio
        for(int f = 0; f < 5; f++){  //for para las filas
          for( int c = 0; c < 3; c++){  //for para las columnas
            suma = suma + goles[f][c];
          }
          //calculo el promedio y lo guardo en el vector
          promedios[f] = (double)suma / 3;
          //tengo que setear a 0 la suma para que comience a acumular la suma del proximo jugador
          suma = 0;
        }  

        //mostrar los goles y los promedios por pantalla
        for(int f = 0; f < 5; f++){  //for para las filas
          System.out.println("------ Jugador número " + f + " ---------" );
          for( int c = 0; c < 3; c++){  //for para las columnas
            System.out.println("Goles del partido N. "+c+": "+goles[f][c]);
          }
          System.out.println("El promedio de goles fue : "+promedios[f]);
        }
    }
    
}
