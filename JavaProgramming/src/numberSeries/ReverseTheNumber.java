package numberSeries;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		int n= 5115;
		int rev= 0;
		int temp=n;
		
		while(n>0) {
			
			int rem = n%10;
			
			rev= rev*10 + rem;
			n= n/10;
		}
		if(temp == rev) {
			System.out.println(temp+" is a Palindrom number");
		}
		else
			System.out.println(temp+" is not a Palindrom number");
	}

}
