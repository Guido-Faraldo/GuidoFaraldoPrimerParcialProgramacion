package primerparcial;

public class PrimerParcial {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca("Leemos Juntos");
        
        cargarBiblioteca(biblioteca);
        
        biblioteca.mostrarPublicaciones();
        
        System.out.println("----------------");
        
        biblioteca.leerPublicaciones();
        
    }
    
    private static void cargarBiblioteca(Biblioteca biblioteca){
        
        Libro lib1 = new Libro("Consejos de vida", 2020, "Joaquin Perez", Genero.NO_FICCION); 
        Libro lib2 = new Libro("Las aventuras en el espacio", 2004, "Claudia Marquez", Genero.CIENCIA); 
        
        Revista rev1 = new Revista("Los Mejores vestidos", 2024, "12234564");
        Revista rev2 = new Revista("Fashion day", 2019, "13443");
        
        Ilustracion ilu1 = new Ilustracion("Perros jugando pocker", 1998, "Miguel Angel", 345, 489);
        Ilustracion ilu2 = new Ilustracion("Mirando al mar", 1856, "Laura Figueroa", 1043, 1340);
        
        Libro lib3 = lib1;
        
        //Es igual que rev1
        Revista rev3 = new Revista("Los Mejores vestidos", 2024, "12234564");
        Ilustracion ilu3 = new Ilustracion("Perros jugando pocker", 1998, "Miguel Angel", 345, 489);
        
        try{
            biblioteca.agregarPublicacion(lib1);
            biblioteca.agregarPublicacion(lib2);
            biblioteca.agregarPublicacion(rev1);
            biblioteca.agregarPublicacion(rev2);
            biblioteca.agregarPublicacion(ilu1);
            biblioteca.agregarPublicacion(ilu2);
            biblioteca.agregarPublicacion(null);
        }
        catch(NullPointerException ex){
            System.out.println("Pasaste un Null");
        }
        catch(PublicacionRepetidaException ex){
            System.out.println("Pasaste una publicacion repetida");
        }
        
    }
    
}
