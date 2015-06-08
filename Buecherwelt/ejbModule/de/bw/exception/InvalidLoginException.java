package de.bw.exception;

public class InvalidLoginException extends BuecherweltException {

	private static final long serialVersionUID = 8759021636475023682L;
	private static final int CODE = 20;

	public InvalidLoginException(String message) {
		super(CODE, message);
	}

}
