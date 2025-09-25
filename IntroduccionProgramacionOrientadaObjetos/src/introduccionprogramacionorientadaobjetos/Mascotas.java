
package introduccionprogramacionorientadaobjetos;


public class Mascotas {
    //Declaramos atributos privados
    private String nombre;
    private String especie;
    private int edad;
    
    //Declaramos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Informacion de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "\n Especie: " + this.especie + "\n Edad: " + this.edad);
    }
    
    //Metodo Cumplir Años
    public void cumplirAnios(){
        this.edad += 1;
    }
    
}
