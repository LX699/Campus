/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejnotascurso;
import java.util.Scanner;
/**
 *
 * @author NTK_MDR
 */
public class EjNotasCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantEst, cantNotas,i,j;
        double suma=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de estudiantes");
        cantEst = leer.nextInt();
        System.out.println("Cantidad de Notas");
        cantNotas = leer.nextInt();
        
        double notas[][] = new double[cantEst][cantNotas+1];
        
        for(i=0;i<cantEst;i++)
            for(j=0;j<cantNotas;j++){
                System.out.println("Ingrese Nota "+(j+1)+" Estudiante "+(i+1));
                notas[i][j] = leer.nextDouble();
            }
        
        for(i=0;i<cantEst;i++){
            for(j=0;j<cantNotas;j++)
                System.out.print(notas[i][j]+"\t");
            System.out.println();
        }
    
    
    for(i=0;i<cantEst;i++){
        suma=0;
        for(j=0;j<cantNotas;j++)
            suma = suma + notas[i][j];
        notas[i][cantNotas] = suma/cantNotas;
    }
    
    for(i=0;i<cantEst;i++){
            for(j=0;j<cantNotas+1;j++)
                System.out.print(notas[i][j]+"\t");
            System.out.println();
        }
    
}
}
