package reproductor;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    
    @Override
    public String toString() {
        return "Artista del momento{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
}


