
package introduccionprogramacionorientadaobjetos;


public class NewMain {

   
    public static void main(String[] args) {
        
        Estudiante estudiante1=new Estudiante();
        estudiante1.setNombre("Adrian");
        estudiante1.setApellido(" Garcia");
        estudiante1.setCurso("Ingles");
        estudiante1.setCalificacion(8);
        
        System.out.println("Informacion Inicial");
        estudiante1.mostrarInfo();
        
        System.out.println("Subir calificacion en 1.5 puntos");
        estudiante1.subirCalificacion(1.5);
        
        System.out.println("Bajar calificacion 2 puntos");
        estudiante1.bajarCalificacion(2);
        
        System.out.println("Informacion Final");
        estudiante1.mostrarInfo();
    }
    
}
