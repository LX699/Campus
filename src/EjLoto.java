/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author NTK_MDR
 */
public class EjLoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,n4,n5,n6;
        int s1,s2,s3,s4,s5,s6;
        int ptos=0;
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese los 6 numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        n4 = leer.nextInt();
        n5 = leer.nextInt();
        n6 = leer.nextInt();
        
        Random azar = new Random();
        //Sorteo
        s1 = azar.nextInt(36)+1;
        do{
            s2 = azar.nextInt(36)+1;
        }while(s2==s1);
        do{
            s3 = azar.nextInt(36)+1;
        }while(s3==s1 || s3==s2);
        do{
            s4 = azar.nextInt(36)+1;
        }while(s4==s1 || s4==s2 || s4==s3);
        do{
            s5 = azar.nextInt(36)+1;
        }while(s5==s1 || s5==s2 || s5==s3 || s5==s4);
        do{
            s6 = azar.nextInt(36)+1;
        }while(s6==s1 || s6==s2 || s6==s3 || s6==s4 || s6==s5);
        
        if (n1==s1 || n1==s2 || n1==s3 || n1==s4 || n1==s5 || n1==s6)
            ptos++;
        if (n2==s1 || n2==s2 || n2==s3 || n2==s4 || n2==s5 || n2==s6)
            ptos++;
        if (n3==s1 || n3==s2 || n3==s3 || n3==s4 || n3==s5 || n3==s6)
            ptos++;
        if (n4==s1 || n4==s2 || n4==s3 || n4==s4 || n4==s5 || n4==s6)
            ptos++;
        if (n5==s1 || n5==s2 || n5==s3 || n5==s4 || n5==s5 || n5==s6)
            ptos++;
        if (n6==s1 || n6==s2 || n6==s3 || n6==s4 || n6==s5 || n6==s6)
            ptos++;
        System.out.println("Numeros sorteados");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("Puntos: "+ptos);
        if (ptos==6)
            System.out.println("Felicidades!! - Gano: $ 1.000.000.000.000");
        else
            if (ptos==5)
                System.out.println("Gano $ 1.000");
            else
                if (ptos==4)
                    System.out.println("Gano $ 1");
                else
                    System.out.println("Siga participando");
    }
    
}
