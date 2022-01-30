									//[Final Keyword]
//"Final keyword is assigned to an entity which can only be assigned once."
//a method,class and variable can be declared as final

class A
{
	final void m1()
	{
		System.out.println("Parent class A m1 method");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("Child class B m1 method");
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
	}
}

//error because we can't override a method once we declared it as final.