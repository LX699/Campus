/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejarreglos2;
import java.util.Scanner;
/**
 *
 * @author NTK_MDR
 */
public class EjArreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,ap;
        float suma=0,prom;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Cantidad de datos");
        N = leer.nextInt();
        float vector1[] = new float[N];
        float vector2[] = new float[N];
        
        for(ap=0;ap<N;ap++){
            System.out.println("Ingrese Nota "+(ap+1));
            vector1[ap] = leer.nextFloat();
        }
        
        for(ap=0;ap<N;ap++)
            System.out.println(vector1[ap]);
        
        //promedio Simple
        for(ap=0;ap<N;ap++)
            suma = suma + vector1[ap];
        prom = suma/N;
        System.out.println("El promedio es: "+prom);
        
        //Promedio Ponderado
        for(ap=0;ap<N;ap++){
            System.out.println("Ingrese ponderacion prueba "+(ap+1));
            vector2[ap] = leer.nextFloat();
        }
        
        float sumaPon = 0;
        for(ap=0;ap<N;ap++)
            sumaPon = sumaPon + vector1[ap]*vector2[ap];
        
        System.out.println("EL promedio ponderado es: "+sumaPon);
    }
    
}
