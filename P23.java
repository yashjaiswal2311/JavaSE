								//[FACTORY METHOD]
class Test
{
	Test m1()
	{
		System.out.println("Factory method");
		Test t = new Test();
		return t;
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
		System.out.println("main method");
	}
}