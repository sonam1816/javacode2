package Assignment_java;

import java.util.Scanner;

//WAP for Area of a Square with scanner.
public class AreaOfSquare {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Entrer the side ");

		double side = s1.nextDouble();
		double area = side * side;
		System.out.println(area);

	}

}

ua