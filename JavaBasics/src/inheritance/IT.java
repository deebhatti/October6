package inheritance;

public class IT extends Management {
	
	
	
	int bonus = 10000;
	
	public void day(){
		System.out.println("Today is Thursday");
	}
	
	public static void main(String[] args) {
		IT John = new IT();
		
		//Adding a comment in line number 16
		
		System.out.println("Bonus of John = $ " + John.bonus);
		System.out.println("Salary of John = $ " + John.salary);
		
		John.day();
	}

}
