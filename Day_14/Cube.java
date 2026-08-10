package com.company.product.module.mathematics.geometry.threedshape;

import com.company.product.module.mathematics.shape.ThreeDShape;

public class Cube extends ThreeDShape {
	public int side;
	
	public Cube(int side) {
		this.side = side;
	}
	
	@Override
	public int calculateVolume() {
		return side * side * side;
	}
	
	@Override
	public int calculateSurfaceArea() {
		return 6 * side * side;
	}
}