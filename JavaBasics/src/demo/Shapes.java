package demo;

public class Shapes {
	
	int length;
	int breadth;
	
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
	
	public Shapes(int a, int b){
		length = a;
		breadth = b;
	}
	
	public void area(){
		System.out.println("Area of rectangle = " + (length*breadth) + " cm.sq.");
	}
	
	public static void shape(){
		System.out.println("Shape of the figure is rectangle");
	}
	
	
	public static void main(String[] args) {
		Shapes rectangle1 = new Shapes();
		rectangle1.area();
		shape();
		
//		Shapes rectangle2 = new Shapes(10,8);
//		rectangle2.area();
//		shape();
	}

}
