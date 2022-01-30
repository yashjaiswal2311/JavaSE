						//[INSTANCE OR NON STATIC METHOD]
class P8 
{
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args) 
	{
		P8 p = new P8();
		p.m1();
		System.out.println("main method");
	}
}


/*we can only access an instance variable or instance method inside a static method by object only
either creating or using this keyword.*/ 