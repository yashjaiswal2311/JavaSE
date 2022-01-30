									//[static variable]
class A 
{
	static int x;
	A()
	{
		this.increment();
	}
	void increment()
		{
			A.x = A.x+1;
			System.out.println("x: "+A.x);
		}
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		A a6 = new A();
	}
}
