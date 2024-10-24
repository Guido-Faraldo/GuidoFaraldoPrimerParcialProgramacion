package primerparcial;

public class Libro extends Publicacion implements PublicacionLeible {
    
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anioPublicacion, String autor, Genero genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
    }
    
    @Override
    public void leer() {
        System.out.println("Soy un Libro y mi autor es: " + this.autor);
    }

    @Override
    public String toString() {
        return "Libro [" + "autor=" + autor + ", genero=" + genero + ']';
    }
    
}
