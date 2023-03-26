
import java.util.Scanner;

/*
* Dado un tiempo en minutos, calcular su equivalente en días y horas. 
*Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
*su equivalente: 1 día, 2 horas
  */
/**
  * @author cecal
 */
public class EquivalenciaDiasHoras {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int min = input.nextInt();
             
        if (min > 60){
            int horas = min / 60;
            int dias = horas / 24; 
           
            System.out.println(dias + " dias " +horas +" horas ");
        }else {
            System.out.println(min +" minutos");
            
        }
        
        
    }
    }
