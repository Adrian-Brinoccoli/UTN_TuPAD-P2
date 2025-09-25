
package introduccionprogramacionorientadaobjetos;


public class Libro {
    //Declaramos los atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //Declaramos getter y setter para los atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = 2025;
        if (anioPublicacion > 0 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;
    }
    
    
}
    
    //Metodo para mostrar la informacion del libro
    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo + "\n Autor: " + this.autor + "\n Año de Publicacion: " + this.anioPublicacion);
    }
    
}

  

