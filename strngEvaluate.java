import java.util.Scanner;

class strngEvaluate{
	public static void main(String[] args) {
		// Taking Input
		System.out.println("The string:");
	    StringBuffer strngOne=new StringBuffer("KaushikTalukdar");
	    System.out.println(strngOne);
	    StringBuffer strngTwo=new StringBuffer();


	    // capacity
	    System.out.println();
	    System.out.println("using capacity method");
	    System.out.println("capacity of the string of StringTwo");
	    System.out.println(strngTwo.capacity());


	    // length of the input string
	    System.out.println();
	    System.out.println("default Length of input string");
	    System.out.println(strngOne.length());


	    //append 
	    System.out.println();
	    System.out.println("Using Append method at the end:");
	    strngOne.append("Java");
		System.out.println(strngOne);

		// Insert
		System.out.println();
		System.out.println("using insert method as MY in index 0:");
		strngOne.insert(0,"MY");
		System.out.println(strngOne);

		// reverse
		System.out.println();
		System.out.println("using reverse method");
		strngOne.reverse();  
		System.out.println(strngOne);



	    


	    //ensure capacity
	    System.out.println();
	    System.out.println("using ensured capacity");

	    System.out.println("After capacity ensured:");
	    strngTwo.ensureCapacity(50);//(oldcapacity*2)+2  
	    System.out.println(strngTwo.capacity());




	    // set length
	    System.out.println();
	   	System.out.println("using setLength");
	    // System.out.println(strngOne.length());
	    strngOne.setLength(40);
	    System.out.println(strngOne.length());


	    // charAt
	    System.out.println();
	    System.out.println("using charAt index 3");
	    char ch1 = strngOne.charAt(3);
	    System.out.println(ch1);


	    // setCharAt
	    System.out.println();
	    System.out.println("using setCharAt:");
	    System.out.println("Afetr using setCharAt 3rd index as X");
	    strngOne.setCharAt(3,'X');
	    System.out.println(strngOne);


	    // getChars
	    System.out.println();

	    System.out.println("using get chars:");
	    //37
	    String str = new String("This is a String buffer with getChars"); 
       	char[] array = new char[40];
       	str.getChars(10, 16, array, 0);
       	System.out.println("Array Contains at 10 to 16 position:" );
       	
       	for(char temp: array){
           System.out.print(temp);
       	}

       	System.out.println();

       




	    



	}
}