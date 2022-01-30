//example
class P13
{
	int x = 100;
	static int y = 200;

	void m1()
	{
		P13.m2();
		System.out.println("m1 method");
	}
	static void m2()
	{
		int result;
		P13 p = new P13();
		result = p.x + P13.y;
		System.out.println("Sum : "+""+result);
	}
	public static void main(String[] args) 
	{
		P13 p = new P13();
		p.m1();
		System.out.println("main method");
	}
}
