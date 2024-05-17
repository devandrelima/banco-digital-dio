package dio.banco.digital.contas;

public abstract class Conta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;;
	}
	
	public void transferir (double valor, ContaCorrente pessoa) {
		sacar(valor);
		pessoa.depositar(valor);
	}
	
	public void transferir (double valor, ContaPolpanca pessoa) {
		sacar(valor);
		pessoa.depositar(valor);
	}
	
	public void imprimirExtrato() {
		System.out.println("Agência: "  + agencia);
		System.out.println("Número: "  + numero);
		System.out.printf("Saldo: R$ %.2f\n",saldo);
	}
}
