/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        // Declaramos input de tipo Scanner para leer los datos ingresados por el Uuario
        Scanner input = new Scanner(System.in);
        
        //Declaramos las variables
        String nombre;
        int edad;
        
        //Pedimos al usuario ingresar los datos
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        
        //Imprimimos los datos por pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }
        
}
    

