package demo;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		
		String day = "May";
		
		switch(day){
		case "Monday":
			System.out.println("I will have cereals today");
			break;
			
		case "Tuesday":
			System.out.println("I will have Oats today");
			break;
			
		case "Wednesday":
			System.out.println("I will have fruits today");
			break;
			
		case "Thursday:":
			System.out.println("I will have juice today");
			break;
			
		case "Friday":
			System.out.println("I will have rice today");
			break;
			
		case "Saturday":
			System.out.println("I will have salad today");
			break;
			
		case "Sunday":
			System.out.println("I will skip my breakfast bcause I will get up in the afternoon");
			break;
			
			default:
				System.out.println("Invalid choice");
			
		}
	}

}
