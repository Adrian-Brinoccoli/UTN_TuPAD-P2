
package introduccionprogramacionorientadaobjetos;


public class NewMainNaveEspacial {

  
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Enterprise");
        nave.setCombustible(50);
        
        System.out.println("Estado Inicial: ");
        nave.mostrarEstado();
        nave.despegar();
        nave.mostrarEstado();
        
        System.out.println("Intentando avanzar 20 km:");
        nave.avanzar(20);
        
        System.out.println("Recargar 40 unidades de combustible");
        nave.recargarCombustible(30);
        
        System.out.println("Intentando avanzar 30 km:");
        nave.avanzar(30);
        
         System.out.println("Estado Final: ");
         nave.mostrarEstado();
    }
}
