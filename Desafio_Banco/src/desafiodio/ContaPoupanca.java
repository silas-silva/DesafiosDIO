package desafiodio;

/**
 *
 * @author silas
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    public void extrato() {
        System.out.println("====== Extrato  Conta Poupan�a ======");
    	super.extrato();
    }
}
