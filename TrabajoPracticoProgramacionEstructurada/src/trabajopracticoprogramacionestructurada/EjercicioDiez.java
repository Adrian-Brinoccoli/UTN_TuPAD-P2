/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class EjercicioDiez {

 /**
 * Actualiza el stock disponible de un producto.
 * 
 * @param stockActual Cantidad actual de stock
 * @param cantidadVendida Cantidad de unidades vendidas
 * @param cantidaRecibida Cantidad de unidades recibidas
 * @return El nuevo stock disponible despues de aplicar ventas y reposiciones.
 */
public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
    int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
    return nuevoStock;
}

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese el stock actual");
    int stockActual = entrada.nextInt();
    
    System.out.println("Ingrese la cantidad de unidades vendidas ");
    int cantidadVendidas = entrada.nextInt();
    
    System.out.println("Ingrese la cantidad de unidades recibidas ");
    int cantidadRecibida = entrada.nextInt();
    
    int stockFinal = actualizarStock(stockActual, cantidadVendidas, cantidadRecibida);
    
    System.out.println("El nuevo stock disponible es: " + stockFinal);
    
}

  
}
