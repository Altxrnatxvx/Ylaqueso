/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laquesoporte;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Laquesoporte {

    /**
     * @param args the command line argumentsggg
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int numero1 = 0;
       int numero2= 0;
        System.out.println("ingresa el primer numero");
        numero1 = leer.nextInt();
            
        System.out.println("ingresa el segundo numero");
        numero2= leer.nextInt();
       int suma = numero1 + numero2;       
    
        
        System.out.println("Perra la suma de esos es " + suma + " y esto esta hecho en java");        
    }
    
}
