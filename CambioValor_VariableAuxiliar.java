/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
*diferente a cada una. A continuación, realizar las instrucciones necesarias 
*para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
*tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
*variable. Utilizar sólo una variable auxiliar.
 */
/**
* @author cecal
 */
public class CambioValor_VariableAuxiliar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 100; 
        int B = 20; 
        int C = 300; 
        int D = 40; 
        System.out.println("A=" +A + " B=" +B +" C=" +C +" D=" + D);
        int Aux = 0;
        Aux = B;
        //B queda vacio 
        B = C; 
        //c queda vacio => pongo el valor  de A en C y A queda vacio
        C = A;
        // A vacio toma el valor de D y queda vacio
        A = D;
        //el valor de B esta en Aux
        D = Aux;
        
        System.out.println("A=" +A + " B=" +B +" C=" +C +" D=" + D);
        //
               
        
        
    }
    
    
}
