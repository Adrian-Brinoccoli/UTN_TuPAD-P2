/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaramos las variables para guardar los datos que ingresa el usuario
        double precio, impuesto, descuento;
        
        //Solicitamos al usuario el precio del producto
        System.out.println("Ingrese el precio base del producto:");
        precio = (double)input.nextDouble();
        
        //Solicitamos al usuario el porcentaje del impuesto
        System.out.println("Ingrese el impuesto del porcentaje: ");
        impuesto = (double)input.nextDouble();
        
        //Solicitamos al usuario porcentaje de descuento.
        System.out.println("Ingrese el descuento en porcentaje");
        descuento = (double)input.nextDouble();
        
        //Colocamos el retorno del metodo en una variable.
        double precioFinal = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: $" + precioFinal);    
    }
    
    /**
     * Calcular el precio final de un producto aplicando un impuesto y un descuento
     * 
     * @param precioBase El precio base del producto sin impuesto.
     * @param impuesto el porcentaje de impuesto a aplicar.
     * @param descuento el porcentaje del descuento que se va aplicar.
     * @return El precio final del producto con el impuesto y descuento aplicados. 
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + ((precioBase * impuesto)/100) -((precioBase * descuento)/100);
        return precioFinal;
    }
}
