package in.springboot.exceptions;

public class ResouceNotFoundException extends RuntimeException{
	ResouceNotFoundException(String message){
		super(message);
	}

}
