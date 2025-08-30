public class Musica {
    String titulo;
    String artista;
    double duracao;

    Musica(String t, String a, double d) {
        titulo = t;
        artista = a;
        duracao = d;
    }

    public String toString() {
        return titulo + " - " + artista + " (" + duracao + " min)";
    }
}
