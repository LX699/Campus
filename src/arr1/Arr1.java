/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arr1;
import java.util.Scanner;
/**
 *
 * @author lab
 */
public class Arr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ap, x;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de datos");
        x = leer.nextInt();
        
        int vector[] = new int [x];
        
        
        
        for(ap=0;ap<x;ap++){
            System.out.println("Ingrese Numero "+ap);
            vector[ap] = leer.nextInt();
        }
               
        for(ap=0;ap<x;ap++){
            System.out.println("vector["+ap+"] - "+vector[ap]);
        }
        
        
    }
}
