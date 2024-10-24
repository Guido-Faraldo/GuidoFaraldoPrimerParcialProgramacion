package primerparcial;

public class Revista extends Publicacion implements PublicacionLeible {
    
    private String numeroEdicion;

    public Revista(String titulo, int anioPublicacion, String numEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numEdicion;
    }
    
    @Override
    public void leer() {
        System.out.println("Soy una Revista y mi numero de edicion es: " + this.numeroEdicion);
    }

    @Override
    public String toString() {
        return "Revista[" + "numEdicion=" + numeroEdicion + ']';
    }
    
}
