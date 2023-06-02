/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reservapc;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class ReservaPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc, fil, col, pago=0;
        
        Scanner leer = new Scanner(System.in);
        boolean lab[][] = new boolean [5][6];
        
        do{
            System.out.println("Sistema de reserva de PC");
            System.out.println("1. Reserva PC");
            System.out.println("2. Libera PC");
            System.out.println("3. Salir");
            System.out.println("Ingrese su opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1: System.out.println("Reserva de PC");
                System.out.println("Ingrese fila y columna del PC");
                fil = leer.nextInt();
                col = leer.nextInt();
                if (lab[fil][col]==false){
                    lab[fil][col] = true;
                    if (fil==1){
                        pago = pago + 1000;
                    }
                    else{
                        if (fil==2 || fil==3){
                            pago = pago + 1500;
                        }
                        else
                            pago = pago + 2000;
                    }
                        
                }
                else{
                    System.out.println("Error - PC Ocupado!!");
                }
                    
                    break;
                case 2: System.out.println("Libera PC");
                System.out.println("Ingrese fila y columna del PC");
                fil = leer.nextInt();
                col = leer.nextInt();
                if (lab[fil][col]==true){
                    lab[fil][col] = false;
                }
                else{
                    System.out.println("Error - PC Desocupado!!");
                }
                    break;
                case 3: System.out.println("Gracias por su visita");
                    break;
                default: System.out.println("Error!!");
                    break;
            }
        }while(opc!=3);
        System.out.println("Recaudación del día: $ "+pago);
    }
}
