package com.bootcamp.calculatorsystemapi;

import com.bootcamp.calculatorsystemapi.Modules.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApiApplication.class, args);

		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Calculator!");

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		System.out.println("Choose an operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.print("Enter the operation number: ");
		int operation = scanner.nextInt();

		switch (operation) {
			case 1:
				System.out.println("Result: " + calculator.add(num1, num2));
				break;
			case 2:
				System.out.println("Result: " + calculator.subtract(num1, num2));
				break;
			case 3:
				System.out.println("Result: " + calculator.multiply(num1, num2));
				break;
			case 4:
				try {
					System.out.println("Result: " + calculator.divide(num1, num2));
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Invalid operation");
		}

		scanner.close();
	}


}
