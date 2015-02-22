package Shape3;

public class Circle {

	private double radius;

	public Circle() {
	}

	public void setRadius(double circleRadius) {
		radius = circleRadius ;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		double area = 3.14159*radius*radius;
		return area;
	}
}
