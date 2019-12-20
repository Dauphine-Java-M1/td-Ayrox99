package fr.dauphine.ja.roinelaymeric.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.roinelaymeric.shapes.model.Circle;

public class DrawableCircle extends Drawable<Circle>{
	
	public DrawableCircle(Circle c) {
		this.obj = c;
	}
	
	public void paintComponent(Graphics g) {
		this.paintComponent(g, Color.orange);
	}
	
	public void paintComponent(Graphics g, Color c) {
		double r = this.obj.getRayon();
		double x = this.obj.getCenter().getX()-r;
		double y = this.obj.getCenter().getY()-r;
		g.drawOval((int)x, (int)y, (int)r*2, (int)r*2);
		g.setColor(c);
		g.fillOval((int)x, (int)y, (int)r*2, (int)r*2);
	}

}
