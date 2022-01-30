                                        /*[Polymorphism]
                                          [Compile-Time]
                                       [Method Overloading]*/
class Test
{
	void m1(int x,int y)
	{
		System.out.println(x+y);
	}
	void m1(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1(10,20);
		t.m1(40);
	}
}

/*[Note:- we can't have same signature in both the methods list of argument or type of argument must be
  different like 
	void m1(int x,int y)
	{
	}
	void m1(int x,char y)
	{
	}

but this is not different
	void m1(int x,int y)
	{
	}
	void m1(int a,int b)
	{
	}
*/