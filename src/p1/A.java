package p1;

import java.util.Scanner;

public class A {
	public double add(double x, double y) {
		return x + y;
	}
	public double subtract(double x, double y) {
		return x - y;
	}
	public double multiply(double x, double y) {
		return x * y;
	}
	public double divide(double x, double y) {
		if(y!= 0) {
			return x / y;
		}else {
			System.out.println("Division by zero is not allowed");
			return 0;
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double x = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		double y = scanner.nextDouble();
		
		double addition = a1.add(x, y);
        double subtraction = a1.subtract(x, y);
        double multiplication = a1.multiply(x, y);
        double division = a1.divide(x, y);
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        
        scanner.close();
		
	}

}

 