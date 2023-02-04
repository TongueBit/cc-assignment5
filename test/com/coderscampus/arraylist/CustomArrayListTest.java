package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	//test-driven Development Methodology
	// step 1 -write a failing test
	// step 2 - write the business logic to make the test pass
	// step 3 -refactor your code
	
	@Test
	void should_Add_21_Items_To_The_Array() {
		//Arrange Stage
		CustomArrayList<Integer> sut = new CustomArrayList<>();		
		//Acting stage
		for(int i = 0; i < 21; i++) {
			sut.add(i);
		}
		assertEquals(20, sut.get(20));	
	}

	@Test
	void should_Grow_Array_To_40() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i < 40; i++) {
			sut.add(i);
		}
		assertEquals(40, sut.getSize());
	}
	
	@Test
	void should_Count_Non_Null_Elements() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		assertEquals(0,sut.getSize());

		sut.add(1);
		assertEquals(1,sut.getSize());

		sut.add(2);sut.add(3);sut.add(4); sut.add(5);sut.add(6);sut.add(7);
		sut.add(8);sut.add(9);sut.add(10); 
		assertEquals(10,sut.getSize()); 
	}
	
	@Test
	void should_Add_Item_At_Index() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		sut.add(1);
		sut.add(2);sut.add(3);sut.add(4); sut.add(5);sut.add(6);sut.add(7);
		sut.add(8);sut.add(9);sut.add(10);
		sut.add(5,100);
		assertEquals(100, sut.get(5));
	}
	
	@Test
	void should_Throw_Index_Exception () {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		try {
			sut.add(10,100);
		} catch(IndexOutOfBoundsException e) {
			e.getCause();
		}	
	}
	
	@Test
	void should_Remove_Element_At_Index_Of_Full_Array_And_Not_Full() {
		CustomArrayList<Integer> sut = new CustomArrayList<>();
		sut.add(0); sut.add(1);sut.add(2);sut.add(3);
		sut.add(4); sut.add(5);sut.add(6);sut.add(7);
		sut.add(8);sut.add(9);
		
		sut.remove(5);
		assertEquals(6, sut.get(5));
		sut.add(10);sut.add(11);
		sut.remove(9);
		assertEquals(11, sut.get(9));
	}
}
