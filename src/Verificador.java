public class Verificador {
    public String resultado_jogo(Player p1, Player p2) {
        String quem_venceu;
        int result = p1.getJogada() + p2.getJogada();
        int impar_par = p1.getEscolha();

        if(result % 2 == 0 && impar_par == 2 || result % 2 != 0 && impar_par == 1) {
          quem_venceu = p1.getName();
        } else {
          quem_venceu = p2.getName();
        }
        return ("Vencedor: " + quem_venceu + "\n");
      }
    
}
