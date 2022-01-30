									//[CONSTRUCTOR]
class P22
{
	P22()
	{
		this(10,20);
		System.out.println("Constructor with 0 argument");
	}
	P22(int x)
	{
		System.out.println("Constructor with 1 argument");
	}
	P22(int x,int y)
	{
		System.out.println("Constructor with 2 argument");
	}
	public static void main(String[] args) 
	{
		P22 p = new P22(); 
	}
}


/*by using this keyword we can access the another constructor inside a constructor
but only once inside a constructor otherwise error*/
//this can't be use as second argument otherwise error.