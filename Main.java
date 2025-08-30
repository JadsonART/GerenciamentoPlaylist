import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int op = -1;

        while (op != 0) {
            System.out.println("\n1 - Adicionar musica");
            System.out.println("2 - Remover musica");
            System.out.println("3 - Listar musicas");
            System.out.println("4 - Duracao total");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Titulo: ");
                String t = sc.nextLine();
                System.out.print("Artista: ");
                String a = sc.nextLine();
                System.out.print("Duracao: ");
                double d = sc.nextDouble();
                sc.nextLine();
                Musica m = new Musica(t, a, d);
                playlist.adicionar(m);
            } else if (op == 2) {
                System.out.print("Digite o titulo: ");
                String titulo = sc.nextLine();
                playlist.remover(titulo);
            } else if (op == 3) {
                playlist.listar();
            } else if (op == 4) {
                playlist.duracaoTotal();
            } else if (op == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção invalida!");
            }
        }
        sc.close();
    }
}
