package fr.dauphine.ja.roinelaymeric.shapes.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.roinelaymeric.shapes.model.Shape;
import fr.dauphine.ja.roinelaymeric.shapes.view.MyDisplay;
import fr.dauphine.ja.roinelaymeric.shapes.model.*;

public class MouseController implements MouseMotionListener, MouseListener{
	
	boolean drag = false;
	int memx, memy;
	Shape s;
	
	private MyDisplay dp;
	
	public MouseController(MyDisplay dp) {
		this.dp = dp;
	}

	public void mouseDragged(MouseEvent e) {
		if (drag) {
			s.translate(e.getX()-memx, e.getY()-memy);
			this.dp.getWorld().changeWorld("translation opérée");
//			Circle c = (Circle) s;
//			System.out.println(c.getCenter().getX() + " " + c.getCenter().getY());
		}
		memx = e.getX();
		memy = e.getY();
	}
	
	public void mouseReleased(MouseEvent e) {
		this.drag = false;
		this.s = null;
	}

	public void mouseMoved(MouseEvent e) {
		//System.out.println("Fromage");
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		if ((!drag) && (dp.getWorld().contains( new Point( e.getX(), e.getY() ) ) != null) ) {
			s = dp.getWorld().contains( new Point( e.getX(), e.getY() ) );
			this.drag = true;
		}
		memx = e.getX();
		memy = e.getY();
		System.out.println("On a cliqué en " +e.getX() +", "+e.getY());
		
	}
}
