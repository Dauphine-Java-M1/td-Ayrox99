package fr.dauphine.ja.roinelaymeric.shapes;

public class Point {
	
	private int x, y;
	private static int nbPts = 0;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	public Point() {
		this.x = 0;
		this.y = 0;
		this.nbPts++;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.nbPts++;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
		this.nbPts++;
	}
	
	public static void main( String[] args ){
        Point p = new Point();
        System.out.println(p.x + " " + p.y);
        System.out.println(p);
    }

}
