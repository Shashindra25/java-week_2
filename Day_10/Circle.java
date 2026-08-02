package com.companyname.projectname.modulename.shape;

import com.companyname.projectname.modulename.Shape;

public class Circle extends Shape{
	public double pi = 3.14159;
	public double radius;
	
	public Circle(int radius, String color, String lineType) {
		this.radius = radius;
		super.color = color;
		super.lineType = lineType;
	}
	
	@Override
	public int area() {
		int area = (int) (pi * radius * radius);
		return area;
	}
	
	@Override
	public int perimeter() {
		int perimeter = (int) (2 * pi * radius);
		return perimeter;
	}
	
	@Override
	public void applyColor() {
		System.out.println(color + " color is applied to Circle.");
	}
	
	@Override
	public void useLine() {
		System.out.println(lineType + " line is used to create the Circle.");
	}
	
	public double getRadius() {
		return radius;
	}
}