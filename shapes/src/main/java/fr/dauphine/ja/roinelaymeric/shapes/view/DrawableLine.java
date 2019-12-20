package fr.dauphine.ja.roinelaymeric.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.roinelaymeric.shapes.model.LigneBrisee;
import fr.dauphine.ja.roinelaymeric.shapes.model.Point;

public class DrawableLine extends Drawable<LigneBrisee>{
	
	public DrawableLine(LigneBrisee lb) {
		this.obj = lb;
	}
	
	public void paintComponent(Graphics g) {
		Point mem = new Point();
		int x1, x2, y1, y2;
		for (Point p : this.obj.getPoints()) {
			if( ! (p.equals(this.obj.getPoints().getFirst())) ) {
				x1 = (int) mem.getX();
				y1 = (int) mem.getY();
				x2 = (int) p.getX();
				y2 = (int) p.getY();
				g.drawLine(x1, y1, x2, y2);
			}
			if(! (p.equals(this.obj.getPoints().getLast())) ){
				mem = p;
			}
		}
	}
}
