package am.devvibes.buyandsellelastic.exception;

import am.devvibes.buyandsellelastic.util.ExceptionConstants;

public class SomethingWentWrongException extends RuntimeException {

	public SomethingWentWrongException(ExceptionConstants message) {
		super(message.getString());
	}

}
