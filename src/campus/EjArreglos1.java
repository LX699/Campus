/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejarreglos1;
import java.util.Scanner;
/**
 *
 * @author NTK_MDR
 */
public class EjArreglos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de numeros");
        N = leer.nextInt();
        
        int vector[] = new int [N];
        int ap = 0;
        
        
        while(ap<N){
            System.out.println("Ingrese numero");
            vector[ap] = leer.nextInt();
            ap++;
        }
       //Muestra el contenido del vector
        System.out.println("Contenido del vector");
        for(ap=0;ap<N;ap++){
            System.out.println(vector[ap]);
        }
        
        //mostrar mayor valor y posición
        int x=0,pos=0;
        
        for(ap=0;ap<N;ap++){
            if(vector[ap]>x){
                x = vector[ap];
                pos = ap;
            }
                
        }
        System.out.println("El mayor es: "+x+" - en la posicion: "+pos);
        int aux=0;
        
        //invierte el vector
        for(ap=0;ap<N/2;ap++){
           aux = vector[(N-1)-ap];
           vector[(N-1)-ap] = vector[ap];
           vector[ap] = aux;
           
        }
        
        //Muestra el contenido del vector
        System.out.println("Contenido del vector");
        for(ap=0;ap<N;ap++){
            System.out.println(vector[ap]);
        }
        
        x=0;pos=0;
        
        for(ap=0;ap<N;ap++){
            if(vector[ap]>x){
                x = vector[ap];
                pos = ap;
            }
                
        }
        System.out.println("El mayor es: "+x+" - en la posicion: "+pos);
        
        
    }
    
}
