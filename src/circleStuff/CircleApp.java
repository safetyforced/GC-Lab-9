package circleStuff;

import java.util.Scanner;

public class CircleApp {

	static Scanner input = new Scanner(System.in);
	static boolean userConsent = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 0;
		int counter = 0;
		
		System.out.println("Welcome to the Circle Tester.");

		while (userConsent) {
			radius = getInput();
			Circle c1 = new Circle(radius);
			printStuff(c1);
			counter++;
			userConsent = getUserConsent();

		}

		System.out.println("You tested " + counter + " circles.  Bye!");
		input.close();

	}

	public static void printStuff(Circle c1) {
		// print stuff

		System.out.println("Circumference is: " + c1.getFormattedCircumference());
		System.out.println("Area is: " + c1.getFormattedArea());
	}

	public static boolean getUserConsent() {
		// ask user if they want to run the program again

		String c;
		boolean consent = true;
		
		while (true) {
			System.out.println("Would you like to test another circle? (y/n): ");
			c = input.nextLine();
			if (c.equalsIgnoreCase("y")) {
				consent = true;
				break;
			} else if (c.equalsIgnoreCase("n")) {
				consent = false;
				break;
			} else {
				System.out.println("Please enter \"y\" or \"n\".");
				continue;
			}
		}
		return consent;
	}

	public static double getInput() {
		// return radius of circle from console user input.

		double r = 0;

		while (true) {
			try {
				System.out.print("Enter Radius: ");
				r = input.nextDouble();
				input.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Please enter a number, not... whatever that was.");
				input.nextLine();
				continue;
			}
		}
		return r;
	}

}
