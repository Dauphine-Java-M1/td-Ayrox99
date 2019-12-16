package fr.dauphine.ja.roinelaymeric.iterables;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Mult {
	
//	public static List<Integer> mult(int i, List<Integer> l){
//		List<Integer> lr = new ArrayList<Integer>();
//		for (int nb : l) {
//			lr.add(nb*i);
//		}
//		return lr;
//	}
	
	public static List<Integer> mult(final int i, final List<Integer> l){
		return new AbstractList<Integer>() {
			
			@Override
			public Integer get(int arg0) {
				return l.get(arg0)*i;
			}

			@Override
			public int size() {
				return l.size();
			}
			
		};
	}
	
	public static List<Integer> mult1(final int i, final List<Integer> l){
		return new AbstractSequentialList<Integer>() {

			@Override
			public ListIterator<Integer> listIterator(int arg0) {
				return l.listIterator(arg0);
			}

			@Override
			public int size() {
				return l.size();
			}
			
			
			
		};
	}
	
	public static void main(String[] args) {
//		List<Integer> lr = new ArrayList<Integer>();
//		lr.add(5);
//		lr.add(4);
//		lr.add(3);
//		List<Integer> l = mult(4,lr);
//		for(int i:l) {
//			System.out.println(i);
//		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = mult(2, al);
		long sum=0;
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("prout1");
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		t0 = System.nanoTime();
		System.out.println("prout2");
		sum=0;
		ret = mult1(2, ll);
		System.out.println("prout3");
		for(int val : ret) {
			sum+=val/2;
		}
		System.out.println("prout");
		System.out.println((System.nanoTime() - t0));
	}
	
}
