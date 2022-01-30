											//[PACKAGES]
package pk2;
class Test
{
	void m1()
	{
		System.out.println("Test class m1 method");
	}
}
class NewTest
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
	}
}



/*
[we know that we can't access a member of a class in a package or file by a class present inside another
package or file,
but if both the classes present inside same package then we can access the one's class method in 
another class at public,protected and default but private method can't be access inside a package or outside
the package]
*/