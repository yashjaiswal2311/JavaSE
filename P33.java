									//[INHERITANCE]
class A
{
	void m1()
	{
		System.out.println("m1 method");
	}
}
class B extends A
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
		System.out.println("Child class m1 method");
	}
}


//Reusability
//Extensibility