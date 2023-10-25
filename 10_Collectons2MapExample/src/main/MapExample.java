package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	public static void main(String[] args) {
		
		
		Map<String, String> districts = new HashMap<>();
		
		districts.put("istanbul", "kadikoy, uskudar, umraniye");
		
		districts.put("ankara", "gazi osman pasa, cankaya , yenimahalle");
		
		
		System.out.println(districts.get("ankara"));
		
		districts.put("ankara", "gazi osman pasa");
		
		System.out.println(districts.get("ankara"));
		
		
		Set<String> keys= districts.keySet();
		
		for (String key : keys) {
			System.out.println(key + "--" + districts.get(key));
		}
		
		
		
	}

}
