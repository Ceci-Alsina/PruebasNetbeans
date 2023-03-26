
import java.util.Scanner;

/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
*muestre su equivalente en romano.
 */

/**
 *
 * @author cecal
 */
public class NumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num;
        
        do {
            System.out.print("Ingresa un número del 1 al 10: ");
            num = input.nextInt();
        } while (num < 1 || num > 10);
        
        
        switch (num){
            case 1:
                System.out.println("En números romanos es I");
                break;
            case 2: 
                System.out.println("En números romanos es II");
                break;
            case 3: 
                System.out.println("En números romanos es III");
                break;
            case 4: 
                System.out.println("En números romanos es IV");
                break;
            case 5: 
                System.out.println("En números romanos es V");
                break;
            case 6:
                System.out.println("En números romanos es VI");
                break;
            case 7:
                System.out.println("En números romanos es VII");
                break;
            case 8:
                System.out.println("En números romanos es VIII");
                break;
            case 9:
                System.out.println("En números romanos es IX");
                break;
            case 10:
                System.out.println("En números romanos es X");
                break;
                // el default no se ejecuta x le agregué el do / while arriba
            default:
                System.out.println("Usted ingresó un número fuera de rango");
        }
        
        
    }
    
}
