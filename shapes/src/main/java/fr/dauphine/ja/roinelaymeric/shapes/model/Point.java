package fr.dauphine.ja.roinelaymeric.shapes;

import java.util.ArrayList;

public class Point {
	
	private double x, y;
	private static int nbPts = 0;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
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
	
	public Point(double x, double y) {
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
	
	public void translate(double dx, double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	
	public double distance(Point p) {
		return Math.sqrt( (this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y) );
	}
	
	public static void main( String[] args ){
        Point p = new Point();
        System.out.println(p.x + " " + p.y);
        System.out.println(p);
        
        Point p1 = new Point(1, 2);
        Point p2 = p1;
        Point p3 = new Point(2, 2);
        ArrayList<Point> l = new ArrayList<Point>();
        l.add(p1);
        System.out.println(l.indexOf(p2));
        System.out.println(l.indexOf(p3));
        System.out.println(p1.distance(p3));
    }

}
