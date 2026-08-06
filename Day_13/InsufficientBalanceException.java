package com.company.project.module.customexception;

public class InsufficientBalanceException extends Exception {
//public class InsufficientBalanceException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Insufficient Balance.";
	}
}