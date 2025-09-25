/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("Ingrese una nota del 0 al 10");
            nota = Integer.parseInt(input.nextLine());
            
            if(nota < 0 || nota > 10) {
             System.out.println("Error: nota no valida. Ingrese una nota entre 0 y 10");
            } else {
                System.out.println("Nota guardada correctamente");
                
            } 
        }while(nota < 0 || nota > 10);
    }

}
        
    
    

