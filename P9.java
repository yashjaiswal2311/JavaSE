						//[INSTANCE OR NON STATIC METHOD]
class P8 
{
	void m1()
	{
		m2();							//direct access
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) 
	{
		P8 p = new P8();
		p.m1();						//access by object
		System.out.println("main method");
	}
}


/*we can only access an instance variable or instance method inside a static method by object only
either creating or using this keyword.
but we can access them directly in instance methods*/ 