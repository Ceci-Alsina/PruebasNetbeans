
import java.util.Scanner;

/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
*y el promedio de n números (n>0). El valor de n se solicitará al principio 
*del programa y los números serán introducidos por el usuario. 
*Realice dos versiones del programa, una usando el bucle “while” y 
*otra con el bucle “do - while"
 */

/**
 
 * @author cecal
 */
public class ValorMax_ValorMin_Prom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros:");
        int n = input.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE; 
        int Prom = 0;
        int i = 0;
        int suma = 0;
        int num = 0;
        
        while (i <= n-1){
            System.out.println("Ingrese los números");
            num = input.nextInt();
            suma+=num;
            if (num > max){
                max = num;
                
            }else if (num <= min){
                min = num;
            }
            ++i;
            
        }
        System.out.println("El máximo es:" +max);
        System.out.println("El mínimo es:" +min);
        System.out.println("el promedio es:" +(suma/n));
        
            
        
    }
    
}
