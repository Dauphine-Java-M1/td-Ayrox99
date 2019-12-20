package fr.dauphine.ja.roinelaymeric.shapes.model;

import java.awt.Graphics;

public abstract class Shape{
	
	public abstract boolean contains(Point p);
	
	public abstract String toString ();
	
	public abstract void translate(int dx, int dy);
	
	public abstract void draw(Graphics g);
	
}
