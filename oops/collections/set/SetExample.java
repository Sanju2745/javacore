package com.javab5.java.oops.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SetExample {

	public static void main(String[] args) {

		ArrayList<Integer> listOfNums = new ArrayList<>();
		ArrayList<Integer> listOfNumsWIthoutDuplicates = new ArrayList<>();
		listOfNums.add(4);
		listOfNums.add(44);
		listOfNums.add(14);
		listOfNums.add(435);
		listOfNums.add(6);
		listOfNums.add(4);
		listOfNums.add(87);
		listOfNums.add(24);
		listOfNums.add(14);
		listOfNums.add(0);
		listOfNums.add(-7);
		listOfNums.add(76);

		System.out.println(listOfNums.size());// Arraylist can contain Duplicates

//		ArrayList<Integer> arrayList = new ArrayList<Integer>();

//		Collections.sort(listOfNums);
//		System.out.println(listOfNums);
//		for (Integer num : listOfNums) {
//			listOfNums.remove(0);
//		}

		// Insertion order preserved

		// Remove the duplicates
//		for (int i = 0; i < listOfNums.size(); i++) {
//
//		}

		for (Integer num : listOfNums) {
//			listOfNumsWIthoutDuplicates.contains(num) ? continue : listOfNumsWIthoutDuplicates.add(num);
			if (!listOfNumsWIthoutDuplicates.contains(num)) {
				listOfNumsWIthoutDuplicates.add(num);
			}

//			listOfNums.remove(0);
		}

		System.out.println(listOfNums);
		System.out.println(listOfNumsWIthoutDuplicates);

		// 2nd way (Elements should be Immutable to be inserted in a hashSet)
		HashSet<Integer> hashSet = new HashSet<>();// No Duplicates are allowed
		// insertion order is not maintained
		// indexing is not allowed
		//PROS : Searching very fast
		
//		---i/p (Values)--->  hash fn  --o\p--->

		for (Integer num : listOfNums) {
			hashSet.add(num);
		}

		ArrayList<Integer> numList2 = new ArrayList<>();
		numList2.add(443);
		numList2.add(444323);
		numList2.add(443423);
		numList2.add(44323);
		
		System.out.println(hashSet.contains(443));//searching is very fast is set

		System.out.println(hashSet);// all the unique elements but disorderd

		hashSet.add(878);
		List<Integer> collectedList = hashSet.stream().collect(Collectors.toList());
		Collections.sort(collectedList);
		System.out.println(collectedList);

//		hashSet.get(i);//indexing access is not allowed
		hashSet.remove(0);
		hashSet.addAll(numList2);//fuse two collection
		System.out.println(hashSet);

	}

}
