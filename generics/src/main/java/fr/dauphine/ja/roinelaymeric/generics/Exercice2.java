package fr.dauphine.ja.roinelaymeric.generics;

import java.util.Arrays;
import java.util.List;

public class Exercice2 {
	
	private static void print(List<?> list) {
		for(Object o:list)
			System.out.println(o);
	}
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		printLong(list);
	}
	
	public static void printLong(List<? extends CharSequence> l) {
		for (CharSequence cs : l) {
			System.out.println(cs.length());
		}
	}

}
