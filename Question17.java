package assessmentTest04;

public class Question17 {

	public static void main(String[] args) {

		String str = "";
		int k = m1(str.length());
		
		k+=3 + k++;
		
		System.out.println(k);
		
	} // doesn't exist in the code given, so it will normally give an error!
		
	public static int m1(int i) {
			
		return ++i; // returns 1
		
		
		//return i++; // returns 0 !!!
	}

	

}
