package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];
	
	@Override
	public boolean add(T item) {
		growList();
		for(int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				return true;
			}	
		}
		return false;
	}
	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		growList();
		if(index > items.length-1)
			throw new IndexOutOfBoundsException();
		Object value = item;
		Object tmp;
		int i = index;
		while(i < items.length) {
			if(items[i] == null) {
				items[i] = value;
				return true;
			}
			tmp = items[i];
			items[i] = value;
			value = tmp;
			i++;
		}
		return false;
	}
	
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		Object value = null;
		boolean flag = true;
		int i = index;
		
		while(i <= items.length-1) {
			//assigns the value of the element being removed
			if (flag) { value = items[i]; flag = false; }
		if( i == getSize()-1) {
			items[i] = null;
			return (T) value;
		} else if(items[i+1] == null) {
				items[i] = null;
				return (T) value;
			}
			items[i] = items[i+1];	
			i++;
		}
		return null;
	}

	
	@Override
	public int getSize() {
		int count = 0;
	    for(Object elem : items)
	        if (elem != null)
	            count++;
		return count ;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if(index > items.length-1)
			throw new IndexOutOfBoundsException();
		return (T) items[index];
	}
	
	private void growList() {
		if(getSize() == items.length) {
			Object[] newArray = new Object[getSize()*2];
			for(int index = 0; index < getSize(); index++) {
				newArray[index] = items[index];
			}
			items = newArray;	
		}
	}	
}
