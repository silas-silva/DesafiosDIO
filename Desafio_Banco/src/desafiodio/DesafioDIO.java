/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiodio;

/**
 *
 * @author silas
 */
public class DesafioDIO {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		//Criação Clientes
		Cliente c1 = new Cliente();
		c1.setNome("João");
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		Cliente c3 = new Cliente();
		c3.setNome("Pedro");
		Cliente c4 = new Cliente();
		c4.setNome("Ana");
		
		//Criação Contas
		Conta cc1 = new ContaCorrente(c1);
		Conta cp1 = new ContaPoupanca(c1);
		Conta cc2 = new ContaCorrente(c2);
		Conta cp2 = new ContaCorrente(c2);
		Conta cc3 = new ContaCorrente(c3);
		Conta cc4 = new ContaCorrente(c4);
		
		//Add conta Banco
		Banco banco = new Banco();
		banco.addConta(cc1);
		banco.addConta(cp1);
		banco.addConta(cc2);
		banco.addConta(cp2);
		banco.addConta(cc3);
		banco.addConta(cc4);

		
		//Operações na conta
		cc1.depositar(100);
		cc2.depositar(50);
		cc3.depositar(200);
		cc4.depositar(70);
		
		cc1.extrato();
		cp1.extrato();

		cc1.transferir(30, cp1);

		cc1.extrato();
		cp1.extrato();
		
		//Listar Clientes
		
		banco.listarCLientes();

	}

}
