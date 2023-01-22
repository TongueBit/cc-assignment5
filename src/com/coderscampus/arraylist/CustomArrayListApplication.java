package com.coderscampus.arraylist;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Integer> aList = new CustomArrayList<>();
		for(int i = 0; i < 10000; i++)
			aList.add(i);
		
		for(int i = 0; i < aList.getSize(); i++)
			System.out.println(aList.get(i));
	}

}
