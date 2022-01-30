									//['this' kEYWORD]
class P14
{
	int x = 100;
	static int y = 200;

	void m1(int x,int y)
	{
		System.out.println("Sum of Local variables: "+(x+y));
		System.out.println("Sum of static & instance variables: "+(this.x+this.y));
	}
	public static void main(String[] args) 
	{
		P14 p = new P14();
		p.m1(10,20);
		System.out.println("main method");
	}
}


//this keyword is a predefined object of the current class.
