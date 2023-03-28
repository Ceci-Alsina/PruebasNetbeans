
import java.util.Scanner;

/*
 * TCrea una aplicación que nos pida un número por teclado y con una función se
*lo pasamos por parámetro para que nos indique si es o no un número primo, debe
*devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
*Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
*17 si es primo.

 */

/**
 *
 * @author cecal
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        if (EsPrimo(num)){
        System.out.println(num +" Es numero primo");
        }else{
            System.out.println(num +"no es numero primo");
            }
    }
    
    
public static boolean EsPrimo(int num){
    if (num<=1){
        return false;
    }
    for (int i=2; i <= num/2; i++){
        if (num % i == 0){
            return false;
        }
    }  
    return true;
}
}
//Para saber si un número es primo, hago un bucle desde 2 hasta la mitad del 
//número y se verifica si es divisible entre alguno de los números 
//en ese rango. Si no es divisible, se devuelve trueindicando que es un número 
//primo. Si se encuentra un número divisor, se devuelve falseindicando que no 
//es primo.