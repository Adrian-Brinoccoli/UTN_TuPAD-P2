/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioCinco {
    public static void main(String[] args) {
       //Declaramos input para leer los datos
       Scanner input = new Scanner(System.in);
       //Declaramos num e inicializamos en 1
       int num = 1;
       //Declaramos sumaPares e inicializamos en 0
       int sumaPares = 0;
       
       while(num != 0) {
           System.out.println("Ingrese un numero (0 para terminar)");
           num = Integer.parseInt(input.nextLine());
           
           if (num % 2 == 0) {
               sumaPares = sumaPares + num; // Amontonamos la suma de numeros pares
           }
       }
       
       System.out.println("La suma de los numeros pares es: " + sumaPares);
    }
    
}
