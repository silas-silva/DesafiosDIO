package main;

import movimentos.Ataque;
import movimentos.AtaqueEspada;
import movimentos.AtaquePunho;
import movimentos.Defesa;
import movimentos.DesesaBracos;
import movimentos.DesesaEscudo;
import personagens.Inimigo;
import personagens.Jogador;

public class Game {
    
    public static void main(String[] args) {
        //Singleton
        Jogador jogador = Jogador.getJogador();
        Inimigo inimigo = Inimigo.getInimigo();
        
        Ataque ataqueEspada = new AtaqueEspada();
        Ataque ataquePunho = new AtaquePunho();
        Defesa defesaEscudo = new DesesaEscudo();
        Defesa defesaBraco = new DesesaBracos();
        
        //Strategy
        inimigo.defender(defesaEscudo);
        jogador.atacar(ataqueEspada);
        
        inimigo.parouDefender(defesaEscudo);
        inimigo.atacar(ataquePunho);
        
    }
    
}
