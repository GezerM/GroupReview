package assessmentTest04;

public class Question20 {

	public static void main(String[] args) {

		String userName = "Mike";
		String password = "12|3";
		String blank = ">?!@#$%|^&*()[]}{?>./'~!=-(*&^^%$ ";
		
		 if (userName == " " && password == " ") {
			 System.out.println("User name and password are blank");
		 } else if (userName == " " && password != " ") {
			 System.out.println("User name cannot be empty");
		 } else if (userName != " " && password == " ") {
			 System.out.println("Password name cannot be empty");
		 } else {
			 for (int i = 0; i < blank.length(); i++) {
				 char find = blank.charAt(i);
				 
				
				System.out.println("Number of iteration " + i);
				System.out.println(find);
				System.out.println(userName.indexOf(find));
				System.out.println(password.indexOf(find));
				
				 
				 if (userName.indexOf(find) > -1 || password.indexOf(find) != -1) {
				 System.out.println("User name or password is not valid. Please verify");
				 break;
				 }
			 
			 }
		 
		 }

	 }

}
