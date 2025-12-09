package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int[] a= {1,5,6,9,3,0,13};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		ArrayList<Integer> arr = new ArrayList<>();
		int missNum=0; 
		
		for(int i=0; i<a.length; i++) {
			
			while( missNum < a[i] ) {
				arr.add(missNum);
				missNum++;
			}
			missNum=a[i]+1;
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
		int secMaxMiss = arr.get(arr.size()-2); 
		System.out.println(secMaxMiss);
		
	}

}
