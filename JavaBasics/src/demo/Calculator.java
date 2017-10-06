package demo;

public class Calculator {
	public Calculator(){
		
	}
	
	
	public int add(int a, int b){ //a and b are formal parameters
		return(a+b);
	}
	
	public void subtract(int a, int b){
		System.out.println(a-b);
	}
	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public void divide(int a, int b){
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		
		System.out.println(basicCal.add(20, 30));
		
		 //20 and 30 are called as actual parameters.
		basicCal.subtract(50, 20);
		basicCal.multiply(5, 2);
		basicCal.divide(60, 10);
		
	}
	
	

}
