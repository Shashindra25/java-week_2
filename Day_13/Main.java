/*
 Create a custom exception class "InsufficientBalanceException" that extends RuntimeException or Exception class and override getMessage method.
   -Create a class "BankingOperations" that extends InsufficientBalanceException class.
    -Create a method "withdraw" that throws InsufficientBalanceException and takes a double value "currentBalance", an int value "withdrawAmount" as parameters and returns a double value.
	 -Now throw the InsufficientBalanceException by creating an object of the class, if the currentBalance < withdrawAmount.
	 -Or else perform withdraw operation by removing withdrawAmount from currentBalance.
	 -Then return the currentBalance;
   -Create a class "Main" and create the object of banking operations class and perform withdraw operation.
    -Also use try catch blocks to handle the exception that comes from the withdraw operation.
*/
package com.company.project.module.main;

import com.company.project.module.banking.BankingOperations;
import com.company.project.module.customexception.InsufficientBalanceException;

public class Main {
	public static void main(String[] args) {
		BankingOperations bankingOperations = new BankingOperations();
		try {
			System.out.println("Available Balance: " + bankingOperations.withdraw(10000, 5000));//without Exception
			//System.out.println("Available Balance: " + bankingOperations.withdraw(10000, 50000));//with Exception
		} catch (InsufficientBalanceException insufficientBalanceException) {
			System.out.println(insufficientBalanceException.getMessage());
		}
	}
}