package dio.banco.digital.contas;

public class ContaPolpanca extends Conta{
	public ContaPolpanca(int agencia, int numero, double saldo) {
		super.agencia = agencia;
		super.numero = numero;
		super.saldo = saldo;
	}
}
