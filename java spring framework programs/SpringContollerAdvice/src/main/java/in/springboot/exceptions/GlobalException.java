package in.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
/*
 * We will add @ControllerAdvice annotation to this class to handle exceptions
 * at the application level.
 */
public class GlobalException {

	@ExceptionHandler
	/*
	 * @ExceptionHandler annotation catches the exception for the specific
	 * exception.
	 */
	public ResponseEntity<ErrorObject> handleResouceNotFoundException(ResouceNotFoundException ex) {
		ErrorObject eobj = new ErrorObject();
		eobj.setStatus(HttpStatus.NOT_FOUND.value());
		eobj.setMessage(ex.getMessage());
		eobj.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(eobj, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorObject> handleNoDataFoundException(NoDataFoundException ex) {
		ErrorObject eobj = new ErrorObject();
		eobj.setStatus(HttpStatus.NO_CONTENT.value());
		eobj.setMessage(ex.getMessage());
		eobj.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(eobj, HttpStatus.OK);
	}

}
