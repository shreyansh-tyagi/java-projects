package in.springboot.exceptions;

public class ResouceNotFoundException extends RuntimeException {
	public ResouceNotFoundException(String message) {
		super(message);
	}

}
