import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private int impar_par;
    private int jogada;
    Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getEscolha() {
        return this.impar_par;
    }

    public int getJogada() {
        return this.jogada;
    }
    
    public void impar_ou_par() {
        System.out.println("Você quer ser impar(1) ou par(2)");
        this.impar_par = input.nextInt();
    }

    public void jogada_numerica() {
        System.out.println("Escolha um número de 1 a 10");
        this.jogada = input.nextInt();
    }

    public void jogada_randomica() {
        Random random = new Random();
        this.jogada = random.nextInt(10) + 1;
    }
    
}
