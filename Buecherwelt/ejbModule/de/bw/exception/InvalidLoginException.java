package de.bw.exception;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Spezielle Exception-Klasse für fehlerhafte Logins
 */
public class InvalidLoginException extends BuecherweltException {

	private static final long serialVersionUID = 8759021636475023682L;

	public InvalidLoginException(String message) {
		super(message);
	}

}
