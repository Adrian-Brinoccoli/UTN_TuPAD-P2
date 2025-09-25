/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioCuatro {

    public static void main(String[] args) {
        //Declaramos para leer los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables donde se van a guardar los precios y las distintas categorias para los descuentos
        int precio;
        double precioConDescuento;
        char categoria;
        
        System.out.println("Ingrese el precio del producto ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoria del producto (A, B o C) ");
        categoria = input.nextLine().charAt(0);
        
        switch (categoria) {
        case 'A':
        case 'a':
            precioConDescuento = precio -(precio * 0.10);
            System.out.print("Descuento aplicado 10%");
            System.out.println("");
            System.out.print("Precio final: $" + precioConDescuento);
            break;
        case 'B':
        case 'b':
            precioConDescuento = precio -(precio * 0.15);
            System.out.print("Descuento aplicado 15%");
            System.out.println("");
            System.out.print("Precio final: $" + precioConDescuento);
            break;
        case 'C':
        case 'c':
            precioConDescuento = precio -(precio * 0.20);
            System.out.print("Descuento aplicado 20%");
            System.out.println("");
            System.out.print("Precio final: $" + precioConDescuento);
            break;
        default:
            System.out.println("No es una categoria valida");
            break;
        }
    }  
             
        
}
    

    


