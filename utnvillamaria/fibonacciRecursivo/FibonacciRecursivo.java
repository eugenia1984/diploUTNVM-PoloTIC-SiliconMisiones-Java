
package fibonacciRecursivo;

//Fibonacci como el rectangulo de oro en arte que va haciendo el espiral
//0 1 1 2 3 5 8 13 21 34
// n = (n-1) + (n-2)

public class FibonacciRecursivo {

    public static void main(String[] args) {
        //Es hasta el valor que quiero que llegue i (va a ser mi n para calcular en fibonacciRecursivo), para que corte y no sea loop infinito
        int serie = 10;  
 
        //inicia con valor 0, a condición es que sea menor a 10, incrementa de 1 en 1
        for (int i = 0; i < serie; i++) { 
            System.out.println(fibonacciRecursivo(i));  //Llamo a la funcion fibonacciRecursivo
        }
 
    }
    
    
    public static int fibonacciRecursivo(int n) {
 
        if (n == 0) {  //Si n es 0 va a devolver 0
            return 0;
        } else if (n == 1) {  //si n es 1 va a devolver 1
            return 1;
        } else { //Cuando n este entre el 2 y el 10 -> calculo : n = (n-1) + (n-2)
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
    }
    
}
