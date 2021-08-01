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
		obj.values = 10;
		obj.show();

	}

}

//Generic only supports wrapper classes.
/**
 * Genetics is preferred over Object because it provides type safety feature
 * whereas Object doesn't have type safety feature.
 * Below is the example for same
 */


//We use < > to specify Parameter type
class Test<T> {
	// An object of type T is declared
	T obj;

	Test(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}
}

//Driver class to test above
class Main {
	public static void main(String[] args) {
		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		//iObj = sObj; // This results an error. It is checking for type
	}
}






