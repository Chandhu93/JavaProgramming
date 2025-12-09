package codes;

public class GmailValidation {

	public static void main(String[] args) {

		boolean flag = true;
		String mail = "siva@gmail.com";
		String[] str = mail.split("@");

		if(str.length == 2 ) {
			String temp = str[0];
			for(int i=0; i<=str.length -1; i++) {
				if(Character.isLowerCase(temp.charAt(i)) || Character.isDigit(temp.charAt(i))) {
				} else {  
					flag= false;
					break;
				}
			}
		}
		else {
			System.out.println("Not a valid Email");
		}
		if(flag && str[str.length-1].equals("gmail.com")) {
			System.out.println(mail+"\n Is a valid Email");
		}

	}
}
