package fr.dauphine.ja.roinelaymeric.shapes.view;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Drawable<T> extends JPanel{
	
	protected T obj;
	
	public abstract void paintComponent(Graphics g);
	
}
