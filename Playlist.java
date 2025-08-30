import java.util.ArrayList;

public class Playlist {
    ArrayList<Musica> musicas = new ArrayList<>();

    void adicionar(Musica m) {
        musicas.add(m);
        System.out.println("Musica adicionada!");
    }

    void remover(String titulo) {
        boolean achou = false;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).titulo.equalsIgnoreCase(titulo)) {
                musicas.remove(i);
                System.out.println("Musica removida!");
                achou = true;
                break;
            }
        }
        if (!achou) {
            System.out.println("Musica nao encontrada.");
        }
    }

    void listar() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist esta vazia.");
        } else {
            for (Musica m : musicas) {
                System.out.println(m);
            }
        }
    }

    void duracaoTotal() {
        double total = 0;
        for (Musica m : musicas) {
            total += m.duracao;
        }
        System.out.println("Duracao total: " + total + " min");
    }
}
