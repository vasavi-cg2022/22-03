package abstracts;

public class Rectengle extends Shape {
    double  widht,length,area,perimeter;

	

	public Rectengle(String color, double widht, double length) {
		super(color);
		this.widht = widht;
		this.length = length;
		
	}



	public double getWidht() {
		return widht;
	}



	public void setWidht(double widht) {
		this.widht = widht;
	}



	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}

	public void area() {
		System.out.println("area of "+(length*widht));
			
	}
	public void perimeter() {
		System.out.println("area of "+(2*(length+widht)));
	}
}