package main;
/*
  -Create an addition class in mathematics package.
  -Create a division class in mathematics package.
  -Create an order class in ecommerce package.
  -Create a product class in ecommerce package.
  -Create a debitCard class in bank package.
  -Create a creditCard class in bank package.
  
  -Create a main program, that imports all the above packages and their classes, and then create object of all the classes.
  (Note: The aim of these programs is to learn the usage of packages. So, keep a couple of methods in those classes, which prints something.)
*/
import mathematics.Addition;
import mathematics.Division;
import bank.DebitCard;
import bank.CreditCard;
import ecommerce.Order;
import ecommerce.Product;

class MainProgram {
	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.method1();
		addition.method2();
		
		Division division = new Division();
		division.method1();
		division.method2();
		
		Order order = new Order();
		order.method1();
		order.method2();
		
		Product product = new Product();
		product.method1();
		product.method2();
		
		DebitCard debitCard = new DebitCard();
		debitCard.method1();
		debitCard.method2();
		
		CreditCard creditCard = new CreditCard();
		creditCard.method1();
		creditCard.method2();
	}
}