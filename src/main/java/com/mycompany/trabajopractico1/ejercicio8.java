/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico1;

import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        //Declaramos input
        Scanner input = new Scanner(System.in);
        
        //Declaramos las variables
        int num1, num2;
        
        //Solicitamos aal Usuario que ingrese los datos
        System.out.println("Ingrese dos numeros enteros");
        System.out.println("Numero1: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Numero 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        //Mostramos el resultado por consola
        
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
    }
    
}
