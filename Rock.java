
 
    interface area{ 
    final static float pi=3.14f; 
    void calculateArea(float x,float y);
    
    }  


    class rectangle implements area{
        public void calculateArea(float x,float y){
            System.out.println("Area of rectangle :"+ x*y);
        }
    }

    class circle implements area{
        public void calculateArea(float x,float y){
            System.out.println("Area of circle :"+ pi*x*x);
        }
    }  

   class Rock {  
 public static void main(String args[]){  
   area objOne = new rectangle();
   area objTwo = new circle();  
   
    objOne.calculateArea(2.3f,7.5f);  
    objTwo.calculateArea(2.3f,0f);  
     }
    }