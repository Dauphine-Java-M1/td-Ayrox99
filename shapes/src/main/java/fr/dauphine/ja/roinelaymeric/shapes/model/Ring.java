package fr.dauphine.ja.roinelaymeric.shapes.model;

import java.awt.Graphics;

import fr.dauphine.ja.roinelaymeric.shapes.view.DrawableRing;

public class Ring extends Circle {
	
	double sous_Rayon;
	
	public Ring (Point c, double r, double sr) {
		super(c, r);
		if (r<=sr) {
	         throw new IllegalArgumentException("Le rayon doit être strictement supérieur au sous-rayon");
	    }		
		this.sous_Rayon = sr;
	}
	
	public double getSousRayon() {
		return this.sous_Rayon;
	}
	
	public boolean equals (Ring r) {
		return super.equals(r) && this.sous_Rayon == r.sous_Rayon;
	}
	
	public String toString() {
		return super.toString() + ", sr = " + this.sous_Rayon + ")";
	}
	
	public boolean contains(Point p) {
		return super.contains(p) && this.getCenter().distance(p)>=this.sous_Rayon; 
	}
	
	public static boolean contains(Point p, Ring...rings) {
		for (Ring r : rings) {
			if (r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void draw(Graphics g) {
		DrawableRing dc = new DrawableRing(this);
		dc.paintComponent(g);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(3.0001, 2);
		Ring r = new Ring(new Point(1, 2), 2, 1);
//		Circle c = new Circle(p1, 1);
//		System.out.println(r.ClassName());
//		System.out.println(c.ClassName());
		System.out.println(r);
		System.out.println(r.contains(p1));
//		System.out.println(c);
	}
}
