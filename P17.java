										/*[CONSTRUCTOR]
									[#User-Defined Constructor]*/
class P17
{
	P17()
	{
		System.out.println("user defined constructor with 0 argument");
	}
	P17(int x)
	{
		System.out.println("user defined constructor with 1 argument");
	}
	public static void main(String[] args) 
	{
		P17 p = new P17();
		P17 p1 = new P17(10);
	}
}



/*if there is a user default constructor present inside the code,no default constructor will be created
 it will only create if there is no user defined constructor is present.*/

