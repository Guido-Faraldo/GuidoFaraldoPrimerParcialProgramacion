package primerparcial;

public class Ilustracion extends Publicacion{
    
    private String nombreIlustrador;
    private double ancho;
    private double largo;

    public Ilustracion(String titulo, int anioPublicacion, String nombreIlustrador, double ancho, double largo) {
        super(titulo, anioPublicacion);
        this.nombreIlustrador = nombreIlustrador;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ilustracion[" + "nombreIlustrador=" + nombreIlustrador + ", ancho=" + ancho + ", largo=" + largo + ']';
    }
    
}
