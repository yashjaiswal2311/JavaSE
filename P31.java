							//[Instance Block & Constructor]
class P31
{
	{
		System.out.println("Instance Block");					//instance block
	}

	P31()
	{
		System.out.println("Constructor");						//constructor
	}
	public static void main(String[] args)
	{
		new P31();				//object creation
	}
}

/*it is same as constructor and serves the same purpose,it executes at the time of object creation
 it executes before constructor*/