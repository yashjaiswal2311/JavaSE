									//[Access Privilages]
				//(most access)[public > protected > default > private]-(least access)
//Example
class A
{
	private void m1()
	{
		System.out.println("class B m1 method");
	}
}
class B extends A
{
	private void m1()
	{
		System.out.println("class B m1 method");
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
	}
}

/*
IMP:-code is running but this is not overriding because private members can never be inherited at any level
to check this comment class B m1() method and code will show error.

-inheritance can only be performed at same level or greater level but not lesser so we have to make interface
 default which we can't do so we will define m1() as public to make access at same level now it will override
 
Note:-"while overiding a method in child class we can't assign weaker Access privilages to child class method
(overiding method)it must be at same level or greater level"
*/