package fr.dauphine.ja.roinelaymeric.shapes.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.roinelaymeric.shapes.controller.MouseController;
import fr.dauphine.ja.roinelaymeric.shapes.model.*;

@SuppressWarnings({ "serial", "deprecation" })
public class MyDisplay extends JPanel implements Observer{
	
	private World w;
	
	public World getWorld() {
		return this.w;
	}

	public MyDisplay(World w) {
		super();
		this.w = w;
		this.w.addObserver(this);
	}
	
	public MyDisplay() {
		super();
	}
	
	public void paintComponent(Graphics g) {
//		g.drawLine(0, 0, 250, 250);
		for (Shape s : this.w.getShapes()) {
			s.draw(g);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true); // rend la fenêtre visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		MyDisplay d = new MyDisplay();
		World w = new World();
		MyDisplay d = new MyDisplay(w);
		MouseController mc = new MouseController(d);
		d.addMouseMotionListener(mc);
		d.addMouseListener(mc);
//		for (int i = 0; i<5; i++) {
//			w.add(new Circle(new Point(250, 250), i*50));
//		}
//		Point p1 = new Point(0, 0);
//		Point p2 = new Point(100, 100);
//		Point p3 = new Point(200, 100);
//		Point p4 = new Point(200, 200);
//		Point p5 = new Point(300, 200);
//		LigneBrisee lb = new LigneBrisee();
//		lb.add(p1);
//		lb.add(p2);
//		lb.add(p3);
//		lb.add(p4);
//		lb.add(p5);
//		w.add(lb);
		frame.add(d);
		w.add(new Ring (new Point (400, 400), 100, 50));
		w.add(new Circle (new Point(250, 250), 100));
		w.add(new Circle (new Point(100, 100), 50));
	}
	
	public void update(Observable w, Object arg1) {
		Graphics g = this.getGraphics();
		 g.clearRect(0, 0, 500, 500);
		paintComponent(g);
		System.out.println(arg1);
	}
	
}
