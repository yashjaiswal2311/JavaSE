									//['this' kEYWORD]
class P15
{
	int x = 100;
	static int y = 200;

	static void m1(int x,int y)
	{
		System.out.println("Sum of Local variables: "+(x+y));
		System.out.println("Sum of static & instance variables: "+(this.x+this.y));		//error
	}
	public static void main(String[] args) 
	{
		P15 p = new P15();
		p.m1(10,20);
		System.out.println("main method");
	}
}


//this keyword is a predefined object of the current class.
/*this code will show error because we can't use this keyword inside static method can only be used within
the instance block.*/