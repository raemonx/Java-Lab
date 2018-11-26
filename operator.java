public class operator{
	public static void main(String[] args) {
		

		//Arithmetic operator
		
		int a=5;  
    		System.out.println(a++);//icrementation after print
    		System.out.println(++a);//incrementation before print 7(6)
    		System.out.println(a--);
    		System.out.println(--a);
    		
    		
    		int m=3;  
    		int p=-3;  
   		boolean x=true;  
   		boolean y=false;  
   		System.out.println(~m);//-4 (minus of total positive value which starts from 0)  
   		System.out.println(~p);//2 (positive of total minus, positive starts from 0)  
   		System.out.println(!x);//false (opposite of boolean value)  
    		System.out.println(!y);//true
    		
    		System.out.println(m+p);//0  
    		System.out.println(m-p);//6  
    		System.out.println(m*p);//-9  
    		System.out.println(m/p);//-1  
    		System.out.println(m%p);//0
    		
    		//shift operator
    		System.out.println(5<<2);//5*2^2=5*4=20  
    		System.out.println(6<<3);//6*2^3=16*8=48  
    		System.out.println(8<<2);//8*2^2=8*4=32  
    		System.out.println(3<<4);//3*2^4=3*16=48   
		
		System.out.println(10>>2);//10/2^2=10/4=2  
    		System.out.println(20>>2);//20/2^2=20/4=5  
    		System.out.println(20>>3);//20/2^3=20/8=2   
		
		
		//For positive number, >> and >>> works same  
        	System.out.println(25>>2);  
        	System.out.println(25>>>2);  
       
       
       	 //For negative number, >>> changes parity bit (MSB) to 0  
        	System.out.println("Line XYZ");
        	System.out.println(-9>>2);  
        	System.out.println(-9>>>2);


	
		
		int e=2;
		int f=9;  
    		System.out.println(a<e&&a++<f);//false && true = false  
    		System.out.println(a);//10 because second condition is not checked  
   		System.out.println(a<e&a++<f);//false && true = false  
    		System.out.println(a);//11 because second condition is checked   


		System.out.println(a>e||a++<f);//true || true = true  
    		System.out.println(a);//10 because second condition is not checked  
    		System.out.println(a>e|a++<f);//true | true = true  
    		System.out.println(a);//11 because second condition is checked 

		
		int min=(a<m)?a:m;  
    		System.out.println(min);
    		
    		
    		int rawOne = 120;
        	rawOne += 10;
        	int rawTwo = 120;
        	rawTwo *= 10;
        	int	rawThree = 330;
        	rawThree -= 30;
        	int rawFour = 127;
        	rawFour %= 7;
        	int rawFive = 120;
       	 rawFive &= 40;
        	int rawSix = 30;
        	rawSix ^= 100;
        	int rawSeven = 127;
        	rawSeven >>= 3;
        	int rawNine = 200;
        	rawNine <<= 3;
        	int rawTen = 300;
        	rawTen >>>= 4;
        	System.out.println(rawOne);
        	System.out.println(rawTwo);
        	System.out.println(rawFour);
        	System.out.println(rawFive);
        	System.out.println(rawSeven);
        	System.out.println(rawThree);
        	System.out.println(rawSix);
        	System.out.println(rawNine);
        	System.out.println(rawTen);
    		
    		

	}
}
