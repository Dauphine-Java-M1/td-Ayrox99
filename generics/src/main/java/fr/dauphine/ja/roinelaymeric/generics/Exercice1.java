package fr.dauphine.ja.roinelaymeric.generics;

public class Exercice1 {
	
	public static <T extends Comparable<T>> T myMax(T...numbers) throws Exception {
		if (numbers.length==0) {
			throw new IllegalArgumentException("At least one number is required");
		}
		T max = numbers[0];
		for (T nb: numbers) {
			if (nb.compareTo(max) == 1) {
				max = nb;
			}
		}
		return max;
	}
	
	public static void main(String[] args) throws Exception {
//		System.out.println(myMax(42,1664)); 
//		System.out.println(myMax(2014,86,13));
//		System.out.println(myMax());
		System.out.println(myMax(8.6,16.64));
		System.out.println(myMax("baa", "aba")); 
//		System.out.println(myMax(8.6, "aba"));
	}
}
