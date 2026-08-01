/*
  Create a class within a package and declare 4 methods with public, protected and private access modifiers; and a method with default accessibility scope.
  -Create a main class within the same package and create an object of the other class in same package and then call its methods.
  -Create a main class, which is similar to the previous class but keep it in a different package.
*/
package pack1;

public class MainProgram1 {
	public static void main(String[] args) {
		Greetings greetings = new Greetings();
		greetings.hi();
		greetings.hello();
		//greetings.hey();
		greetings.bye();
	}
}