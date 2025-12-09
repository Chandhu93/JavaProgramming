package collections;

import java.util.HashMap;
import java.util.Map;

public class FindMinValueOfMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("apple", 56);
		hm.put("mango", 33);
		hm.put("papaya", 22);
		hm.put("banana", 11);
		
		int minPrice=Integer.MAX_VALUE;
		String minFruit= "";
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() < minPrice) {
				minPrice= entry.getValue();
				minFruit= entry.getKey();
			}
		}
			System.out.println(minFruit+" --> "+ minPrice);
			
		
		
	}

}
