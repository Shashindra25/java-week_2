package com.company.product.module.mathematics.geometry.twodshape;

import com.company.product.module.mathematics.shape.TwoDShape;

public class Rectangle extends TwoDShape {
	public int length;
	public int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public int calculateArea() {
		return (length * width);
	}
	
	@Override
	public int calculatePerimeter() {
		return (2 * (length + width));
	}
}