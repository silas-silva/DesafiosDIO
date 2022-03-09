package movimentos;

import armas.Espada;

public class AtaqueEspada implements Ataque {

    @Override
    public int atacar() {
        System.out.println("Ataque de 10");
        return Espada.ataque;

    }

}
