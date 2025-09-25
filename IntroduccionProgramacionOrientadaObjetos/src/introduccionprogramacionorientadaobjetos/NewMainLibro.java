
package introduccionprogramacionorientadaobjetos;


public class NewMainLibro {

   
    public static void main(String[] args) {
        //Creamos Objeto Libro
        Libro libro1 = new Libro();
        
        //agregamos valores a cada tributo
        libro1.setTitulo("La Casa de los Espiritud");
        libro1.setAutor("Isabel Allende");
        libro1.setAnioPublicacion(2026); // Publicacion Invalida
        
        // Mostramos la informacion habiendo puesto un año erroneo
        libro1.mostrarInfo();
        System.out.println("");
        libro1.setAnioPublicacion(1982); // año valido de publicacion
        libro1.mostrarInfo();
        
    }
    
}
