package com.exception.userdefined;

public class UserDefinedExceptionImpl {
	public static void main(String[] args) {

		int sum = 5 + 5;
		try {
			if (sum == 10) {
//				sum = sum / 0;
				throw new SumCompleteException("Sum 10 Exception");// User defined Exception
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
