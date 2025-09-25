/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        //declaramos para leer los datos
        Scanner input = new Scanner(System.in);
        int anio; // se declara la variable anio, aqui va a guardar el valor ingresado por el usuario
        
        //Solicitamos un valor al usuario
        System.out.println("Ingrese un año para verificar si es bisiesto");
        anio = Integer.parseInt(input.nextLine());
        
        //Verificamos el condicional sea divisible por 4 y no por 100, a excepcion que el año se divisible por 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}