package jungsuk_chapter6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise6_20 {
	
	public static int[] shuffle(int[] original) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<original.length; i++) {
			list.add(original[i]);
		}
		
		Collections.shuffle(list);
		
		int[] result  = new int[list.size()];
		int i = 0;
		for (Integer e : list) {
			result[i++] = e.intValue();
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
