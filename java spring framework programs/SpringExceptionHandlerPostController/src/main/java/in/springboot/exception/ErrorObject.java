package in.springboot.exception;

public class ErrorObject {
	int status;
	String message;
	long time;
	/**
	 * @return the status
	 */
	
	public ErrorObject(int status, String message, long time) {
		super();
		this.status = status;
		this.message = message;
		this.time = time;
	}

	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/*
	 * public ErrorObject() {
	 * 
	 * }
	 */

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}
	
}
