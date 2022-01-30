class Test
{
	static int x;
	void increment()
	{
		Test.x = Test.x+1;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
		Test t5 = new Test();

		t1.increment();
		t2.increment();
		t3.increment();
		t4.increment();
		t5.increment();
	}
}
