/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioDos {
    public static void main(String [] args) {
        //declaramos para leer los datos.
        Scanner input = new Scanner(System.in);
        
        //Declaramos las variables
        int numUno, numDos, numTres, mayor;
        
        //Solicitamos al usuario que ingrese los numeros
        System.out.println("Ingrese 3 numeros");
        System.out.println("Primer numero: ");
        numUno = Integer.parseInt(input.nextLine());
        System.out.println("Segundo numero: ");
        numDos = Integer.parseInt(input.nextLine());
        System.out.println("Tercer numero: ");
        numTres = Integer.parseInt(input.nextLine());
        
        // Inicializamos mayor igualando a numUno
        mayor = numUno;
        
        if (numDos > mayor) { 
            mayor = numDos;
        }
        if (numTres > mayor) {
            mayor = numTres; 
        }
        
        // Mostramos al numero mayor
        System.out.println("El numero mayor es: " + mayor);
    }   
}
   
