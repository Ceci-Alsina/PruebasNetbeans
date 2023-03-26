
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se.
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
*la función equals() de la clase String.
 */

/**
 * @author cecal
 */
public class Detecta_Vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = input.nextLine();
        //uso toLowerCase() para que no haya problema con may/minusc
        letra = toLowerCase(letra);
        System.out.println(letra);
                
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
         System.out.println("La letra ingresada es una vocal");
        } else {
         System.out.println("La letra ingresada no es una vocal");
        }        
        /////////////////////////////////////////////////
        // lo mismo pero con método contains()

        // TAMBIÉN SE PODRÍA HACER CON indexOf()
        
        //if ("aeiou".indexOf(letra) != -1) {
        //System.out.println("La letra ingresada es una vocal");
        //} else {
        //System.out.println("La letra ingresada no es una vocal");
        //}
        //////////////////////////////////////////////
        //se usa indexOf() para buscar la letra en la cadena
        //"aeiou". Si la letra se encuentra en la cadena, el método indexOf() 
        //devuelve su posición en la cadena (que es diferente de -1), lo que 
        //significa que es una vocal. De lo contrario, el método devuelve -1, 
        //lo que significa que no es una vocal.
        
        if ("aeiou".contains(letra)) {
        System.out.println("La letra ingresada es una vocal");
        } else {
        System.out.println("La letra ingresada no es una vocal");
        }
        //utiliza el método contains() para verificar si la cadena "aeiou" 
        //contiene la letra ingresada por el usuario. Si la letra es una vocal, 
        //el método contains() devuelve true y se imprime el mensaje 
        //"La letra ingresada es una vocal". 
        //De lo contrario, el método devuelve false y se imprime el mensaje 
        //"La letra ingresada no es una vocal".
    }
    
}
