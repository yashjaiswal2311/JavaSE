								//[Abstract Class & Methods]
							//[Inheritance in abstract methods]
abstract class A
{
	void m1()
	{
		System.out.println("Hello World!");
	}
	abstract void m2();
}
abstract class B extends A
{
	void m2()
	{

	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
		b.m2();
	}
}

/*we have to override m2 method in class B because this is the only way to use abstract method of parent 
 class in child class now B contains both normal method so it can be declared as normal class and it's
 object can be created.
 and because B is inheriting both the mthod of A and one of them is abstract then B must be an abstract class
 */