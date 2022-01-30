class Parent
{
		   int x=70;
	static int y=80;
}
class Child extends Parent
{
		   int x=20;
	static int y=30;
	void m1(int x,int y)
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
		System.out.println(super.x+super.y);
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1(2,3);
	}
}

//(this) keyword is used as the object of present class to access instance variables.
//(super) keyword is used as the object of parent class to access instance variables.