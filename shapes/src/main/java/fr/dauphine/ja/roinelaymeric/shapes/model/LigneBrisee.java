package fr.dauphine.ja.roinelaymeric.shapes.model;

import java.awt.Graphics;
import java.util.LinkedList;

import fr.dauphine.ja.roinelaymeric.shapes.view.DrawableLine;

public class LigneBrisee extends Shape{
	
	//private Point[] points;
	//private int ptAct = 0;
	private LinkedList<Point> points;
	
	/*public LigneBrisee(int nbPts) {
		this.points = new Point[nbPts];
	}*/
	
	public LigneBrisee() {
		this.points = new LinkedList<Point>();
	}
	
	public LinkedList<Point> getPoints(){
		return this.points;
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
	
	@Override
	public void translate(int dx, int dy) {
		for (Point p : this.points) {
			p.translate(dx, dy);
		}
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

	@Override
	public void draw(Graphics g) {
		DrawableLine dc = new DrawableLine(this);
		dc.paintComponent(g);		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
