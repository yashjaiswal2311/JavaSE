                                        /*[Polymorphism]
                                          [Compile-Time]
                                     [Constructor Overloading]*/
class Test
{
	Test()
	{
		System.out.println("Constructor with 0 argument");
	}
	Test(int x)
	{
		System.out.println("Constructor with 1 argument");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		Test t1 = new Test(10);
	}
}