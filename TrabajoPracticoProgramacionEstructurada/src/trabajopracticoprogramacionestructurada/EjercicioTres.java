/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioTres {
    public static void main (String[] args) {
        // Declaramos para leer los datos
        Scanner input = new Scanner(System.in);
        //declaramos variables para la edad ingresada por el usuario y variable para la clasificacion de la etapa de vida.
        int edad;
        String etapaVida = "";
        
        //Solicitamos al usuario la edad
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12 ) {
            etapaVida = "Niño/a";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else if (edad >= 60 ) {
            etapaVida = "Adulto Mayor";
        }
        System.out.println("Eres un " + etapaVida);
    }

}
