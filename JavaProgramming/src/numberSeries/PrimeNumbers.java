package numberSeries;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		boolean flag = true;

		if(n<2) {
			flag= false;
		}
		else {
			for (int i=2; i<n-1; i++) {
				if(n% i == 0) {
					flag= false;
					break;
				}
			}
		}

		if (flag== true) 
			System.out.println(n+" is a prime");
		else
			System.out.println(n+" not a prime number");
	}
}

class PrimeNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int count =0;

		for(int i=2; i<=n-1 ;i++) {
			if(n%i == 0) {
				count++;
				break;
			}
		}

		if (n < 2) {
		    System.out.println(n + " is not a prime number");
		} else if (count == 0) {
		    System.out.println(n + " is a prime number");
		} else {
		    System.out.println(n + " is not a prime number");
		}
	}

}

