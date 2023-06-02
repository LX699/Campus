/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batallanavalm4;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class BatallaNavalM4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,x,y,contHU=0,contHM=0,filaU,colU,filaM,colM;
        
        int marU[][] = new int [5][5];
        int marM[][] = new int [5][5];
        
        Scanner leer = new Scanner(System.in);
        for(i=0;i<5;i++){
            do{
            do{
                System.out.println("Fila: ");
                filaU = leer.nextInt();
            }while(filaU<0||filaU>4);
            do{
                System.out.println("Columna: ");
                colU = leer.nextInt();
            }while(colU<0||colU>4);
            }while(marU[filaU][colU]==1);
            marU[filaU][colU]=1;
        }
        
        Random azar = new Random();
        for(i=0;i<5;i++){
            do{
                filaM = azar.nextInt(5);
                colM = azar.nextInt(5);
            }while(marM[filaM][colM]==1);
            marM[filaM][colM]=1;
        }
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
                System.out.print(marU[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
                System.out.print(marM[i][j]+"\t");
            System.out.println();
        }
        
        do{
            do{
                System.out.println("Ingrese Fila");
                filaU = leer.nextInt();
            }while(filaU<0||filaU>4);
            do{
                System.out.println("Ingrese Columna");
                colU = leer.nextInt();
            }while(colU<0||colU>4);
            if(marM[filaU][colU]==1){
                System.out.println("Hundio un barco");
                contHU++;
                marM[filaU][colU]=2;
            }
            else
                System.out.println("Al agua!!");
            
            filaM = azar.nextInt(5);
            colM = azar.nextInt(5);
            System.out.println("Disparo Maquina "+filaM+"-"+colM);
            if(marU[filaM][colM]==1){
                System.out.println("Maquina Hundio un barco");
                contHM++;
                marU[filaM][colM]=2;                
            }
            else
                System.out.println("al Agua!!");
        }while(contHU<5||contHM<5);
    }
}
