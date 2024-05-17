package dio.banco.digital.principal;

import dio.banco.digital.contas.*;
import dio.banco.digital.pessoas.*;

public class Main {

	public static void main(String[] args) {
		PessoaFisica cliente1 = new PessoaFisica("André", "05/10/2000", 11122233344l);
		cliente1.setContaCorrente(new ContaCorrente(1,1,0));
		PessoaFisica cliente2 = new PessoaFisica("Ana", "14/03/1985", 22211144455l);
		cliente2.setContaPolpanca(new ContaPolpanca(2,2,0));
		
		// Mostra contas recém criadas
		cliente1.extratoContaCorrente();
		cliente1.extratoContaPolpança();
		cliente2.extratoContaCorrente();
		cliente2.extratoContaPolpança();
		
		// Modifica a conta de André e mostra o extrato
		cliente1.getContaCorrente().depositar(100);
		cliente1.extratoContaCorrente();
		
		// Modifica as contas de André e Ana e mostra o extrato das duas
		cliente1.getContaCorrente().transferir(50, cliente2.getContaPolpanca());
		cliente1.extratoContaCorrente();
		cliente2.extratoContaPolpança();
	}
}
