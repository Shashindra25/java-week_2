package com.company.project.module.main;

import com.company.project.module.mathematics.Division;

public class Main {
	public static void main(String[] args) {
		Division division = new Division();
		//division.divide(10, 2);//#1
		//division.divide(10, 0);//#1.1
		
		//division.divide(new int[] {10, 2});//#2
		//division.divide(new int[] {10, 0});//#2.1
		//division.divide(new int[] {10});//#2.2
		
		//division.divide(10, 2, 20, 5);//#3
		//division.divide(10, 0, 20, 5);//#3
		//division.divide(10, 2, 20, 0);//#3
		//division.divide(10, 0, 20, 0);//#3
		
		//division.divide(10, 2);//#4
		division.divide(10, 0);//#4.1
	}
}