package demo2;

public class Calculator {
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(double a, double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(20, 30);
		basicCal.add(10.5,5.3);
	}

}
