package com.company.project.module.mathematics;

/*
//#1
//Basic try catch
//ArithmeticException
public class Division {
	public int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}
		System.out.println(num1 + " / " + num2 + " = " + result);
		return result;
	}
}
*/

/*
//#2
//one try multiple catch
//ArithmeticException
//ArrayIndexOutOfBoundsException
public class Division {
	public int divide(int[] numbers) {
		int result = 0;
		try {
			result = numbers[0] / numbers[1];
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			arrayIndexOutOfBoundsException.printStackTrace();
		}
		System.out.println("Result: " + result);
		return result;
	}
}
*/

/*
//#3
//Multiple try catch
//Requirement: Take 4 integer inputs and perform divide on first 2 integers, then on next 2 integers.
//Note: Both operations must execute and their output must be displayed.
//ArithmeticException
public class Division {
	public void divide(int num1, int num2, int num3, int num4) {
		int result1 = 0, result2 = 0;
		try {
			result1 = num1 / num2;
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}
		System.out.println("Result 1: " + result1);
		
		//try {
		//	result1 = num1 / num2;
		//	result2 = num3 / num4;
		//} catch (ArithmeticException arithmeticException) {
		//	arithmeticException.printStackTrace();
		//}
		//System.out.println("Result 1: " + result1);
		//System.out.println("Result 2: " + result2);
		//We can't do this, because the "result2" will not be executed if the "result1" fails.
		
		try {
			result2 = num3 / num4;
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}
		System.out.println("Result 2: " + result2);
	}
}
*/

///*
//#4
//Nested try catch
//Requirement: Take 2 integer inputs and perform divide operation on them. Perform the hi(), hello() and print the result only when the divide operation is successfully performed.
//i.e. If the divide "result1 = num1 / num2;" fails then both "greeting.hi();greeting.hello();" and "System.out.println("Result 1: " + result1);" should not execute.
//Note: The failure of "greeting.hi();greeting.hello();" should not effect the execution of "System.out.println("Result 1: " + result1);".
//NullPointerException
//ArithmeticException
public class Division {
	public void divide(int num1, int num2) {
		Greetings greeting = new Greetings();
		int result1 = 0;
		try {
			result1 = num1 / num2;
			
			try {
				greeting.hi();
				greeting.hello();
			} catch (NullPointerException nullPointerException) {
				nullPointerException.printStackTrace();
			}
			
			System.out.println("Result 1: " + result1);
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}
	}
}
//*/