package shapes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {

	double radius;

	public Circle(double radius) {
		// initialize attributes
		
		setRadius(radius);
	}
	
	public double getRadius() {
		// returns value of radius variable
		return radius;
	}

	public void setRadius(double r) {
		// sets value of radius 
		
		radius = r;
	}

	public double getCircumference() {
		// calculate and return circumference of circle.
		
		return Math.PI * (2 * getRadius());
	}

	public String getFormattedCircumference() {
		// return formatted value of circumference
		
		return formatNumber(getCircumference());
	}

	public double getArea() {
		// calculate and return area of circle
		
		return Math.PI * (getRadius() * getRadius());
	}

	public String getFormattedArea() {
		// return formatted value of circumference
		
		return formatNumber(getArea());
	}

	private String formatNumber(double x) {
		// format value to two decimal points
		
		NumberFormat formatter = new DecimalFormat("#,###.00");
		return formatter.format(x);

	}

}
