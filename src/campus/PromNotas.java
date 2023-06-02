/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package promnotas;
import java.util.Scanner;
/**
 *
 * @author lab
 */
public class PromNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float suma=0,prom;
        int cNotas, ap;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese CAntidad de notas");
        cNotas = leer.nextInt();
        
        float vNotas[] = new float [cNotas];
        
        //Ingresa las notas al vector de Notas
        for(ap=0;ap<cNotas;ap++){
            System.out.println("Ingrese nota "+(ap+1));
            vNotas[ap] = leer.nextFloat();
        }
        
        //Muestra todas las notas almacenadas en el vector
        for(ap=0;ap<cNotas;ap++){
            System.out.println("Nota "+(ap+1)+" : "+vNotas[ap]);
        }
        
        //Calcula el promedio de las notas
        for(ap=0;ap<cNotas;ap++){
            suma = suma + vNotas[ap];
        }
        prom = suma/cNotas;
        
        System.out.println("El promedio es: "+prom);
    }
}
