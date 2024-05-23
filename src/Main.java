import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Infome seu nome: ");
        String playerName = input.nextLine();

        Player p1 = new Player(playerName);
        Player p2 = new Player("CPU");
        Verificador verificador = new Verificador();

        p1.impar_ou_par();
        p1.jogada_numerica();
        p2.jogada_randomica();

        String vencedor = verificador.resultado_jogo(p1, p2);
        System.out.println(vencedor);
    }

}