package Assignment_java;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of width");
		double width = s1.nextDouble();
		System.out.println("Enter the value of length");
		double length = s1.nextDouble();
		double area = width * length;
		System.out.println("Area of rectangle" + "  " + area);
		s1.close();

	}

}
