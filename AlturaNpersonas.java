
import java.util.Scanner;

/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se 
 *encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */

/**
 *
 * @author cecal
 */
public class AlturaNpersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas:");
        int n = input.nextInt();
        double suma1 = 0;
        double suma2 = 0;
        double cont = 0;
    
        for (int i = 0; i <= n-1 ; i++) {
            System.out.print("Ingrese la altura: ");
            double altura = input.nextDouble();
            
            if (altura >= 160) {
                suma1 = suma1 + altura;
                
            }else if (altura < 160) {
                suma2 = suma2 + altura;
                cont++;
                System.out.print(cont);
            }
            

        }
        if (cont > 0){
            System.out.println("El promedio de los menores a 1.60m es: " + (suma2 / cont));
        } else {
            System.out.println("No hay personas con altura menor a 1.60m.");
        }
        System.out.println("El promedio general es: " + ((suma1 + suma2) / n));
        }
       
        
        
    }
    
