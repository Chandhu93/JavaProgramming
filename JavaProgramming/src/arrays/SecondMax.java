package arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] a = {12, 8, 10, 9, 84, 11, 108, 3, 0};
		int max= Integer.MIN_VALUE;
		int smax= Integer.MIN_VALUE;		// both start with min number
		
		for(int i=0; i<a.length; i++) {
			if( a[i] >max) {				// if a[i] greater then, max = a[i]
				smax = max;
				max=a[i];
			} 
			
			else if ( a[i] > smax &&  a[i] != max) {  //If it's not the max, but still greater than current smax, update smax.
				smax = a[i]	;							//Also checks a[i] != max to avoid duplicate max being counted as smax.
			}
		}
 		System.out.println(max);
 		System.out.println(smax);
	}

}
