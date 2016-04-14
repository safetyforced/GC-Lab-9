package circleStuff;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {

	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getCircumference() {
		return Math.PI * (2 * getRadius());
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}

	public double getArea() {
		return Math.PI * (getRadius() * getRadius());
	}

	public String getFormattedArea() {
		return formatNumber(getArea());
	}

	private String formatNumber(double x) {
		NumberFormat formatter = new DecimalFormat("#.00");
		return formatter.format(x);

	}

}
