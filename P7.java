class Test 
{
	static int x = 100;
		   int y = 200;
}
class P7
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.y);
		System.out.println(Test.x);
	}
}
