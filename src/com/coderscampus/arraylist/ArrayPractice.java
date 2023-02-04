package com.coderscampus.arraylist;

import java.sql.Array;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[10];
		
		for(int i = 0; i < arr.length-2; i++) {
			arr[i] = i;
		}
		
		printArray(arr);
		
		//remove index 3
		int value;
		boolean flag = true;
		int index = 3;
		
		while(index < arr.length-1) {
			if (flag) {
				 value = arr[index];
				 flag = false;
			}
			if(arr[index+1] == null) {
				arr[index] = null;
				break;
			}
			arr[index] = arr[index+1];	
			index++;
		}
		printArray(arr);
	}

	private static void printArray(Integer[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
	}

}
