package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestApplication {

	public static void main(String[] args) {
		List <String> mainlist = new ArrayList<>();
		mainlist.add("test");
		
		
		CustomArrayList<String> newList = new CustomArrayList<>();
		for (int i = 0; i<50; i++) {
			newList.add("item: "+ i );
		}
		
		for (int i=0; i<newList.getSize(); i++) {
		    System.out.println(newList.get(i));
		}
	}

}
