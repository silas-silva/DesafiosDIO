package personagens;

import movimentos.Ataque;
import movimentos.Defesa;

public class Jogador {

    private static Jogador jogador;
    private float vida = 100;
    private int ataque = 10;
    private int poderDefesa = 10;

    private Jogador() {
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
        Inimigo inimigo = Inimigo.getInimigo();
        inimigo.setVida(inimigo.getVida() - (this.getAtaque() / inimigo.getPoderDefesa()));
        System.out.println(inimigo.getVida());
        if(inimigo.getVida() <= 0){
            System.out.println("Inimigo Morreu");
        }
    }
    
    public void parouAtacar(Ataque ataque) {
        poderDefesa -= ataque.atacar();
    }

    public static Jogador getJogador() {
        if (jogador == null) {
            jogador = new Jogador();
        }
        return jogador;
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
