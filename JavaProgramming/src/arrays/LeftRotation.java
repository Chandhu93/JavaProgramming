package arrays;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};

		for(int j=1; j<=a.length-1; j++) {

			int temp = a[0];
			for(int i=0; i<a.length-1  ; i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
			System.out.println(Arrays.toString(a));
		}
		
	}
}