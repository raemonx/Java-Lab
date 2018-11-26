class Person
{
     String FirstName;
     String LastName;
 
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
     String instructor;
 
     Student(String fName, String lName, int nId, String stnd, String instr)
     {
          super(fName,lName);
          id = nId;
          standard = stnd;
          instructor = instr;         
      }
      Student(Student st)
     {
          
          id = st.nId;
          standard = st.stnd;
          instructor = st.instr; 
          super(st.fName,st.lName);

      }

}



class copyConstructor
{
       public static void main(String args[])
       {
               Student sObj = new Student("Kaushik","Talukdar",160103003,"CSE","Sir");
                Student copyObj = new Student(sObj);
               System.out.println("Student :");
               System.out.println("First Name : " + sObj.FirstName);
               System.out.println("Last Name : " + sObj.LastName);
               System.out.println("ID : " + sObj.id);
               System.out.println("department : " + sObj.standard);
               System.out.println("Instructor : " + sObj.instructor);

               // System.out.println("Student of copied:");
               // System.out.println("First Name : " + copyObj.FirstName);
               // System.out.println("Last Name : " + copyObj.LastName);
               // System.out.println("ID : " + copyObj.id);
               // System.out.println("department : " + copyObj.standard);
               // System.out.println("Instructor : " + copyObj.instructor);




        }
}