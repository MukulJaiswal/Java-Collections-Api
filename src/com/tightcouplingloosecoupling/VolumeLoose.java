package com.tightcouplingloosecoupling;

interface BoxLoose {
	void calculateArea(int length, int breadth, int height);
}

class BoxLoose1 implements BoxLoose {

	@Override
	public void calculateArea(int length, int breadth, int height) {
		System.out.println("Area :: " + length * breadth * height);
	}
}

class BoxLoose2 implements BoxLoose {

	@Override
	public void calculateArea(int length, int breadth, int height) {
		System.out.println("Area :: " + (0.5)*(length * breadth * height));
	}
}

public class VolumeLoose {
	public static void main(String[] args) {
		BoxLoose lBoxLoose = new BoxLoose2();
		lBoxLoose.calculateArea(10, 10, 10);
	}
}
