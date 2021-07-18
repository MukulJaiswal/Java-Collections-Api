package com.exception.userdefined;

public class SumCompleteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SumCompleteException() {
	}

	public SumCompleteException(String s) {
		/**
		 * Since Exception class is using super keyword so we have to pass string in
		 * super also as Exception class extends Throwable class.
		 */
		super(s);
	}
}
