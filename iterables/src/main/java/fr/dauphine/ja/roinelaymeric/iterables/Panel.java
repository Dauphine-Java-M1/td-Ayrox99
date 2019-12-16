package fr.dauphine.ja.roinelaymeric.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Panel{
	
//	private int deb, fin;
	
//	public Panel (int deb, int fin) {
//		this.deb = deb;
//		this.fin = fin;
//	}
	
//	public Iterator<Integer> iterator() {
//		return new Iterator<Integer>() {
//			
//			int act = deb;
//			
//			public boolean hasNext() {
//				return act<=fin;
//			}
//
//			public Integer next() {
//				act++;
//				if (act-1<=fin) {
//					return act-1;
//				}else {
//					throw new NoSuchElementException();
//				}
//			}
//			
//		};
//	}
	
	public static Iterator<Integer> panel1(final int a, final int b) {
//		Panel p = new Panel(a, b);
//		return p.iterator();
		return new Iterator<Integer>() {
			
			int act = a;
			
			public boolean hasNext() {
				return act<=b;
			}

			public Integer next() {
				if (this.hasNext()) {
					act++;
					return act-1;
				}else {
					throw new NoSuchElementException();
				}
			}
		};
	}
	
	public static Iterable<Integer> panel2(final int a, final int b){
		return new Iterable<Integer>() {

			public Iterator<Integer> iterator() {
				return Panel.panel1(a, b);
			}
			
		};
	}
	
	public static List<Integer> panel(final int a, final int b){
//		return panel2(a, b);
		return new AbstractList<Integer>() {
			
			@Override
			public Integer get(int arg0) {
				return a+arg0;
			}

			@Override
			public int size() {
				return b-a+1;
			}
			
		};
	}
	
	public static void main(String[] args) {
//		Iterator<Integer> it=panel1(1,5);
//		Iterator<Integer> i2=panel1(1,5);
//		for(;it.hasNext();) {
//			System.out.println(it.next());
//		}
//		while(it.hasNext() && i2.hasNext()) {
//			System.out.println(it.next());
//			System.out.println(i2.next());
//		}
//		for(int i:panel2(1,5)) {
//			System.out.println(i);
//		}
		List<Integer> l = panel(3,6);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println(l.get(1));
	}
	
}
