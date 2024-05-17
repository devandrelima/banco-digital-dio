package dio.banco.digital.pessoas;

import dio.banco.digital.contas.ContaCorrente;
import dio.banco.digital.contas.ContaPolpanca;

public abstract class Pessoa {
	protected String nome;
	protected String dataNascimento;
	protected long cpf;
	protected ContaCorrente contaCorrente;
	protected ContaPolpanca contaPolpanca;
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("CPF: " + cpf);
	}
	
	public void extratoContaCorrente() {
		if(contaCorrente == null) {
			System.out.println("\n" + nome + " não possui Conta Corrente.\n");
			return;
		}
		System.out.println("\n--- Extrato Conta Corrente ---\n");
		imprimirDados();
		contaCorrente.imprimirExtrato();
	}

	public void extratoContaPolpança() {
		if(contaPolpanca == null) {
			System.out.println("\n" + nome + " não possui Conta Polpança.\n");
			return;
		}
		System.out.println("\n--- Extrato Conta Polpança ---\n");
		imprimirDados();
		contaPolpanca.imprimirExtrato();
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public void setContaPolpanca(ContaPolpanca contaPolpanca) {
		this.contaPolpanca = contaPolpanca;
	}
	
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public ContaPolpanca getContaPolpanca() {
		return contaPolpanca;
	}
}
