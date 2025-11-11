package arrays;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] a = {32, 4, 46, 8, 84, 9, 43 };
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]> max ) {
				max=a[i];
			}
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Max:" + max);
		System.out.println("Min:" + min);
	}
	
}
