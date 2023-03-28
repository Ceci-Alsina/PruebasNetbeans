
import java.util.Scanner;

/*
 * programa que procese una secuencia de caracteres ingresada por teclado y
*terminada en punto, y luego codifique la palabra o frase ingresada 
*de la siguiente manera:  aeiou se cambian por  @#$%*
 */

/**
  * @author cecal
 */
public class Codigo_Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
   
        System.out.println("ingrese caracteres por teclado y termine en punto");
        String text = input.nextLine();
       
        System.out.println(Cod_Palabras(text));
        
    }
    public static String Cod_Palabras (String text) {
            
        int i;
        int longitud = text.length();
        String text2 = "";
               
        for (i=0; i<longitud; i++){
            String aux = text.substring(i, i+1);

            switch (aux){
                case "a":
                    text2 += "@";
                   
                    break;
                case "e":
                    text2 += "#";
                    break;
                case "i":
                    text2 +="$";
                    break;
                case "o":
                    text2+="%";
                    break;
                case "u":
                    text2 += "*";
                    break;
                default:
                     text2 += aux;
                     break;
            }
              
        }
               
      return text2;
    }
}