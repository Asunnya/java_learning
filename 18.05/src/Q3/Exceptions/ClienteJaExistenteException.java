package Q3.Exceptions;

public class ClienteJaExistenteException extends Exception{
	public ClienteJaExistenteException(String msg) {
		super(msg);
	}
	public ClienteJaExistenteException() {
		super("Cliente encontrado em nossa lista");
	}

}
