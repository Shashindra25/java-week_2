package com.company.product.module.mathematics.geometry.twodshape;

import com.company.product.module.mathematics.shape.TwoDShape;

public class Square extends TwoDShape {
	public int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public int calculateArea() {
		return (side * side);
	}
	
	@Override
	public int calculatePerimeter() {
		return (4 * side);
	}
}