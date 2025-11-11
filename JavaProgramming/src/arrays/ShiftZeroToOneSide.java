package arrays;

import java.util.Arrays;

public class ShiftZeroToOneSide {

	public static void main(String[] args) {

		int[] a = {1, 4, 0,0,45,67,88,0,00};
		int[]  b= new int[a.length];
		int index = a.length-1;
 	
		for(int i= a.length-1 ; i>=0 ;i-- ) {
			if(a[i] != 0) 
				b[index--]= a[i];
		}
	System.out.println(Arrays.toString(b));
	}
}
