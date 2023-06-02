/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejcubonotas;
import java.util.Random;
/**
 *
 * @author NTK_MDR
 */
public class EjCuboNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double notas[][][] = new double[10][3][4];
        int i,j,k;
        
        Random azar = new Random();
        
        for(i=0;i<10;i++)
            for(j=0;j<3;j++)
                for(k=0;k<4;k++)
                    notas[i][j][k] = azar.nextDouble(7);
        
        for(k=0;k<4;k++){
            System.out.println("Semestre: "+(k+1));
            for(i=0;i<10;i++){
                for(j=0;j<3;j++)
                    System.out.print(notas[i][j][k]+"\t");
                System.out.println();
            }
        }
    }
    
}
