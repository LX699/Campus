/*
 * Programa que crea un vector a partir de dos vectores iniciales. El tercer
 * vector debe llenarse con los valores intercalados de los otros vectores.
 */
package ejvector1;
import java.util.*;
/**
 *
 * @author lab
 */
public class EjVector1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ap, ap1, ap2, cDatos1,cDatos2,cDatos3;
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        
        //Crea los tres vectores
        System.out.println("Ingrese cantidad de datos vector 1");
        cDatos1= leer.nextInt();
        int vec1[] = new int [cDatos1];
        System.out.println("Ingrese cantidad de datos vector 2");
        cDatos2 = leer.nextInt();
        int vec2[] = new int [cDatos2];
        cDatos3 = cDatos1 + cDatos2;
        int vec3[] = new int [cDatos3];
        
        //Llena los dos primeros vectores con datos aleatorios entre 1 y 100
        for(ap=0;ap<cDatos1;ap++){
            vec1[ap] = azar.nextInt(100) + 1;
        }
        for(ap=0;ap<cDatos2;ap++){
            vec2[ap] = azar.nextInt(100) + 1;
        }
        
        //Muestra ambos vectores
        for(ap=0;ap<cDatos1;ap++){
            System.out.print(vec1[ap]+" - ");
        }
        System.out.println();
        for(ap=0;ap<cDatos2;ap++){
            System.out.print(vec2[ap]+" - ");
        }
        System.out.println();
        
        //Intercalar datos de ambos vectores en un tercero
        ap1=0;
        ap2=0;
        for(ap=0;ap<cDatos3;ap++){
            if ((ap%2==0 && ap1<cDatos1) || (ap%2!=0 && ap2>=cDatos2)) {
                vec3[ap] = vec1[ap1];
                ap1++;
            }
            else{
  
                    vec3[ap] = vec2[ap2];
                    ap2++;

            }
        }
        
        //Muestra vector resultante
        for(ap=0;ap<cDatos3;ap++){
            System.out.print(vec3[ap]+" - ");
        }
        System.out.println();
    }
}
