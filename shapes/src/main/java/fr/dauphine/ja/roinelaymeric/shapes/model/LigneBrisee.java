package fr.dauphine.ja.roinelaymeric.shapes;

import java.util.LinkedList;

public class LigneBrisee {
	
	//private Point[] points;
	//private int ptAct = 0;
	private LinkedList<Point> points;
	
	/*public LigneBrisee(int nbPts) {
		this.points = new Point[nbPts];
	}*/
	
	public LigneBrisee() {
		this.points = new LinkedList<Point>();
	}
	
	/*public boolean add (Point p) {
		if (ptAct < this.pointCapacity()) {
			this.points[ptAct] = p;
			ptAct++;
			return true;
		}
		return false;
	}
	
	public int pointCapacity() {
		return this.points.length;
	}
	
	public int nbPoints() {
		return ptAct;
	}
	
	public boolean contains(Point p) {
		for (Point pt : this.points) {
			if (pt.isSameAs(p)) {
				return true;
			}
		}
		return false;
	}*/
	
	public boolean add (Point p) {
		return this.points.add(p);
	}
	
	public int nbPoints() {
		return this.points.size();
	}
	
	public boolean contains(Point p) {
		return this.points.contains(p);
	}
	
	public static void main(String[] args) {
		//LigneBrisee l = new LigneBrisee(3);
		LigneBrisee l = new LigneBrisee();
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 2);
		System.out.println(l.add(p1));
		System.out.println(l.add(p2));
		//System.out.println(l.add(null));
		System.out.println(l.contains(null));
	}
}
