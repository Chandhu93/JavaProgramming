package numberSeries;

public class DenominationOfNumber {

	public static void main(String[] args) {
		
		int n = 2100;
		int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		for(int i=0; i< notes.length; i++) {
			
			int deno = n/notes[i];
			System.out.println(notes[i] +" - "+ deno);
			n= n%notes[i];
			
		}
		
	}

}
