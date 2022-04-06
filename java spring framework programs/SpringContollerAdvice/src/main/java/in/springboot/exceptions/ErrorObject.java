package in.springboot.exceptions;

public class ErrorObject {
	int status;
	String message;
	long timestamp;
	/**
	 * @return the status
	 */
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
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public ErrorObject() {
		
	}
	public ErrorObject (int status,String message,long timestamp) {
		this.status=status;
		this.message=message;
		this.timestamp=timestamp;
	}

}
