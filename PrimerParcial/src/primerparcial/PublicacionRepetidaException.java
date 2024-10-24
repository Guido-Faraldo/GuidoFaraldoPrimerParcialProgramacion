package primerparcial;

public class PublicacionRepetidaException extends RuntimeException{
    
    private static final String MENSAJE = "No se puede agregar una publicacion que ya esta repetida"; 

    public PublicacionRepetidaException() {
        super(MENSAJE);
    }

}
