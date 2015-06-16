package de.bw.exception;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Die Exception-Klasse BuecherweltException ist für die Ausgabe sämtlicher allgemeiner Fehler zuständig.
 */
public class BuecherweltException extends Exception {

	private static final long serialVersionUID = -1658425297634781761L;
	
	public BuecherweltException(String message) {
		super(message);
	}
}
