
import java.util.Scanner;

/*Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
 *en todos los tipos de tratamientos.
*Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
*los mismos tratamientos que los socios del tipo A.
*Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
*dichos tratamientos.
*Solicite una letra (carácter) que representa la clase de un socio, y luego un 
*valor real que represente el costo del tratamiento (previo al descuento) y 
*determine el importe en efectivo a pagar por dicho socio.
 */

/**
 *
 * @author cecal
 */
public class AsocObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        String tipoAsoc = "";
        float desc = 0; 
        float tratam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto de tratamiento requerido:");
        tratam = input.nextFloat();
    do {
 
        System.out.println("Ingrese que tipo de asociado es: ");
        tipoAsoc = input.next();
        
        
    }while (!tipoAsoc.equals("A") && !tipoAsoc.equals("B")&& !tipoAsoc.equals("C"));
        
    switch(tipoAsoc){
        case "A":
            float valorTrat = (tratam * 50) / 100;
            System.out.println("El valor del tratamiento con descuento es " +" $" +valorTrat);
            break;
        case "B":
        
            valorTrat = (tratam * 35) / 100;
            System.out.println("El valor del tratamiento con descuento es" +" $" +valorTrat);
            break;
        case "C":
            
            System.out.println("El valor del tratamiento es sin descuento es " +" $" +tratam);
            break;
    }
}
}
