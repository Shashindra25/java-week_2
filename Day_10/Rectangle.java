package com.companyname.projectname.modulename.shape;

import com.companyname.projectname.modulename.Shape;

public class Rectangle extends Shape{
	public int length;
	public int width;
	
	public Rectangle(int length, int width, String color, String lineType) {
		this.length = length;
		this.width = width;
		super.color = color;
		super.lineType = lineType;
	}
	
	@Override
	public int area() {
		int area = length * width;
		return area;
	}
	
	@Override
	public int perimeter() {
		int perimeter = 2 * (length + width);
		return perimeter;
	}
	
	@Override
	public void applyColor() {
		System.out.println(color + " color is applied to Rectangle.");
	}
	
	@Override
	public void useLine() {
		System.out.println(lineType + " line is used to create the Rectangle.");
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
}