package fr.dauphine.ja.roinelaymeric.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.roinelaymeric.shapes.model.Circle;
import fr.dauphine.ja.roinelaymeric.shapes.model.Ring;

public class DrawableRing extends Drawable<Ring>{

	public DrawableRing(Ring r) {
		this.obj = r;
	}
	
	public void paintComponent(Graphics g) {
		this.paintComponent(g, Color.blue);
	}
	
	public void paintComponent(Graphics g, Color c) {
		Circle c1 = new Circle (this.obj.getCenter(), this.obj.getRayon());
		DrawableCircle dc1 = new DrawableCircle(c1);
		dc1.paintComponent(g, c);
		Circle c2 = new Circle (this.obj.getCenter(), this.obj.getSousRayon());
		DrawableCircle dc2 = new DrawableCircle(c2);
		dc2.paintComponent(g, Color.white);
	}

}
