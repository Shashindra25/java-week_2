package com.company.product.module.mathematics.geometry.threedshape;

import com.company.product.module.mathematics.shape.ThreeDShape;

public class Cuboid extends ThreeDShape {
	public int length;
	public int width;
	public int height;
	
	public Cuboid(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int calculateVolume() {
		return length * width * height;
	}
	
	@Override
	public int calculateSurfaceArea() {
		return 2 * ((width * height) + (length * width) + (length * height));
	}
}