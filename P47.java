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
	/*Child()					//default constructor
	{
		super();				//implicit calling
	}*/
	public static void main(String[] args)
	{
		Child c = new Child();
	}
}

/*[it is printing parent class 0 argument constructor because there is no user defined constructor in 
child class so it is creating default constructor and by default child class constructor child() has super()
in it which by default calls parent class constructor with o argument and in this code a user defined
constructor with 0 argument is present in parent class so it is accessing that constructor.]*/

/*[Note:- if we don't call parent class constructor with super by default child class constructor will call
 the parent class constructor with 0 argument if there no constructor in parent class it will create a
 default constructor in parent and then call it and if there is no constructor in both the classes Child
 and Parent class then a default constructor will create in both classes and then Child class constructor
 will run and then it will call the parent class constructor with 0 argument
							In the previous code if we did not write super() it will implicitly run super()
 but if we want to call other  constructor with 1 argument then we have to call it like super(10);]*/

 /*[Note:- if we make parent class constructor with 0 argument as a argument(//) and if we call super(10);
 there will be no error but if we do not call it like this and we make parent class constructor with 
  0 argument as argument then it will be error here are the example of it]*/