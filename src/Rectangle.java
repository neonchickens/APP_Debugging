
public class Rectangle {
	
	//Dimensions of our rectangle
	private double height, width;

	public Rectangle() {
		//Default constructor, default 1x1 rectangle
		this.height = 1;
		this.width = 1;
	}
	
	public Rectangle(double height, double width) {
		//Constructor w parameters
		this.height = height;
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getDiagonal() {
		//The diagonal is the distance from corner to opposite corner
		return 0;
	}	
	
	public double getArea() {
		//The area is the two dimensional space a shape occupies
		return 0;
	}	
	
	public double getPerimeter() {
		//The perimeter is the distance around the outer edge of a shape
		return 0;
	}
}
