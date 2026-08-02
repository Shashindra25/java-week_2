/*
Create a Shape class, declare string variables of color and lineType. And also add area and perimeter methods that return int value.
	-Then declare applyColor and useLine methods with void return type. This class will be a parent class for other classes.
   -Create a Rectangle class and make it a child of Shape class.
    -Declare length and width integer variables.
	-Use this and super keywords to create constructor.
	-Override methods from parent class to calculate area and perimeter.
	-Also override the applyColor and useLine methods from parent class.
	-Create getter methods for length and width.
   -Create a Circle class and make it a child of Shape class.
	-Declare pi = 3.14159 and radius variables as double.
    -Use this and super keywords to create constructor.
	-Override methods from parent class to calculate area and perimeter.
	-Also override the applyColor and useLine methods from parent class.
	-Create getter method for radius.
   -Create a main class and create the objects of Rectangle and Circle class.
    -Use all the methods present in them.
*/
	
package com.companyname.projectname.modulename.mainprogram;

import com.companyname.projectname.modulename.shape.Rectangle;
import com.companyname.projectname.modulename.shape.Circle;

class Main {
	public static void main(String[] args){
		System.out.println();
		Rectangle rectangle = new Rectangle(2, 5, "Yellow", "Solid");
		rectangle.useLine();
		rectangle.applyColor();
		System.out.println("Length of the Rectangle: " + rectangle.getLength() + ". And Width of the Rectangle: " + rectangle.getWidth() + ".");
		System.out.println("Area of Rectangle: " + rectangle.area());
		System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
		
		System.out.println();
		Circle circle = new Circle(3, "Red", "Dotted");
		circle.useLine();
		circle.applyColor();
		System.out.println("Radius of the Circle: " + circle.getRadius() + ".");
		System.out.println("Area of Circle: " + circle.area());
		System.out.println("Perimeter of Circle: " + circle.perimeter());
		System.out.println();
	}
}