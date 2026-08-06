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