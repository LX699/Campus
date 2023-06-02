/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class BuscaMinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[10][10];
        
        int i,j,k,cont;
        Random azar = new Random();
        
        for(k=0;k<10;k++){
            i = azar.nextInt(10);
            j = azar.nextInt(10);
            if (matriz[i][j]==100)
                k--;
            else
                matriz[i][j] = 100;
        }
        
        for(i=0;i<10;i++){
            for(j=0;j<10;j++)
                System.out.print(matriz[i][j]+"\t");
            System.out.println();
        }
        
        for(i=0;i<10;i++)
            for(j=0;j<10;j++){
                cont=0;
                if (i>0 && i<9 && j>0 && j<9 && matriz[i][j]!=100){
                if (matriz[i-1][j-1]==100)
                    cont++;
                if(matriz[i-1][j]==100)
                    cont++;
                if(matriz[i-1][j+1]==100)
                    cont++;
                if(matriz[i][j-1]==100)
                    cont++;
                if (matriz[i][j+1]==100)
                    cont++;
                if(matriz[i+1][j-1]==100)
                    cont++;
                if(matriz[i+1][j]==100)
                    cont++;
                if (matriz[i+1][j+1]==100)
                    cont++;
                matriz[i][j] = cont;
                }
                else{
                    if (i==0 && j==0 && matriz[i][j]!=100){
                        if (matriz[0][1]==100)
                            cont++;
                        if (matriz[1][0]==100)
                            cont++;
                        if (matriz[1][1]==100)
                            cont++;
                        matriz[0][0] = cont;
                    }
                    else{
                        if (i==0 && j==9 && matriz[i][j]!=100){
                            if (matriz[0][8]==100)
                                cont++;
                            if (matriz[1][8]==100)
                                cont++;
                            if (matriz[1][9]==100)
                                cont++;
                            matriz[0][9] = cont;
                        }
                        else{
                            if (i==9 && j==0 && matriz[i][j]!=100){
                                if (matriz[8][0]==100)
                                    cont++;
                                if (matriz[8][1]==100)
                                    cont++;
                                if (matriz[9][1]==100)
                                    cont++;
                                matriz[9][0] = cont;
                            }
                            else{
                                if (i==9 && j==9 && matriz[i][j]!=100){
                                    if (matriz[9][8]==100)
                                        cont++;
                                    if (matriz[8][8]==100)
                                        cont++;
                                    if (matriz[8][9]==100)
                                        cont++;
                                    matriz[9][9]=cont;
                                }
                                else{
                                    if (i==0 && j!=0 && j!=9 && matriz[i][j]!=100){
                                        if (matriz[i][j-1]==100)
                                            cont++;
                                        if (matriz[i+1][j-1]==100)
                                            cont++;
                                        if (matriz[i+1][j]==100)
                                            cont++;
                                        if (matriz[i+1][j+1]==100)
                                            cont++;
                                        if (matriz[i][j+1]==100)
                                            cont++;
                                        matriz[i][j]=cont;
                                    }
                                    else{
                                        if (i==9 && j!=0 && j!=9 && matriz[i][j]!=100){
                                            if (matriz[i][j-1]==100)
                                                cont++;
                                            if (matriz[i-1][j-1]==100)
                                                cont++;
                                            if (matriz[i-1][j]==100)
                                                cont++;
                                            if (matriz[i-1][j+1]==100)
                                                cont++;
                                            if (matriz[i][j+1]==100)
                                                cont++;
                                            matriz[i][j] = cont;
                                        }
                                        else{
                                            if (j==0 && i!=0 && i!=9 && matriz[i][j]!=100){
                                                if (matriz[i-1][j]==100)
                                                    cont++;
                                                if (matriz[i-1][j+1]==100)
                                                    cont++;
                                                if (matriz[i][j+1]==100)
                                                    cont++;
                                                if (matriz[i+1][j+1]==100)
                                                    cont++;
                                                if (matriz[i+1][j]==100)
                                                    cont++;
                                                matriz[i][j] = cont;
                                            }
                                            else{
                                                if (j==9 && i!=0 && i!=9 && matriz[i][j]!=100){
                                                    if (matriz[i-1][j]==100)
                                                        cont++;
                                                    if (matriz[i-1][j-1]==100)
                                                        cont++;
                                                    if (matriz[i][j-1]==100)
                                                        cont++;
                                                    if (matriz[i+1][j-1]==100)
                                                        cont++;
                                                    if (matriz[i+1][j]==100)
                                                        cont++;
                                                    matriz[i][j] = cont;
                                                }
                                            }
                                                
                                        }
                                            
                                    }
                                        
                                }
                            }
                                
                        }  
                    }
                        
                }
                    
            }
            
        System.out.println(); 
        for(i=0;i<10;i++){
            for(j=0;j<10;j++)
                System.out.print(matriz[i][j]+"\t");
            System.out.println();
        }
            
    }
}
