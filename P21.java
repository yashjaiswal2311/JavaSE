									//[CONSTRUCTOR]
class P21
{
	P21()
	{
		System.out.println("Constructor with 0 argument");
		this(10,20);						//error can't be used as second statement
	}
	P21(int x)
	{
		System.out.println("Constructor with 1 argument");
	}
	P21(int x,int y)
	{
		System.out.println("Constructor with 2 argument");
	}
	public static void main(String[] args) 
	{
		P21 p = new P21(); 
	}
}


/*by using this keyword we can access the another constructor inside a constructor
but only once inside a constructor otherwise error*/
//this can't be use as second argument otherwise error.