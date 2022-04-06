package in.springboot.exceptions;

public class NoDataFoundException extends RuntimeException {
	NoDataFoundException(String message){
		super(message);
	}

}
