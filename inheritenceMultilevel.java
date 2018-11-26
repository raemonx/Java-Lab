class Person
{
     String FirstName;
     String LastName;
     String xy="Shyam";
 
     Person(String fName, String lName)
     {
              FirstName = fName;
              LastName = lName;
      }
} 

class Student extends Person
{
     int id;
     String standard;
     String xy="Hari";
     
 
     Student(String fName, String lName, int nId, String stnd)
     {
          super(fName,lName);
          id = nId;
          standard = stnd;
                
      }
}

class Instructor extends Student{
	String instructor;
	String xy="Ram";
	Instructor(String fName, String lName, int nId, String stnd, String instr){
		super(fName,lName,nId,stnd);
		instructor = instr;   
	}

	void ambiSuper(){
		System.out.println("xy is Instructor:"+xy);
		System.out.println("xy is from Student:"+super.xy);
		System.out.println("xy is: from Person"+((Person)this).xy);
	}

}	



class inheritenceMultilevel
{
       public static void main(String args[])
       {
               Instructor sObj = new Instructor("Kaushik","Talukdar",160103003,"CSE","Sir");
 
               System.out.println("Student :");
               System.out.println("First Name : " + sObj.FirstName);
               System.out.println("Last Name : " + sObj.LastName);
               System.out.println("ID : " + sObj.id);
               System.out.println("department : " + sObj.standard);
               System.out.println("Instructor : " + sObj.instructor);

               sObj.ambiSuper();
        }
}