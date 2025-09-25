/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;


public class EjercicioDoce {

   
    public static void main(String[] args) {
        //Declaramos el array de precios y le asignamos valores.
        double[] precioProducto = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //Mostramos los precios originales.
        System.out.println("Precios originales: ");
        for(double precio : precioProducto) {
            System.out.println("Precio: " + precio);
        }
        
        //Modificamos el precio de la segunda posicion.
        precioProducto[2] = 129.99;
        
        //Mostramos los precios modificados
        System.out.println("Precios modificados: ");
        for(double precio : precioProducto) {
            System.out.println("Precio: " + precio);
        }
    }
    
}
