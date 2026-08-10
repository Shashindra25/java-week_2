/*
	Step 1: Create the Abstract Class for 3D Shapes
		1. Create a package named `com.company.product.module.mathematics.shape`.
		2. Inside this package, create an abstract class named `ThreeDShape`.
		3. Define two public abstract methods:
			- `public abstract int calculateSurfaceArea();`
			- `public abstract int calculateVolume();`

	Step 2: Create the Abstract Class for 2D Shapes
		1. In the same package (`com.company.product.module.mathematics.shape`), create an abstract class named `TwoDShape`.
		2. Define two public abstract methods:
			- `public abstract int calculateArea();`
			- `public abstract int calculatePerimeter();`
	(Note: You can leave a commented-out non-abstract version of this class above it as a historical reference, although not strictly necessary for functionality).

	Step 3: Create the 3D Shape Implementation - Cube
		1. Create a new package named `com.company.product.module.mathematics.geometry.threedshape`.
		2. Import the `ThreeDShape` abstract class.
		3. Create a public class named `Cube` that extends `ThreeDShape`.
		4. Declare a public integer variable: `public int side`.
		5. Create a constructor `public Cube(int side)` that initializes `this.side = side`.
		6. Override `calculateVolume()` to return `side * side * side`.
		7. Override `calculateSurfaceArea()` to return `6 * side * side`.

	Step 4: Create the 3D Shape Implementation - Cuboid
		1. In the same package (`com.company.product.module.mathematics.geometry.threedshape`), create a public class named `Cuboid` that extends `ThreeDShape`.
		2. Declare three public integer variables: `length`, `width`, and `height`.
		3. Create a constructor `public Cuboid(int length, int width, int height)` that initializes these three variables.
		4. Override `calculateVolume()` to return `length * width * height`.
		5. Override `calculateSurfaceArea()` to return `2 * ((width * height) + (length * width) + (length * height))`.

	Step 5: Create the 2D Shape Implementation - Square
		1. Create a new package named `com.company.product.module.mathematics.geometry.twodshape`.
		2. Import the `TwoDShape` abstract class.
		3. Create a public class named `Square` that extends `TwoDShape`.
		4. Declare a public integer variable: `public int side`.
		5. Create a constructor `public Square(int side)` that initializes `this.side = side`.
		6. Override `calculateArea()` to return `(side * side)`.
		7. Override `calculatePerimeter()` to return `(4 * side)`.

	Step 6: Create the 2D Shape Implementation - Rectangle
		1. In the same package (`com.company.product.module.mathematics.geometry.twodshape`), create a public class named `Rectangle` that extends `TwoDShape`.
		2. Declare two public integer variables: `length` and `width`.
		3. Create a constructor `public Rectangle(int length, int width)` that initializes both variables.
		4. Override `calculateArea()` to return `(length * width)`.
		5. Override `calculatePerimeter()` to return `(2 * (length + width))`.

	Step 7: Create the Main Execution Class
		1. Create a new package named `com.company.product.module.main`.
		2. Import all the shapes (`Square`, `Rectangle`, `Cube`, `Cuboid`) and the abstract classes (`TwoDShape`, `ThreeDShape`) from their respective packages.
		3. Create a public class named `Main`.
		4. Add the standard main method: `public static void main(String[] args)`.
		5. Inside the main method, implement the following logic in order:
			- Instantiate a `Square` object with a side of 3.
			- Print "Area of Square: " followed by the result of `square.calculateArea()`.
			- Print "Perimeter of Square: " followed by the result of `square.calculatePerimeter()`.
			- Instantiate a `Rectangle` object with length 3 and width 5.
			- Print "Area of Rectangle: " followed by `rectangle.calculateArea()`.
			- Print "Perimeter of Rectangle: " followed by `rectangle.calculatePerimeter()`.
			- Instantiate a `Cube` object with a side of 3.
			- Print "Surfacearea of Cube: " followed by `cube.calculateSurfaceArea()`.
			- Print "Volume of Cube: " followed by `cube.calculateVolume()`.
			- Instantiate a `Cuboid` object with length 3, width 4, and height 5.
			- Print "Surfacearea of Cuboid: " followed by `cuboid.calculateSurfaceArea()`.
			- Print "Volume of Cuboid: " followed by `cuboid.calculateVolume()`.
*/

package com.company.product.module.main;

import com.company.product.module.mathematics.geometry.twodshape.Square;
import com.company.product.module.mathematics.geometry.twodshape.Rectangle;
import com.company.product.module.mathematics.shape.TwoDShape;
import com.company.product.module.mathematics.shape.ThreeDShape;
import com.company.product.module.mathematics.geometry.threedshape.Cube;
import com.company.product.module.mathematics.geometry.threedshape.Cuboid;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		Square square = new Square(3);
		System.out.println("Area of Square: " + square.calculateArea());
		System.out.println("Perimeter of Square: " + square.calculatePerimeter());
		System.out.println();
		Rectangle rectangle = new Rectangle(3, 5);
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
		System.out.println();
		Cube cube = new Cube(3);
		System.out.println("Surfacearea of Cube: " + cube.calculateSurfaceArea());
		System.out.println("Volume of Cube: " + cube.calculateVolume());
		System.out.println();
		Cuboid cuboid = new Cuboid(3, 4, 5);
		System.out.println("Surfacearea of Cuboid: " + cuboid.calculateSurfaceArea());
		System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());
		System.out.println();
	}
}