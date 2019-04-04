package com.collections.java;
/**
 * 
 * @author Mukul
 *
 * @param <T>
 */
class Type<T> {
	T values;

	void show() {
		System.out.println(values.getClass().getName());
	}
}

public class Generics {
	public static void main(String[] args) {
		Type<Integer> obj = new Type<Integer>();
		obj.values =10;
		obj.show();

	}

}
//Generic only supports wrapper classes.
