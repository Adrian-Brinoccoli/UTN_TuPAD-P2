
package introduccionprogramacionorientadaobjetos;

public class NewMainGallina {
    
    public static void main(String[] args) {
        // Creamos Gallina y le asignamos valores a sus atributos.
        Gallina g1 = new Gallina();
        g1.setIdGallina("AP213UV");
        g1.setEdad(1);
        g1.setHuevosPuestos(0);
        
        Gallina g2 = new Gallina();
        g2.setIdGallina("AP214UV");
        g2.setEdad(2);
        g2.setHuevosPuestos(3);
        
        //Estado Inicial
        System.out.println("Estado Inicial de las Gallinas");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        //Llamamos 4 veces al estado ponerHuevo
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.ponerHuevo();
        
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();
        
        //LLamamos una vez al metodo envejecer
        g1.envejecer();
        g2.envejecer();
        
        //Estado Fianl de las Gallinas
        System.out.println("Estado Final de las Gallinas");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
    }
    
}
