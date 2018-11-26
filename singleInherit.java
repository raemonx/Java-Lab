class sample {
   int age;

   sample(int age) {
      this.age = age;       
   }

   public void getAge() {
      System.out.println("The value of the variable named age in super class is: " +age);
   }
}

class Subclass extends sample {
   Subclass(int age) {
      super(age);
   }

   public static void main(String argd[]) {
      Subclass s = new Subclass(24);
      s.getAge();
   }
}