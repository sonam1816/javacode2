package Assignment_java;
//WAP for Area of a circle with scanner.

import java.util.Scanner;

public class AreaofaCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		int radius = s1.nextInt();

		double area = Math.PI * radius * radius; // calculate the area of circle

		System.out.println("area of circle->" + area);
		s1.close();

	}

}
