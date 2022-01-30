						//[INSTANCE OR NON STATIC METHOD]
class Test
{
	void m2()
	{
		System.out.println("m2 method");
	}
}
class P11 
{
	void m1()
	{
		Test t = new Test();
		t.m2();
		System.out.println("m1 method");
	}
	public static void main(String[] args) 
	{
		P11 p = new P11();
		p.m1();
		System.out.println("main method");
	}
}


/*we can only access an instance variable or instance method inside a static method by object only
either creating or using this keyword.

we can access instance method of a class in other class by creating the object of that class which
contains instance method in other class.
we can also create an object inside a instance block
*/