class series
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		A a;
		a=obj2;
		a.show();
		
	}
}
class A
{
	public void show()
	{
		System.out.println("In A");
	}
}
class B
{
	public void show()
	{
		System.out.println("In B");
	}	
}
