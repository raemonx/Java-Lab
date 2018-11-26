import java.util.Scanner;




import java.io.*;
//scanner
class inputMethods{
	//required in buffer input
	public static void main(String[] args) throws IOException{
//throw IOException is required because data can get corrupted during an input 
// operation the method readLine() can alert the user by throwing anexception.
// by writing the IOException in main we can make the system handle the exception itself

	// public static void main(String[] args) {
	   	
		// scanner
	   	// System.out.println("enter the input");
	    // Scanner sc=new Scanner(System.in);
	    // String s1=sc.nextLine();
	    // System.out.println(s1);


		//console
		// shows error if not executed in system i.e. not posble in IDE and cygwin
	    // Console value=System.console();	
	    // String s2=value.readLine("enter the value");
	    // System.out.println(s2);


	    buffer
	    System.out.println("enter the input");
	    InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(isr);
	    String s4=br.readLine();
	    System.out.println(s4);

	    //commandLineArgument
	    //note:nee dto enter argument at the time of execution i.e. java inputmethods m n o p
	    int sum=0;
	    for(int i=0;i<args.length;i++){
	      sum+=Integer.parseInt(args[i]);
	    }
	    System.out.println("Sum is : "+sum);

   }

}





// public String input3()
// {
//     System.out.println("enter the input");
//     String s3=javax.swing.JOptionPane.showInputDialog("enter the text");
//     return s3;

