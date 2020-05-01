package org.collection;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		Vector<Integer> li = new Vector();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		
		Enumeration e = li.elements();
		System.out.println(e);
		while (e.hasMoreElements()) {
			Object d = e.nextElement();
			System.out.println(d);
			
		}
		
//		ListIterator<Integer> s = li.listIterator();
//		
//		while(s.hasNext()) {
//			Integer next = s.next();
//			System.out.println(next);
//		}
//		
//		
//		while(s.hasPrevious()) {
//			Integer next = s.previous();
//			System.out.println(next);
//		}
		
//		for (int i = 0; i < li.size(); i++) {
//			Integer num = li.get(i);
//			System.out.println(num);
//			
//		}
	}

}
