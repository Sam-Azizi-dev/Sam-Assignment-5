package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int i=0;
	@Override
	public boolean add(T item) {
		if (i == items.length) {
			items = Arrays.copyOf(items, items.length*2);
		}
		items[i] = item;
		i++;
		
		return true;
	}

	@Override
	public int getSize() {
		int counter;
		for (counter = 0 ; counter<=items.length; counter++) {
			if (items[counter] == null) {
				break;
			}
		}
		return counter;
	}

	@Override
	public T get(int index) {
		if ((0 > index) || (index < items.length)) {
			return (T) items[index];
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + "]";
	}
	
}
