package am.devvibes.buyandsellelastic.exception;

import am.devvibes.buyandsellelastic.util.ExceptionConstants;

public class NotFoundException extends RuntimeException {

	public NotFoundException(ExceptionConstants message) {
		super(message.getString());
	}

}
