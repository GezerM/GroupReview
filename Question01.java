package assessmentTest04;

public class Question01 {

	public static void main(String[] args) {

		String s = "JavaScript String Quiz";
		System.out.println(s.charAt(s.length() - 6));
		
	
		System.out.println("---------------------");
		System.out.println(s.length());
		
		System.out.println(s.length() - 6);
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + " " + s.charAt(i));
		}

	}

}
