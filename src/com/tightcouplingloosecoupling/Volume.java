package com.tightcouplingloosecoupling;

/**
 * Here there is a strong dependency between Volumen and Box class.
 * If anything is changes in Box class then output of area of box is getting affected.
 * @author Mukul
 *
 */
public class Volume {
	public static void main(String[] args) {
		Box box = new Box(5, 5, 5);
	}
}

class Box {
	public int volume;

	public Box(int length, int breadth, int height) {
		System.out.println("Area :: " + length * breadth * height);
	}
}