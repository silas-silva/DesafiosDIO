package desafiodio;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Silas
 */

@Getter
@Setter
public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void extrato() {
        System.out.println("     Titular: " + this.cliente.getNome());
        System.out.println("     Ag�ncia: " + this.agencia);
        System.out.println("     N�mero: " + this.numero);
        System.out.println("     Saldo: " + this.saldo);
        System.out.println("=====================================");
        System.out.println("");
    }
}
