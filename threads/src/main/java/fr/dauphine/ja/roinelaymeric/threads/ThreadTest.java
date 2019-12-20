package fr.dauphine.ja.roinelaymeric.threads;

public class ThreadTest {
	
	public static int n = 1;
	
	public static Runnable fct(final int id) {
		return new Runnable() {

			public void run() {
				for (int i = 1; i<=10000; i++) {
					System.out.println("Je suis le thread " + id +", et j'effectue l'itération " + n);
					n++;
				}
			}
			
		};
	}
	
	public static void main(String[] args) {
		Thread th1 = new Thread (fct(1));
		Thread th2 = new Thread (fct(2));
		th1.start();
		th2.start();
	}
	
}
