package com.annotations;

/**
 * Example of pre-defined annotation.
 * https://www.youtube.com/watch?v=o9vn4No_ii4&ab_channel=Telusko
 * https://www.geeksforgeeks.org/annotations-in-java/
 */
class A {
	void display() {
		System.out.println("In A class");
	}
}

class B extends A {
	@SuppressWarnings("unused")
	@Override
	void display() {
		int suppressWarning;
		System.out.println("In B class");
	}
}

@DeveloperInfoAnnotation(developerName = "Mukul Jaiswal", empId = 1711885)
public class AnnotationImpl {
	
	@DeveloperInfoAnnotation(developerName = "Mukul Jaiswal", empId = 1711885)
	public static void main(String[] args) {
		System.out.println("User Defined Annotation Class");
	}
}
