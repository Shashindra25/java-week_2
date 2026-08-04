/*
Creater an application.(Exception Handling)
	-One program class.
	-One class for performing division operation on two numbers.
*/
package com.companyname.projectname.modulename.main;

import com.companyname.projectname.modulename.mathematics.Division;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scanner.nextInt();
		Division division = new Division(num1, num2);
		System.out.println("Division Result: " + division.divide());
		System.out.println();
	}
}