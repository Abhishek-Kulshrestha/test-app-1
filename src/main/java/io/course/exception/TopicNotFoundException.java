/**
 * 
 */
package io.course.exception;

/**
 * @author ssundaram
 *  Need  TO Add  features and  also  write control advice default.
 */
public class TopicNotFoundException extends Throwable {

	public TopicNotFoundException() {
		super();
	}

	public TopicNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TopicNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TopicNotFoundException(String message) {
		super(message);
	}

	public TopicNotFoundException(Throwable cause) {
		super(cause);
	}

}
