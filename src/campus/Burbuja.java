/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package burbuja;
import java.util.*;
/**
 *
 * @author NTK_MDR
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vLong,i,j,aux;
        Random azar = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("Defina Tamaño del vector");
        vLong = leer.nextInt();
        int vector[] = new int[vLong];
        
        for(i=0;i<vLong;i++)
            vector[i] = azar.nextInt(100);
        
        for(i=0;i<vLong;i++)
            System.out.print(vector[i]+"-");
        System.out.println();
        
        for(i=0;i<vLong;i++)
            for(j=i+1;j<vLong;j++)
                if (vector[i]<vector[j]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
        for(i=0;i<vLong;i++)
            System.out.print(vector[i]+"-");
        System.out.println();
    }
    
}
