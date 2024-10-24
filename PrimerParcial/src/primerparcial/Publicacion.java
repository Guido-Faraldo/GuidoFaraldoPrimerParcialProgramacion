package primerparcial;

import java.util.Objects;

public abstract class Publicacion {
    
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
           return false;
        }
        Publicacion other = (Publicacion)obj;
        return this.titulo.equals(other.titulo) && this.anioPublicacion == other.anioPublicacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anioPublicacion);
    }

}
