/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioOnce {
    //Declaramos la variable global
    public static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }    
            
    public static void calcularDescuentoEspecial(double precio) {
        double descuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuento;

        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El precio con descuento es: " + precioFinal);
    }
    
}



    


    


   
   
    
