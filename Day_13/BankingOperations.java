package com.company.project.module.banking;

import com.company.project.module.customexception.InsufficientBalanceException;

public class BankingOperations {
	public double withdraw(double currentBalance, int withdrawAmount) throws InsufficientBalanceException {
		if (currentBalance < withdrawAmount) {
			InsufficientBalanceException insufficientBalanceException = new InsufficientBalanceException();
			throw insufficientBalanceException;
		} else {
			currentBalance -= withdrawAmount;
		}
		return currentBalance;
	}
}