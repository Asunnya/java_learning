package Cliente;

import Cliente.Exceptions.DadoInvalidoException;

import java.io.Serializable;

public class Cliente implements Serializable {
	private int cpf;
	private String nome;
	private int idade;


	protected Cliente(int cpf, String nome, int idade) throws DadoInvalidoException {
		setCpf(cpf);
		this.nome = nome;
		setIdade(idade);
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) throws DadoInvalidoException {
		if (idade < 18 || idade > 130) {
			throw new DadoInvalidoException("VALOR INVALIDO PARA IDADE.");
		} else {
			this.idade = idade;
		}
	}

	protected int getCpf() {
		return cpf;
	}

	protected void setCpf(int cpf) throws DadoInvalidoException {
		if (cpf <= 0) {
			throw new DadoInvalidoException("O VALOR INSERIDO PARA CPF É INVÁLIDO");
		} else {
			this.cpf = cpf;
		}
	}


}
