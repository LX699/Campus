/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejnotas;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class EjNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila, columna, f, c, contAp=0, contRp=0, contEx=0;
        double suma=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de estudiantes");
        fila = leer.nextInt();
        System.out.println("Ingrese cantidad de evaluaciones");
        columna = leer.nextInt();
        
        double pNotas[][] = new double [fila][columna+1];
        
        //Guarda las notas en la matriz
        for(f=0;f<fila;f++){
            for(c=0;c<columna;c++){
                System.out.println("Ingrese nota "+(c+1)+" del estudiante "+(f+1));
                pNotas[f][c] = leer.nextDouble();
            }
        }
        
        //Muestra el contenido de la matriz
        for(f=0;f<fila;f++){
            for(c=0;c<columna;c++){
                System.out.print(pNotas[f][c]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        //Calcula Promedios
        for(f=0;f<fila;f++){
            suma=0;
            for(c=0;c<columna;c++){
                suma = suma + pNotas[f][c];
            }
            pNotas[f][c] = suma/columna;
        }
        
        //Muestra el contenido de la matriz incluyendo promedio
        for(f=0;f<fila;f++){
            for(c=0;c<columna+1;c++){
                System.out.print(pNotas[f][c]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        //Contar aprobados reprobados y en examen
        for(f=0;f<fila;f++){
            if (pNotas[f][columna]>=4){
                contAp++;
            }
            else{
                if (pNotas[f][columna]>=3.6){
                    contEx++;
                }
                else{
                    contRp++;
                }
            }                
        }
        System.out.println("Aprobados: "+contAp);
        System.out.println("Reprobados: "+contRp);
        System.out.println("Examen: "+contEx);
            
    }
}
