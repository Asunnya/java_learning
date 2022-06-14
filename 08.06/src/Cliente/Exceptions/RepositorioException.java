package Cliente.Exceptions;

public class RepositorioException extends Exception {

	public RepositorioException(String msg) {
		super(msg);
	}

	public RepositorioException() {
		super("A lista de Clientes esgotou");
	}


}
