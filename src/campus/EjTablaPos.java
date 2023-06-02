/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejtablapos;
import java.util.Random;
/**
 *
 * @author NTK_MDR
 */
public class EjTablaPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tabla[][] = new int[10][8];
        int i,j, golesEqi,golesEqj;
        
        Random azar = new Random();
        for(i=0;i<9;i++)
            for(j=i+1;j<10;j++){
                golesEqi = azar.nextInt(6);
                golesEqj = azar.nextInt(6);
                tabla[i][0]++;
                tabla[j][0]++;
                tabla[i][4] = tabla[i][4] + golesEqi;
                tabla[j][4] = tabla[j][4] + golesEqj;
                tabla[i][5] = tabla[i][5] + golesEqj;
                tabla[j][5] = tabla[j][5] + golesEqi;
                tabla[i][6] = tabla[i][4] - tabla[i][5];
                tabla[j][6] = tabla[j][4] - tabla[j][5];
                if (golesEqi>golesEqj){
                    tabla[i][1]++;
                    tabla[j][3]++;
                    tabla[i][7] = tabla[i][7] + 3;
                }
                else
                    if (golesEqi<golesEqj){
                        tabla[j][1]++;
                        tabla[i][3]++;
                        tabla[j][7]+=3;
                    }
                    else{
                        tabla[i][2]++;
                        tabla[j][2]++;
                        tabla[i][7]+=1;
                        tabla[j][7]+=1;
                    }
                        
                    
            }
        
        for(i=0;i<10;i++){
            for(j=0;j<8;j++)
                System.out.print(tabla[i][j]+"\t");
            System.out.println();
        }
                
    }
    
}
