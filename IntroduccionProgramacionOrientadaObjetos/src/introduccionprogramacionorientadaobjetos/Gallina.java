
package introduccionprogramacionorientadaobjetos;


public class Gallina {
    //Declaramos atributos privados
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Declaramos los metodos getter y setter

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    //Metodo para que la gallina ponga un huevito
    public void ponerHuevo() {
        this.huevosPuestos +=1;
    }
    
    //Metodo envejecer
    public void envejecer() {
        this.edad +=1;
    }
    
    //Estado de la Gallina 
    public void mostrarEstado() {
        System.out.println("Id: " + this.idGallina + ", huevos puestos: " + this.huevosPuestos + ", edad: " + this.edad);
    }
    
}
