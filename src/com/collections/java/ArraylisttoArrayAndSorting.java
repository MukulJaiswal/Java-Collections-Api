package com.collections.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//ArrayList to Array
//Array  to ArrayList using Arrays.asList()
//How to sort list of Object using list.sort((a,b) - > )
//How to sort the list in asc and desc order
class Employee{
	private int empid;
	private String name;
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
}

public class ArraylisttoArrayAndSorting {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		int[] arr = new int[al.size()];

//*********************** ArrayList to Array Conversion.*****************
		
		System.out.println("****************** ArrayList to Array Conversion.**************");
		
		for (int i = 0; i < al.size(); i++)
			arr[i] = al.get(i);

		for (int x : arr)
			System.out.println(x + " ");

		System.out.println("Second Method");

		Integer a[] = al.toArray(new Integer[al.size()]);

		// String names[]=list.toArray(new String[list.size()])

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//Java 8 method to convert int array to list of integerss
		System.out.println("***********List of Integers******************");
		int[] ints = {1,2,3};
		List<Integer> listOfInts = Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println(listOfInts);
		
		//*********************************************************************************************************
		
		System.out.println("*************Array to ArrayList and Sorting of Object class **************");
		
		Employee emp1 = new Employee(101,"John");
		Employee emp2 = new Employee(144,"Peter");
		Employee emp3 = new Employee(130,"Charles");
		Employee emp4 = new Employee(99,"Mark");
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4));
		
		System.out.println(list.toString());//If object need to print then override the toString() method
		
		
		/**
		 * Sort the object using Lambda expression
		 */
		list.sort( (e1 , e2) -> e1.getEmpid()  - e2.getEmpid() );
		
		System.out.println(list.toString());
		
		//***********************************************************************************************
		
		System.out.println("\n*************Sorting of List of Int and String **************\n");
		
		List<String> slist = new ArrayList<String>();
		slist.add("Ram");
		slist.add("Shyam");
		slist.add("Abhiram");
		slist.add("Meena");
		
		slist.sort(null);
//		slist.sort(Collections.reverseOrder());
		
		//Below will also work.
//		Collections.sort(slist);
//		Collections.reverse(slist);
//		Collections.sort(slist ,Comparator.reverseOrder());
		System.out.println("Ascending String list " + slist);
		
		slist.sort(Collections.reverseOrder());
		System.out.println(slist);
		
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(100);
		ilist.add(800);
		ilist.add(200);
		ilist.add(900);
		
		//Both method will work
		ilist.sort(null);
		System.out.println(ilist);
		
		ilist.stream().sorted();
		System.out.println(ilist);
		
		//Printing in reverse order
		ilist.sort(Collections.reverseOrder());
		System.out.println(ilist);
		
		//Use of indexOf on list.
		System.out.println("Index : " + slist.indexOf("Ram"));
		
		
		
//*************************************Sorting of Array/String********************************************************************
		
		System.out.println("**********************Sorting of Array/String************************************");
		String str[] = {"Ram" ,"Shyam" , "Abhiram" , "Meena"};
		
		Arrays.sort(str, Collections.reverseOrder());
		
		//This is how you print an array with taking a loop
		System.out.println( Arrays.toString(str));

		List<String> sslist  = Arrays.asList(str);
		
		System.out.println(sslist);
		sslist.sort(null);
		System.out.println(sslist);
		
//******************************convert int[] to ArrayList**************************************************************		
		System.out.println("************convert int[] to ArrayList*************************");
				
		int array[] = {1,7,3,9,5};
		String str1[] = {"Ram" ,"Shyam" , "Abhiram" , "Meena"};
		
		List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
		System.out.println(arrayList);
		
		//Convert Array to List 
		List<String> slist1  = Arrays.asList(str1);
		System.out.println(slist1);
		
//**************************Merge two arraylist************************************************
		System.out.println("\n************************Merge two arraylist************************************");
		
		al.addAll(ilist);
		System.out.println(al);
		
		//This is used to remove an element from an array
		al.remove(0);
		System.out.println(al);
		
//**************************Sorting************************************************	
		System.out.println("\n************************Sort an positive number only on array************************************");

		Integer B[] =  {1,5,-2,-1,2,6,-4,2,9,8};
		
		Arrays.sort(B, Comparator.comparingInt(Math::abs));
		System.out.println(Arrays.toString(B));
		
	}
}










