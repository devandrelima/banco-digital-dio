package dio.banco.digital.contas;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero, double saldo) {
		super.agencia = agencia;
		super.numero = numero;
		super.saldo = saldo;
	}
}
