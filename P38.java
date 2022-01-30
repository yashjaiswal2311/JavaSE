
class Parent
{
	int x =20;
	static int y = 30;
	static
	{
		System.out.println("Parent class Static Block");
	}
	{
		System.out.println("Parent class Instance Block");
	}
	void m1()
	{
		System.out.println("Parent class m1 method");
	}
}
class Child extends Parent
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		System.out.println(c.x);
		System.out.println(Child.y);
		c.m1();
	}
}
//what properties a child class can inherit from parent class.