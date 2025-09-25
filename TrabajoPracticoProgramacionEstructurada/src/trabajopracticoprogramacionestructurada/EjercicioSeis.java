/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaramos e iniciamos contadores en 0
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0, num;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            //Verificamos si es igual a 0 o menor o mayor
            if(num > 0) {
               contadorPositivos++;
            } else if (num < 0) {
                contadorNegativos++;
            } else if (num == 0) {
                contadorCeros++;
                
            }
        }
        
        System.out.println("Resultados");
        System.out.print("Positivos: " + contadorPositivos + "\n");
        System.out.print("Negativos: " + contadorNegativos + "\n");
        System.out.print("Ceros: " + contadorCeros);
      
    }   
}
