										/*[CONSTRUCTOR]
									[#User-Defined Constructor]*/
class P18
{
	/*P18()
	{
		System.out.println("user defined constructor with 0 argument");
	}*/
	P18(int x)
	{
		System.out.println("user defined constructor with 1 argument");
	}
	public static void main(String[] args) 
	{
		P18 p = new P18();
		//P18 p1 = new P18(10);
	}
}
//error

/*if there is a user default constructor present inside the code,no default constructor will be created
 it will only create if there is no user defined constructor is present.*/

 /*in above code P18() can't access P18() default constructor because there a user defined constructor
 with 1 argument is present so it can't create default constructor and there is no no user defined
 constructor with 0 argument is present so it will show error*/
