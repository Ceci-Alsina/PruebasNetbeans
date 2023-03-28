
import java.util.Scanner;

/*
 *Crea una aplicación que a través de una función nos convierta una cantidad 
*de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
*yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
*la moneda a convertir que será una cadena, este no devolverá ningún valor y 
*mostrará un mensaje indicando el cambio (void).
 */

/**
 *
 * @author cecal
 */
public class EurosDolarYenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        Scanner input = new Scanner(System.in);
      
        System.out.println("Ingrese cantidad de euros:");
        double euros = input.nextDouble();
        input.nextLine();// para limpiar el buffer
        System.out.println("Escriba a que quiere convertir los euros: dolares o libras o yenes: ");
        String moneda = input.nextLine();
        Convertidor(euros,moneda);
        
               
    }
    
public static void Convertidor(double euros, String moneda){
    
    if (moneda.equalsIgnoreCase("dolares")){
        double euros_dolar = euros * 1.28611;
        System.out.println(euros +" " +"euros, son" +" " +euros_dolar +moneda);
     
    }else if (moneda.equalsIgnoreCase("libras")){
        double euros_libra = euros * 0.86;
        System.out.println(euros +" " +" euros son " +" " +euros_libra +moneda);
                
    }else if (moneda.equalsIgnoreCase("yenes")){
        double euros_yenes = euros * 129.852;
        System.out.println(euros  +" " +"euros son " +" " +euros_yenes +moneda );
    }else{
        System.out.println("Usted ingresó una  moneda no contemplada" +" " +moneda);
        
    }
    
  
    
}    
}
