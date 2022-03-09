package personagens;

import movimentos.Ataque;
import movimentos.Defesa;

public class Inimigo {

    private static Inimigo inimigo;
    private float vida = 100;
    private int ataque = 10;
    private int poderDefesa = 10;

    private Inimigo() {
        super();
    }

    public void defender(Defesa defesa) {
        poderDefesa += defesa.defender();
    }

    public void parouDefender(Defesa defesa) {
        poderDefesa -= defesa.defender();
    }

    public void atacar(Ataque ataques) {
        ataque += ataques.atacar();
        Jogador jogador = Jogador.getJogador();
        jogador.setVida(this.getAtaque() / jogador.getPoderDefesa());
        if(jogador.getVida() <= 0){
            System.out.println("Jogador Morreu");
        }
    }
    
    public void parouAtacar(Ataque ataque) {
        poderDefesa -= ataque.atacar();
    }

    public static Inimigo getInimigo() {
        if (inimigo == null) {
            inimigo = new Inimigo();
        }
        return inimigo;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPoderDefesa() {
        return poderDefesa;
    }

    public void setPoderDefesa(int defesa) {
        this.poderDefesa = defesa;
    }
}
