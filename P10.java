						//[INSTANCE OR NON STATIC METHOD]
class Test
{
	void m2()
	{
		System.out.println("m2 method");
	}
}
class P10 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m2();
		System.out.println("main method");
	}
}


/*we can only access an instance variable or instance method inside a static method by object only
either creating or using this keyword.

we can access instance method of a class in other class by creating the object of that class which
contains instance method in other class.
*/