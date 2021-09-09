package com.enums;

public enum Season {
	/**
	 * This is not the good practice to declare the enum as this need to be stored
	 * in database.
	 * 
	 * // SPRING, SUMMER, WINTER, FALL
	 * 
	 * Enum can contain variable and well as constructor as well.
	 */

	SPRING(1), SUMMER(2), WINTER(3), FALL(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
