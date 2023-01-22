package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer size = 0;
	
	@Override
	public boolean add(T item) {
		if(size == items.length) {
			Object[] newArray = new Object[size*2];
			
			for(int index = 0; index < size; index++) {
				newArray[index] = items[index];
			}
			items = newArray;	
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		return (T) items[index];
	}
	
}
