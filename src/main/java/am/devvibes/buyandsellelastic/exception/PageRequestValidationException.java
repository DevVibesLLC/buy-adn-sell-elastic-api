package am.devvibes.buyandsellelastic.exception;

import am.devvibes.buyandsellelastic.util.ExceptionConstants;

public class PageRequestValidationException extends RuntimeException {
	public PageRequestValidationException(ExceptionConstants message) {
		super(message.getString());
	}
}
