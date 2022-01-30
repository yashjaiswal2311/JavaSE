class Parent
{
	Parent()
	{
		System.out.println("Parent class 0 argument constructor");
	}
	Parent(int x)
	{
		System.out.println("Parent class 1 argument constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		//super();					//implicit calling
		System.out.println("Child class 0 argument constructor");
	}
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}

/*[Note:- if we don't call parent class constructor with super by default child class constructor will call
 the parent class constructor with 0 argument if there no constructor in parent class it will create a
 default constructor in parent and then call it and if there is no constructor in both the classes Child
 and Parent class then a default constructor will create in both classes and then Child class constructor
 will run and then it will call the parent class constructor with 0 argument
							In the previous code if we did not write super() it will implicitly run super()
 but if we want to call other  constructor with 1 argument then we have to call it like super(10);]*/