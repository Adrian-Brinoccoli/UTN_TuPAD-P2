/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;


public class EjercicioTrece {

    /**
     * Muestra los precios de un arreglo de precios dfe manera recursiva.
     * @param precios un arreglo de tipo "double" que contiene los precios 
     * @param indice un indice entero que indica la posicion actual en el arreglo.
     */
    public static void mostrarPreciosRecursivos(double[] precios, int indice) {
        //si el indice es menor que el arreglo sigue el proceso.
        if (indice < precios.length) {
            //imprime el precio actual en la posicion del arreglo
            System.out.println("Precio: $" + precios[indice]);
            // llama recursivamente a la funcion.
            mostrarPreciosRecursivos(precios, indice + 1);
        }
    }
    public static void main(String[] args) {
        // Declaramos e inicializamos array
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //mostrar los precios originales
        System.out.println("Precios Originales:");
        mostrarPreciosRecursivos(precios, 0);
        
        //modificamos el precio de la segunda posicion
        precios[2] = 129.99;
        
        //Mostramos los precios con la modificacion.
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivos(precios, 0);
    }
    
}
