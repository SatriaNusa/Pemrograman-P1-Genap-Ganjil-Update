package Praktikum12d.bin;

public class Point extends Shape{
	static int x, y;
	public Point(){
		x = 0;
		y = 0;
	}
	public double area(){
		return 0;
	}
	public double perimeter(){
		return 0;
	}
	public static void print(){
		System.out.println("point: " + x + ","+ + y);
	}
	public static void main(String[] satria){
		Point p = new Point();
		p.print();
	}

}

