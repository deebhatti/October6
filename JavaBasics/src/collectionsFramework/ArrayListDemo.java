package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		
		for (String x : cities){
			System.out.println(x);
		}
		
		System.out.println("Total entries in the list = " + cities.size());
		
		System.out.println("Index of London = " + cities.indexOf("London"));
		
		System.out.println("Element at 1st index = " + cities.get(1));
		
	}

}
