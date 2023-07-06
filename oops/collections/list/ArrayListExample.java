package com.javab5.java.oops.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import com.javab5.java.oops.polymorphism.Shape;

public class ArrayListExample {
	public static void main(String[] args) {

		int x = 99;
		Integer y = x;// Autoboxing
		ArrayList list = new ArrayList();// can only accept an Object
		System.out.println(list.size());

		list.add(1);// Integer
		list.add("Suman");// String
		list.add(new Shape());// shape object

		System.out.println(list);

		// Insertion order is preserved in arraylist
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();// GENERICS
		listOfIntegers.add(33);// int | Integer
//		listOfIntegers.add("SU,an");
		listOfIntegers.add(x);// Autoboxing
		listOfIntegers.add(9945);
		listOfIntegers.add(234);
		listOfIntegers.add(24);
		listOfIntegers.add(33);// can hold dups
//		listOfIntegers.add(null);// can hold null | Refrain from default sorting
		System.out.println(listOfIntegers);
		byte byteValue = listOfIntegers.get(0).byteValue();
		System.out.println(byteValue);

//		Iteration of a arraylist 
		System.out.println("way 1"); // WORST
		for (int i = 0; i < 4; i++) {
			System.out.print(listOfIntegers.get(i) + " ");
			listOfIntegers.add(6);
		}

		listOfIntegers.add(0, 100);//adding element is time taking
		System.out.println(listOfIntegers + "size : " + listOfIntegers.size());
		System.out.println("\nway 2");
		for (Integer integer : listOfIntegers) {
			System.out.print(integer + " ");
//			listOfIntegers.add(6);// you should not mutate your arraylist while iterating
		}

		System.out.println("\nway 3");// 33 99 9945 234 24
		Iterator<Integer> i = listOfIntegers.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.print(integer + " ");
		}

//		Py : list, dictionary, set, tuple 
		System.out.println("\nway 4");// <---- 33 99 9945 234 24
		listOfIntegers.stream().forEach(System.out::println);

		System.out.println(listOfIntegers.contains(33));
		
		Collections.sort(listOfIntegers);//ascending
		System.out.println(listOfIntegers);

		
		Collections.sort(listOfIntegers,Collections.reverseOrder());//descending
		System.out.println(listOfIntegers);
		listOfIntegers.clear();// clear all the elements
		System.out.println(listOfIntegers.isEmpty());
		System.out.println(listOfIntegers);
		
		

	}

}
