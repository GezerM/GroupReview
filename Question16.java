package assessmentTest04;

public class Question16 {

	public static void main(String[] args) {

		String str = "Cybertek Students";
		
		int x = str.indexOf("t", 8);
		
		System.out.println(str.substring(3, x));
		
		System.out.println("---------------------");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(i + "  " + str.charAt(i));
		}
		
	
		System.out.println();
		System.out.println("x = " + x);
		
		System.out.println("----------INDEXOF EX-----------");
		System.out.println("**************************");
		int y = str.indexOf("t");  // 5
		System.out.println("if started from index number '0' index number of 't' = " + y);
		
		System.out.println("=========================");
		int z = str.indexOf("t", 10);  //10
		System.out.println("if started from index number '10' index number of 't' = " + z);
		
		System.out.println("+++++++++++++++++++++++++");
		int m = str.indexOf("t", 11);  //15
		System.out.println("if started from index number '11' index number of 't' = " + m);
	
		int h = str.indexOf("t", 16);  //-1
		System.out.println("if started from index number '11' index number of 't' = " + h);
			
	
		System.out.println("-------SUBSTRING EX--------------");
		System.out.println("**************************");
		System.out.println(str.substring(10)); //tudents == if started from index number 10
		
		System.out.println("=========================");
		System.out.println(str.substring(0, 16)); //Cybertek Student
		
		System.out.println("_________________________");
		System.out.println(str.substring(0, 0)); // ""
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println(str.substring(0, 1)); //C
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(0)+ str.charAt(0));
		System.out.println(str.substring(0, 1).equals(str.charAt(0)));
		System.out.println(str.substring(0, 1)+str.substring(0, 1));
		
	
	}

}
