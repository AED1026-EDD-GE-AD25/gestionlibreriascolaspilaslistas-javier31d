package miPrincipal.modelo;

public class Libro {
    private String Titulo;
    private String Autor;
    private String isbn;
    
    public Libro(String Titulo, String Autor, String isbn) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return Titulo;
    }
    
    public String getAutor() {
        return Autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    @Override
    public String toString() {
        return "Libro{Titulo='" + Titulo + "', Autor='" + Autor + "', isbn='" + isbn + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        
        Libro other = (Libro) obj;
        
        // Comparación robusta de ISBN
        if (this.isbn == null) {
            return other.isbn == null;
        } else {
            return this.isbn.equals(other.isbn);
        }
    }
    
    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    
}}