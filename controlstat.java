import java.util.Scanner;

class controlstat{
	public static void main(String[] args) {
		// while(true){
		System.out.println("Select the respective type of control statement (Note:switch is already in use):");
		System.out.println("Here 1:3 selection statement,4:7 iteration statement,8:10 jump statement");
		System.out.println("1.if");
		System.out.println("2.ifelse");
		System.out.println("3.if elseif");
		System.out.println("4.while");
		System.out.println("5.for loop");
		System.out.println("6.do while");
		System.out.println("7.for each");
		System.out.println("8.break");
		System.out.println("9.continue");
		System.out.println("10.return");
		

		System.out.println("enter the input");
	    Scanner sc=new Scanner(System.in);
	    int term=sc.nextInt();
	    System.out.println(term);

	    switch (term) {
	    	case 1:
	    		int age;  
	        	Scanner inputDevice = new Scanner(System.in);  
		        System.out.print("Please enter Age: ");  
		        age = inputDevice.nextInt();  
		        if(age > 18)  
	            System.out.println("above 18 ");
	    		break;
	    	case 2:
	    		int age;  
		        Scanner inputDevice = new Scanner( System.in );  
		        System.out.print( "Please enter Age: " );  
		        age = inputDevice.nextInt();  
		        if ( age >= 18 )  
		            System.out.println( "above 18 " );  
		        else  
		            System.out.println( "below 18" );  
	    		
	    		break;
	    	case 3:
	    		int age;  
		        Scanner inputDevice = new Scanner( System.in );  
		        System.out.print( "Please enter Age: " );  
		        age = inputDevice.nextInt();  
		        if ( age >= 18 && age <=35 )  
		            System.out.println( "between 18-35 " );  
		        else if(age >35 && age <=60)  
		            System.out.println("between 36-60");  
		        else  
		            System.out.println( "not matched" );
	    		break;
	    	case 4:
	    		int i = 0;  
        while ( i < 5 )  
        {  
            System.out.println( "Value :: " + i );  
            i++;  
        } 
	    		break;
	    	case 5:
	    	int i = 0;  
        do  
        {  
            System.out.println( "value :: " + i );  
            i++;  
        }  
        while ( i < 5);  
	    		break;
	    	case 6:
	    	for (i=0;i<5 ;i++ ) {
	    		System.out.println( "value :: " + i );
	    	}
	    		break;
	    	case 7:
	    	int[] i =  
        { 1, 2, 3, 4, 5 };  
        for ( int j : i )  
        {  
            System.out.println( "value :: " + j );  
        } 
	    		break;
	    	case 8:
	    	for ( int var = 0; var < 5; var++ )  
        {  
            System.out.println( "Var is : " + var );  
            if ( var == 3 )  
                break;  
        }
	    		break;
	    	case 9:
	    	for ( int var1 = 0; var1 < 4; var1++ )  
        {  
            for ( int var2 = 0; var2 < 4; var2++ )  
            {  
                if ( var2 == 2 )  
                    continue;  
                System.out.println( "var1:" + var1 + ", var2:" + var2 );  
            }  
        }
	    		break;
	    	case 10:
	    	ReturnDemo returnDemo = new ReturnDemo();  
        	System.out.println( "No : " + returnDemo.returnCall() );
	    		break;
	    	default :
	    		System.out.println("not matched");
	    		break;

	    }
		
// }


	}

int returnCall(){
					return 5;  
			    } 


}