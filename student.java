this.salary= salary;
import java.util.Scanner;
 class Detail{
		int rollNumber;
		String name;
		int marks;
		Detail(){
			name="";
			rollNumber=0;
	marks=0;
		}

		Detail(String x,int y,int z){
			name=x;
			rollNumber=y;
			marks=z;
		}


		
		




		void display(){
			System.out.println("Student rollnumber" +rollNumber);
			System.out.println("Student Name" +name);
			System.out.println("Student marks" +marks);
		}





	


	}




public class student{
	

	public static void main(String[] args) {
		Detail s1= new Detail(),s2= new Detail(); 
		
		
		

		System.out.println("Enter student details:" );
			Scanner sc = new Scanner(System.in);
	         
	         s1.Detail(sc.next(),sc.next(),sc.next());

	         s1.display();
		
		
		
		
		
	}
}
