import java.util.Scanner;
public class CodeDemo1 {
	/** 
	 * This is a javadocs, used for documentation of a program
	 */
	 
	public static void main (String[] args) 
	{
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
		   String fullName = "Brandon" + " Lee " + " Krawoskwy";
		   // Uppercase
		   String fullNameUpper = fullName.toUpperCase();
		   System.out.println(fullNameUpper);
		   
		   /*
		    * Conditionals and Loops
		    */
		    
		    // Conditional checking if x is even using modulus
		    System.out.println(" \n x: " + x);
		    if (x % 2 == 0)
		    {
				System.out.println(" x is even ");
			}
			else
			{
				System.out.println("x is odd");
			}
			double e = 2.3;
			double f = 2.4;
			double g = 2.5;
			
			//boolean operators
			// &&
			if (e > 2 && e < f)
			{
				System.out.println(e + " is between 2 and " + f);
			}
			// ||
			if ( f > e || f > g)
			{
				System.out.println(f + " is greater than " + e + " or greater than " + g);
			}
			// ! - not
			if ( g != 2.6)
			{
				System.out.println(g + " is not equal to 2.6");
			}
			// while loops
			int i = 0;
			while ( i < 5)
			{
				System.out.println("i: " + i);
				i++;
				System.out.println();
			}	
			// for loops
			for (int k = 0; k < 10; k++)
			{
				System.out.println("k: " + k);
			}
			/*
			 * Casting
			 */
			 // Cast int to string
			 String intToString = Integer.toString(1);
			 // Cast double to string
			 String doubleToString = Double.toString(1.1);
			 // Print the values and type of values
			 System.out.println(intToString + " " + intToString.getClass());
			 System.out.println(doubleToString + " " + doubleToString.getClass());
			 // Cast string to int
			 int stringToInt = Integer.parseInt("1");
			 // Cast String to double
			 double stringToDouble = Double.parseDouble("1.1");
			 // Print values and type of values
			 System.out.println(stringToInt);
			 System.out.println(stringToDouble);
			 // cast to Object then get class
			 System.out.println(((Object)(stringToInt)).getClass());
			 System.out.println(((Object)(stringToDouble)).getClass());
			 /*
			  * Use Input
			  */
			  Scanner scan = new Scanner(System.in);
			  System.out.print("Enter a number: ");
			  int myInt = scan.nextInt();
			  System.out.println("Your number is " + myInt);
			  // print the multiplication table for myInt
			  for (int t = 1; t <=10; t++)
			  {
				  System.out.println(t * myInt);
			  }
			  System.out.println("Enter a string: ");
			  String myStr = scan.next();
			  // print each character in the string seperately
			  for (int s = 0; s < myStr.length(); s++)
			  {
				  System.out.println(myStr.charAt(s));
			  }
	}		
}

