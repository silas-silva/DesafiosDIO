package movimentos;

import armas.Escudo;

public class DesesaEscudo implements Defesa {

    @Override
    public int defender() {
        return Escudo.defesa;
    }

}
