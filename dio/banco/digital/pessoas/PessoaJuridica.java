package dio.banco.digital.pessoas;

public class PessoaJuridica extends Pessoa{
	
	long cnpj;
	
	public PessoaJuridica(String nome, String dataNascimento, long cpf, long cnpj) {
		super.nome = nome;
		super.dataNascimento = dataNascimento;
		super.cpf = cpf;
		this.cnpj = cnpj;
	}
}
