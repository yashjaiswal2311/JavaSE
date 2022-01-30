									//[Access Privilages]
				//(most access)[public > protected > default > private]-(least access)
//Example
interface A
{
	void m1();
}
class B implements A
{
	/*void m1()					//error
	{
		System.out.println("class B m1 method");
	}*/
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
/*ERROR
weaker access privilages 


-Interface method are bydefault 'public'

 we can only inherit a normal class from an interface if that interface contains no method or if it contains
 method which is bydefault an abstract method then we have to override it in the class
 but when we override it as it was in argument it it showing error "weaker access privilages" because 
 by default interfaces are public and by default class is default and default has weaker access than public
 as we can see in the diagram at the top of the code.

-inheritance can only be performed at same level or greater level but not lesser so we have to make interface
 default which we can't do so we will define m1() as public to make access at same level now it will override
 
Note:-"while overiding a method in child class we can't assign weaker Access privilages to child class method
(overiding method)it must be at same level or greater level"
*/