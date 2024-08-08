package com.tnsif.cubes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NumbersList {
	ArrayList<Integer> obj1 = new ArrayList<>();

	public NumbersList() {
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
	}
	
	
	public void showIterator() {
		Iterator<Integer> it = obj1.iterator();
		System.out.println("Using Iterator:");
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
			if(num.equals(4)) {
				it.remove();
			}
		}
		System.out.println("After removing: ");
		System.out.println(obj1);
	}
	
	
	public void showListIterator() {
		ListIterator<Integer> lit = obj1.listIterator(obj1.size());
		
		System.out.println("Using listIterator for backward traversal:");
		while(lit.hasPrevious()) {
			Integer num = lit.previous(); 
			System.out.println(num);
		}
		
		System.out.println("Using listIterator for forward traversal:");
		while(lit.hasNext()) {
			Integer num = lit.next();
			System.out.println(num);
			if(num.equals(3)) {
				lit.set(7);
			}
	}
		System.out.println("After replacing  3: ");
		System.out.println(obj1);
	}}
