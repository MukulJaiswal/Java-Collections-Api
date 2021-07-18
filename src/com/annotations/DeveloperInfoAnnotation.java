package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User defined Annotation. It is given with syntax as @interface <Annotation
 * Name>. Inside that interface define a functions, which are nothing but the
 * parameters which you want to pass inside the annotation.
 */

@Target({ ElementType.METHOD, ElementType.TYPE }) // This can be used in Class and Methods
@Retention(RetentionPolicy.RUNTIME)
public @interface DeveloperInfoAnnotation {

	// Declare the function which you want to provide inside the annotation name.
	String developerName();

	int empId();
}

//eg - > DeveloperInfoAnnotation(developerName = "Mukul" , empId = 1711885)