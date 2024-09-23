package com.deloitte.lab2.ex2;
import java.util.Arrays;

public class SortArrayAlpha {
	public static void main(String[] args) {
		String[] arr = { "hello", "world", "apple", "banana", "zion" };
		String[] result = sortStrings(arr);
		System.out.println(Arrays.toString(result));
	}

	public static String[] sortStrings(String[] arr) {
		if (arr == null || arr.length == 0) {
            return arr;
        }
		Arrays.sort(arr);
		
		int middle=arr.length/2;
		
		for(int i=0;i<middle;i++) {
			arr[i]=arr[i].toUpperCase();	
		}
		
		
		for(int i=middle;i<arr.length;i++) {
			arr[i]=arr[i].toLowerCase();	
		}
		
		return arr;
		
	}

}
