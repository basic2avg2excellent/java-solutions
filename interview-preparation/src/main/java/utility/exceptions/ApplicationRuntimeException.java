package utility.exceptions;

public class ApplicationRuntimeException extends RuntimeException {
	private static final long serialVersionUID = -727894269200491017L;
	
	public ApplicationRuntimeException() {
		super();
	}	
	
	public ApplicationRuntimeException(String message) {
		super(message);
	}
	
	public ApplicationRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}