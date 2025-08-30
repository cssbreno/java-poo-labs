package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/**
	 * Custom exception for domain-specific errors.
	 * @param msg
	 */

	public DomainException(String msg) {
		super(msg);
	}

}
