package demo;

public class IFELseDemo {
	public static void main(String[] args) {
		
		String day ="Friday";
		
		
		
		if(day.equals("Monday")){
			System.out.println("I will have Oats in the breakfast");
		}
		
		else if(day.equalsIgnoreCase("Tuesday")){
			System.out.println("I will have fruits in the breakfast");
		}
		
		else if(day.equals("Wednesday")){
			System.out.println("I will have a heavy meal in the breakfast");
		}
		
		else {
			System.out.println("I will skip my breakfast");
		}
		
	}

}
