/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticoprogramacionestructurada;

import java.util.Scanner;


public class EjercicioNueve {
/**
 * @param peso peso del paquete en kilogramos
 * @param zona zona de envio, puede ser nacional o internacional
 * @return el costo de envio calculado: $ 5 por kilos para envios nacionales y 10 para internacionales.
 */

public static double calcularCostoEnvio(double peso, String zona) {
    double costoEnvio = 0;
    if(zona.equalsIgnoreCase("Nacional")) {
         costoEnvio = peso * 5;
    } else if (zona.equalsIgnoreCase("Internacional")) {
         costoEnvio = peso * 10;
    }
        
        return costoEnvio;
}

/**
 * Calcular el total de la compra sumando el precio del producto y el costo de envio
 * @param precioProducto precio base del producto sin costos extras.
 * @param costoEnvio costo de envio previo calculado.
 * @return el monto total a pagar de la compra.
 */
public static double calcularTotalCompra(double precioProducto, double costoEnvio){
    return precioProducto + costoEnvio;
}


public static void main(String[]args) {
    //Declaramos las variables para leer los datos.
    Scanner input = new Scanner(System.in);
    //Declaramos las variables parta guardar los datos ingresados por el usuario
    double peso, precioProducto;
    String zona;
    
    
    //Solicitamos el precio del producto al usuario
    System.out.println("Ingrese el precio del Producto");
    precioProducto = input.nextDouble();
    
    //Solicitamos al usurio el peso del paquete
    System.out.println("Ingrese el peso del paquete");
    peso = input.nextDouble();
    input.nextLine();
    
    //Solicitamos la zona de envio
    System.out.println("Ingrese la zona de envio (Nacional o Internancional)");
    zona = input.nextLine();
    
    double costoEnvio = calcularCostoEnvio(peso, zona);
    
    double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
    
    //Mostramos los resultados
    System.out.println("El costo de envio es: " + costoEnvio);
    System.out.println("El total a pagar es: " + precioFinal);
    
    

}
}
