package Cliente.Exceptions;

public class ClienteInexistenteException extends Exception {

	public ClienteInexistenteException(String message) {
		super(message);
	}

	public ClienteInexistenteException() {
		super("O cliente não está cadastrado");
	}

}
