package assessmentTest04;

public class Question08 {

	public static void main(String[] args) {

		String b = "rumble";
		
		
		System.out.println("b.length() = " + b.length());
		System.out.println("b.length()-1 = " + (b.length()-1));
		for (int i = 0; i < b.length(); i++) {
			System.out.println(i + " " + b.charAt(i));
		}
		System.out.println("b.concat(\"4\") =" + b.concat("4"));
		System.out.println("b.concat(\"4\").substring(3, b.length()-1) = " + b.concat("4").substring(3, b.length()-1));
		
		
		b+=b.concat("4").substring(3, b.length()-1);
		
		System.out.println(b);

	}

}
