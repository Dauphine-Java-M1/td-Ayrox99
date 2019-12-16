package fr.dauphine.ja.roinelaymeric.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exercice5 {

	public static <T> void swap(List<T> l, int ind1, int ind2) {
		T tmp = l.get(ind1);
		l.set(ind1, l.get(ind2));
		l.set(ind2, tmp);
	}
	
	public static void shuffle(List<?> l, int rep) {
		int i1, i2;
		for (int i=0; i<rep; i++) {
			i1 = new Random().nextInt(l.size());
			i2 = new Random().nextInt(l.size());
			while(i1 == i2) {
				i2 = new Random().nextInt(l.size());
			}
			swap(l, i1, i2);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		shuffle(l, 20);
		System.out.println(l);
	}
	
}
