package fr.dauphine.ja.roinelaymeric.shapes.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class World extends Observable{
	
	private ArrayList<Shape> shapes;
	
	public Shape contains(Point p) {
		for (Shape s : this.shapes) {
			if (s.contains(p)) {
				return s;
			}
		}
		return null;
	}
	
	public ArrayList<Shape> getShapes(){
		return this.shapes;
	}
	
	public World() {
		this.shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape s) {
		this.shapes.add(s);
		changeWorld("ajout d'une forme");
	}
	
	public void addObserver(Observer o) {
		super.addObserver(o);
	}
	
	public void changeWorld(String s) {
		setChanged();
		notifyObservers(s);
	}

	public static void main(String[] args) {
		
	}
	
}
