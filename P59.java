									//[Final Keyword]
//"Final keyword is assigned to an entity which can only be assigned once."
//a method,class and variable can be declared as final

class A
{
	final int x = 20;
	void m1()
	{
		x=30;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
	}
}



//error because we can't re-assign value to a variable once we declared it as final.