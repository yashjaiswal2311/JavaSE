								//Multi-Level Inheritance
class A extends Object
{
	int x=10;
	static int y=20;
	void m1()
	{
		System.out.println("Class A m1 method");
	}
	A()
	{
		//super(); of class object By default
		System.out.println("Class A constructor with 0 argument");
	}
}
class B extends A
{
	/*B()				//default constructor
	{
		super(); of class A By default
	}*/
}
class C extends B
{
	/*C()				//default constructor
	{
		super(); of class B By default
	}*/
	public static void main(String[] args)
	{
		C c = new C();
		c.m1();
		System.out.println(A.y);
		System.out.println(c.x);
	}
}

/*NOTE:-in class C a default constructor with 0 argument will be created because there is no user-defined
 constructor and bydefault it contains super(); of RECENT parent class which means C will contain  super of
 B so it will go directly to the default constructor of B because there is no user defined constructor 
 and it contains Super(); of its recent parent class A so it will go to the user defined constructor of A
 with 0 argument which also contains super(); of its parent class 'Object' so it will go directly to 
 the object class constructor and there is nothing to print so it will come back to A and print output,after
 printing it will come back to B but nothing to print so it will come back to C nothing to print and } found
 process terminated.*/























































































































































