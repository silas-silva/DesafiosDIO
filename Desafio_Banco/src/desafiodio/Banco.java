package desafiodio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Silas
 */
@Getter
@Setter
public class Banco {
	
    private String nome;
    private List<Conta> contas;
    
    public void listarCLientes(){
    	System.out.println("=====================================\n       Lista de Clientes\n");
        for(Conta c : contas) {
        	System.out.println(c.cliente.getNome());
        }
    }
    
    public Banco() {
    	contas = new ArrayList<Conta>();
    }
    
    public void addConta(Conta conta){
		this.contas.add(conta);
    }
}
