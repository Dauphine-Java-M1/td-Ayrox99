package fr.dauphine.ja.roinelaymeric.threads;

import java.util.ArrayList;

public class MySafeList {
	
	private Object o = new Object();
	
	public ArrayList<Double> l;
	
	public MySafeList() {
		l = new ArrayList<Double>();
	}
	
	public void add(Double d) {
		synchronized (o){
			l.add(d);
		}
	}
	
	public Integer size() {
		return l.size();
	}
	
	public Double get(int i) {
		return l.get(i);
	}
	
	public static boolean stressTest(int n, final int m) throws Exception {
		ArrayList<Thread> lTh= new ArrayList<Thread>();
		final MySafeList l = new MySafeList();
		for (int i = 0; i < n; i++) {
			Runnable r = new Runnable() {

				public void run() {
					for (int j = 0; j<m; j++) {
						l.add((double)j);
					}
					
				}
				
			};
			lTh.add(new Thread(r));
		}
		for (Thread t : lTh) {
			t.start();
		}
		System.out.println(l.size() + " " +(n*m));
		for (Double d : l.l) {
			System.out.println((d));
		}
		return l.size()==n*m;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(stressTest(4, 3));
	}
	
}
