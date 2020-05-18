package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> conts = new ArrayList<>(Arrays.asList("a", "b", "c","d"));
		
		System.out.println(conts.get(2)); // ArrayList does not search. It returns directly the element addressed by the index supplied
		
		conts.add("e"); // O(1) as we are adding at last
		
		System.out.println(conts);
		
		conts.remove("e"); // O(n) we need to iterate through each element to reach that index and then remove that value
		
		System.out.println(conts); //O(1) as we are looping through anything
		
		conts.add(0, "f"); // O(n) adding an element at the front means we have to move the existing array one position
		
		System.out.println(conts);

	}

}
