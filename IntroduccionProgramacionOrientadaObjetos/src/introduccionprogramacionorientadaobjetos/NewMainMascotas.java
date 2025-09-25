
package introduccionprogramacionorientadaobjetos;


public class NewMainMascotas {

    public static void main(String[] args) {
        // Creamos una mascota y le asignamos valores.
        Mascotas m1=new Mascotas ();
        m1.setNombre("Mia");
        m1.setEspecie("Gato");
        m1.setEdad(2);
        
        //Mostramos informacion de la mascota
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.cumplirAnios();
        
        System.out.println("Resultado Final");
        m1.mostrarInfo();
        
        
        
    }
    
}
