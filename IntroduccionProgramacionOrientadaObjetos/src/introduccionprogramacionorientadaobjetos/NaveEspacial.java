
package introduccionprogramacionorientadaobjetos;

public class NaveEspacial {
    //Declaramos los atributos privados
    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    //Metodo Despegar
    public void despegar() {
        if(this.combustible >= 5) { //Vemos si nave tiene combustible para poder despegar
            System.out.println("La nave despego ");
            this.combustible -=5; // se le resta las unidades necesarias para que despegue
        } else {
            System.out.println("No hay suficiente combustible para despegar");
        }
    }
    
    //Metodo avanzar
    public void avanzar(int distancia) {
        if((distancia * 2) <= this.combustible) { //cada km comsume 2 unidades de combustible
            System.out.println("La nave avanzo " + distancia + "kms");
            this.combustible -= (distancia *2); 
        } else {
            System.out.println("No hay suficiente combustible, por favor recargue! ");
        }
    }
    
    //Metodo recargar
    public void recargarCombustible(int cantidad) {
        int maximo = 100; // maximo disponible del tanque de la nave
        if((cantidad + this.combustible) <= maximo) { //verificamos que no revalse el tanque de la nave
          this.combustible += cantidad;
        } else {
            System.out.println("Ha ingresado demasiado combustible");   
        }
    }
    
    //Metodo para mostrar el estado de la nave.
    public void mostrarEstado() {
        System.out.println("Nombre: " + this.nombre + ", combustible: " + this.combustible);
    }
    
}
