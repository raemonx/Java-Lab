class A{
  
  public void runOne(){
    System.out.println("Class A");
}
}
class B extends A{
 
  public void runOne(){
    System.out.println("Class B");
  }
}

class Main{
    public static void main(String[] args){
       B obj = new B();
        
        A a = new B();
      
      a=obj;




      a.runOne();
}
}


 