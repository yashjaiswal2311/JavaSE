									//[CONSTRUCTOR]
class P20
{
	P20()
	{
		this(10);
		this(10,20);					//error
		System.out.println("Constructor with 0 argument");
	}
	P20(int x)
	{
		System.out.println("Constructor with 1 argument");
	}
	P20(int x,int y)
	{
		System.out.println("Constructor with 2 argument");
	}
	public static void main(String[] args) 
	{
		P20 p = new P20(); 
	}
}


/*by using this keyword we can access the another constructor inside a constructor
but only once inside a constructor otherwise error*/
//this can't be use as second argument otherwise error.