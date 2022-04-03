public class CodeDemo1 {
	
	public static void main (String[] args) {
		System.out.println("Hello World!");
		System.out.println();
		/*
		 * Defining variables
		 */
		int x = 5;
		double y = 5.0;
		boolean flag = true;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("flag = " + flag);
		
		/*
		 * String and characters
		 */ 
		String dept = "cit"; //String
		char letter = 'a'; //char
		String course = dept + 590; //String with int
		String grade = letter + ""; // char with String
		String courseInformation = course + ": " + grade;
		System.out.println(courseInformation);
		
		/*
		 * 
		 */ 
		 
		 double d = 2 * x + 10;
		 double z = 2 * y + 5;
		 System.out.println("d = " + d);
		 System.out.println("z = " + z);
		 
		 /* division with ints
		  * uses integer division and ignores the remainder
		  */
		  System.out.println("x / 2: " + (x/2));
		  System.out.println("x / 2.0: " + (x/2.0));
		  
		  // Power operation
		  System.out.println("x power 4: " + Math.pow(x,4));
		  
		  /* 
		   * String operations
		   */ 
		   
		   //String concatenation
	}
}

