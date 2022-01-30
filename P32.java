class P32
{
	{
		System.out.println("Instance Block");					//instance block
	}
	P32()
	{
		System.out.println("Constructor");						//constructor
	}
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args)
	{
		P32 p = new P32();				//object creation
		//this.m1();				//can't be used in static method
		p.m1();
	}
	static 
	{
		System.out.println("Static Block");						//static block
	}
}
/*
Order of execution
1-Static Block
2-Instance Block
3-Constructor
4-methods
...
*/