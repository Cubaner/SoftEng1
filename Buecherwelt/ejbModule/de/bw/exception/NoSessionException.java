package de.bw.exception;

/**
 * @author Jonas Brandhorst/Johann Schäfer
 * Spezielle Exception-Klasse für nicht vorhandene Sessions. Wenn ohne gültige Session eine Methode vom Client ausgeführt werden
 * soll, wird eine NoSessionException erzeugt.
 */
public class NoSessionException extends BuecherweltException {

	private static final long serialVersionUID = 8759021636475023682L;

	public NoSessionException(String message) {
		super(message);
	}

}
