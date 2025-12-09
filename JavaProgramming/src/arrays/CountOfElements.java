package arrays;

public class CountOfElements {

	public static void main(String[] args) {

		int [] a= {1,2,3,4,5,0,1,2,3,1,0};
		boolean[] b= new boolean[a.length];

		for (int i=0; i<a.length-1; i++) {
			if(!b[i]) {
				int count=1;
				for(int j=i+1; j<=a.length-1; j++) {
					if(a[i] == a[j]) {
						b[j] = true;
						count++;
					}
				}
				if(count>1) {
					System.out.println(a[i]+" --> "+ count);
				}
				else if (count==1) {
					System.out.println("Unique Elements: "+a[i]+" --> "+ count);
				}
			}
		}
	}
}
