package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMaxMissing {

	public static void main(String[] args) {
		int[]a= {5,4,6,17,9,15};
		Arrays.sort(a);
		ArrayList<Integer> arr = new ArrayList<>();
		int missingNum=0;
		
		for(int i: a) {
			while(missingNum < i) { //updating next instant missing number
				arr.add(missingNum);					// 1,2,3 is in one loop, 4,5,6 is present
				missingNum++;
			}
			missingNum= i+1;	// updating missing number here missNum is updated to 7
		}
		
		int secMaxMiss = arr.get(arr.size()-2); // use size method to print for other missing numbers 
		System.out.println(secMaxMiss);
		
	}
	

}
