package com.enums;

import java.util.Arrays;

public class EnumImpl {

	public static void main(String[] args) {
		Season season = Season.valueOf("WINTER");
		Season season1 = Season.SUMMER;
		
		//ordinal gives the index of the enum. It starts from 0
		System.out.println(season.ordinal()); 
		System.out.println(season1.ordinal());
		
		System.out.println("Winter : " + Season.WINTER.getValue());
		
		System.out.println(Arrays.toString(Season.values()));// return the array of season
		
		//Enum can be directly accessed without instantiating it. Just like static keyword
		System.out.println(Season.WINTER);
	}
}
