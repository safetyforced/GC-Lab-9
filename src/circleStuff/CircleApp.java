package circleStuff;

import java.util.Scanner;

public class CircleApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = getInput();

		Circle c1 = new Circle(radius);

		System.out.println(c1.getFormattedCircumference());
		System.out.println(c1.getFormattedArea());
		input.close();
	}

	public static double getInput() {
		
		double r = 0;
		
		while (true) {
			try {
				System.out.println("Welcome to the Circle Tester.");
				System.out.print("Enter Radius: ");
				r = input.nextDouble();
				input.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Please enter a number");
				input.nextLine();
				continue;
			}
		}
		return r;
	}
}
