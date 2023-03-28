
import java.util.Scanner;

/*
 * TCrea una aplicación que le pida dos números al usuario y este pueda elegir
*entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
*función para cada operación matemática y deben devolver sus resultados para 
*imprimirlos en el main. 

 */

/**
 *
 * @author cecal
 */
public class Func_Suma_Resta_Multi_Div {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = input.nextDouble();
        System.out.println("Ingrese otro número distinto de cero");
        double num2 = input.nextDouble();
        System.out.println("Elija la opción de la operación deseada: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = input.nextInt();
        switch (opcion){
            case 1:
                System.out.println(num1 + " + " +num2 +" = " +suma(num1, num2));
                return;
            case 2: 
                System.out.println(num1 + " - " +num2 +" = " +resta(num1, num2));
                return;
            case 3: 
                System.out.println(num1 + " * " +num2 +" = " +multiplicacion(num1, num2));
                return;
            case 4:
                if (num2 !=0){
                 
                    System.out.println(num1 +" / " +num2 +" = " +division(num1, num2));
                }else{
           System.out.println("Usted ingreso un cero como segundo numero");
       }
        }
    }
    //////////////////////////////
   public static double suma (double num1, double num2){
       
       double resultado = num1 + num2;
              
       return resultado;
   } 
   /////////////////////////////////////
   public static double resta (double num1, double num2){
       
       double resultado = num1 - num2;
              
       return resultado;
   }
   //////////////////////////////////
   public static double multiplicacion (double num1, double num2){
       
       double resultado = num1 * num2;
              
       return resultado;
   }
   ////////////////////////////
   public static double division (double num1, double num2){
              
       double resultado = num1 / num2;
       
       return resultado;
   }
}
