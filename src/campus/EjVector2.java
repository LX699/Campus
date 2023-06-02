/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejvector2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lab
 */
public class EjVector2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ap, ap3, ap2, cDatos1,cDatos2,cDatos3;
        int contPar,contImpar;
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
        //Crea el vector inicial
        System.out.println("Ingrese cantidad de datos vector inicial");
        cDatos1= leer.nextInt();
        int vecInic[] = new int [cDatos1];
        
        //Llena vector inicial con datos aleatorios entre 1 y 100
        for(ap=0;ap<cDatos1;ap++){
            vecInic[ap] = azar.nextInt(100) + 1;
        }
        
        //Muestra vector inicial
        for(ap=0;ap<cDatos1;ap++){
            System.out.print(vecInic[ap]+" - ");
        }
        System.out.println();
        
        //cuenta cantidad de datos pares e impares
        contPar=0;
        contImpar=0;
        for(ap=0;ap<cDatos1;ap++){
            if (vecInic[ap]%2==0)
                contPar++;
            else
                contImpar++;
        }
        
        //Crea vector de datos pares e impares
        int vPar[] = new int [contPar];
        int vImpar[] = new int [contImpar];
        
        //Clasifica valores pares e impares en sus respectivos vectores
        ap2=0;
        ap3=0;
        for(ap=0;ap<cDatos1;ap++){
            if (vecInic[ap]%2==0){
                vPar[ap2] = vecInic[ap];
                ap2++;
            }
            else{
                vImpar[ap3] = vecInic[ap];
                ap3++;
            }
                
        }
        
        //Muestra vectores resultantes
        for(ap=0;ap<contPar;ap++){
            System.out.print(vPar[ap]+" - ");
        }
        System.out.println();
        for(ap=0;ap<contImpar;ap++){
            System.out.print(vImpar[ap]+" - ");
        }
        System.out.println();
              
    }
}
