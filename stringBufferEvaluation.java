import java.util.Scanner;

class strngEvaluation{
	public static void main(String[] args) {
		// Taking Input
		System.out.println("enter the input");
	    Scanner sc=new Scanner(System.in);
	    String strngOne=sc.nextLine();


	    // length of the input string
	    System.out.println("Length of input string");
	    System.out.println(strngOne.length());


	    //append 
	    System.out.println();
	    System.out.println("Using Append method:");
	    strngOne.append("Java");
		System.out.println(strngOne);

		// Insert
		System.out.println();
		System.out.println("using insert method:");
		strngOne.insert(1,"MY");
		System.out.println(strngOne);

		// reverse
		System.out.println();
		System.out.println("using reverse method");
		strngOne.reverse();  
		System.out.println(strngOne);



	    // capacity
	    System.out.println();
	    System.out.println("using capacity method");
	    System.out.println("capacity of the string");
	    System.out.println(strngOne.capacity());


	    //ensure capacity
	    System.out.println();
	    System.out.println("using ensured capacity");

	    System.out.println("After capacity ensured:");
	    strngOne.ensureCapacity(50);
	    System.out.println(strngOne.capacity());


	    // set length
	    System.out.println();
	    
	   	System.out.println("using setLength");
	    System.out.println(strngOne.length());
	    strngOne.setLength(40);
	    System.out.println(strngOne.length());


	    // charAt
	    System.out.println();
	    System.out.println("using charAt");
	    char ch1 = strngOne.charAt(3);
	    System.out.println(ch1);


	    // setCharAt
	    System.out.println();
	    System.out.println("using setCharAt:");
	    System.out.println("Afetr using setyCharAt");
	    strngOne.setCharAt(3,'X');
	    System.out.println(strngOne);


	    // getChars
	    System.out.println();

	    System.out.println("using get chars:");
	    //37
	    String str = new String("This is a String buffer with getChars"); 
       	char[] array = new char[40];
       	str.getChars(10, 16, array, 0);
       	System.out.println("Array Contains:" );
       	
       	for(char temp: array){
           System.out.print(temp);
       	}

       




	    



	}
}