package numberSeries;

public class PowerOfANumber {

	public static void main(String[] args) {
		
		int n= 2;
		int power= 2;
		int product=1;
		
		for(int i=1; i<=power; i++) {
			
			product = product* n; 
		}
		System.out.println(product);
	}

}


