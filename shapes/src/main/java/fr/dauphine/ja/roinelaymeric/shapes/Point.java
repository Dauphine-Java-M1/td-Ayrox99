package fr.dauphine.ja.roinelaymeric.shapes;

import java.util.ArrayList;

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
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Point ) {
			Point p = (Point) obj;
			return isSameAs(p);
		}else {
			return false;
		}
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
	
	public boolean isSameAs(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	public static void main( String[] args ){
        Point p = new Point();
        System.out.println(p.x + " " + p.y);
        System.out.println(p);
        
        Point p1 = new Point(1, 2);
        Point p2 = p1;
        Point p3 = new Point(1, 2);
        ArrayList<Point> l = new ArrayList<Point>();
        l.add(p1);
        System.out.println(l.indexOf(p2));
        System.out.println(l.indexOf(p3));
    }

}
