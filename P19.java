									//[CONSTRUCTOR]
class P19
{
	P19()
	{
		this(10);
		System.out.println("Constructor with 0 argument");
	}
	P19(int x)
	{
		System.out.println("Constructor with 1 argument");
	}
	public static void main(String[] args) 
	{
		P19 p = new P19(); 
	}
}


/*by using this keyword we can access the another constructor inside a constructor
but only once inside a constructor*/
