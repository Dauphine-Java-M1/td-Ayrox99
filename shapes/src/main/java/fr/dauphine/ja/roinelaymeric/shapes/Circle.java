package fr.dauphine.ja.roinelaymeric.shapes;

public class Circle {

	private Point centre;
	private double rayon;
	
	public Circle (Point c, double r) {
		this.centre = new Point(c);
		this.rayon = r;
	}
	
	@Override
	public String toString() {
		return "(c = " + this.centre.toString() + ", r = " + this.rayon + ", s = " + this.surface() + (this.ClassName().equals("Circle") ?  ")": ""); 
	}
	
	public void translate (double dx, double dy) {
		this.centre.translate(dx, dy);
	}
	
	public Point getCenter() {
		return new Point(this.centre);
	}
	
	public String ClassName() {
		String temp = this.getClass().getName();
		return temp.substring(temp.lastIndexOf(".")+1);
	}
	
	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}
	
	public boolean equals (Circle c) {
		return this.centre.isSameAs(c.centre) && this.rayon == c.rayon;
	}
	
	public boolean contains(Point p) {
		return this.centre.distance(p) <= this.rayon;
	}
	
	public static boolean contains(Point p, Circle...circles) {
		for (Circle c : circles) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
//		Point p=new Point(1,2);
//		Circle c=new Circle(p,1);
//		Circle c2=new Circle(p,2);
//		c2.translate(1,1);
//		System.out.println(c+" "+c2);
//		Circle c=new Circle(new Point(1,2), 1);
//		c.getCenter().translate(1,1);
//		System.out.println(c);
//		System.out.println(23);
		Point p=new Point(0,0);
		Circle c = new Circle(p, 2);
		Point p1=new Point(1,0);
		Point p2=new Point(2,0);
		Point p3=new Point(2.1,0);
		System.out.println(c.contains(p1));
		System.out.println(c.contains(p2));
		System.out.println(c.contains(p3));
	}

}
