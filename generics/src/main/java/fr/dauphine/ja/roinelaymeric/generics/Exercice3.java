package fr.dauphine.ja.roinelaymeric.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice3 {
	
//	public static <T extends CharSequence> List<Integer> listLength(List<T> list) {
//		ArrayList<Integer> length=new ArrayList<Integer>();
//		for(int i=0;i<list.size();i++) {
//			T seq=list.get(i);
//			length.add(seq.length());
//		}
//		return length;
//	}
	
	public static List<Integer> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			CharSequence seq=list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	public static void main(String[] args) {
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}

}
