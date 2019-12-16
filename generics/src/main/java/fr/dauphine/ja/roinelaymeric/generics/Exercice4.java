package fr.dauphine.ja.roinelaymeric.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercice4 {

	public static Integer minWithBool(int a, int b, int bool) {
		if(a>b) {
			bool = 1;
			return a;
		}else if (a==b) {
			bool = 0;
			return a;
		}else {
			bool = -1;
			return b;
		}
	}
	
	public static <T> List<? extends T> fusion(List<? extends T>l1, List<? extends T>l2){
		int l1T=l1.size();
		int l2T=l1.size();
		if (l1T==0 && l2T==0) {
			return null;
		}
		if (l1T!=0 && l2T==0) {
			return l1;
		}
		if (l1T==0 && l2T!=0) {
			return l2;
		}
		ArrayList<T> l = new ArrayList<T>();
		int i = 0;
		int b=0;
		int min = minWithBool(l1T, l2T, b);
		while(i<min) {
			l.add(l1.get(i));
			l.add(l2.get(i));
			i++;
		}
		if(b==1) {
			while(i<l1T) {
				l.add(l1.get(i));
				i++;
			}
		}else if (b==-1) {
			while(i<l2T) {
				l.add(l2.get(i));
				i++;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		System.out.println(r1);
		List<?> r2=fusion(l1,l2);
		System.out.println(r2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = (List<Integer>) fusion(l3,l4);
		System.out.println(r3);
		List<?> r4 = fusion(l1,l3);
		System.out.println(r4);
	}
	
}
