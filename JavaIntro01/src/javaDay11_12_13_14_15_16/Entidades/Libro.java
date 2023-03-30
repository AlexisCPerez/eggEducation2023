//Crear una clase llamada Libro que contenga los siguientes atributos: 
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
//los datos al usuario y luego informar mediante otro método el número de ISBN, 
//el título, el autor del libro y el número de páginas.
package javaDay11_12_13_14_15_16.Entidades;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro() {
    }
    
    public void ingresarDatos(String titulo,int ISBN, String autor, int numeroDePaginas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        
    }

@Override
    public String toString() {
        return "Libro " + "ISBN =" + ISBN + ", titulo =" + titulo + ", autor =" + autor + ", paginas =" + numeroDePaginas;
    }
    
}

