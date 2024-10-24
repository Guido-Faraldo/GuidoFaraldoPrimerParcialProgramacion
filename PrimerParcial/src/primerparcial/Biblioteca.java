package primerparcial;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private String nombre;
    private List<Publicacion> publicaciones;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new ArrayList<>();
    }
    
    public void agregarPublicacion(Publicacion p){
        if (this.publicaciones.contains(p)){
            throw new PublicacionRepetidaException();
        }
        if (p == null){
            throw new NullPointerException();
        }
        this.publicaciones.add(p);
    }
    
    public void mostrarPublicaciones() {
        if (!(this.publicaciones.isEmpty())){
            for (Publicacion p: this.publicaciones){
                System.out.println(p);
            }
        }
    }
    
    public void leerPublicaciones(){
        for (Publicacion p : this.publicaciones){
            if (p instanceof PublicacionLeible pl){
                pl.leer();
            }else{
                System.out.println(p + " no se puede leer");
            }
        }
    }
    
}
