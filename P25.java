									//[instance variable]
class A 
{
	int x;
	void increment()
	{
		x = x+1;
		System.out.println("x: "+x);
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		A a6 = new A();

		a1.increment();
		a1.increment();
		a1.increment();
		a1.increment();
		a1.increment();
		a1.increment();

		/*for(int i=1;i<=6;i++)
		{
			a1.increment();
		}*/
	}
}
