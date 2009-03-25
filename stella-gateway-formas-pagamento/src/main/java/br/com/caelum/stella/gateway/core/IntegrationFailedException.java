package br.com.caelum.stella.gateway.core;

/**
 * Exception que deve ser lan�ada, quando, por algum motivo, a integra��o falhar
 * @author Alberto Pc
 *
 */
public class IntegrationFailedException extends RuntimeException {

	public IntegrationFailedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntegrationFailedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IntegrationFailedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IntegrationFailedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
