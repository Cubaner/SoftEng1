package de.bw.exception;

public class BuecherweltException extends Exception {

	private static final long serialVersionUID = -1658425297634781761L;

	private int errorCode;
	
	public BuecherweltException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public BuecherweltException(String message) {
		super(message);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
