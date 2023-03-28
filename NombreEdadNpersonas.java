
import java.util.Scanner;

/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
*datos de las personas ingresadas por teclado e indique si son mayores 
*o menores de edad. Después de cada persona, el programa debe preguntarle
*al usuario si quiere seguir mostrando personas 
*y frenar cuando el usuario ingrese la palabra “No”
 */

/**
 *
 * @author cecal
 */
public class NombreEdadNpersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean seguirmostrando = true;
        
        while (seguirmostrando){
            ProcesaPersonas();
            System.out.println("¿Quiere seguir mostrando personas? (Sí/No):");
            String respuesta = input.nextLine();
           
            // uso ".equalsIgnoreCase " para que no importe si es SI o si o Si ..
            if (respuesta.equalsIgnoreCase("NO")){
                seguirmostrando = false;
      
            }
        }
          
    }
    
 // metodo que se que se encarga de pedir el nombre y la edad de la persona, 
 //determinar si es mayor o menor de edad y mostrar el resultado correspondiente
    // no retorna ningún valor 
  public static void ProcesaPersonas(){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Ingrese el nombre de la persona ");
      String nombre =input.nextLine();
      
      System.out.println("Ingrese la edad de " +nombre +":" );
      int edad = input.nextInt();
      
      input.nextLine(); // limpia el buffer de scanner
      
      if (edad>=18){
      System.out.println(nombre +" Es mayor de edad");
  }else{
          System.out.println(nombre +" Es menor de edad");
          }
      
      
  }          
       
  
                 
                 
                 
            
}

        
