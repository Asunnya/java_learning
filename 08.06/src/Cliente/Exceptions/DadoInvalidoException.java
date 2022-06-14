package Cliente.Exceptions;

public class DadoInvalidoException extends Exception {

	public DadoInvalidoException(String message) {
		super(message);
	}

	public DadoInvalidoException() {
		super("O VALOR INSERIDO É INVALIDO");
	}
}
