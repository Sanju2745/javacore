package com.javab5.java.oops.collections.list;

import java.util.ArrayList;
import java.util.Collections;

import com.javab5.java.oops.polymorphism.Shape;

public class StringArrayList {

	public static void main(String[] args) {

		ArrayList<Shape> listOfShape = new ArrayList<Shape>();//do a custom sorting algo
		ArrayList<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("apple");
		listOfStrings.add("avacoda");
		listOfStrings.add("lion");
		listOfStrings.add("lame");
		listOfStrings.add("anaconda");
		listOfStrings.add("bee");
		listOfStrings.add("zebra");

		System.out.println(listOfStrings);
		Collections.sort(listOfStrings);//change the index permanent | MUTATION
		System.out.println(listOfStrings);
		
		
		Collections.sort(listOfStrings, Collections.reverseOrder());//change the index permanent | MUTATION
		System.out.println(listOfStrings);
		
		Collections.shuffle(listOfStrings);//change the index permanent | MUTATION
		System.out.println(listOfStrings);
		

	}

}
