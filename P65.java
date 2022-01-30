								//[Abstract Class & Methods]
							//[Inheritance in abstract methods]
abstract class A
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class B extends A
{
	void m1()
	{
		System.out.println("Class B m1 method");
	}
}
abstract class C extends B
{
	void m2()
	{
		System.out.println("Class C m2 method");
	}
}
class D extends C
{
	void m3()
	{
		System.out.println("Class D m3 method");
	}
	public static void main(String[] args) 
	{
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
	}
}

/* In the code there is only one way to extends a normal class from an abstract class is to override the 
  abstract method of abstract class or if abstract class has no abstract method then we can directly inherit
  a normal class from abstract class but in above case class A contains 3 abstract methods and inherited
  class B from A contains all 3 methods so it must be declared as abstract and we are overriding m1() in 
  B but still it contains 2 abstract methods So inherited class from B which is C must be declared
  as abstract class and we are overiding m2() in C so now it will contain onlyu one abstract method
  and we are inheriting D from C which contain 2 normal and 1 abstract method and in D we are overidding 
  m3() so D contain all normal method so it can be declared as normal class and we can create its object and
  can access all the overriden methods.*/
