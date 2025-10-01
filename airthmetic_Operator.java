package Assignment_java;

//Assignment 4
public class airthmetic_Operator {

	static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition of 2 numbers :" + +c);
	}

	static void sub() {
		int a = 20;
		int b = 10;
		int c = a - b;
		System.out.println("Subtration of 2 numbers :" + +c);
	}

	static void mul() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println("multiplication of 2 numbers :" + +c);
	}

	static void div() {
		int a = 100;
		int b = 20;
		int c = a / b;
		System.out.println("division of 2 numbers :" + +c);
	}

	static void mud() {
		int a = 110;
		int b = 20;
		int c = a % b;
		System.out.println("modulus of 2 numbers :" + +c);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mud();

	}

}
