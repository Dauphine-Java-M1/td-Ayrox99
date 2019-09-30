package fr.dauphine.ja.roinelaymeric.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	
	int toto;
	Random r = new Random();
	
	ArrayList<Integer> numbers;
	
	public PrimeCollection (){
		numbers = new ArrayList<Integer>();
	}
	
	public int getToto() {
		return toto;
	}
	
	public void setToto(int toto) {
		this.toto = toto;
	}
	
	public void initRandom(int n, int m) {
		for (int i = 0; i < n; i++) {
			int nb = r.nextInt(m+1);
			numbers.add(nb);
		}
	}
	
	private static boolean isPrime(int p) {
		if (p == 0 || p == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public void printPrimes() {
		for (int nb : numbers) {
			if (isPrime(nb)) {
				System.out.println(nb);
			}
		}
	}
	
    public static void main( String[] args )
    {
        PrimeCollection c = new PrimeCollection();
        c.initRandom(100, 2000);
        c.printPrimes();
    }
}
