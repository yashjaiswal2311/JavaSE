									/*[INHERITANCE]
									 [ROOT CLASS]*/
class A extends Object
{
	void m1()
	{
	}
}
class B extends A
{
	void m2()
	{
	}
}
class C extends B
{
	void m3()
	{
	}
}
class D extends C
{
	public static void main(String[] args) 
	{
		D d = new D();
		d.m1();
		d.m2();
		d.m3();
	}
}


/*Reusability
  Extensibility

[NOTE- A class which is not inherited from any class will be extend by object class also known as
 root class but it is not mendatory to write extends Object.]*/