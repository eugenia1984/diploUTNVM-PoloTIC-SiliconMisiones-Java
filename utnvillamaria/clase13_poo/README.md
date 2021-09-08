## Última clase práctica de Francisco para luego pasar a POO

#### Nos muestra como bajar Eclipse, pero podemos usar NetBeans, IntelliJ o VSC

   * Crear un paquete (**package**)
   * Crear la clase main (la clase principal que va a ejecutar mi programa)
   * Tener a mano la consola (asi vemos el output)
   * Ver **Proyects** donde están los **package** y las **clases**

### Se ve la resolución de los ejercios prácticos de la clase 10


Repaso:

-Importar el paquete **util**:

```JAVA
import java.util.Scanner;
```

-Para poder Scanear los datos que se ingresen (INPUT):

```JAVA
Scanner leer = new Scanner(System.in);
```   

-Con el + se concatenan Strings, y también String con Número (int , float, double)

-Si voy a dividir dos números enteros y si guardo en una variable que va a tener el resultado de la división debería ser int, pero **para tener mejor precisión siempre es recomendable que sean todos DOUBLE / FLOAT**

-Organizar los algoritmos en este orden:

   * variables
   * INPUT : valore sque voy a pedir
   * PROCESAMIENTO: las cuentas que hago
   * OUTPUT: lo que sale por consola

-Para calcular la **potencia** usamos de la clase **Math** el método **pow**:

Su sintaxis es: 
```
Math.pow(numero_a_calcular_potencia, el_valor_de_la_potencia_a_elevar);
```

Entonces si quiero calcular 5 al cuadrado -> ```JAVA Math.pow(5,2);```

-Para saber si un número es **par** o **impar** uso el **modulo** -> ``` numero / 2 == 0 ```

-Para el ejercicio de si un numero es primo:

```JAVA
import java.util.Scanner;

public class OtraClase{
  //CON RETURN PUEDO SALIR DEL MÉTODO MAIN Y FINALIZAR  EL PROGRAMA
  Scanner sc = new Scanner(Suystem.in);
  
  System.out.println("Ingrese un número entero: ");
  int numero = sc.nextInt();
  
  //El 0, 1 Y 4 NO SON PRIMOS
  if( numero == 0 || numero == 1 || numero == 4) {
    System.out.println("El número no es primo");
    return;
  }
  
  for(int x = 2; x < numero / 2; x++) {
    //SI ES DIVISIBLE POR CUALQUIERA DE ESTOS NUMEROS, NO ES PRIMO
    if(numero % x == 0) {
      System.out.println("No es primo");
      return;
    }
    //SI NO SE PUDO DIVIDIR POR NINGUNO DE LOS DE ARRIBA, SI ES PRIMO
    System.out.println("Es primo");
  }
}

```
----
